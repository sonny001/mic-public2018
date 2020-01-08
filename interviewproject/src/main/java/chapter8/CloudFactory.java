package chapter8;

import java.util.HashMap;
import java.util.Map;

/**
 * @program mic-public2018
 * @description: 文件上传工厂
 * @author: sonny
 * @create: 2020/01/01 15:47
 */
public class CloudFactory {

    private static Map<String, CloudSDK> cloudSDKMap = new HashMap<>();
    static {
        cloudSDKMap.put("Ali", new AliAdapter(new ALiSDK()));
        cloudSDKMap.put("AWS", new AWSSDKAdapter(new AWSSDK()));
    }

    public static CloudSDK getCloudSDK(String type){
        return cloudSDKMap.get(type);

    }
}
