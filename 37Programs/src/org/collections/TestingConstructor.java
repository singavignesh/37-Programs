package org.collections;

public class TestingConstructor {
	public TestingConstructor(int a) {
		System.out.println("I am normal constructor");
	}
	public TestingConstructor() {
		this(15,"a");
			System.out.println("i am super constructor");
		}
	
	public TestingConstructor(int a, String b) {
		this(1);
			System.out.println("i am parent");
				}
		public static void main(String[] args) {
			TestingConstructor ni = new TestingConstructor();
		}
		
	}

