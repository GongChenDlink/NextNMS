package main.service.net.impl;

import java.util.List;

import main.service.net.NetDiscoveryService;

/**
 * Description: <br> 
 *  
 * @author GC <br>
 * @version 1.0 <br>
 * @CreateDate 2020年12月14日 <br>
 * @since V1.0 <br>
 * @see main.service.net.impl <br>
 */
public class NetDiscoveryServiceImpl implements NetDiscoveryService {

    @Override
    public void dicoveryByIPs(List<String> ips) throws Exception {
        System.out.println("Discovery By IPs: " + ips);
    }

}
