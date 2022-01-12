package cn.nanchaos.nus.user.reqdto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Default Description
 *
 * @author: nanchaos
 * @time: 2022/1/12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NusUserSaveReqDTO implements Serializable {
    private static final long serialVersionUID = 1879525334956256532L;
    /**
     * 加密后密码
     */
    private String password;

    /**
     * 加密盐
     */
    private String salt;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String phone;
}
