package com.netflix.app.common.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.*;
import java.util.Date;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;

//import com.sea.dotcom.sso.apiservice.util.SendTestRequestService;

/**
*	시스템 공통 모듈로 데이터 체크 및 변환 등의 작업하는 클래스.
*/
public class RuleChecker {

	private static final Log LOGGER = LogFactory.getLog(RuleChecker.class); 
	
	/** 숫자에 대한 문자열 */
	static private String numeric 	= "0123456789"; 
	/** 알파벳에 대한 문자열 */
	
	//static private String alpha 	= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; 

	/**
	*	str문자열에 들어있는 old_char문자열을 new_char문자열로 변환한 새로운 문자열을 반환하는 메소드.
	*
	*	<br>Examples:<br><br> 
	*	<pre>
	*		Replace("mesquite in your cellar", "e", "o")
	*			returns "mosquito in your collar"
	*		Replace("the war of baronets", "r", "y")
	*			returns "the way of bayonets"
	*	</pre>
	*	
	*	@param	str			변환전의 문자열
	*	@param	old_char	변환할 예전의 문자열
	*	@param	new_char	변환될 새로운 문자열
	*	@return	the String, 변환후의 문자열. 
	*/
	public static String Replace( String str , String old_char , String new_char ) {
		
		if( str == null || str.equals("") ) return "";
		else {
			int fromindex = 0;
			String temp = null;
			for(int i=0 ; i<str.length() ; i++) {
				fromindex = i;
				int pos = str.indexOf(old_char,fromindex);
				if( pos != -1 ) {
					temp = str.substring(0,pos) + new_char + str.substring(pos+old_char.length());
					str = temp;
					i = pos+new_char.length()-1;
				} else break;
			}	
			return str;
		}
	}

	/**
	*	str문자열에 들어있는 ch문자을 new_char문자열로 변환한 새로운 문자열을 반환하는 메소드.
	*
	*	<br>Examples:<br><br> 
	*	<pre>
	*		Replace("mesquite in your cellar", 'e', "o")
	*			returns "mosquito in your collar"
	*		Replace("the war of baronets", 'r', "y")
	*			returns "the way of bayonets"
	*	</pre>
	*	
	*	@param	str			변환전의 문자열
	*	@param	ch			변환할 예전의 문자
	*	@param	new_char	변환될 새로운 문자열
	*	@return	the String, 변환후의 문자열. 
	*/
	public static String Replace( String str , char ch, String new_char ) {
		
		Character chr = new Character(ch);
		
		String old_char = chr.toString();
		
		if( str == null || str.equals("") ) return "";
		else {
			int fromindex = 0;
			String temp = null;
			for(int i=0 ; i<str.length() ; i++) {
				fromindex = i;
				int pos = str.indexOf(old_char,fromindex);
				if( pos != -1 ) {
					temp = str.substring(0,pos) + new_char + str.substring(pos+old_char.length());
					str = temp;
					i = pos+new_char.length()-1;
				} else break;
			}	
			return str;
		}
	}

	/**
	*	str문자열에 들어있는 old_char문자열을 ch문자로 변환한 새로운 문자열을 반환하는 메소드.
	*
	*	<br>Examples:<br><br> 
	*	<pre>
	*		Replace("mesquite in your cellar", "e", 'o')
	*			returns "mosquito in your collar"
	*		Replace("the war of baronets", "r", 'y')
	*			returns "the way of bayonets"
	*	</pre>
	*	
	*	@param	str			변환전의 문자열
	*	@param	old_char	변환할 예전의 문자열
	*	@param	ch			변환될 새로운 문자
	*	@return	the String, 변환후의 문자열. 
	*/
	public static String Replace( String str , String old_char , char ch  ) {
		
		Character chr = new Character(ch);
		
		String new_char = chr.toString();
		
		if( str == null || str.equals("") ) return "";
		else {
			int fromindex = 0;
			String temp = null;
			for(int i=0 ; i<str.length() ; i++) {
				fromindex = i;
				int pos = str.indexOf(old_char,fromindex);
				if( pos != -1 ) {
					temp = str.substring(0,pos) + new_char + str.substring(pos+old_char.length());
					str = temp;
					i = pos+new_char.length()-1;
				} else break;
			}	
			return str;
		}
	}
	
