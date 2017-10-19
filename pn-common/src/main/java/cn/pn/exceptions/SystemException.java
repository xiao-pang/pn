package cn.pn.exceptions;

import cn.pn.enums.ResponseCodeEnum;
import cn.pn.enums.TradeStatusEnum;

/**
 * @Comment 系统异常
 * @Author 庞义洋
 * @Date 2017/10/13
 */
public class SystemException extends RuntimeException {

    private String code ;
    private String desc ;

    public SystemException(ResponseCodeEnum responseCode) {
        this(responseCode.getCode() , responseCode.getDesc()) ;
    }

    public SystemException(String code, String desc) {
        super("错误码:" + code + ",错误信息:" + desc);
        this.code = code;
        this.desc = desc;
    }

    public SystemException(ResponseCodeEnum responseCode , TradeStatusEnum tradeStatus) {
        this(responseCode.getCode() , responseCode.getDesc() , tradeStatus) ;
    }

    public SystemException(String code, String desc , TradeStatusEnum tradeStatus) {
        super("错误码:" + code + ",错误信息:" + desc + ",订单状态:" + tradeStatus );
        this.code = code;
        this.desc = desc;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
