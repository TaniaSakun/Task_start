package com.gmail.sakuntanya;

import java.io.Serializable;

public class Cat implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String type;

	public Cat(int age, double weigt, boolean sex, String ration, String name, String type) {
		this.name = name;
		this.type = type;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public void getVoice() {
		System.out.println("Meow");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", type=" + type + "," + super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	
	}

	@Override
	public Cat clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Cat) super.clone();
	}

}
