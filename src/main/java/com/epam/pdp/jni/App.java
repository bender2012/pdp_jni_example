package com.epam.pdp.jni;

public class App {

	public native void print();

	private static String cc3260_DLLPath = "src/main/resources/cc3260";
	private static String stlp45_DLLPath = "src/main/resources/stlp45";
	private static String HelloWorldDLLPath = "src/main/resources/HelloWorldDLL";

	public static void main(String[] args) {
		System.loadLibrary(cc3260_DLLPath);
		System.loadLibrary(stlp45_DLLPath);
		System.loadLibrary(HelloWorldDLLPath);
		App app = new App();
		app.print();
	}

}
