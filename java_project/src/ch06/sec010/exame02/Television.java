package ch06.sec010.exame02;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
	static {
		info = company+"-"+model;
	}
}
