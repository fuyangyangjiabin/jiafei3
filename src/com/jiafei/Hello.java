package com.jiafei;

public class Hello implements Runnable{
	public static void main(String[] args) {
		System.out.println(".............");
	}

	@Override
	public void run() {
		System.out.println("run");
	}
}
