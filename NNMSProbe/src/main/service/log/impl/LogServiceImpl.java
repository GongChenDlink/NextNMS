package main.service.log.impl;

import main.service.log.LogService;

/**
 * Description: 打印日志服务信息<br> 
 *  
 * @author GC <br>
 * @version 1.0 <br>
 * @CreateDate 2020年12月14日 <br>
 * @since V1.0 <br>
 * @see main.service.log.impl <br>
 */
public class LogServiceImpl implements LogService {

    @Override
    public void printLog() throws Exception {
        System.out.println("Print Log");
    }

}
