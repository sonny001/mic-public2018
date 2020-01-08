package chapter8;

/**
 * @program mic-public2018
 * @description: ALi适配器
 * @author: sonny
 * @create: 2020/01/01 15:46
 */
public class AliAdapter implements CloudSDK {

    ALiSDK aLiSDK;

    public AliAdapter(ALiSDK aLiSDK) {
        this.aLiSDK = aLiSDK;
    }

    @Override
    public void putObject(String fileName) {
        aLiSDK.setBucket();
        aLiSDK.uploadFile(fileName);
    }
}
