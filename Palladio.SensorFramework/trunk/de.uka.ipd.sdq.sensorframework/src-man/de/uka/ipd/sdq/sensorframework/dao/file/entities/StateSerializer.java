package de.uka.ipd.sdq.sensorframework.dao.file.entities;

import java.util.HashMap;

import de.uka.ipd.sdq.sensorframework.entities.State;
import de.uka.ipd.sdq.sensorframework.entities.StateSensor;
import de.uka.ipd.sdq.sensorframework.storage.lists.ISerialiser;

public class StateSerializer implements ISerialiser {

	HashMap<Long, State> hashMap = new HashMap<Long, State>(); 
	
	public StateSerializer(StateSensor stateSensor){
		for (State s : stateSensor.getSensorStates()) {
			hashMap.put(s.getStateID(),s);
		}
	}
	
	public Object[] deserialise(byte[] bytes) {
		State[] states = new State[(int)(bytes.length / getElementLenght())];
		int blockPos = 0;
		for (int j = 0; j<states.length; j++){
			long l = 0;
			for (int i = 7; i >=0; i--) {
				l = l << 8;
				l |= bytes[blockPos+i] < 0 ? 256 + bytes[blockPos+i] : bytes[blockPos+i];
			}
			blockPos += 8;
			states[j] = hashMap.get(l);
			if (states[j] == null)
				throw new RuntimeException("State could not be deserialized as it returned null values for states.");
		}
		return states;
	}

	public long getElementLenght() {
		return 8;
	}

	public byte[] serialise(Object[] objects, int count) {
		byte[] block = new byte[(int)(count*getElementLenght())];
		int blockPos = 0;
		for (int j = 0; j < count; j++){
			long l = ((State)objects[j]).getStateID();
			for (int i = 0; i < 8; i++) {
				block[blockPos++] = (byte)(l & 0xff);
				l = l >> 8;
			}
		}
		return block;
	}

}
