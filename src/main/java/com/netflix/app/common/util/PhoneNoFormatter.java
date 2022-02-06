package com.netflix.app.common.util;

public abstract class PhoneNoFormatter {
	
	/*
	 * formatPhoneSeq function formats the phone number with '-'.
	 * ex) 1112223333 -> 111-222-3333
	 */
	public static String formatPhoneSeq(String phone) {
		
		if (phone != null && !phone.contains("-")) {
			String result = "";
			String phone1 = "";
			String phone2 = "";
			String phone3 = "";

			if (phone.length() > 6) {
				phone1 = phone.substring(0, 3);
				phone2 = phone.substring(3, 6);
				phone3 = phone.substring(6);
				result = phone1 + "-" + phone2 + "-" + phone3;
			} else if (phone.length() > 3) {
				phone1 = phone.substring(0, 3);
				phone2 = phone.substring(3);
				result = phone1 + "-" + phone2;
			}
			return result;
		} else {
			return phone;
		}
	}
}
