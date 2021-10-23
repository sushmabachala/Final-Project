package com.air.observer;

public class Users implements Observer{

	@Override
	public void notifyUser(String msg, String userName) {
		// TODO Auto-generated method stub
		System.out.println("******"+msg+" "+userName+" **********");
	}
	
	
	

}
