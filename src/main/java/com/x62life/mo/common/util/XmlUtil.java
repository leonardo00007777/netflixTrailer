package com.x62life.mo.common.util;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.xml.bind.marshaller.CharacterEscapeHandler;

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
}