	/**
	*	Vector sour에 attr값을 key로 해당하는 값과 value값과 같은 Item를 새로운 Vector에 추가하여 반환하는 메소드.
	*	
	*	@param	sour	HashTable객체를 Item로 하는 DB정보를 같는 Vector변수
	*	@param	attr	HashTable의 Key값
	*	@param	value	비교할 값
	*	@return	the Vector, 값이 같은 Item를 갖는 Vector.
	*/
 	@SuppressWarnings("unchecked")
	public static Vector efilter(Vector sour, String attr, String value) {
  		Vector result = new Vector();
  	
 		for(int i = 0; i < sour.size(); i++) {
 			String temp = (String)(((Hashtable)sour.elementAt(i)).get(attr.toUpperCase()));
 		
 			if(temp.equals(value))
 				result.add((Hashtable)sour.elementAt(i));
 		}
 	
 		return result;
 	
	}	

	/**
	*	Vector sour에 attr값을 key로 해당하는 값과 value값과 다른 Item를 새로운 Vector에 추가하여 반환하는 메소드.
	*	
	*	@param	sour	HashTable객체를 Item로 하는 DB정보를 같는 Vector변수
	*	@param	attr	HashTable의 Key값
	*	@param	value	비교할 값
	*	@return	the Vector, 값이 다른 Item를 갖는 Vector.
	*/
 	@SuppressWarnings("unchecked")
	public static Vector nfilter(Vector sour, String attr, String value) {
  		Vector result = new Vector();
  	
 		for(int i = 0; i < sour.size(); i++) {
 			String temp = (String)(((Hashtable)sour.elementAt(i)).get(attr.toUpperCase()));
 		
 			if(!temp.equals(value))
 				result.add((Hashtable)sour.elementAt(i));
 		}
 	
 		return result;
 	
	}	
	
	/**
	*	char 배열의 수을 반환하는 메소드.
	*	
	*	@param	temp	char 배열
	*	@return	the int, char 배열의 수.
	*/
	public static int arrayNum( char[] temp ) 
	{
		int count = 0;
		try {
			while( temp[count] != '\0' ) count++;
		} catch ( NullPointerException e) {
			LOGGER.error(e);
		} catch ( ArrayIndexOutOfBoundsException e) {
			LOGGER.error(e);
		} catch ( Exception e) {
			LOGGER.error(e);
		} 
		return count;

	}		

	/**
	*	String 배열의 수을 반환하는 메소드.
	*	
	*	@param	temp	String 배열
	*	@return	the int, String 배열의 수.
	*/	
	public static int arrayNum( String[] temp ) 
	{
		int count = 0;
		try {
			while( temp[count] != null ) count++;
		} catch ( NullPointerException e) {
		} catch ( ArrayIndexOutOfBoundsException e) {
		} catch ( Exception e) {}
		return count;
	}

	/**
	*	target 문자열이 숫자로 이루어진 것인지의 여부를 판단하는 메소드.
	*	
	*	@param	target	문자열
	*	@return	the boolean, 숫자로 이루어진 문자열이면  true, 그외에는 false.
	*/	
	public static boolean isNumeric( String target ) 
	{
		for ( int i = 0 ; i < target.length() ; i++ ) {
			if ( numeric.lastIndexOf(target.charAt(i)) == -1 ) return false;
		}
		return true;
	}

	/**
	*	하나의 Vector에 또다른 Vector를 추가해 Vector로 반환하는 메소드.
	*	
	*	@param	aV		Vector변수
	*	@param	bV		aV 에 추가할 Vector변수
	*	@return	the Vector, aV에 bV가 추가된 Vector.
	*/
	@SuppressWarnings("unchecked")
	public static Vector VaddVector( Vector aV , Vector bV ) 
	{
		for ( int i = 0 ; i < bV.size() ; i++ ) {
			aV.addElement(bV.elementAt(i));
		}
		return aV;
	}

	/**
	*	문자열을 왼쪽에서부터 특정길이 만큼만 문자열로 반환하는 메소드.
	*	
	*	<br>Examples:<br><br> 
	*	<pre>
	*		Left("mesquite", 5)
	*			returns "mesqu"
	*	</pre>
	*	
	*	@param	str		원본문자열
	*	@param	num		문자열의 길이
	*	@return	the String, 왼쪽에서부터 특정길이의 문자열.
	*/
	public static String Left( String str , int num ) {
		if(str == null) return null;
		else if( str.length() < num ) return str;
		else return str.substring(0,num);
	}
	
