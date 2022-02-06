package com.netflix.app.common.util;

public enum DateFormats {
	yyyyMMdd("yyyyMMdd"), MM_dd_yyyy("MM/dd/yyyy");

	 private String format;

	 private DateFormats(String f) {
		 format = f;
	 }

	 public String getFormat() {
	   return format;
	 }
}

