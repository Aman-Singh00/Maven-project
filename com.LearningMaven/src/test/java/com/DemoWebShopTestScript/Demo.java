package com.DemoWebShopTestScript;

import java.time.LocalDateTime;

public class Demo {
	
	//public static RemoteWebDriver driver;
	
	public static String name() {
		LocalDateTime sysdate=LocalDateTime.now();
		String name=sysdate.toString().replace(":", "-");
		return name;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Demo.name());
	}

}
