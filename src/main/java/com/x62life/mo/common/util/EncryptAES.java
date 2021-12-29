
package com.x62life.mo.common.util;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class EncryptAES {

    public static String Decrypt(String text, String key) throws Exception
    {
          Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
          
          byte[] keyBytes= new byte[16];
          byte[] b= key.getBytes("UTF-8");
          int len= b.length;

          if (len > keyBytes.length) len = keyBytes.length;
          System.arraycopy(b, 0, keyBytes, 0, len);

          SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
          IvParameterSpec ivSpec = new IvParameterSpec(keyBytes);
          cipher.init(Cipher.DECRYPT_MODE,keySpec,ivSpec);

          byte [] results = cipher.doFinal(Base64.getDecoder().decode(text));

          return new String(results,"UTF-8");
    }

    public static String Encrypt(String text, String key) throws Exception
    {
          Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

          byte[] keyBytes= new byte[16];
          byte[] b= key.getBytes("UTF-8");
          int len= b.length;

          if (len > keyBytes.length) len = keyBytes.length;
          System.arraycopy(b, 0, keyBytes, 0, len);

          SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
          IvParameterSpec ivSpec = new IvParameterSpec(keyBytes);
          cipher.init(Cipher.ENCRYPT_MODE,keySpec,ivSpec);

          byte[] results = cipher.doFinal(text.getBytes("UTF-8"));

          return Base64.getEncoder().encodeToString(results);
    }
		
	//  as-is  소스	
	//    Function AESDecrypt(sCypher, sPassword)
	//    Dim bytIn()
	//    Dim bytOut
	//    Dim bytPassword()
	//    Dim lCount
	//    Dim lLength
	//	Dim sTemp
	//	
	//    lLength = Len(sCypher)
	//    ReDim bytIn(lLength/2-1)
	//    For lCount = 0 To lLength/2-1
	//        bytIn(lCount) = CByte("&H" & Mid(sCypher,lCount*2+1,2))
	//    Next
	//    lLength = Len(sPassword)
	//    ReDim bytPassword(lLength-1)
	//    For lCount = 1 To lLength
	//        bytPassword(lCount-1) = CByte(AscB(Mid(sPassword,lCount,1)))
	//    Next
	//
	//    bytOut = DecryptData(bytIn, bytPassword)
	//
	//    lLength = UBound(bytOut) + 1
	//    sTemp = ""
	//    For lCount = 0 To lLength - 1
	//        sTemp = sTemp & Chr(bytOut(lCount))
	//    Next
	//
	//    AESDecrypt = sTemp
	//End Function
    
}