	/**
	*	문자열을 왼쪽에서부터 특정길이 만큼만 문자열로 반환하는 메소드.
	*	<br>사용하지 않는 메소드인 것 같음.
	*	
	*	@param	str		원본문자열
	*	@param	num		문자열의 길이
	*	@return	the String, 왼쪽에서부터 특정길이의 문자열.
	*/
	public static String LeftB( String str , int num ) {
		if(str == null) return null;
		else
		{
			int strByte=0;
			int strLen = str.length();
			String rtnStr = "";
			
			for(int i=0;i<strLen;i++)
    		{
    			if(str.charAt(i) >= ' ' && str.charAt(i) <= '~' ) strByte++;
    			else strByte += 2;
        		if (strByte > num) break;
        		rtnStr = rtnStr+str.substring(i,i+1);
    		}
			return rtnStr;
		}
	}

	/**
	*	문자열을 오른쪽에서부터 특정길이 만큼만 문자열로 반환하는 메소드.
	*	
	*	<br>Examples:<br><br> 
	*	<pre>
	*		Right("mesquite", 5)
	*			returns "quite"
	*	</pre>
	*	
	*	@param	str		원본문자열
	*	@param	num		문자열의 길이
	*	@return	the String, 오른쪽에서부터 특정길이의 문자열.
	*/
	public static String Right( String str , int num ) {
		if(str == null) return null;
		else if( str.length() < num ) return str;
		else return str.substring(str.length()-num);
	}

	/**
	*	문자열을 특정위치에서부터 특정길이 만큼만 문자열로 반환하는 메소드.
	*	
	*	<br>Examples:<br><br> 
	*	<pre>
	*		Mid("mesquite", 4, 4)
	*			returns "quit"
	*	</pre>
	*	
	*	@param	str		원본문자열
	*	@param	num		문자열의 길이
	*	@return	the String, 특정위치에서부터 특정길이의 문자열.
	*/
	public static String Mid( String str , int start_num , int end_num ) {
		if(str == null) return null;
		else if( str.length() < end_num || str.length() < start_num ) return str;
		else return str.substring(start_num-1,start_num-1+end_num);
	}

	/**
	*	문자열을 특정문자열로 구분하여 String배열로 반환하는 메소드.
	*	
	*	@param	strSP		원본문자열
	*	@param	giho		특정문자열
	*	@return	Array of the String , 특정문자열로 구분된 String배열.
	*/	
	public static String[] splitIt(String strSP, String giho){
		
		if( strSP == null || strSP.trim().equals("")) return new String[1];

		StringTokenizer st = new StringTokenizer(RuleChecker.Replace(strSP,giho," "+giho+" "),giho);
		int stCount = st.countTokens();
		String[] temp = new String [stCount];

		for(int i=0; i < stCount; i++){
			int pos = strSP.indexOf(giho);
			if( pos >= 0 ) {
				temp[i] = strSP.substring(0, pos);
				strSP = strSP.substring(pos+giho.length());
			} else {
				temp[i] = strSP;
				break;
			}
		}
		return(temp);
	}
		
	/**
	*	문자열의 HTML 태그를 웹에서 보여주기 위해 encode하여 문자열로 반환하는 메소드.
	*	
	*	<br>Examples:<br><br> 
	*	<pre>
	*		HtmlEncode("<b>문자열</b>")
	*			returns "&lt;b&gt;문자열&lt;/b&gt;"
	*	</pre>
	*	
	*	@param	str		원본문자열
	*	@return	the String, 특정위치에서부터 특정길이의 문자열.
	*/
	public static String HtmlEncode(String str) {
		if (str == null) return "";
		StringBuffer results = null;
		char[] orig = null;
		int beg = 0, len = str.length();
		for (int i = 0; i < len; ++i){
			char c = str.charAt(i);
			switch (c){
			case 0:
			case '&':
			case '<':
			case '>':
			case '"':
				if (results == null){
					orig = str.toCharArray();
					results = new StringBuffer(len+10);
				}
				if (i > beg)
				results.append(orig, beg, i-beg);
				beg = i + 1;
				switch (c){
					default: // case 0:
					continue;
					case '&':
					results.append("&amp;");
					break;
					case '<':
					results.append("&lt;");
					break;
					case '>':
					results.append("&gt;");
					break;
					case '"':
					results.append("&quot;");
					break;
				}
				break;
			}
		}
		if (results == null) return str;
		results.append(orig, beg, len-beg);
		return results.toString();

		//if(str == null) return null;
		//else return RuleChecker.Replace(RuleChecker.Replace(RuleChecker.Replace(str,"&","&amp;"),"<","&lt;"),">","&gt;");
	}

