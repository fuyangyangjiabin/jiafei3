package com.jiafei;

public class Hello implements Runnable{
	public static void main(String[] args) {
		System.out.println(".............");
	}

	@Override
	public void run() {
		System.out.println("run");
	}
	
	static class World{
		private String guid;
		private String name;
		public String getGuid() {
			return guid;
		}
		public void setGuid(String guid) {
			this.guid = guid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
}
