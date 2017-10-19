package cn.pn.enums;

/**
 * @Comment 交易状态
 * @Author 庞义洋
 * @Date 2017/10/13
 */
public enum TradeStatusEnum {

    SUCCESS("成功") ,
    PROCESS("处理中") ,
    UNKNOWN("未知") ,
    FAIL("失败") ;

    private String value ;

    TradeStatusEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
