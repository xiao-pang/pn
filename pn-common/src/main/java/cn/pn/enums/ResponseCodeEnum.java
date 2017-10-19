package cn.pn.enums;

/**
 * @Comment 响应码
 * @Author 庞义洋
 * @Date 2017/10/13
 */
public enum ResponseCodeEnum implements IResponse {
    SUCCESS("000000" , "处理成功") ,

    //系统异常
    SYSTEM_ERROR("001000" , "系统异常") ,


    //参数异常
    INVALID_PARAMETER("002000" , "参数校验异常{0}") ,

    ;

    /**
     * 响应码
     */
    private String code ;

    /**
     * 响应信息
     */
    private String value ;

    ResponseCodeEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String getDesc() {
        return null;
    }
}
