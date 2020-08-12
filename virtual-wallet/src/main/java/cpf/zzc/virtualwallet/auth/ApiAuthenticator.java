package cpf.zzc.virtualwallet.auth;

/**
 * date 2020/8/11
 *
 * @author caopengflying
 */
public interface ApiAuthenticator {
    /**
     * 根据url认证权限
     * @param url
     */
    void auth(String url);

    /**
     * 根据请求验证
     * @param apiRequest
     */
    void auth(ApiRequest apiRequest);
}
