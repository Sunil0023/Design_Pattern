package com.creational.phoneFactory;

public class PhoneFactory {

	public Phone getPhone(String phoneType) throws Exception{
		if(phoneType.equals("ios")) {
			return new Ios();
		}else if(phoneType.equals("windows")) {
			return new Windows();
		} else if(phoneType.equals("android")) {
			return new Android();
		}else {
			throw new InvalidPhoneType("invalid Phone Type, possible values are: ios, windows, android");
		}
	}

}
