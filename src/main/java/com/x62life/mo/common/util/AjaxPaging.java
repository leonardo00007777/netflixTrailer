package com.x62life.mo.common.util;

import com.x62life.mo.common.constants.StoreConsts;
import com.x62life.mo.model.common.BaseCommonEntity;
import org.dom4j.tree.AbstractEntity;

import java.util.ArrayList;
import java.util.List;


public class AjaxPaging extends AbstractEntity {

    private static final long serialVersionUID = 2169150538463582653L;

    private PagingUtil paging;
    private List<?> contents;
    private int totalCount;

    public AjaxPaging() {
        this.contents = new ArrayList<BaseCommonEntity>();
        this.paging = new PagingUtil(StoreConsts.TOTAL_COUNT_NO_DATA, StoreConsts.DEFAULT_PAGE_INDEX);
    }

    public AjaxPaging(List<?> contents, PagingUtil pagingUtil) {
        this.contents = contents;
        this.paging = pagingUtil;
    }

    public AjaxPaging(int totalCount, List<?> contents, PagingUtil pagingUtil) {
        this.totalCount = totalCount;
        this.contents = contents;
        this.paging = pagingUtil;
    }

    public PagingUtil getPaging() {
        return paging;
    }

    public void setPaging(PagingUtil paging) {
        this.paging = paging;
    }

    public List<?> getContents() {
        return contents;
    }

    public void setContents(List<?> contents) {
        this.contents = contents;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

}
