package com.dili.customer.sdk.rpc;

import com.dili.customer.sdk.domain.CustomerMarket;
import com.dili.ss.domain.BaseOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <B></B>
 * <B>Copyright:本软件源代码版权归农丰时代科技有限公司及其研发团队所有,未经许可不得任意复制与传播.</B>
 * <B>农丰时代科技有限公司</B>
 *
 * @author yuehongbo
 * @date 2020/6/18 15:59
 */
@FeignClient(name = "customer-service", contextId = "customerMarketRpc", url = "${customerService.url:}")
public interface CustomerMarketRpc {

    /**
     * 获取客户在某市场内的信息
     * @param customerId 客户ID
     * @param marketId 市场ID
     * @return
     */
    @PostMapping(value = "/api/customerMarket/getByCustomerAndMarket")
    BaseOutput<CustomerMarket> getByCustomerAndMarket(@RequestParam("customerId") Long customerId, @RequestParam("marketId") Long marketId);

    /**
     * 更改客户所在市场的客户等级
     * @param customerId 客户ID
     * @param marketId 所属市场ID
     * @param nextGrade 想要更新成的等级
     */
    @PostMapping("/api/customerMarket/changeGrade")
    BaseOutput changeGrade(@RequestParam("customerId") Long customerId, @RequestParam("marketId") Long marketId, @RequestParam("grade") Integer nextGrade);
}
