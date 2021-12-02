package com.x62life.mo.common.util.masking;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonAddrMasker implements Masker {

    final String ZIPCODE_PATTERN = "^[0-9\\]\\[]*$";
    final String ADDRESS_PATTERN = "(?<=.{0}).";
    final String ADDRESS_MASKING_PATTERN = "*";

    @Override
    public String mask(String address) {

        String[] addressArray = address.trim().split(" ");
        if (addressArray.length <= 0) {
            return address;
        }

        // zipCode check
        Matcher matcher = Pattern.compile(ZIPCODE_PATTERN).matcher(addressArray[0]);
        int maskingIndex = (matcher.matches()) ? 3 : 2;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < addressArray.length; i++) {
            if (i <= maskingIndex) {
                sb.append(addressArray[i]);
            } else {
                sb.append(addressArray[i].replaceAll(ADDRESS_PATTERN, ADDRESS_MASKING_PATTERN));
            }
            if (i < addressArray.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();

    }
}