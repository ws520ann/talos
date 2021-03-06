/**
 * Copyright 2012-2017 Kaixindai Financing Services Jiangsu Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kxd.talos.dashboard.service.core.service.impl.dataprovider;

import com.kxd.talos.dashboard.service.core.consts.DataLayerSourceTypeEnums;
import com.kxd.talos.dashboard.service.core.service.impl.AbstractChildDataProvider;
import com.kxd.talos.dashboard.service.core.service.intf.IChildDataProvider;

/**
 * 请输入功能描述
 * 
 * @author lhldyf 2016年10月17日
 */
public class ElasticsearchChildDataProvider extends AbstractChildDataProvider implements IChildDataProvider {

    /**
     * {@inheritDoc}
     */
    @Override
    public String dataProviderType() {

        return DataLayerSourceTypeEnums.ES.code();

    }

}
