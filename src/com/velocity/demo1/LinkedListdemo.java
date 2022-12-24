package com.velocity.demo1;

import java.util.LinkedList;

public class LinkedListdemo {

	
	 public static void main(String[] args) {
		
		 LinkedList<Integer> list=new LinkedList<Integer>();
		 
		 list.add(1);
		 list.add(2);
		 list.add(3);
		 
		for(int a:list) {
			System.out.println(a);
		}
	}
}
