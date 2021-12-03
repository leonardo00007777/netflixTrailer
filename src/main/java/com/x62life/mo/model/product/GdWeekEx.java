package com.x62life.mo.model.product;

import org.apache.ibatis.type.Alias;

@Alias("gdWeekEx")
public class GdWeekEx extends GdWeek{
    String gdName;

    public String getGdName() {
        return gdName;
    }

    public void setGdName(String gdName) {
        this.gdName = gdName;
    }
}
