package com.netflix.app.common.util.masking;

public class AbstractMasker implements Masker {

    @Override
    public String mask(String value) {
        return value;
    }

}
