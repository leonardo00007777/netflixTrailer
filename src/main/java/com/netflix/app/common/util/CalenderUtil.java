package com.netflix.app.common.util;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class CalenderUtil {
    
    private static final Logger LOGGER  = LoggerFactory.getLogger(CalenderUtil.class);
    
    private final static String[] holiday = {
                                        "20191225", "20200101", "20200124", "20200125", "20200127", "20200301", 
                                        "20200415", "20200430", "20200505", "20200606", "20200815", "20200930", 
                                        "20201001", "20201002", "20201003", "20201009", "20201225", "20210101",
                                        "20210211", "20210212" ,"20210213", "20210301", "20210505", "20210519",
                                        "20210606", "20210815", "20210920", "20210921", "20210922", "20211003",
                                        "20211009", "20211225", "20220101", "20220131", "20220201", "20220202",
                                        "20220301", "20220505", "20220508", "20220606", "20220815", "20220909",
                                        "20220910", "20221003", "20221009", "20221225", "20230101", "20230121",
                                        "20230122", "20230123", "20230301", "20230505", "20230527", "20230606",
                                        "20230815", "20230928", "20230929", "20230930", "20231003", "20231009",
                                        "20231225", "20240101", "20240209", "20240210", "20240301", "20240410",
                                        "20240505", "20240515", "20240606", "20240815", "20240916", "20240917",
                                        "20240918", "20241003", "20241009", "20241225"
                                       };
    
    public static String isStrOpen() {
        
        String retStr = "NORMAL";
        
        long today = System.currentTimeMillis(); // long 형의 현재시간
        LOGGER.debug("today : {}", today);
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(today);
       
        //SUNDAY:1 SATURDAY:7
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        
        if (dayOfWeek == Calendar.SATURDAY) {
            //TODO 토요일 체크 // SATURDAY
            retStr = "SATURDAY";
        }else if(dayOfWeek == Calendar.SUNDAY) {
            //TODO 일요일 체크 // SUNDAY
            retStr = "SUNDAY";
        }
        
        return retStr;
    }
    
    /**
     * 주말 (토,일)
     * @param date
     * @return
     */
    public static boolean isWeekend(long date) {
        boolean result = false;
       
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date);
       
        //SUNDAY:1 SATURDAY:7
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {
            result = true;
        }
       
        return result;
    }
    
    /**
     * 법정휴일
     * @param date
     * @return
     */
    public static boolean isLegalHoliday(long date) {
        boolean result = false;
       
        List<String> solarList = Arrays.asList(holiday);
       
        String solarDate = DateFormatUtils.format(date, "yyyyMMdd");
       
       
        if (solarList.indexOf(solarDate) >= 0) {
            return true;
        }
       
        return result;
    }
}

