package com.dili.customer.service;

import com.dili.customer.domain.Contacts;
import com.dili.ss.base.BaseService;
import com.dili.ss.domain.BaseOutput;

/**
 * 由MyBatis Generator工具自动生成
 * This file was generated on 2020-01-02 16:18:39.
 */
public interface ContactsService extends BaseService<Contacts, Long> {

    /**
     * 保存客户联系人信息
     * @param customerContacts
     * @return
     */
    BaseOutput saveContacts(Contacts customerContacts);
}