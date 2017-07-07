package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Janita
 * create on 2017/3/4
 * 使用swagger来管理restful接口文档
 */
@Configuration
@EnableSwagger2
@SuppressWarnings("unused")
public class SwaggerConfig {

	private static final String API_PACKAGE= "com.example.demo";
	private static final String TITLE = "展示模块";
	private static final String DESC = "展示模块";
	
	@Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
//                .globalOperationParameters(parameterList())
                .select()
                .apis(RequestHandlerSelectors.basePackage(API_PACKAGE))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(TITLE)
                .description(DESC)
                .termsOfServiceUrl("")
                .contact(new Contact("bin", "www.lfb.com/", ""))
                .version("v1")
                .build();
    }

//    /**
//     * 添加 请求头 中需要的参数
//     * @return
//     */
//    private List<Parameter> parameterList() {
//        List<Parameter> aParameters = new ArrayList<>();
//
//        ParameterBuilder token = new ParameterBuilder();
//        token.name(ShowConst.HEADER_TOKEN).description("在请求头中添加登录成功之后获得的 x-access-token，").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
//        aParameters.add(token.build());
//
//        ParameterBuilder loginName = new ParameterBuilder();
//        loginName.name(ShowConst.HEADER_USERNAME).description("在请求头中添加登录成功之后获得的 x-access-username").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
//        aParameters.add(loginName.build());
//
//        return aParameters;
//    }
}
