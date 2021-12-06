package com.x62life.mo.model.category;

import org.apache.ibatis.type.Alias;

//다른 카테고리
@Alias("anotherCategory")
public class AnotherCategory {
    private String div1;
    private String div2;
    private String gdcd;

    public String getDiv1() {
        return div1;
    }

    public void setDiv1(String div1) {
        this.div1 = div1;
    }

    public String getDiv2() {
        return div2;
    }

    public void setDiv2(String div2) {
        this.div2 = div2;
    }

    public String getGdcd() {
        return gdcd;
    }

    public void setGdcd(String gdcd) {
        this.gdcd = gdcd;
    }
}
