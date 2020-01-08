package chapter8;

/**
 * @program mic-public2018
 * @description: AWS 适配器
 * @author: sonny
 * @create: 2020/01/01 15:44
 */
public class AWSSDKAdapter implements CloudSDK {

    private AWSSDK awssdk;

    public AWSSDKAdapter(AWSSDK awssdk) {
        this.awssdk = awssdk;
    }

    @Override
    public void putObject(String fileName) {
        awssdk.putObject(fileName);
    }
}
