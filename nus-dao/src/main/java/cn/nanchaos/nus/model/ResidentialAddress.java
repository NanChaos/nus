package cn.nanchaos.nus.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Default Description
 * 居住地址
 *
 * @author: nanchaos
 * @time: 2022/1/12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResidentialAddress {
    /**
     * 国家
     */
    private String country;

    /**
     * 户籍_省
     */
    private String province;

    /**
     * 户籍_市
     */
    private String city;

    /**
     * 户籍_县 / 区
     */
    private String county;

    /**
     * 户籍_镇
     */
    private String town;
}
