package com.velocity.demo1;

import java.util.ArrayList;

public class ArrayListDemo {

	
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("bunny");
		list.add("pranav");
		list.add("shubham");
		
		list.stream().forEach(x->System.out.println(x));
	}
}
