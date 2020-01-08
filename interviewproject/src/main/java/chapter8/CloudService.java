package chapter8;

/**
 * @program mic-public2018
 * @description:
 * @author: sonny
 * @create: 2020/01/01 15:50
 */
public class CloudService {

    CloudSDK cloudSDK;

    public CloudService(String cloudType) {
        this.cloudSDK = CloudFactory.getCloudSDK(cloudType);
    }

    public void putObject(String fileName) {
        cloudSDK.putObject(fileName);
    }
}
