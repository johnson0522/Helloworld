package com.java.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestJava {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
//		System.out.println("Hello Johnson");
		Map<String,Object> hm = new HashMap<String,Object>();
		hm.put("name", "Johnson");
		hm.put("sex", "male");
		hm.put("age", 40);
		Iterator<Entry<String,Object>> s = hm.entrySet().iterator();
		while(s.hasNext()) {
			Entry<String,Object> et = s.next();
			System.out.println(et.getKey() + " : " + et.getValue());
		}
//		Class.forName("com.java.test.TestJava");

	}

}
