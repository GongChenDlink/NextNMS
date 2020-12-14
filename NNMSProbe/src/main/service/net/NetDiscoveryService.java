package main.service.net;

import java.util.List;

/**
 * Description: 网络发现服务<br> 
 *  
 * @author GC <br>
 * @version 1.0 <br>
 * @CreateDate 2020年12月14日 <br>
 * @since V1.0 <br>
 * @see main.service.net <br>
 */
public interface NetDiscoveryService {
    
    /**
     * Description: 根据指定IP进行发现<br> 
     *  
     * @author GC<br>
     * @param ips
     * @throws Exception <br>
     */
    void dicoveryByIPs(List<String> ips) throws Exception;

}
