package com.x62life.mo.common.util;

import com.x62life.mo.common.exception.SSOServiceException;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.glassfish.jaxb.core.marshaller.CharacterEscapeHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.InputSource;

import java.io.*;

public class XmlUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(XmlUtil.class);
    
    /**
     * create xml with jaxb marshall
     *
     * @param formater class
     * @param encoding
     * @param formatted_output
     * @return xml
     */
    public static String createXmlWithMarshall(Object clzz, String encoding, boolean isFormatOutput) {
      
        StringWriter sendingXmlTmpt = new StringWriter();

        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(clzz.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, isFormatOutput);
            jaxbMarshaller.setProperty(CharacterEscapeHandler.class.getName(), new CharacterEscapeHandler() {
                @Override
                public void escape(char[] ac, int i, int j, boolean flag, Writer writer) throws IOException {
                    writer.write(ac, i, j);
                }
            });
            jaxbMarshaller.marshal(clzz, sendingXmlTmpt);
        } catch (JAXBException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return sendingXmlTmpt.toString();
    } 
    
    
    
    /**
     * read xml with jaxb unmarshall
     *
     * @param formatter class
     * @param read xml
     * @return return class
     */
    public static Object readXmlWithUnmarshall(Object clzz, String xml) {
        
        Object rtnClass = null;
        JAXBContext jc;
        try {
            jc = JAXBContext.newInstance(clzz.getClass());
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            rtnClass = unmarshaller.unmarshal(new StringReader(xml)); 
        } catch (JAXBException e) {
            LOGGER.error(xml);
            LOGGER.error(e.getMessage(), e);
        }
        
        return rtnClass;
    } 
    
    
	
/**
 * convertInputStreamXMLToObject() function converts an input stream into XML format using the Castor API.
 * 
 */
public static Object convertInputStreamXMLToObject(InputStream in, Unmarshaller unmarshaller) throws SSOServiceException {	
	Object parameter = null;
	
	BufferedInputStream bis = null;
	ByteArrayInputStream bais = null;
	try {
		byte[] data = convertXMLToBytes(in);
		bais = new ByteArrayInputStream(data);
		bis = new BufferedInputStream(bais);
		InputSource inSource = new InputSource(bis);
		parameter = unmarshaller.unmarshal(inSource);
		return parameter;
	} catch(Exception e){
		throw new SSOServiceException(e.getMessage(),e);

	} finally {
		try { if(bais!=null) bais.close(); } catch(Exception e) { LOGGER.error(e.getMessage()); }
		try { if(bis!=null) bis.close(); } catch(Exception e) { LOGGER.error(e.getMessage()); }
		try { if(in!=null) in.close(); } catch(Exception e) { LOGGER.error(e.getMessage()); }
	}
}

/**
 * convertInputStreamXMLToBytes() function converts an input stream into byte array.
 * 
 */
public static byte[] convertXMLToBytes(final InputStream inStream) throws SSOServiceException {	
	BufferedInputStream bis = null;
	ByteArrayOutputStream bos = null;
	try {

		bis = new BufferedInputStream(inStream);
		bos = new ByteArrayOutputStream();
		byte[] buff = new byte[1024];
		while (true) {
			int len = bis.read(buff);
			if (len == -1)
				break;
			bos.write(buff, 0, len);
		}

		byte[] data = bos.toByteArray();
		bos.close();
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("RequestPayload--> " + new String(data));
		}
		if (LOGGER.isWarnEnabled()) {
			LOGGER.warn("RequestPayload--> " + new String(data));
		}
		return data;
	} catch(Exception e){
		throw new SSOServiceException(e.getMessage(),e);
	} finally {
		try { if(bis!=null) bis.close(); } catch(Exception e) { LOGGER.error(e.getMessage()); }
		try { if(inStream!=null) inStream.close(); } catch(Exception e) { LOGGER.error(e.getMessage()); }
		try { if(bos!=null) bos.close(); } catch(Exception e) { LOGGER.error(e.getMessage()); }
	}

}

/**
 * convertBytesXMLToObject() function converts an byte array data containing xml  into an object by the Castor API.
 * 
 */
public static Object convertBytesXMLToObject(byte[] data, Unmarshaller unmarshaller) throws SSOServiceException {	
	Object parameter = null;
	try {
		InputSource inSource = new InputSource(new ByteArrayInputStream(
				data));
		parameter = unmarshaller.unmarshal(inSource);
		return parameter;
	} catch(Exception e){
		throw new SSOServiceException(e.getMessage(),e);
	}
}

}
