package com.x62life.mo.model.common;

import com.x62life.mo.common.constants.Constants;
import org.dom4j.tree.AbstractEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/*@Alias("baseCommonEntity")*/
public class BaseCommonEntity extends AbstractEntity {
    private static final Logger LOGGER  = LoggerFactory.getLogger(BaseCommonEntity.class);

    private static final long serialVersionUID = -4475325076693566943L;

    private Timestamp sysRegDtime;
    private String sysRegrId;
    private Timestamp sysModDtime;
    private String sysModrId;

    private int rowsPerPage;
    private int pageIdx;
    private int pageCalc;
    //private String systemDefaultLanguage;
    private String dbLocaleLanguage;
    private String state;
    private String defaultCntryCd;
    private String sysRegrNm;
    private String sysModrNm;
    
    // 대용량 엑셀다운로드
    private String fieldNames;
    private String texts;
    private String widths;
    private String excelTitle;
    private String excelYn;
    private String excelCurPage;
    private String excelCnt;
    private String excelTcnt;    
    
    // 201911.13 오프라인리뷰관련추가 / 화면별 API 조회여부
    private String viewCode;

    public BaseCommonEntity() {
        //this.dbLocaleLanguage = DBLocaleContextHolder.getLocale().getLanguage();
    }
    
    // 201911.13 오프라인리뷰관련추가 / 화면별 API 조회여부
    public String getViewCode() {
		return viewCode;
	}
	public void setViewCode(String viewCode) {
		this.viewCode = viewCode;
	}

	/**
     * @return the sysRegDtime
     */
    public Timestamp getSysRegDtime() {
        return sysRegDtime;
    }

    /**
     * @param sysRegDtime
     *            the sysRegDtime to set
     */
    public void setSysRegDtime(Timestamp sysRegDtime) {
        this.sysRegDtime = sysRegDtime;
    }
    /**
     * @return the sysRegrId
     */
    public String getSysRegrId() {
        return sysRegrId;
    }

    /**
     * @param sysRegrId
     *            the sysRegrId to set
     */
    public void setSysRegrId(String sysRegrId) {
        this.sysRegrId = sysRegrId;
    }
    /**
     * @return the sysModDtime
     */
    public Timestamp getSysModDtime() {
        return sysModDtime;
    }

    /**
     * @param sysModDtime
     *            the sysModDtime to set
     */
    public void setSysModDtime(Timestamp sysModDtime) {
        this.sysModDtime = sysModDtime;
    }
    /**
     * @return the sysModrId
     */
    public String getSysModrId() {
        return sysModrId;
    }

    /**
     * @param sysModrId
     *            the sysModrId to set
     */
    public void setSysModrId(String sysModrId) {
        this.sysModrId = sysModrId;
    }

    /**
     * @return the rowsPerPage
     */
    public int getRowsPerPage() {
        return rowsPerPage;
    }

    /**
     * @param rowsPerPage
     *            the rowsPerPage to set
     */
    public void setRowsPerPage(int rowsPerPage) {
        this.rowsPerPage = rowsPerPage;
    }

    /**
     * @return the pageCalc
     */
    public int getPageCalc() {
        setPageCalc(this.getRowsPerPage() * this.getPageIdx());
        return this.pageCalc;
    }

    public void setPageCalc(int pageCalc) {
        this.pageCalc = pageCalc;
    }

    /**
     * @return the pageIdx
     */
    public int getPageIdx() {
        return pageIdx;
    }

    /**
     * @param pageIdx
     *            the pageIdx to set
     */
    public void setPageIdx(int pageIdx) {
        this.pageIdx = pageIdx;
    }

    /**
     * @return the dbLocaleLanguage
     */
    public String getDbLocaleLanguage() {
        return dbLocaleLanguage;
    }

    /**
     * @param dbLocaleLanguage
     *            the dbLocaleLanguage to set
     */
    public void setDbLocaleLanguage(String dbLocaleLanguage) {
        this.dbLocaleLanguage = dbLocaleLanguage;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

//    public String getSystemDefaultLanguage() {
//		if (systemDefaultLanguage == null || systemDefaultLanguage.isEmpty()) {
//
//		    try{
//    			systemDefaultLanguage = Config.getStatically(Constants.DEFAULT_SYSTEM_LANGUAGE);
//    			if (systemDefaultLanguage == null) {
//    				systemDefaultLanguage = Constants.EMPTY;
//    			}
//		    }catch(Exception e){
//		        LOGGER.trace(e.getMessage(), e);
//		        systemDefaultLanguage = "ko";
//		    }
//		}
//
//		return systemDefaultLanguage;
//	}
//
//	public void setSystemDefaultLanguage(String systemDefaultLanguage) {
//		this.systemDefaultLanguage = systemDefaultLanguage;
//	}
//
//    /**
//     * @return the defaultCntryCd
//     */
//    public String getDefaultCntryCd() {
//        if (defaultCntryCd == null || defaultCntryCd.isEmpty()) {
//
//            defaultCntryCd = Config.getStatically(Constants.DEFAULT_COUNTRY_CD);
//            if (defaultCntryCd == null) {
//                defaultCntryCd = Constants.EMPTY;
//            }
//        }
//
//        return defaultCntryCd;
//    }

    /**
     * @param defaultCntryCd
     *            the defaultCntryCd to set
     */
    public void setDefaultCntryCd(String defaultCntryCd) {
        this.defaultCntryCd = defaultCntryCd;
    }

    protected String getTimeStampFormat(Timestamp timestamp){
        if(timestamp == null) {
            return Constants.EMPTY;
        }

        final String pattern = "yyyy-MM-dd HH:mm:ss";
    	return getTimeStampFormat(timestamp, pattern);
    }

    protected String getTimeStampFormat(Timestamp timestamp, String pattern){
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        String result = Constants.EMPTY;
        try {
            Date date = new Date(timestamp.getTime());
            result = formatter.format(date);
        } catch (Exception e) {
            LOGGER.debug("Use Empty: {}", e);
            result = Constants.EMPTY;
        }

        return result;
    }

    public String getSysRegrNm() {
        return sysRegrNm;
    }

    public void setSysRegrNm(String sysRegrNm) {
        this.sysRegrNm = sysRegrNm;
    }

    public String getSysModrNm() {
        return sysModrNm;
    }

    public void setSysModrNm(String sysModrNm) {
        this.sysModrNm = sysModrNm;
    }

    
    public String getFieldNames() {
		return fieldNames;
	}

	public void setFieldNames(String fieldNames) {
		this.fieldNames = fieldNames;
	}

	public String getTexts() {
		return texts;
	}

	public void setTexts(String texts) {
		this.texts = texts;
	}

	public String getWidths() {
		return widths;
	}

	public void setWidths(String widths) {
		this.widths = widths;
	}
	
    public String getExcelTitle() {
		return excelTitle;
	}

	public void setExcelTitle(String excelTitle) {
		this.excelTitle = excelTitle;
	}
	
	public String getExcelYn() {
		return excelYn;
	}

	public void setExcelYn(String excelYn) {
		this.excelYn = excelYn;
	}

	public String getExcelCurPage() {
		return excelCurPage;
	}

	public void setExcelCurPage(String excelCurPage) {
		this.excelCurPage = excelCurPage;
	}

	public String getExcelCnt() {
		return excelCnt;
	}

	public void setExcelCnt(String excelCnt) {
		this.excelCnt = excelCnt;
	}

	public String getExcelTcnt() {
		return excelTcnt;
	}

	public void setExcelTcnt(String excelTcnt) {
		this.excelTcnt = excelTcnt;
	}

}
