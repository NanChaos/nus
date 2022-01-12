package cn.nanchaos.nus.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Default Description
 *
 * @author: nanchaos
 * @time: 2022/1/12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NusUserDO implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

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

    /**
     *
     */
    private Date createAt;

    /**
     *
     */
    private String createBy;

    /**
     *
     */
    private Date updateAt;

    /**
     *
     */
    private String updateBy;
}