	/**
	*	문자열을 특정문자("...")를 붙쳐서 특정길이로 반환하는 메소드.
	*	<br>한글에 대해서는 길이를 2로 처리하며 한글이 깨지는것도 방지한다.
	*	
	*	<br>Examples:<br><br> 
	*	<pre>
	*		CutStr("Korea팀파이팅대한민국팀파이팅", 15)
	*			returns "Korea팀파이팅..."
	*	</pre>
	*	
	*	@param	str		원본문자열
	*	@param	num		문자열의 길이
	*	@return	the String, 특정위치에서부터 특정길이의 문자열.
	*/
	public static String CutStr(String xxx, int limit) {
		if (limit < 5 )
			return xxx;
			
		int strlen = 0;
		char c;
		StringBuffer rtnStrBuf = new StringBuffer();
		for(int j = 0; j < xxx.length(); j++)
		{
			c = xxx.charAt(j);
			if( c == '<' || c == '>' ) {
				strlen++;
			} else {
				if ( c  <  0xac00 || 0xd7a3 < c )
				{
					strlen++;
				} 
				else  
					strlen+=2;  //한글이다..
			}
			
			rtnStrBuf.append(c);
			if (strlen > limit-3)
			{
				rtnStrBuf.append("...");
				break;
			}				
		}
		return rtnStrBuf.toString();
	}

	/**
	*	특정파일을 한줄씩 읽어서 Vector로 반환하는 메소드.
	*	
	*	@param	filename	파일의 절대경로명
	*	@return	the Vector, 파일의 데이터.
	*/
	@SuppressWarnings("unchecked")
	public static Vector readFile(String filename) {
		Vector vc = null;
		BufferedReader in=null;
		try {
			in = new BufferedReader(new FileReader(new File(filename)));
			vc = new Vector();
			while( in.ready() ) {
				vc.add(in.readLine());
			}
			in.close();
		} catch( FileNotFoundException e) {
			LOGGER.error(e);
		} 
		catch(IOException ioe){
			LOGGER.error(ioe);
		}
		finally {
			  if ( in != null ) {
				    try {
				    	in.close();
				    }
				    catch ( IOException ioe ) {
				    	LOGGER.error(ioe);
				    }
				  }
		}
			return vc;

	}

