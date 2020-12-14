package main.service.log.impl;

import main.service.log.LogService;

/**
 * Description: 鎵撳嵃鏃ュ織鏈嶅姟淇℃伅<br> 
 *  
 * @author GC <br>
 * @version 1.0 <br>
 * @CreateDate 2020骞�12鏈�14鏃� <br>
 * @since V1.0 <br>
 * @see main.service.log.impl <br>
 */
public class LogServiceImpl implements LogService {

    @Override
    public void printLog() throws Exception {
        System.out.println("Print Log");
    }

    @Override
    public void printErrorLog() throws Exception {
        System.out.println("Print Error Log");
    }

}
