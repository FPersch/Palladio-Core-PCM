package de.uka.ipd.sdq.ByCounter.test;

import java.util.Random;

/**
 * @author Martin Krogmann
 * @author Michael Kuperberg
 * @since 0.1
 * @version 0.9
 */
public class NewCompressor extends Compressor {
	private static final Random rd = new Random();
	private static final Input_Buffer ib = new Input_Buffer(10000, getInput());
	private static final Output_Buffer ob = new Output_Buffer(new byte[10000]);
	public NewCompressor() {
		super(ib, ob);
	}

	private static final byte[] getInput(){
		final byte[] bArray = new byte[10000];
		for(int i=0; i<10000; i++){
			bArray[i] = (byte)rd.nextInt(256); 
		}
		return bArray;
	}
	
	public void compress(){
		super.compress();
	}
	public void compressFake(){
		System.out.println("Aha!");
	}
}


