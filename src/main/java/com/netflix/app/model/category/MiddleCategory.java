package com.netflix.app.model.category;

import java.sql.Timestamp;

/*@Alias("middleCategory")*/
//중간 카테고리
public class MiddleCategory {
    private String category; //대분류코드
    private String subCategory; //중분류코드
    private String subCatName; //중분류명
    private String useyn; //사용여부
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getsubCategory() {
        return subCategory;
    }

    public void setsubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getsubCatName() {
        return subCatName;
    }

    public void setsubCatName(String subCatName) {
        this.subCatName = subCatName;
    }

    public String getUseyn() {
        return useyn;
    }

    public void setUseyn(String useyn) {
        this.useyn = useyn;
    }

    public Timestamp getIndt() {
        return indt;
    }

    public void setIndt(Timestamp indt) {
        this.indt = indt;
    }

    public Timestamp getUpdt() {
        return updt;
    }

    public void setUpdt(Timestamp updt) {
        this.updt = updt;
    }
}
