package hello;

import hello.filters.SimpleFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * This annotation belongs to spring and it will probably not be available on the Zuul version provided by Nexi.
 * TODO find alternative for @EnableZuulProxy
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ZuulClientApplication {


    public static void main(String[] args) {
        SpringApplication.run(ZuulClientApplication.class, args);
    }

    @Bean
    public SimpleFilter simpleFilter() {
        return new SimpleFilter();
    }

}


