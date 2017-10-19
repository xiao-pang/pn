package cn.pn.enums;

/**
 * @Comment 响应信息接口
 * @Author 庞义洋
 * @Date 2017/10/13
 */
public interface IResponse {

    /**
     * 获取响应码
     * @return
     */
    String getCode() ;

    /**
     * 获取响应信息
     * @return
     */
    String getDesc() ;

}
