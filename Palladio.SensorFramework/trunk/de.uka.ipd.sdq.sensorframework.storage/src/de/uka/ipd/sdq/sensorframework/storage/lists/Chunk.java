package de.uka.ipd.sdq.sensorframework.storage.lists;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Chunk<T> {
	private long myFilePos;
	private Object[] data = null;
	private int nextFreeElement = 0;
	private RandomAccessFile raf;
	private ISerialiser serialiser;
	private boolean changed;
	private long fromElement;

	public Chunk(RandomAccessFile raf, ISerialiser serialiser) throws IOException {
		this.myFilePos = raf.length();
		this.raf = raf;
		this.serialiser = serialiser;
		data = new Object[BackgroundMemoryList.MEMORY_CHUNKS_SIZE];
		changed = false;
		fromElement = myFilePos / serialiser.getElementLenght();
	}

	public Chunk(RandomAccessFile raf, ISerialiser serialiser, int chunkNo) throws IOException {
		this.raf = raf;
		this.serialiser = serialiser;
		raf.seek(chunkNo * BackgroundMemoryList.MEMORY_CHUNKS_SIZE * serialiser.getElementLenght());
		this.myFilePos = raf.getFilePointer();
		loadChunk();
		changed = false;
		fromElement = myFilePos / serialiser.getElementLenght();
	}

	private void loadChunk() throws IOException {
		int count = (int)(BackgroundMemoryList.MEMORY_CHUNKS_SIZE * serialiser.getElementLenght());
		if (raf.length() < raf.getFilePointer() + count) {
			count = (int)( raf.length() - raf.getFilePointer() );
		}
		byte[] b = new byte[count];
		raf.read(b, 0, count);
		Object[] newData = serialiser.deserialise(b);
		if (newData.length == BackgroundMemoryList.MEMORY_CHUNKS_SIZE) {
			data = newData;
		} else {
			data = new Object[BackgroundMemoryList.MEMORY_CHUNKS_SIZE];
			for (int i = 0; i < newData.length; i++)
				data[i] = newData[i];
		}
		nextFreeElement = newData.length;
	}

	public void add(T d){
		if (d == null)
			throw new IllegalArgumentException("Background memory list does not support null values.");
		data[nextFreeElement++] = d;
		changed = true;
	}
	
	public void persist() throws IOException {
		if (changed) {
			raf.seek(myFilePos);
			raf.write(serialiser.serialise(data,nextFreeElement));
		}
	}

	public boolean isFull() {
		return nextFreeElement >= data.length;
	}
	
	public long fromElement() {
		return fromElement;
	}

	public long toElement() {
		return fromElement() + nextFreeElement - 1;
	}
	
	public int size() {
		return nextFreeElement;
	}

	public T get(int index) {
		return (T)data[index];
	}
}
