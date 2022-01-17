package com.nic.san;

public class NewInstance {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class c1=Class.forName(args[0]);
		Class c2=Class.forName(args[1]);
		Object o1=c1.newInstance();
		Object o2=c2.newInstance();
		System.out.println("NewInstance.main()"+o1.toString());
		System.out.println("NewInstance.main()"+o2.toString());
		

	}

}
