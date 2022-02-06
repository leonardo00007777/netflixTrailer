package com.netflix.app.model.customer;

import org.dom4j.tree.AbstractEntity;

import java.io.Serializable;
import java.sql.Timestamp;


/*@Alias("group")*/
public class Group extends AbstractEntity implements Serializable {
/*@org.apache.ibatis.type.Alias("group")
public class Group extends AbstractEntity {*/

    private static final long serialVersionUID = 1872105074150971785L;
    
    private long groupNo;
    private String descr;
    private String insertedBy;
    private Timestamp insertedDate;
    private String updatedBy;
    private Timestamp updatedDate;
    
    public Group(){
        //Default Constructor
    }
    
    public long getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(long groupNo) {
        this.groupNo = groupNo;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getInsertedBy() {
        return insertedBy;
    }

//    @UnescapeHtml
//    public void setInsertedBy(String insertedBy) {
//        this.insertedBy = insertedBy;
//    }

    public Timestamp getInsertedDate() {
        return insertedDate;
    }

    public void setInsertedDate(Timestamp insertedDate) {
        this.insertedDate = insertedDate;
    }

//    @UnescapeHtml
//    public String getUpdatedBy() {
//        return updatedBy;
//    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return String.format(
                "Group [groupNo=%s, descr=%s, insertedBy=%s, insertedDate=%s, updatedBy=%s, updatedDate=%s]", groupNo,
                descr, insertedBy, insertedDate, updatedBy, updatedDate);
    }
}
