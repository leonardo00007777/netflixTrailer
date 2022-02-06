package com.netflix.app.common.util.masking;

public class CommonPhoneMasker implements Masker {

    final String PHONE_PATTERN = "^(.*)\\-(.*)\\-(.*)$";
    final String PHONE_MASKING_PATTERN = "$1-****-$3";
    final String PHONE_DIVISION = "-";

    @Override
    public String mask(String number) {

        String[] valueArray = number.trim().split(PHONE_DIVISION);
        if (valueArray.length <= 0) {
            return number;
        }

        if (valueArray.length == 3) {
            return number.replaceAll(PHONE_PATTERN, PHONE_MASKING_PATTERN);
        }

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < valueArray.length; i++) {

            if (i == 0) {
                sb.append(valueArray[i].replaceAll("[0-9]", "*"));
            } else {
                sb.append(valueArray[i]);
            }

            if (i < valueArray.length - 1) {
                sb.append("-");
            }
        }

        return sb.toString();
    }

}