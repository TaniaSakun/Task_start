package com.gmail.sakuntanya;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		Cat catOne = new Cat(3, 7, true, "Milk", "Vaska", "HomeCat");
		Cat catTwo = new Cat(3, 7, true, "Milk", "Vaska", "HomeCat");
		catOne.getVoice();
		System.out.println(catOne.hashCode());
		System.out.println(catTwo.hashCode());
		System.out.println();
		System.out.println(catOne == catTwo);
		System.out.println(catOne.equals(catTwo));
		System.out.println();
		Cat catTree = null;
		try {
			catTree = catOne.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(catTree == catOne);
		System.out.println(catTree.equals(catOne));
		System.out.println();

		Class catClass = catOne.getClass();
		Field[] catField = catClass.getDeclaredFields();
		for (int i = 0; i < catField.length; i++) {
			System.out.println(catField[i]);
		}
		System.out.println();

		Method[] catMethod = catClass.getDeclaredMethods();
		for (int i = 0; i < catMethod.length; i++) {
			System.out.println(catMethod[i]);
		}
		System.out.println();

		Constructor<?>[] catConstructor = catClass.getDeclaredConstructors();
		for (int i = 0; i < catConstructor.length; i++) {
			System.out.println(catConstructor[i]);
		}
		System.out.println();

		Field catAge = null;
		try {
			catAge = catClass.getDeclaredField("age");
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(catOne);

		File file = new File("cat.dat");
		try {
			SerializableClass.saveObjectToFile(catOne, file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Cat catFive = null;
		try {
			catFive = (Cat) SerializableClass.loadObjectFromFile(file);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(catFive);
	}
}
