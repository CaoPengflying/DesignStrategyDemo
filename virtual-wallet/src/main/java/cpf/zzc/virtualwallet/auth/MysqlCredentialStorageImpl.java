package cpf.zzc.virtualwallet.auth;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * mysql凭证存储
 * date 2020/8/11
 *
 * @author caopengflying
 */
public class MysqlCredentialStorageImpl implements CredentialStorage {
    private static Map<String, String> passwordMap = Maps.newHashMap();

    static {
        passwordMap.put("1000", "pwd-00");
        passwordMap.put("1001", "pwd-01");
        passwordMap.put("1002", "pwd-02");
        passwordMap.put("1003", "pwd-03");
    }

    @Override
    public String getPasswordByAppId(String appId) {
        return passwordMap.get(appId);
    }
}
