package com.dili.customer.service;

import com.dili.customer.domain.BusinessCategory;
import com.dili.customer.domain.TallyingArea;
import com.dili.ss.base.BaseService;

import java.util.List;

/**
 * 客户经营品类信息
 * @author yuehongbo
 * @Copyright 本软件源代码版权归农丰时代科技有限公司及其研发团队所有, 未经许可不得任意复制与传播.
 * @date 2020/8/31 14:46
 */
public interface BusinessCategoryService extends BaseService<BusinessCategory, Long> {
    /**
     * 批量保存客户经营信息
     * @param businessCategoryList 经营品类数据
     * @param customerId       客户ID
     * @param marketId         市场ID
     * @return
     */
    Integer saveInfo(List<BusinessCategory> businessCategoryList, Long customerId, Long marketId);

}
