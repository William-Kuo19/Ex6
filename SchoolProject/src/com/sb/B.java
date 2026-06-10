package com.sb;

import com.sa.Student1;
import com.sa.Student2;

public class B extends Student1 implements Student2{
	private int eng;
	
	public B(String name,int eng) {
		super(name);
		this.eng=eng;
	}

	@Override
	public void skill() {
		System.out.println("B skill");
		
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	
	

}