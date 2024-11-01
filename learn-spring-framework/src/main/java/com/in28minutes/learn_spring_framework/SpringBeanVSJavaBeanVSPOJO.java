package com.in28minutes.learn_spring_framework;
import java.io.Serializable;

class Pojo {
	
	private String text = "my_text";
	private int number = 10;
	
	public String toString() {
		return text + " : " + number;
	}
}

class JavaBean implements Serializable {
	
	// public no-arg constructor
	public JavaBean() {
		
	}
	
	private String text;
	private int number;
	
	// getters and setters 
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}	
}

public class SpringBeanVSJavaBeanVSPOJO {

	public static void main(String[] args) {
		
		Pojo pojo = new Pojo();
		
		System.out.println(pojo.toString());
		
		JavaBean java_bean = new JavaBean();
		
		java_bean.setText("Java bean text");	
		java_bean.setNumber(777);
		
		System.out.println(java_bean.getText() + " \n" + java_bean.getNumber());		
	}
}
