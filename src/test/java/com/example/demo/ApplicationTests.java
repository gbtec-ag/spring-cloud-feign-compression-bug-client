package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void contextLoads() {
        assertThat(ctx).isNotNull();
    }

    // @Test
    // public void apacheHttpClientBeanAvailale() {
    // FeignContext feignContext = ctx.getBean(FeignContext.class);
    // Map<String, RequestInterceptor> interceptors = feignContext.getInstances("foo", RequestInterceptor.class);
    // assertThat(interceptors).hasSize(2);
    //
    // RequestInterceptor interceptor = interceptors.get("feignAcceptGzipEncodingInterceptor");
    // assertThat(interceptor).isInstanceOf(FeignAcceptGzipEncodingInterceptor.class);
    //
    // interceptor = interceptors.get("feignContentGzipEncodingInterceptor");
    // assertThat(interceptor).isInstanceOf(FeignContentGzipEncodingInterceptor.class);
    // }
}
