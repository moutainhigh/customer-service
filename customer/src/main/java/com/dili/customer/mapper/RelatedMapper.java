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
package com.dili.customer.mapper;

import com.dili.ss.base.MyMapper;
import com.dili.customer.domain.Related;
import com.dili.customer.sdk.dto.RelatedQuery;
import java.util.List;

/**
* @website http://shaofan.org
* @author shaofan
* @date 2020-08-24
**/
public interface RelatedMapper extends MyMapper<Related> {

    List<Related> selectByQuery(RelatedQuery query);
}