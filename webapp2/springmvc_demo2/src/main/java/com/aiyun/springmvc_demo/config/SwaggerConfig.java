package com.aiyun.springmvc_demo.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @ClassName SwaggerConfig
 * @Description TODO
 * @Author tree
 * @Date 2019/7/6 12:59
 * @Version 1.8
 **/

@Configuration
@EnableWebMvc
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi(){
        return  new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.aiyun.springmvc_demo2.controller"))
                .paths(PathSelectors.any())
                .build();

    }

private ApiInfo apiInfo(){
    return new ApiInfoBuilder()
                     // 设置页面标题
                  .title("使用swagger2构建短视频后端api接口文档")
                     // 设置联系人
                     .contact(new Contact("fxy", "http://gitcom/fuxiaoyangAlex", "fuxiaoyang18@163.com"))
                    // 描述
                     .description("欢迎访问短视频接口文档，这里是描述信息")
                     // 定义版本号
                     .version("1.0").build();
         }
}
