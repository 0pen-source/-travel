package com.github.weibao.compoment;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Create 16/2/5,下午5:58
 * @Author dongzhukai
 */
public class DynamicDataSource extends AbstractRoutingDataSource{
    @Override
    protected Object determineCurrentLookupKey() {
        return DatabaseContextHolder.getCustomerType();
    }


}
