package cpf.zzc.virtualwallet.auth;

import java.util.Date;
import java.util.Map;

/**
 * date 2020/8/11
 *
 * @author caopengflying
 */
public class AuthToken {
    private static final Long DEFAULT_EXPIRE_TIME_INTERVAL = 60L * 1000;
    private String token;
    private long createTime;
    private Long expireTime = DEFAULT_EXPIRE_TIME_INTERVAL;

    public AuthToken(String token, long createTime, Long expireTime) {
        this.token = token;
        this.createTime = createTime;
        this.expireTime = expireTime;
    }

    public AuthToken(String token, long createTime) {
        this.token = token;
        this.createTime = createTime;
    }
    public static AuthToken generate(String url,long timestamp,String appId, String password){
        StringBuilder token = new StringBuilder();
        token.append(url).append(appId).append(password).append(timestamp);
        return new AuthToken(token.toString(), timestamp);
    }
    /**
     * 生成token
     * @param url
     * @param createTime
     * @param paramMap
     * @return
     */
    public static AuthToken createToken(String url, long createTime, Map<String, String> paramMap) {
        StringBuilder token = new StringBuilder();
        token.append(url);
        for (String key : paramMap.keySet()) {
            token.append(key);
            token.append(paramMap.get(key));
        }
        token.append(createTime);
        return new AuthToken(token.toString(),createTime);
    }

    public boolean isExpired() {
        Date now = new Date();
        return now.getTime() - createTime <= expireTime;
    }

    public String getToken() {
        return token;
    }

    public boolean match(AuthToken authToken) {
        return this.token.equals(authToken.getToken());
    }

}
