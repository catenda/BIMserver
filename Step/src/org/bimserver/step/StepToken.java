package org.bimserver.step;

public class StepToken {
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
