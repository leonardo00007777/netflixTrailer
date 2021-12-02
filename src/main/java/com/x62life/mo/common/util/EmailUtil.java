package com.x62life.mo.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.x62life.mo.common.exception.UserServiceException;

public class EmailUtil {

	private static final Log LOGGER = LogFactory.getLog(EmailUtil.class);
	
	private String smtpHost;
	private String smtpAccount;
	private String smtpPassword;
	private String smtpTemplateDir;	
	private String smtpAuth;
	private String smtpTestEmail;
	private String cyberUrl;
	private String cyberSslUrl;	
	/* Added by shanth */
	private String resetPWEmailLoginURL;
	
	private boolean smtpDebug;
	
	
	
	
	/**
	 * @return the resetPWEmailLoginURL
	 */
	public String getResetPWEmailLoginURL() {
		return resetPWEmailLoginURL;
	}

	/**
	 * @param resetPWEmailLoginURL the resetPWEmailLoginURL to set
	 */
	public void setResetPWEmailLoginURL(String resetPWEmailLoginURL) {
		this.resetPWEmailLoginURL = resetPWEmailLoginURL;
	}

	
	
	/**
	 * Returns the cyber url
	 * @return
	 */
	public String getCyberUrl() {
		return cyberUrl;
	}

	/**
	 * Sets the cyber url
	 * @param cyberUrl
	 */
	public void setCyberUrl(String cyberUrl) {
		this.cyberUrl = cyberUrl;
	}

	/**
	 * Returns the cyber ssl url
	 * @return
	 */
	public String getCyberSslUrl() {
		return cyberSslUrl;
	}

	/**
	 * Sets the cyber ssl url
	 * @param cyberSslUrl
	 */
	public void setCyberSslUrl(String cyberSslUrl) {
		this.cyberSslUrl = cyberSslUrl;
	}

	/**
	 * Returns the test email address
	 * @return
	 */
	public String getSmtpTestEmail() {
		return smtpTestEmail;
	}

	/**
	 * Sets the test email address
	 * @param smtpTestEmail
	 */
	public void setSmtpTestEmail(String smtpTestEmail) {
		this.smtpTestEmail = smtpTestEmail;
	}

	/**
	 * Returns the smtp host
	 * @return
	 */
	public String getSmtpHost() {
		return smtpHost;
	}

	/**
	 * Sets the host
	 * @param smtpHost
	 */
	public void setSmtpHost(String smtpHost) {
		this.smtpHost = smtpHost;
	}

	/**
	 * Returns the smtp account
	 * @return
	 */
	public String getSmtpAccount() {
		return smtpAccount;
	}

	/**
	 * Sets the smtp account
	 * @param smtpAccount
	 */
	public void setSmtpAccount(String smtpAccount) {
		this.smtpAccount = smtpAccount;
	}

	/**
	 * Returns the smtp password
	 * @return
	 */
	public String getSmtpPassword() {
		return smtpPassword;
	}

	/**
	 * Sets the smtp password
	 * @param smtpPassword
	 */
	public void setSmtpPassword(String smtpPassword) {
		this.smtpPassword = smtpPassword;
	}

	/**
	 * Returns the email template directory path 
	 * @return
	 */
	public String getSmtpTemplateDir() {
		return smtpTemplateDir;
	}

	/**
	 * Sets the email template directory path
	 * @param smtpTemplateDir
	 */
	public void setSmtpTemplateDir(String smtpTemplateDir) {
		this.smtpTemplateDir = smtpTemplateDir;
	}

	/**
	 * Returns the debug flag
	 * @return
	 */
	public boolean getSmtpDebug() {
		return smtpDebug;
	}

	/**
	 * Sets the debug flag
	 * @param smtpDebug
	 */
	public void setSmtpDebug(boolean smtpDebug) {
		this.smtpDebug = smtpDebug;
	}

	/**
	 * Returns the authorization flag
	 * @return
	 */
	public String getSmtpAuth() {
		return smtpAuth;
	}

	/**
	 * Sets the authorization flag
	 * @param smtpAuth
	 */
	public void setSmtpAuth(String smtpAuth) {
		this.smtpAuth = smtpAuth;
	}

