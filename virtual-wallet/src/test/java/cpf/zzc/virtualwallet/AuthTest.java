package cpf.zzc.virtualwallet;

import cpf.zzc.virtualwallet.auth.ApiAuthenticator;
import cpf.zzc.virtualwallet.auth.AuthToken;
import cpf.zzc.virtualwallet.auth.DefaultApiAuthenticatorImpl;
import org.junit.Test;

/**
 * date 2020/8/11
 *
 * @author caopengflying
 */

public class AuthTest {

    @Test
    public void getToken() {
        //client 获取token
        AuthToken generate = AuthToken.generate("http://getToken", 20200811, "1001", "pwd-01");
        String token = generate.getToken();
        System.out.println(token);
        //client根据token请求接口
        ApiAuthenticator apiAuthenticator = new DefaultApiAuthenticatorImpl();
        apiAuthenticator.auth("http://getToken?timestamp=20200811&appId=1001&token=" + token);

    }
}
