package main.service.log;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/**
 * Description: 日志服务<br> 
 *  
 * @author GC <br>
 * @version 1.0 <br>
 * @CreateDate 2020年12月14日 <br>
 * @since V1.0 <br>
 * @see main.service.log <br>
 */
public interface LogService {
    
    /**
     * Description: 打印日志<br> 
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

}