	/**
	 * Returns the mail session
	 * @return
	 */
	private Session getSession() {
		Properties props = new Properties();
		props.put("mail.smtp.user", smtpAccount);
		props.put("mail.smtp.host", smtpHost);
		props.put("mail.smtp.auth", smtpAuth);
//		props.put("mail.debug", smtpDebug);
//		props.put("mail.smtp.port", "");
//		props.put("mail.smtp.from", "");				
		
		Session session = Session.getDefaultInstance(props, null); 
		session.setDebug(smtpDebug);
		
		return session;
	}
	
	/**
	 * Reads the email template and returns the HTML text
	 * @param fromFile
	 * @return
	 */
	public static String readMessage(File fromFile) {
        FileInputStream from = null;
        StringBuffer br = new StringBuffer();
        String readPart = null;
        
        try{
            from = new FileInputStream(fromFile);
            
            byte[] buffer = new byte[4096];
            int bytes_read;
            
            while((bytes_read = from.read(buffer)) != -1){
                readPart = new String(buffer, 0, bytes_read);
                br.append(readPart);  
            }  
            from.close();
        }
		catch(FileNotFoundException  fileError) {
			LOGGER.error(fileError);  
        }
		catch(IOException ioe)
		{
			LOGGER.error(ioe);
		}
		finally
		{
			if ( from != null ) {
				try
				{
				   	from.close();
				 }
				 catch ( IOException ioe ) {
					 LOGGER.error(ioe);
				    }
			 }
		}
        return br.toString();
    }
	
	/**
	 * Converts string to internet address
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public static Address toAddress(String str) throws UserServiceException {
		if(str == null) {
			return null;
		}
		InternetAddress iAddress=null;
		try {
			iAddress = new InternetAddress(str);
		} catch(AddressException error)
		{
			throw new UserServiceException("InternetAddressException",error);
		}
		return iAddress;
	}
	
	/**
	 * Converts array of string to address array
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public static Address[] toAddress(String[] str) throws UserServiceException {				
		if(str == null) {
			return null;			
		}
		
		Address[] addresses = new Address[str.length];
		
		for(int i=0; i < str.length; i++) {
			try{
			addresses[i] = new InternetAddress(str[i]);
			}
			catch(AddressException error){
				throw new UserServiceException("TOAddress Exception",error);
			}
		}
		
		return addresses;
	}
	
	/**
	 * Sets the email addresses to TO
	 * @param message
	 * @param str
	 * @throws Exception
	 */
	protected void setToRecipients(MimeMessage message, String[] str) throws UserServiceException {
		setRecipients(message, Message.RecipientType.TO, str);
	}
	
	/**
	 * Sets the email addresses to TO
	 * @param message
	 * @param addr
	 * @throws Exception
	 */
	protected void setToRecipients(MimeMessage message, Address[] addr) throws UserServiceException {
		setRecipients(message, Message.RecipientType.TO, addr);
	}
	
	/**
	 * Sets the email addresses to CC
	 * @param message
	 * @param str
	 * @throws Exception
	 */
	protected void setCcRecipients(MimeMessage message, String[] str) throws UserServiceException {
		setRecipients(message, Message.RecipientType.CC, str);
	}
	
	/**
	 * Sets the email addresses to CC
	 * @param message
	 * @param addr
	 * @throws Exception
	 */
	protected void setCcRecipients(MimeMessage message, Address[] addr) throws UserServiceException {
		setRecipients(message, Message.RecipientType.CC, addr);
	}
	
	/**
	 * Sets the email addresses to BCC
	 * @param message
	 * @param str
	 * @throws Exception
	 */
	protected void setBccRecipients(MimeMessage message, String[] str) throws UserServiceException {
		setRecipients(message, Message.RecipientType.BCC, str);
	}
	
	/**
	 * Sets the email addresses to BCC
	 * @param message
	 * @param addr
	 * @throws Exception
	 */
	protected void setBccRecipients(MimeMessage message, Address[] addr) throws UserServiceException {
		setRecipients(message, Message.RecipientType.BCC, addr);
	}
	
	/**
	 * Sets the receivers' email addresses 
	 * @param message
	 * @param type
	 * @param str
	 * @throws Exception
	 */
	protected void setRecipients(MimeMessage message, RecipientType type, String[] str) throws UserServiceException {		
		setRecipients(message, type, toAddress(str));
	}
	
