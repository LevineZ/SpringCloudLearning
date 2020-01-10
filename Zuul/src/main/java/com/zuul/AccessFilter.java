package com.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public class AccessFilter extends ZuulFilter {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccessFilter.class);


    @Override
    public String filterType() {           //返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型
        return "pre";
    }

    @Override
    public int filterOrder() {            //通过int值来定义过滤器的执行顺序
        return 0;
    }

    @Override
    public boolean shouldFilter() {       //返回一个boolean类型来判断该过滤器是否要执行，所以通过此函数可实现过滤器的开关。
        return true;
    }

    @Override
    public Object run() throws ZuulException {      //过滤器具体逻辑
        RequestContext cxt = RequestContext.getCurrentContext();
        HttpServletRequest request = cxt.getRequest();
        LOGGER.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("AccessToken");
        if (accessToken == null) {
            LOGGER.warn("accessToken is empty");
            cxt.setSendZuulResponse(false);        //过滤该请求，不对其进行路由
            cxt.setResponseStatusCode(401);
            return null;
        }
        LOGGER.info("accessToken is ok");
        return null;
    }
}