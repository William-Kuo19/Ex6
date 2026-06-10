package com.sc;

import com.sa.Student1;
import com.sa.Student2;
import com.sb.A;
import com.sb.B;

public class Addstudent {

	public static void main(String[] args) {
		Student1 s1=new Student1("abc");
		System.out.println(s1.getName());
		
		Student2 s2=new A("abc",70);
		A s3=new A("abc",70);
		
		System.out.println(s3.getName());
		
		B s4=new B("a",85);

	}

}