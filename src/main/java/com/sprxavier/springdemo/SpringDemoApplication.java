package com.sprxavier.springdemo;

import com.sprxavier.springdemo.pojo.myDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * 1. SpringBoot在pom文件-->springboot-dependencies中定义了一系列的属性用于存放版本信息
 * 之后又定义了一个版本管理属性，引用了上述的版本信息 封装好了一套成熟稳定的版本引用
 * <p>
 * 2. 项目的pom文件中继承了parent
 */
@SpringBootApplication
/**
 * 在 **@EnableConfigurationProperties** 注解的参数中写入需要从配置依赖注入的bean
 *
 * NOTE:在用此注解注册过的bean不用加@Component注解，因为这个注解里包含了@Component
 * 否则会造成 bean 的重复定义。
 */
@EnableConfigurationProperties(myDataSource.class)

/**
 * 会扫描当前包及其子包中的所有类型的注解，做customized swagger docs
 */
@EnableSwagger2
public class SpringDemoApplication {
    /**
     * args在cmd下可以手动键入
     * Spring会处理args中的参数并当作临时属性覆盖boot配置中的属性
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 一般为了安全性
         * 这里run方法的第二个参数可以删去 这样就切断了boot工程和cmd的联系
         */
        ConfigurableApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);

        myDataSource bean = context.getBean(myDataSource.class);

        System.out.println("启动类中bean为： " + bean);
    }

}
