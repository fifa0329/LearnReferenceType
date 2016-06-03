package com.skywang.java;

import java.lang.ref.SoftReference;

public class SoftReferenceTest {

	public static void main(String[] args) {
		SoftReference ref = new SoftReference(new MyDate());
		ReferenceTest.drainMemory();
	}
}
