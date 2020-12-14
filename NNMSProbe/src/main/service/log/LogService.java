package main.service.log;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/**
 * Description: 鏃ュ織鏈嶅姟<br> 
 *  
 * @author GC <br>
 * @version 1.0 <br>
 * @CreateDate 2020骞�12鏈�14鏃� <br>
 * @since V1.0 <br>
 * @see main.service.log <br>
 */
public interface LogService {
    
    /**
     * Description: 鎵撳嵃鏃ュ織<br> 
     *  
     * @author GC<br>
     * @throws Exception <br>
     */
    void printLog() throws Exception;
    
    /**
     * 
     * Description:用户打印日志 <br> 
     *  
     * @author hzy<br>
     * @CreateDate 2020年12月14日 <br>
     * @param userId 用户id
     * @throws Exception <br>
     */
    void printLog(String userId) throws Exception;

    /**
     * Description: 打印错误日志<br> 
     *  
     * @author zl<br>
     * @throws Exception <br>
     */
    void printErrorLog() throws Exception;


}
