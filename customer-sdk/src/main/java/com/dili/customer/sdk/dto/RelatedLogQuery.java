/*
*  Copyright 2019-2020 ShaoFan
*
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*  http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/
package com.dili.customer.sdk.dto;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
* @website http://shaofan.org
* @author shaofan
* @date 2020-09-07
**/
@Data
public class RelatedLogQuery{

    /**
    * boostrap table post 参数
    * @author shaofan
    *
    */
    private int pageNum;//页码
    private int pageSize;//数量
    private String orderByColumn;//排序字段
    private String isAsc;//排序字符 asc desc

    /** provider */
    private Map metadata;


    /** 精确 */
    private Long parent;
}