package com.elite.kvijay9.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.util.ContentCachingResponseWrapper;

public class CommonFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        ContentCachingResponseWrapper responseCacheWrapperObject = new ContentCachingResponseWrapper((HttpServletResponse) servletResponse);
        byte[] responseArray = responseCacheWrapperObject.getContentAsByteArray();
        String responseStr = new String(responseArray, responseCacheWrapperObject.getCharacterEncoding());
        filterChain.doFilter(servletRequest, responseCacheWrapperObject);
        responseArray = responseCacheWrapperObject.getContentAsByteArray();
        responseStr = new String(responseArray, responseCacheWrapperObject.getCharacterEncoding());
        System.out.println("Filter after: " + responseStr);
        responseCacheWrapperObject.copyBodyToResponse();
    }

    @Override
    public void destroy() {

    }
}
