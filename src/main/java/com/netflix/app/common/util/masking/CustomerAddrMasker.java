package com.netflix.app.common.util.masking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerAddrMasker implements Masker {
    
    protected static final Logger LOGGER = LoggerFactory.getLogger(CustomerAddrMasker.class);
    
    @Override
    public String mask(String value) {
        int cnt = 0;
        int position = 0;
        boolean flag = false;
        
        /*
        for (int i=0; i<value.length(); i++) {
            if (" ".equals(value.substring(i, i+1))) cnt++;
            
            if (cnt == 1) position = i;
        }
        */
        
        for (int i=value.length(); i>0; i--) {
            if (" ".equals(value.substring(i-1, i))) cnt++;
            
            if (cnt == 1) position = i;
        }
        if (position < 3) {
            flag = true;
            cnt = 0;
            position = 0;
            for (int i=0; i<value.length(); i++) {
                if (" ".equals(value.substring(i, i+1))) cnt++;
                
                if (cnt == 0) position = i;
            }
        }
        if (flag) {
            value = value.substring(0, position+1) + " *** ";
        } else {
            value = value.substring(0, position-1) + " *** ";
        }
        
        return value;
    }

}
