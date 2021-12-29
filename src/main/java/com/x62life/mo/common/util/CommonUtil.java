package com.x62life.mo.common.util;

import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class CommonUtil
{
	public static final String NULL_STRING = "NULL";
    public static final String EMPTY_STRING = "";
    public static String nvl(String str, String returnStr)
    {
        if( str == null || str.equalsIgnoreCase(NULL_STRING) || str.equals(EMPTY_STRING) )
        {
            return returnStr;
        }
        else
        {
            try
            {

                return str;
            }
            catch (Exception e)
            {
                e.printStackTrace();
                return returnStr;
            }
        }
    }
 // get Public key Value
    public static byte[] getPublicKey(String keyPath)
    {

    byte[] b = null;

        try {
        
        int n;
       // InputStream fis1 = CommonUtil.class.getClassLoader()
        //.getResourceAsStream(keyPath);
        FileInputStream fis1 = new FileInputStream(keyPath); 

        n = fis1.available();
        b = new byte[n];

        while (n > 0) {
                int result = fis1.read(b);
                if (result == -1) break;
            }

        }
        catch (IOException e) {
              System.err.println(e); 
        }
        catch (Exception e) {
                e.printStackTrace();
        }
    return b;

    }
	public static String getValidDate(String dateStr,DateFormats inputDateFormat,DateFormats outputDateFormat ) {
		String inputDateFormatStr = inputDateFormat.getFormat();
		String outputDateFormatStr = outputDateFormat.getFormat();
		String formattedDateStr  = "";
		if(dateStr!=null&&dateStr.length()>1){
		try {
			SimpleDateFormat inputFormatter = new SimpleDateFormat(inputDateFormatStr);
			inputFormatter.setLenient(false);
			SimpleDateFormat outputFormatter = new SimpleDateFormat(outputDateFormatStr);
			formattedDateStr = outputFormatter.format(inputFormatter.parse(dateStr));
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid date "+ dateStr);
		} catch(Exception anyOtherException){
			System.out.println("Invalid date "+ anyOtherException.getMessage());
		}
		}
		return formattedDateStr;
	}
	
	public static boolean isEmptyString( String s ){
		return ( null == s || s.length() == 0 );
	}

	/*public static String getMessageBody(Campaign campaign) throws Exception {
		
		String path = CampaignConstants.getProperty("VELOCITY_TEMPLATE_PATH");
		Properties p = new Properties();
		p.setProperty(Velocity.RESOURCE_LOADER, "class");   
	    p.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader"); // Set the class path to load the template  
		
		VelocityEngine ve = new VelocityEngine();
		ve.init(p);
		VelocityContext context = new VelocityContext();
		
		String vmFileName = "campaign_created.vm";

		
		Template t = ve.getTemplate(vmFileName);

		context.put("campaign", campaign);
		StringWriter writer = new StringWriter();
		t.merge( context, writer ); 
		return writer.toString();
	}*/

	public static boolean isValidDate(String dateStr,DateFormats inputDateFormat) {
		String inputDateFormatStr = inputDateFormat.getFormat();
		Date testDate = null;
		SimpleDateFormat inputFormatter = new SimpleDateFormat(inputDateFormatStr);
		if(dateStr!=null&&dateStr.length()>1){
		try {
			testDate = inputFormatter.parse(dateStr);
			} catch (ParseException e) {
			System.out.println(e.getMessage());
			return false;
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid date "+ dateStr);
			return false;
		}
		if (!inputFormatter.format(testDate).equals(dateStr)) 
	    {
			System.out.println("Invalid date "+ dateStr);
	      return false;
	    }
		}
		return true;
	}
	
	public static Properties getPropertiesFromFile(String fileName){
		Properties properties = new Properties(); 
		try { 
			InputStream inputStream = CommonUtil.class.getClassLoader()  
			                .getResourceAsStream(fileName+".properties");  
			  
			      // load the inputStream using the Properties  
			        properties.load(inputStream); 
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return properties;
	}
	public static String getDateStr(Date dateObj,DateFormats dateFormat) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat.getFormat());
		return sdf.format(dateObj);
	}
	public static String getmonthNo(String month) {
		// TODO Auto-generated method stub
		String monthNo = "";
		if("JANUARY".equalsIgnoreCase(month)){
			monthNo = "01";
		}
		if("FEBRUARY".equalsIgnoreCase(month)){
			monthNo = "02";
		}
		if("MARCH".equalsIgnoreCase(month)){
			monthNo = "03";
		}
		if("APRIL".equalsIgnoreCase(month)){
			monthNo = "04";
		}
		if("MAY".equalsIgnoreCase(month)){
			monthNo = "05";
		}
		if("JUNE".equalsIgnoreCase(month)){
			monthNo = "06";
		}
		if("JULY".equalsIgnoreCase(month)){
			monthNo = "07";
		}
		if("AUGUST".equalsIgnoreCase(month)){
			monthNo = "08";
		}
		if("SEPTEMBER".equalsIgnoreCase(month)){
			monthNo = "09";
		}
		if("OCTOBER".equalsIgnoreCase(month)){
			monthNo = "10";
		}
		if("NOVEMBER".equalsIgnoreCase(month)){
			monthNo = "11";
		}
		if("DECEMBER".equalsIgnoreCase(month)){
			monthNo = "12";
		}
		
		return monthNo;
	}
	
	public static boolean isSSOUser(HttpServletRequest request)
	{
		return request.getSession().getAttribute("ssoUser") != null;
	}
	
}