	/**
	 * Sets the receivers' email addresses  
	 * @param message
	 * @param type
	 * @param addr
	 * @throws Exception
	 */
	protected void setRecipients(MimeMessage message, RecipientType type, Address[] addr) throws UserServiceException {				
		try {
			message.setRecipients(type, addr);
		} catch (MessagingException error) {
			throw new UserServiceException("RecepientMessage Exception",error);
		}
	}
	
	/**
	 * Sends email
	 * @param to
	 * @param cc
	 * @param bcc
	 * @param fromEmailAddress
	 * @param fromName
	 * @param subject
	 * @param strTextOnly
	 * @param strMessage
	 * @throws Exception
	 */
	public void send(String[] to, String[] cc, String[] bcc
			, String fromEmailAddress, String fromName
			, String subject, String strTextOnly, String strMessage) throws UserServiceException {
		
		send(toAddress(to), toAddress(cc), toAddress(bcc), fromEmailAddress, fromName, subject, strTextOnly, strMessage);
	}
	
	/**
	 * Sends email
	 * @param toAddr
	 * @param ccAddr
	 * @param bccAddr
	 * @param fromEmailAddress
	 * @param fromName
	 * @param subject
	 * @param strTextOnly
	 * @param strMessage
	 * @throws Exception
	 */
	public void send(Address[] toAddr, Address[] ccAddr, Address[] bccAddr
			, String fromEmailAddress, String fromName
			, String subject, String strTextOnly, String strMessage) throws UserServiceException {
		
		Session mailSession = getSession();		
		
		MimeMessage message = new MimeMessage(mailSession);
				
		setToRecipients(message, toAddr);
		setCcRecipients(message, ccAddr);
		setBccRecipients(message, bccAddr);				
		
		Address[] allAddr = (Address[]) ArrayUtils.addAll(toAddr, ArrayUtils.addAll(ccAddr, bccAddr));
				
		//      Create a multi-part to combine the parts
		MimeMultipart mpRoot = new MimeMultipart("mixed");
		Multipart mpContent  = new MimeMultipart("alternative");
		
		//      Create your text message part
		MimeBodyPart contentPartRoot = new MimeBodyPart();
		try{
		contentPartRoot.setContent(mpContent);
		
		//      Add the root body part to the root multipart
		mpRoot.addBodyPart(contentPartRoot);
		
		//      1. Add text
		MimeBodyPart mbp1 = new MimeBodyPart();
		mbp1.setText(strTextOnly);
		mpContent.addBodyPart(mbp1);
		
		//      2. Add html
		MimeBodyPart mbp2 = new MimeBodyPart();
		String htmlText = strMessage;
		mbp2.setContent(htmlText, "text/html");
		mpContent.addBodyPart(mbp2);
		
		//      Associate multi-part with message
		message.setContent(mpRoot);
		
		message.setSubject(subject);
		message.setFrom(new InternetAddress(fromEmailAddress, fromName));
		message.setSentDate(new Date());
		message.setHeader("X-Mailer", "sendhtml");
		message.saveChanges();
		}catch(MessagingException error){
			throw new UserServiceException("MessagingException",error);
		}
		catch(UnsupportedEncodingException encError)
		{
			throw new UserServiceException("Unsupported Encoding Exception",encError);
		}
		
		sendMessages(mailSession, message, allAddr);			
	}	
	
	/**
	 * Sends email
	 * @param mailSession
	 * @param message
	 * @param toAddr
	 * @throws Exception
	 */
	protected void sendMessages(Session mailSession, MimeMessage message, Address[] toAddr) throws UserServiceException {
		Address[] tempToAddr=toAddr;
		try{
		Transport transport = mailSession.getTransport("smtp");		
		transport.connect(smtpHost, smtpAccount, smtpPassword);
		
		if(smtpTestEmail != null && smtpTestEmail.trim().length() > 0) {
			tempToAddr = new Address[]{new InternetAddress(smtpTestEmail)};
		}	
		
		transport.sendMessage(message, tempToAddr);		
		transport.close();
		}catch(NoSuchProviderException error)
		{
			throw new UserServiceException("No Provider Exception",error);
		}
		catch(MessagingException msg)
		{
			throw new UserServiceException("Messaging exception while sending email",msg);
		}
	}
}