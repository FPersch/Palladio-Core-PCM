package de.uka.ipd.sdq.edp2.storage.tests;

import java.io.File;
import java.io.IOException;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import de.uka.ipd.sdq.edp2.file.impl.BackgroundMemoryListImpl;
import de.uka.ipd.sdq.edp2.file.impl.DoubleSerializer;


/**Tests the behavior of the BackgroundMemoryList and DoubleSerialiser.
 * @author Henning Groenda
 */
public class DoubleBackgroundMemoryListTest {

	private static final int LARGE_NUMBER_OF_ELEMENTS = 1000000;
	
	/** Temporary file used to serialize data. */
	private static File tempFile = null;
	/** The used serializer. */
	private static DoubleSerializer doubleSerializer = new DoubleSerializer();
	/** The used background list. */
	private static BackgroundMemoryListImpl<Double> list;

	@Before
	public void initializeEnvironment() throws IOException {
		tempFile = File.createTempFile(DoubleBackgroundMemoryListTest.class.getName() + "_", ".tst");
		tempFile.deleteOnExit();
	}
	
	/**Checks if a single value can be serialized and deserialized successfully.
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void basicDeserialization() throws IOException {
		// Check list instance serialization size
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				doubleSerializer);
		Assert.assertEquals("File length of empty lists should be 0.", 0, tempFile.length());
		Assert.assertEquals("Size of empty array should be 0.", 0, list.size());
		list.add(1.0);
		Assert.assertEquals("Size of single element array should be 1.", 1, list.size());
		list.close();
		Assert.assertEquals("File length after storing and closing is the expected " +
				"product of object serialization size and number of data elements.", 
				doubleSerializer.getElementLength(), tempFile.length());
		
		// check if deserialization works with another instance
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				new DoubleSerializer());
		Assert.assertEquals("Deserilized test list must contain one element.", 1, list.size());
		Assert.assertEquals("Value before and after serialization must be the same.", 1.0, list.get(0));
	}

	/**Checks the behavior at chunk size limit (limit - 1).
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void basicDeserializationChunkSizeMinusOne() throws IOException {
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				doubleSerializer);
		basicDeserializationChunkSize(BackgroundMemoryListImpl.DEFAULT_CHUNK_SIZE - 1, 0);
		list.close();
	}

	/**Checks the behavior at chunk size limit (limit - 1).
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void basicDeserializationChunkSize() throws IOException {
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				doubleSerializer);
		basicDeserializationChunkSize(BackgroundMemoryListImpl.DEFAULT_CHUNK_SIZE, 0);
		list.close();
	}

	/**Checks the behavior at chunk size limit (limit - 1).
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void basicDeserializationChunkSizePlusOne() throws IOException {
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				doubleSerializer);
		basicDeserializationChunkSize(BackgroundMemoryListImpl.DEFAULT_CHUNK_SIZE + 1, 0);
		list.close();
	}
	
	/**Creates the specified number of elements in the list, closes it, and checks if values are the same.
	 * Asserts correct file size.
	 * @param numberElements Number of data elements to create.
	 * @param valueOffset Offset to add on the values stored.
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public void basicDeserializationChunkSize(long numberElements, int valueOffset) throws IOException {
		long oldListSize = list.size();
		
		// create and serialize elements
		for (double i = 0; i < numberElements; i++) {
			list.add(i + 1 + valueOffset);
		}
		list.close();
		Assert.assertEquals("File length after storing and closing is expected to be the " +
				"product of object serialization size and number of data elements.", 
				doubleSerializer.getElementLength() * (numberElements + oldListSize), tempFile.length());

		// check if deserialization works with another instance
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				new DoubleSerializer());
		Assert.assertEquals("Deserialized test list must contain " + (numberElements + oldListSize) + " element(s).", 
				numberElements + oldListSize, list.size());
		for (double i = 0; i < numberElements; i++) {
			Assert.assertEquals("Value(s) before and after serialization must be the same.", 
					i + 1 + valueOffset, list.get((int) (oldListSize + i)));
		}
	}
	
	/**Checks the behavior for large number of elements.
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void largeNumberOfElements() throws IOException {
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				doubleSerializer);
		basicDeserializationChunkSize(LARGE_NUMBER_OF_ELEMENTS, 0);
		list.close();
	}

	/**Checks if repetitive writing is possible. Also checks if there are errors when
	 * writing if all chunks are full.
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void repetitiveWriting() throws IOException {
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				new DoubleSerializer());
		basicDeserializationChunkSize(BackgroundMemoryListImpl.DEFAULT_CHUNK_SIZE, 0);
		basicDeserializationChunkSize(BackgroundMemoryListImpl.DEFAULT_CHUNK_SIZE - 1, 
				2 * BackgroundMemoryListImpl.DEFAULT_CHUNK_SIZE);
		basicDeserializationChunkSize(BackgroundMemoryListImpl.DEFAULT_CHUNK_SIZE + 2,
				4 * BackgroundMemoryListImpl.DEFAULT_CHUNK_SIZE);
		list.close();
	}
	
	/**Checks if an exception is throw if null Objects are added to the list.
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	@Test(expected=IllegalArgumentException.class)
	public void nullElementException() throws IOException {
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				new DoubleSerializer());
		list.add(null);
		list.close();
	}
	
	/**Checks if empty lists are serialized and deserialized correctly.
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void noElementsInList() throws IOException {
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				new DoubleSerializer());
		Assert.assertEquals("Size of empty list is not 0.", list.size(), 0);
		list.close();
		Assert.assertEquals("File size of empty list is not 0.", tempFile.length(), 0);
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				new DoubleSerializer());
		Assert.assertEquals("Size of empty list after deserialization is not 0.", list.size(), 0);
		list.close();
	}
	
	@SuppressWarnings("unchecked")
	@Test(expected=IllegalStateException.class)
	public void noAddAfterClose() throws IOException {
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				new DoubleSerializer());
		list.close();
		list.add(1.0);
	}

	@SuppressWarnings("unchecked")
	@Test(expected=IllegalStateException.class)
	public void noGetAfterClose() throws IOException {
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				new DoubleSerializer());
		list.close();
		list.get(1);
	}
	
	@SuppressWarnings("unchecked")
	@Test(expected=IllegalStateException.class)
	public void noCloseAfterClose() throws IOException {
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				new DoubleSerializer());
		list.close();
		list.close();
	}

	@SuppressWarnings("unchecked")
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void onlyPositiveIndices() throws IOException {
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				new DoubleSerializer());
		list.get(-1);
		list.close();
	}

	@SuppressWarnings("unchecked")
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void keepIndicesWithinExistingElements() throws IOException {
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				new DoubleSerializer());
		list.add(1.1);
		list.get(1);
		list.get(2);
		list.close();
	}
	
	/**Checks if the same file can be read correctly using different chunk sizes.
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void differentChunkSizes() throws IOException {
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				new DoubleSerializer());
		long numberElements = BackgroundMemoryListImpl.DEFAULT_CHUNK_SIZE + 2;
		// create and serialize elements
		for (double i = 0; i < numberElements; i++) {
			list.add(i + 1);
		}
		list.close();
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				new DoubleSerializer(), BackgroundMemoryListImpl.DEFAULT_CHUNK_SIZE / 4);
		Assert.assertEquals("Deserialized test list must contain " + numberElements + " element(s).", 
				numberElements, list.size());
		for (double i = 0; i < numberElements; i++) {
			Assert.assertEquals("Value(s) before and after serialization must be the same.", 
					i + 1, list.get((int) i));
		}
		list.close();
	}
	
	@SuppressWarnings({ "static-access", "unchecked" })
	@Test
	public void settingElementsInList() throws IOException {
		int numberElements = list.DEFAULT_CHUNK_SIZE + 20;
		int valueOffset = 30;
		double[] values = new double[numberElements];
		// create elements
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				new DoubleSerializer());
		for (int i = 0; i < numberElements; i++) {
			values[i] = i + 1 + valueOffset;
			list.add(values[i]);
		}
		// serialize
		list.close();
		
		// Check if changes are stored correctly
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				new DoubleSerializer());
		// select chunk and set value in another chunk
		list.get(0);
		double newValue = Math.random() * 100000;
		double oldValue;
		int positionOfChange = numberElements - 10; 
		oldValue = list.set(positionOfChange, newValue);
		Assert.assertEquals("Value must not be changed by serialization and setting a new value.",
				values[positionOfChange], oldValue);
		// select another chunk and look if value is stored in list
		list.get(0);
		Assert.assertEquals("Changed value not stored correctly.", 
				newValue, list.get(positionOfChange));
		values[positionOfChange] = newValue;
		list.close();
		
		// Check if only changed value is changed
		list = new BackgroundMemoryListImpl<Double>(tempFile.getAbsolutePath(),
				new DoubleSerializer());
		for (int i = 0; i < numberElements; i++) {
			Assert.assertEquals("Value(s) before and after serialization must be the same.", 
					values[i], list.get(i));
		}
	}
}
