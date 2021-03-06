package com.dili.customer.service;

import com.dili.customer.domain.Attachment;
import com.dili.ss.base.BaseService;

import java.util.List;

/**
 * 客户附件信息
 * 由MyBatis Generator工具自动生成
 * This file was generated on 2020-07-25 17:14:18.
 */
public interface AttachmentService extends BaseService<Attachment, Long> {

    /**
     * 批量保存数据
     * @param attachmentList
     * @return
     */
    Integer batchSave(List<Attachment> attachmentList);
}