	/**
	*	Vector의 정보를 한줄씩 특정파일에 저장하는 메소드.
	*	
	*	@param	vc			문자열 정보가 있는 Vector
	*	@param	filename	파일의 절대경로명
	*/
	@SuppressWarnings("unchecked")
	public static void writeFile(Vector vc, String filename) {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(new File(filename))));
			for( int i=0 ; i< vc.size() ; i++ ) {
				out.println((String)vc.elementAt(i));
			}
			out.close();
		} catch(IOException ioe) {
			System.out.println(ioe);
		}
	}

	/**
	*	날짜에 대한 "YYYYMMDD"형태의 문자열인지를 판단하는 메소드.
	*	
	*	@param	strVal	검사를 하려는 문자열
	*	@return the boolean, 올바른 형태이면 true, 그외에는 false.
	*/
	public static boolean isDate(String strVal){
		
			if(strVal != null && !strVal.equals(""))
			{
				// 8자리가 넘을경우 앞 8자 분리
				if (strVal.length() > 8) strVal = strVal.substring(0, 8);
				
				// 년월일 분리
				int    TermY  = Integer.parseInt(strVal.substring(0,4));
				int    TermM  = Integer.parseInt(strVal.substring(4,6));
				int    TermD  = Integer.parseInt(strVal.substring(6,8));
				
				// 월확인
				if (TermM < 1 || TermM > 12) return false;
				
				// 일확인
				int[] day_num = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				if(((TermY % 4 == 0) && (TermY % 100 != 0)) || (TermY % 400 == 0)) day_num[1]=29;
				
				if (TermD < 1 || TermD > day_num[TermM-1] ) return false;
			}
			else 
			{
				return false;
			}
	
		return true;
	}

	/**
	*	문자열에서 공백문자(' ', '\n', '\r', '\t')를 제거하여 반환하는 메소드.
	*	
	*	<br>Examples:<br><br> 
	*	<pre>
	*		DelBlank("아버지가 방에 들어가신다")
	*			returns "아버지가방에들어가신다"
	*	</pre>
	*	
	*	@param	str		원본문자열
	*	@return	the String, 공백문자를 제거한 문자열.
	*/
	public static String DelBlank( String str ) {
		if( str == null || str.trim().equals("")) return str;
		int len = str.length();
		String ret = "";
		for( int i =0 ; i<len ; i++ ) {
			if( !str.substring(i,i+1).equals(" ") && !str.substring(i,i+1).equals("\t") && !str.substring(i,i+1).equals("\r") && !str.substring(i,i+1).equals("\n")) {
				ret += str.substring(i,i+1);
			}
		}
		return ret;
	}
	
	/**
	*	문자열에서 뒤의 공백문자(' ', '\n', '\r', '\t')를 제거하여 반환하는 메소드.
	*	
	*	<br>Examples:<br><br> 
	*	<pre>
	*		rtrim("월드컵  ")
	*			returns "월드컵"
	*	</pre>
	*	
	*	@param	str		원본문자열
	*	@return	the String, 공백문자를 제거한 문자열.
	*/
	public static String rtrim( String str ) {
		if( str == null || str.trim().equals("")) return str;
		while(str.substring(str.length()-1,str.length()).equals(" ")
		    ||str.substring(str.length()-1,str.length()).equals("\t")
		    ||str.substring(str.length()-1,str.length()).equals("\0")
		    ||str.substring(str.length()-1,str.length()).equals("\n")
		    ||str.substring(str.length()-1,str.length()).equals("\r")) {
			str = str.substring(0,str.length()-1);
		}
		return str;
	}

	/**
	*	문자열에서 URL주소를 반환하는 메소드.
	*	
	*	@param	str		원본문자열
	*	@return	the String, URL주소.
	*/
	public static String create_url( String str ) {
		String tem1 = "";
		String tem2 = "";
		String ret = str;
		
		ret = RuleChecker.Replace(ret,"/./","/");
			while( ret.indexOf("../") >= 0 ) {
				int i= ret.indexOf("../");
				tem1 = ret.substring(0,i-1);
				tem2 = ret.substring(i);
				tem1 = tem1.substring(0,tem1.lastIndexOf("/")+1);
				tem2 = tem2.substring(3);
				ret = tem1+tem2;
			}

			return ret;

	}

	/**
	*	Date객체를 특정 날짜형식의 문자열로 반환하는 메소드.
	*	
	*	@param	formatType		날짜형식
	*	@param	currentDate		날짜 객체
	*	@return	the String, 특정형식의 날짜 문자열.
	*/
	public static String format(String formatType, Date currentDate){
		 //예 : formatType ="yyyy MM dd HH mm ss"
		  java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(formatType,java.util.Locale.KOREA);

		   String formattedDate = formatter.format(currentDate);

		   return formattedDate;

	}

	/**
	*	숫자에 대한 문자열에 앞에 특정한 길이에 맞춰서 "0"을 채워 반환하는 메소드.
	*	
	*	@param	str		숫자문자열
	*	@param	len		특정한 길이
	*	@return	the String, "0"을 포함하는 문자열
	*/
	public static String AddZeroLen(String str , int len) {
		if( str == null ) return str;
		if( str.length() < len ) {
			int temp = len - str.length();
			for( int i=0 ; i<temp ; i++ )
				str = "0" + str;
			return str;
		} else {
			return str;
		}
	}

	/**
	*	입력한 String값이 빈문자열("") 또는 null 값일 경우 0을 리턴.  
	*	
	*	@param	str		숫자문자열
	*	@return	the int parseInt()된 값
	*/
	public static int parseInt(String intStr)
	{
		int i=0;
		i=Integer.parseInt(intStr);
		return i;

	}

}