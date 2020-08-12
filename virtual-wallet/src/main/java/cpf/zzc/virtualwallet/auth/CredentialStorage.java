package cpf.zzc.virtualwallet.auth;

/**
 * date 2020/8/11
 *
 * @author caopengflying
 */
public interface CredentialStorage {
    /**
     * 根据appId获取密码
     * @param appId
     * @return
     */
    String getPasswordByAppId(String appId);
}
