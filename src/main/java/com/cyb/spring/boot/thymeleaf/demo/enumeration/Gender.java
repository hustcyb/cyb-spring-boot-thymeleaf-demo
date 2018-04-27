package com.cyb.spring.boot.thymeleaf.demo.enumeration;

public enum Gender {
	Male((byte) 0, "男"), Female((byte) 1, "女");

	private byte value;

	private String name;

	private Gender(byte value, String name) {
		this.value = value;
		this.name = name;
	}

	public byte getValue() {
		return value;
	}

	public String getName() {
		return name;
	}
}
