package com.travelsky.git;

public class testGitMerge {
	public static void testMaster() {
		System.out.println("主分支添加的内容");
		System.out.println("主分支添加的内容2");
	}
	public static void testDev() {
		System.out.println("dev分支测试");
	}
	public static void testDev2() {
		System.out.println("dev分支测试2");
	}
	public static void testDev3() {
		System.out.println("dev分支测试3");
	}
	public static void main(String[] args) {
		System.out.println("helloworld");
		testDev();
		testMaster();
	}
}
