package cpf.zzc.virtualwallet.auth;

/**
 * date 2020/8/11
 *
 * @author caopengflying
 */
public class ApiRequest {
    private static final String APP_ID_KEY = "appId";
    private static final String TOKEN_KEY = "token";
    private static final String TIMESTAMP_KEY = "timestamp";
    private String baseUrl;
    private String appId;
    private String token;
    private long timestamp;

    public ApiRequest() {
    }

    public ApiRequest(String baseUrl, String appId, String token, long timestamp) {
        this.baseUrl = baseUrl;
        this.appId = appId;
        this.token = token;
        this.timestamp = timestamp;
    }

    public static ApiRequest buildFromUrl(String url) {
        ApiRequest apiRequest = new ApiRequest();
        String[] split = url.split("\\?");
        apiRequest.baseUrl = split[0];
        String[] param = split[1].split("&");
        for (String s : param) {
            String[] map = s.split("=");
            String key = map[0];
            String value = map[1];
            switch (key) {
                case APP_ID_KEY:
                    apiRequest.appId = value;
                    break;
                case TOKEN_KEY:
                    apiRequest.token = value;
                    break;
                case TIMESTAMP_KEY:
                    apiRequest.timestamp = Long.parseLong(value);
                    break;
                default:
            }
        }
        return apiRequest;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getAppId() {
        return appId;
    }

    public String getToken() {
        return token;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
