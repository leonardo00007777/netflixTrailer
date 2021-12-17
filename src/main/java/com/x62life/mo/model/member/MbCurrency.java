package com.x62life.mo.model.member;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*@Alias("mbCurrency")*/
//회원 적립금 잔액
public class MbCurrency {
    private String memcd; //회원번호
    private BigDecimal accpoint; //적립금
    private BigDecimal skpoint; //sk포인트
    private BigDecimal deposit; //예치금

    public String getMemcd() {
        return memcd;
    }

    public void setMemcd(String memcd) {
        this.memcd = memcd;
    }

    public BigDecimal getAccpoint() {
        return accpoint;
    }

    public void setAccpoint(BigDecimal accpoint) {
        this.accpoint = accpoint.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getSkpoint() {
        return skpoint;
    }

    public void setSkpoint(BigDecimal skpoint) {
        this.skpoint = skpoint.setScale(0, RoundingMode.DOWN);
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit.setScale(0, RoundingMode.DOWN);
    }
}
