package com.github.weibao.compoment;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Create 16/2/5,下午8:42
 * @Author dongzhukai
 */
@Component
@Aspect
public class DataSourceInterceptor {
    /**
     * 设置登录,注册用户的数据源
     *
     * @param jp
     */
    public void setdataSourceAccount(JoinPoint jp) {
        DatabaseContextHolder.setCustomerType("dataSourceAccount");
    }

    /**
     * 设置
     *
     * @param jp
     */
    public void setdataSourceBiz(JoinPoint jp) {
        DatabaseContextHolder.setCustomerType("dataSourceBiz");
    }
}
