package com.netflix.app.model.boardcontents;

import java.sql.Timestamp;

//요리관리
/*@Alias("bdCook")*/
public class BdCook {
    private int ctsidx; //순번
    private String title; //요리명
    private String material; //재료
    private String recipe; //조리법
    private String cookimg; //이미지파일
    private Timestamp indt; //등록일시
    private Timestamp updt; //수정일시
    private String useyn; //사용여부

    public int getCtsidx() {
        return ctsidx;
    }

    public void setCtsidx(int ctsidx) {
        this.ctsidx = ctsidx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getCookimg() {
        return cookimg;
    }

    public void setCookimg(String cookimg) {
        this.cookimg = cookimg;
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

    public String getUseyn() {
        return useyn;
    }

    public void setUseyn(String useyn) {
        this.useyn = useyn;
    }
}
