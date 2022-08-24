package com.mycompany.tutorial.ch06;

public class Television {
	
    public static String company = "samsun";
    public static String model = "OLED";
    public static String info;
    
    public String version = "1.0";
    
    static {
    	company = company + "g";
    	info = company + " " + model;
    }
}
