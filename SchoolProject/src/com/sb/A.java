package com.sb;

import com.sa.Student1;
import com.sa.Student2;
/**
 * <h2>學員管理系統</h2>
 * A班學員<br>
 * Ex:<br>
 * A a=new A("a",10);
 * 
 * @author Teacher
 * @version 1.0
 */
public class A extends Student1 implements Student2 {
	private int chi;
	
	/**
	 * 
	 * @param name 輸入名字
	 * @param chi 輸入國文分數
	 */
	public A(String name,int chi) {
		super(name);
		this.chi=chi;
		
	}
	
	
	/**
	 * print-->A skill
	 */
	public void skill() {
		System.out.println("A skill");
		
	}
	
	/**
	 * 
	 * @return 讀取國文分數
	 */
	public int getChi() {
		return chi;
	}
	
	
	/**
	 * 
	 * @param chi 輸入修改國文分數
	 */
	public void setChi(int chi) {
		this.chi = chi;
	}
	
	

}