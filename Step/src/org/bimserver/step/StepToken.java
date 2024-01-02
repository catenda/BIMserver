package org.bimserver.step;

public class StepToken {
    public static final byte TOKEN_BEGIN_EXCHANGE = 0;
    public static final byte TOKEN_END_EXCHANGE = 1;
    public static final byte TOKEN_HEADER = 2;
    public static final byte TOKEN_DATA = 3;
    public static final byte TOKEN_ENDSEC = 4;
    public static final byte TOKEN_IDENTIFIER = 5;
    public static final byte TOKEN_ENUM = 6;
    public static final byte TOKEN_INSTANCE_NAME = 7;
    public static final byte TOKEN_INTEGER = 8;
    public static final byte TOKEN_REAL= 9;
    public static final byte TOKEN_STRING = 10;
    public static final byte TOKEN_BINARY = 11;
    public static final byte TOKEN_UNSET = 12;
    public static final byte TOKEN_REDECLARED = 13;
    public static final byte TOKEN_EQUAL = 14;
    public static final byte TOKEN_LPAREN = 15;
    public static final byte TOKEN_RPAREN = 16;
    public static final byte TOKEN_COMMA = 17;
    public static final byte TOKEN_SEMICOLON = 18;
    public static final byte TOKEN_EOF = 19;
    public static final byte TOKEN_LOC = 20;
    public static final byte TOKEN_ERROR = 21;

    private final long position;
    private final byte type;
    private final int length;

    public StepToken(byte type, long position, int length) {
        this.position = position;
        this.type = type;
        this.length = length;
    }

    public long getPosition() {
        return position;
    }

    public byte getType() {
        return type;
    }

    public int getLength() {
        return length;
    }
}
