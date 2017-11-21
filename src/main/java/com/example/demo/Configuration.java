package com.example.demo;

@org.springframework.context.annotation.Configuration
public class Configuration {

    // FIXME Only if we add a @Bean of type ApacheHttpClient to the application context the
    // FeignAcceptGzipEncodingAutoConfiguration and FeignContentGzipEncodingAutoConfiguration are adding the necessary
    // interceptors to the application context.
    // But then the service discovery is broken and the client does not find it's server part anymore!

    // @Bean
    // public ApacheHttpClient apacheHttpClient() {
    // return new ApacheHttpClient();
    // }

}
