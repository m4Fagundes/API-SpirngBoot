// package com.brincandocomspringboot.springboot.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// import springfox.documentation.service.Contact;
// import springfox.documentation.spi.DocumentationType;
// import springfox.documentation.spring.web.plugins.Docket;
// import springfox.documentation.builders.ApiInfoBuilder;
// import springfox.documentation.builders.PathSelectors;
// import springfox.documentation.builders.RequestHandlerSelectors;
// import springfox.documentation.service.ApiInfo;
// import springfox.documentation.swagger2.annotations.EnableSwagger2;

// @Configuration
// @EnableSwagger2
// public class SwaggerConfig {


//     @Bean
//     public Docket apiDiDocket(){
//         return new Docket(DocumentationType.SWAGGER_2)
//             .select()
//             .apis(RequestHandlerSelectors.basePackage("com.brincandocomspringboot.controller"))
//             .paths(PathSelectors.any())
//             .build()
//             .apiInfo(buildIpiInfo());
//     }


//     private ApiInfo buildIpiInfo(){
//         return new ApiInfoBuilder()
//             .title("API Person")
//             .description("REST Api para gerenciamento de pessoas")
//             .version("1.0.0")
//             .contact(new Contact("Matheus" , "matheusfagundesaraujo@gmail.com", null))
//             .build();
//     }

// }
