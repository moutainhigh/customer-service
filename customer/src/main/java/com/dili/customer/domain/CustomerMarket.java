package com.dili.customer.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.dili.ss.domain.BaseDomain;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * 由MyBatis Generator工具自动生成
 * 客户归属市场关系表
 * This file was generated on 2020-01-09 18:02:32.
 */
@Table(name = "`customer_market`")
@Getter
@Setter
public class CustomerMarket extends BaseDomain {
    /**
     * ID
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 归属组织
     */
    @Column(name = "`market_id`")
    @NotNull(message = "客户所属市场不能为空")
    private Long marketId;

    /**
     * 归属部门##内部创建归属到创建员工的部门
     */
    @Column(name = "`department_id`")
    private Long departmentId;

    /**
     * 客户id
     */
    @Column(name = "`customer_id`")
    private Long customerId;

    /**
     * 所有者
     */
    @Column(name = "`owner_id`")
    @NotNull(message = "客户所有者不能为空")
    private Long ownerId;

    /**
     * 客户等级
     */
    @Column(name = "`grade`")
    private Integer grade;

    /**
     * 客户行业##水果批发/蔬菜批发/超市
     */
    @Column(name = "`profession`")
    private String profession;

    /**
     * 经营地区##经营地区城市id
     */
    @Column(name = "`operating_area`")
    private String operatingArea;

    /**
     * 经营地区经度
     */
    @Column(name = "`operating_lng`")
    private String operatingLng;

    /**
     * 经营地区纬度
     */
    @Column(name = "`operating_lat`")
    private String operatingLat;

    /**
     * 其它头衔
     */
    @Column(name = "`other_title`")
    private String otherTitle;

    /**
     * 销售市场
     */
    @Column(name = "sales_market")
    private String salesMarket;

    /**
     * 客户别名
     */
    @Column(name = "`alias`")
    private String alias;

    /**
     * 客户类型##采购、销售、代买等##{provider:"dataDictionaryValueProvider",queryParams:{dd_id:4}}
     */
    @Column(name = "`type`")
    private String type;

    /**
     * 备注信息
     */
    @Column(name = "`notes`")
    private String notes;

    /**
     * 在本市场的初始创建人
     */
    @Column(name = "`creator_id`",updatable = false)
    private Long creatorId;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`",updatable = false)
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 修改人id
     */
    @Column(name = "`modifier_id`")
    private Long modifierId;

    /**
     * 修改时间
     */
    @Column(name = "`modify_time`")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modifyTime;

}