package cpf.zzc.virtualwallet.auth;

import java.util.Date;

/**
 * date 2020/8/11
 *
 * @author caopengflying
 */
public class DefaultApiAuthenticatorImpl implements ApiAuthenticator {
    private CredentialStorage credentialStorage;

    public DefaultApiAuthenticatorImpl() {
        this.credentialStorage = new MysqlCredentialStorageImpl();
    }

    public DefaultApiAuthenticatorImpl(CredentialStorage credentialStorage) {
        this.credentialStorage = credentialStorage;
    }

    @Override
    public void auth(String url) {
        ApiRequest apiRequest = ApiRequest.buildFromUrl(url);
        auth(apiRequest);
    }

    @Override
    public void auth(ApiRequest apiRequest) {
        String appId = apiRequest.getAppId();
        String baseUrl = apiRequest.getBaseUrl();
        long timestamp = apiRequest.getTimestamp();
        String token = apiRequest.getToken();
        AuthToken clientToken = new AuthToken(token, timestamp);
        if (clientToken.isExpired()) {
            throw new RuntimeException("token 已过期");
        }
        String passwordByAppId = credentialStorage.getPasswordByAppId(appId);
        AuthToken generate = AuthToken.generate(baseUrl, timestamp, appId, passwordByAppId);
        if (!generate.match(clientToken)) {
            throw new RuntimeException("token不符");
        }
    }


}
