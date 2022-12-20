package org.bimserver.step;

import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;

import org.apache.geronimo.mail.util.Hex;

public class StepStringDecoder {

	private static CharsetDecoder decoder_ISO_8859_1 = Charset.forName(
			"ISO-8859-1").newDecoder();
	private static CharsetDecoder[] decoder_ISO_8859 = { decoder_ISO_8859_1,
			Charset.forName("ISO-8859-2").newDecoder(),
			Charset.forName("ISO-8859-3").newDecoder(),
			Charset.forName("ISO-8859-4").newDecoder(),
			Charset.forName("ISO-8859-5").newDecoder(),
			Charset.forName("ISO-8859-6").newDecoder(),
			Charset.forName("ISO-8859-7").newDecoder(),
			Charset.forName("ISO-8859-8").newDecoder(),
			Charset.forName("ISO-8859-9").newDecoder() };

	public static String decode(String str) {
		byte[] bytes = str.getBytes();
		return decode(bytes, 0, bytes.length);
	}

	public static String decode(byte[] bytes, int offset, int length) {
		CharsetDecoder decoder = null;

		StringBuilder sb = new StringBuilder();
		int index = offset;
		while (index < bytes.length && (index - offset) < length) {

			char c = (char) bytes[index];
			switch (c) {

			case '\'':

				switch ((char) bytes[index + 1]) {

				case '\'':
					sb.append('\'');
					index += 2;
					break;

				default:
					throw new RuntimeException("Invalid string");

				}

				break;

			case '\\':

				switch ((char) bytes[index + 1]) {

				case '\\':
					sb.append('\\');
					index += 2;
					break;

				case 'S':
					if ((char) bytes[index + 2] == '\\') {
						if (decoder == null) {
							sb.append((char) (bytes[index + 3] + 128));
						} else {
							byte[] buffer = { (byte) (bytes[index + 3] + 128) };
							try {
								sb.append(decoder.decode(java.nio.ByteBuffer
										.wrap(buffer)));
							} catch (CharacterCodingException e) {
								throw new RuntimeException(e);
							}
						}
						index += 4;
					} else {
						index++;
					}
					break;

				case 'P':
					decoder = decoderFromAlphabet(bytes[index + 2]);
					index += 4;
					break;

				case 'X':
					switch ((char) bytes[index + 2]) {

					case '\\': {
						byte[] hexBuffer = new byte[2];
						System.arraycopy(bytes, index + 3, hexBuffer, 0, 2);
						try {
							sb.append(decoder_ISO_8859_1
									.decode(java.nio.ByteBuffer.wrap(Hex
											.decode(hexBuffer))));
						} catch (CharacterCodingException e) {
							throw new RuntimeException(e);
						}
						index += 5;
					}
						break;
					case '2': {
						if ((char) bytes[index + 3] != '\\') {
							throw new RuntimeException("Expected \\");
						}
						byte[] hexBuffer = new byte[4];
						int i = index + 4;
						do {
							System.arraycopy(bytes, i, hexBuffer, 0, 4);
							String hexString = new String(hexBuffer, StandardCharsets.UTF_8);
							int cp = Integer.parseInt(hexString, 16);
							sb.append((char) cp);
							i += 4;
						} while ((char) bytes[i] != '\\');
						index = i + 4;
					}
						break;
					case '4': {
						if ((char) bytes[index + 3] != '\\') {
							throw new RuntimeException("Expected \\");
						}
						byte[] hexBuffer = new byte[8];
						int i = index + 4;
						do {
							System.arraycopy(bytes, i, hexBuffer, 0, 8);
							String hexString = new String(hexBuffer, StandardCharsets.UTF_8);
							int cp = Integer.parseInt(hexString, 16);
							sb.append((char) cp);
							i += 8;
						} while ((char) bytes[i] != '\\');
						index = i + 4;
					}
						break;
					}

					break;

				default:
					throw new RuntimeException("Unknown control code");

				}

				break;
			default:
				sb.append(c);
				index++;
				break;
			}
		}
		return sb.toString();
	}

	private static CharsetDecoder decoderFromAlphabet(byte c) {
		int index = c - 'A';
		if (index >= 0 && index < decoder_ISO_8859.length) {
			return decoder_ISO_8859[index];
		} else {
			throw new RuntimeException("Unknown alphabet \\P" + (char) c);
		}
	}

}
