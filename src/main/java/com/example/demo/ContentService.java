package com.example.demo;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ContentService {

    private final ContentProxy proxy;

    public ContentService(ContentProxy proxy) {
        this.proxy = proxy;
    }

    public Content get(Integer size) {
        return proxy.get(size);
    }

}

@FeignClient(name = "spring-cloud-feign-compression-bug-server")
interface ContentProxy {

    @RequestMapping(path = "/api/content", method = GET, produces = APPLICATION_JSON_UTF8_VALUE)
    Content get(@RequestParam("size") Integer size);

}
