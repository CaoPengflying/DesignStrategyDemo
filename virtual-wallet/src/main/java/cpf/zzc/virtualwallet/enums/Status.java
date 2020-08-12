package cpf.zzc.virtualwallet.enums;

/**
 * date 2020/8/11
 *
 * @author caopengflying
 */
public enum Status {
    /**
     * 代执行
     */
    TO_BE_EXECUTED(1),
    /**
     * 执行完成
     */
    EXECUTED(2);
    private Integer code;

    Status(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
