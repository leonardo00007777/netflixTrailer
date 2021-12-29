package com.x62life.mo.common.util;

import com.x62life.mo.common.constants.StoreConsts;
import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 페이징 Util
 * 
 * @author User
 *
 */
public class PagingUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(PagingUtil.class);

    private int blockCount = StoreConsts.DEFAULT_BLOCK_COUNT;
    private int totalCount;
    private int pageIdx = StoreConsts.DEFAULT_PAGE_INDEX;
    private int totalPageCount;
    private int startRowNo;
    private int endRowNo;
    private int startBlockNo;
    private int endBlockNo;
    private int rowsPerPage = StoreConsts.ROWS_PER_PAGE_20;
    private int prevBlockNo;
    private int nextBlockNo;

    /**
     * 전체row/현재 페이지/페이지 당 row/페이징탭 사이즈로 계산
     * 
     * @param totalCount
     *            total rows count
     * @param pageIdx
     *            current page
     * @param rowsPerPage
     *            rows per page
     * @param blockCount
     *            paging tab size
     */
    public PagingUtil(int totalCount, int pageIdx, int rowsPerPage, int blockCount) {
        this.totalCount = totalCount;
        this.pageIdx = pageIdx;
        this.rowsPerPage = rowsPerPage;
        this.blockCount = blockCount;

        calculate();
    }

    /**
     * 전체row/현재 페이지/페이지 당 row로 계산 페이징탭 사이즈 = 10
     * 
     * @param totalCount
     * @param pageIdx
     * @param rowsPerPage
     */
    public PagingUtil(int totalCount, int pageIdx, int rowsPerPage) {
        this.totalCount = totalCount;
        this.pageIdx = pageIdx;
        this.rowsPerPage = rowsPerPage;

        calculate();
    }

    /**
     * 전체row/현재 페이지로 계산 페이지 당 row = 10 페이징탭 사이즈 = 10
     * 
     * @param totalCount
     * @param page
     */
    public PagingUtil(int totalCount, int pageIdx) {
        this.totalCount = totalCount;
        this.pageIdx = pageIdx;

        calculate();
    }

    /**
     * 입력된 정보로 페이징 탭 계산.
     */
    private void calculate() {
        totalPageCount = (totalCount / rowsPerPage) + (totalCount % rowsPerPage == 0 ? 0 : 1);
        endRowNo = pageIdx * rowsPerPage;
        startRowNo = (pageIdx - 1) * rowsPerPage + 1;

        startBlockNo = ((pageIdx - 1) / blockCount) * blockCount + 1;
        endBlockNo = startBlockNo + (blockCount - 1);

        // 마지막 페이지 정보
        endBlockNo = endBlockNo > totalPageCount ? totalPageCount : endBlockNo;
        
        nextBlockNo = endBlockNo + 1 > totalPageCount ? totalPageCount : endBlockNo + 1;
        prevBlockNo = startBlockNo - blockCount  <= 1 ? 1 : startBlockNo - blockCount; 
    }

    /**
     * 스크롤 다운용 페이징 변수 세팅 default : 1 페이지, 20 Rows
     * 
     * @param clazz
     */
    public static final <T> void setPagingProperty(T clazz) {
        try {
            final int pageIdx = Integer.parseInt(BeanUtils.getProperty(clazz, "pageIdx"));
            final int rowsPerPage = Integer.parseInt(BeanUtils.getProperty(clazz, "rowsPerPage"));

            BeanUtils.setProperty(clazz, "pageIdx", (pageIdx < 1 ? StoreConsts.DEFAULT_PAGE_INDEX : pageIdx));
            BeanUtils.setProperty(clazz, "rowsPerPage", (rowsPerPage < 1 ? StoreConsts.ROWS_PER_PAGE_20 : rowsPerPage));

        } catch (Exception ignore) {
            LOGGER.trace(ignore.getMessage(), ignore);
        }
    }

    /**
     * 스크롤 다운용 페이징 변수 세팅 default : 1 페이지, 20 Rows
     * 
     * @param clazz
     * @param rowsPerPage
     */
    public static final <T> void setPagingProperty(T clazz, int rowsPerPage) {
        try {
            final int pageIdx = Integer.parseInt(BeanUtils.getProperty(clazz, "pageIdx"));

            BeanUtils.setProperty(clazz, "pageIdx", (pageIdx < 1 ? StoreConsts.DEFAULT_PAGE_INDEX : pageIdx));
            BeanUtils.setProperty(clazz, "rowsPerPage", rowsPerPage);

        } catch (Exception ignore) {
            LOGGER.trace(ignore.getMessage(), ignore);
        }
    }

    /**
     * 숫자형식 페이징 처리를 위한 데이터. [default:1, 페이지:20Rows]
     * 
     * @param clazz
     * @param totalCount
     * @return
     */
    public static final <T> PagingUtil getPageNumbering(T clazz, final int totalCount) {

        return getPageNumbering(clazz, totalCount, 0);
    }

    /**
     * 숫자형식 페이징 처리를 위한 데이터. [default:1, 페이지:20Rows]
     * 
     * @param clazz
     * @param totalCount
     * @param pageRows
     * @return
     */
    public static final <T> PagingUtil getPageNumbering(T clazz, final int totalCount, final int pageRows) {
        return getPageNumbering(clazz, totalCount, pageRows, 0);
    }
    
    /**
     * 숫자형식 페이징 처리를 위한 데이터. [default:1, 페이지:20Rows]
     * 
     * @param clazz
     * @param totalCount
     * @param pageRows
     * @return
     */
    public static final <T> PagingUtil getPageNumbering(T clazz, final int totalCount, final int pageRows, final int blockCount) {
        PagingUtil numberingInfo = null;
        
        try {
            
            int pageIdx = Integer.parseInt(BeanUtils.getProperty(clazz, "pageIdx"));
            int rowsPerPage = pageRows > 0 ? pageRows : Integer.parseInt(BeanUtils.getProperty(clazz, "rowsPerPage"));
            int blocks = blockCount < 1 ? StoreConsts.DEFAULT_BLOCK_COUNT : blockCount; 
            
            pageIdx = pageIdx < 1 ? StoreConsts.DEFAULT_PAGE_INDEX : pageIdx;
            rowsPerPage = rowsPerPage < 1 ? StoreConsts.ROWS_PER_PAGE_20 : rowsPerPage;
            
            numberingInfo = new PagingUtil(totalCount, pageIdx, rowsPerPage, blocks);
            
        } catch (Exception ignore) {
            LOGGER.trace(ignore.getMessage(), ignore);
        }
        
        return numberingInfo;
    }

    /**
     * 페이지 시작 row no.
     * 
     * @param pageIdx
     * @return
     */
    public int getStartRowNo() {
        return startRowNo;
    }

    /**
     * 페이지 종료 row no
     * 
     * @param pageIdx
     * @return
     */
    public int getEndRowNo() {
        return endRowNo;
    }

    /**
     * 전체 페이지 count
     * 
     * @return
     */
    public int getTotalPageCount() {
        return totalPageCount;
    }

    /**
     * 전체 rows
     * 
     * @return
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * 현재 페이지 번호
     * 
     * @return
     */
    public int getPageIdx() {
        return pageIdx;
    }

    /**
     * 시작 페이징 탭 번호
     * 
     * @return
     */
    public int getStartBlockNo() {
        return startBlockNo;
    }

    /**
     * 마지막 페이징 탭 번호
     * 
     * @return
     */
    public int getEndBlockNo() {
        return endBlockNo;
    }

    /**
     * 페이지당 rows
     * 
     * @return
     */
    public int getRowsPerPage() {
        return rowsPerPage;
    }

    /**
     * 페이지당 rows 설정
     * 
     * @param rowsPerPage
     */
    public void setRowsPerPage(int rowsPerPage) {
        this.rowsPerPage = rowsPerPage;
    }

    /**
     * 페이징 탭 사이즈
     * 
     * @return
     */
    public int getBlockCount() {
        return blockCount;
    }

    /**
     * 페이징 탭 사이즈 설정
     * 
     * @param blockCount
     */
    public void setBlockCount(int blockCount) {
        this.blockCount = blockCount;
    }

    public int getPrevBlockNo() {
        return prevBlockNo;
    }

    public void setPrevBlockNo(int prevBlockNo) {
        this.prevBlockNo = prevBlockNo;
    }

    public int getNextBlockNo() {
        return nextBlockNo;
    }

    public void setNextBlockNo(int nextBlockNo) {
        this.nextBlockNo = nextBlockNo;
    }
}
