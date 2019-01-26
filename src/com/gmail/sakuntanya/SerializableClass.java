package com.gmail.sakuntanya;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializableClass {

	public static void saveObjectToFile(Object obj, File file) throws IOException {
		if (obj == null || file == null) {
			throw new IllegalArgumentException();
		}
		try (ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(file))) {
			oos.writeObject(obj);
		} catch (IOException e) {
			throw e;
		}
	}

	public static Object loadObjectFromFile(File file) throws IOException, ClassNotFoundException {
		if (file == null) {
			throw new IllegalArgumentException();
		}
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			return ois.readObject();
		} catch (IOException| ClassNotFoundException e) {
			throw e;
		}

	}
}
