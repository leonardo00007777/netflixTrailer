package com.netflix.app.common.util.masking;

public class CustomerNameMasker implements Masker {

    @Override
    public String mask(String value) {

        char[] charArray = value.replaceAll(" ", "").toCharArray();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < charArray.length; i++) {
            if ((i % 2) == 0) {
                sb.append(charArray[i]);
                continue;
            }
            sb.append("*");
        }

        return sb.toString();
    }

}