package de.uka.ipd.sdq.palladiofileshare.algorithms.compress;

import java.util.zip.CRC32;

public final class OutputBuffer {
    private int cnt;
    private byte[] buffer;
    
    public OutputBuffer(byte[] b) {
        buffer = b;
    }
    
    public int getLength() {
        return cnt;
    }
    
    public long getCRC() {
        CRC32 crc32 = new CRC32();
        crc32.update(buffer, 0, cnt);
        return crc32.getValue();
    }
    
    public void writeByte(byte c) {
        buffer[cnt++] = c;
    }
    
    public void writebytes(byte[] buf, int n) {
        for (int i = 0; i < n; i++) {
            buffer[cnt++] = buf[i];
        }
    }
}