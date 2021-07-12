package com.example.jvm;

public class MethodParam {
	Service service = new Service();

	public static void main(String[] args) {

		try {
			MethodParam methodParam = new MethodParam();
			methodParam.hi("nihao");
		} catch (Exception e) {
			System.out.println("hi");
		}
	}

	private static void doRuntimeException() {
		throw new RuntimeException("runtimeException");
	}

	public String hi(String hi) {
		Thread thread = Thread.currentThread();
		StackTraceElement stack[] = thread.getStackTrace();
		Thread.UncaughtExceptionHandler handler = thread.getUncaughtExceptionHandler();
		for (int i = 0; i < stack.length; i++) {
			System.out.print(stack[i].getClassName() + " 。" + stack[i].getMethodName() + "" + "-----");
		}

			doRuntimeException();


		String result = service.say(hi);
		System.out.println(result);
		return result;
	}
}
