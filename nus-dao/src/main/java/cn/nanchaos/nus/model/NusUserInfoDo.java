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
public class NusUserInfoDo implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * user表主键id
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 性别
     */
    private String gender;

    /**
     * 出生年月
     */
    private Date birthday;

    /**
     * 职业
     */
    private String profession;

    /**
     * 户籍地表Id
     */
    private String householdAddressId;

    /**
     * 居住地址表Id
     */
    private String residentialAddressId;

    /**
     * GitHub表Id
     */
    private String gitHubInfoId;

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
