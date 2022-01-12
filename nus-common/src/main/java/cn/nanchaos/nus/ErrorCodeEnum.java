package cn.nanchaos.nus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Default Description
 *
 * @author: nanchaos
 * @time: 2022/1/12
 */
@Getter
@AllArgsConstructor
public enum ErrorCodeEnum {
    /**
     * 操作成功
     */
    OPTION_SUCCESS("OPTION_SUCCESS", "操作成功"),

    /**
     * 操作失败
     */
    OPTION_FAILURE("OPTION_FAILURE", "操作失败"),

    /**
     * 参数异常
     */
    ERROR_PARAM_EXCEPTION("ERROR_PARAM_EXCEPTION", "参数异常"),

    /**
     * 系统繁忙，请重新尝试
     */
    ERROR_SYSTEM_EXCEPTION("ERROR_SYSTEM_EXCEPTION", "系统繁忙，请重新尝试");

    private String code;
    private String msg;
}
