package com.netflix.app.common.util;

public class RequestParamFilterUtil {
		
	    public static String handleRequestParam(String param) {
	        String result = param;
	        if(result!=null)
	        {	
		            result = RuleChecker.Replace(result, "\"", "&quot;");
		            result = RuleChecker.Replace(result, "<", "&lt;");
		            result = RuleChecker.Replace(result, ">", "&gt;");
		            result = RuleChecker.Replace(result, ".exe", ".txt");
		            result = RuleChecker.Replace(result, "javascript", "_");
		            result = RuleChecker.Replace(result, "script", "_");
		            result = RuleChecker.Replace(result, "SCRIPT", "_");
		            result = RuleChecker.Replace(result, "JAVASCRIPT", "_");
		            
		            result = RuleChecker.Replace(result, "'", "''");
		            result = RuleChecker.Replace(result, "--", "__");
		            result = RuleChecker.Replace(result, ";", "|");
		            //result = RuleChecker.Replace(result, "%", "");

		            result = RuleChecker.Replace(result, "(?i)SELECT", "_");
		            result = RuleChecker.Replace(result, "(?i)INSERT", "_");
		            result = RuleChecker.Replace(result, "(?i)UPDATE", "_");
		            result = RuleChecker.Replace(result, "(?i)DELETE", "_");

		        return result;
	        }
	        else
	        {
	        	return "";
	        }
	    }
	    /*
	     * check the validity of the url
	     */
	    public static boolean validTargetUrl(String url){
	    	boolean result = true;
	    	    	
	    	if(url != null){
	    		if(url.indexOf("samsung.com") == -1){
	    			result = false;
	    		}
	    	} else {
	    		result = false;
	    	}
	    	    	
	    	return result;
	    }
	    
	    public static String trimToEmpty(String str){
	        return str == null ? "" : str.trim();
	    }

	    public static boolean equalsToEmpty(String str1, String str2) {
	        return str1 == null ? str2 == null : str1.equals(str2);
	    }

	    public static String toDB(String str) {
	        String result = str;
	        result = RuleChecker.Replace(result, "'", "''");
	        result = RuleChecker.Replace(result, "--", "");
	        return result;
	    }

		public static boolean isEmptyString(String optinC310) {		
			if(optinC310 == null || optinC310.trim().length() == 0) {
				return true;
			}
			
			return false;
		}

}
