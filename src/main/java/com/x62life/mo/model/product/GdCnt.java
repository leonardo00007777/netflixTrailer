package com.x62life.mo.model.product;

import org.apache.ibatis.type.Alias;


@Alias("gdCnt")
//재고량
public class GdCnt {
    private String gdcd; //상품코드
    private int gdcnt; //재고량
}
