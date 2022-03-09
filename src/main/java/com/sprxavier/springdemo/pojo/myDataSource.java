package com.sprxavier.springdemo.pojo;

import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * Hibernate提供的框架 实现JSR的validation接口
 * @Validated 标志改bean需要属性校验 类似sql中的check constraint
 */
@Validated
@ConfigurationProperties("spring.datasource")
public class myDataSource {
    private String driver;
    private String url;

    @Length(max = 3,message = "username outta range 3 <-- go to myDataSource and cancel if needed")
    private String username;

    private String password;


    @Override
    public String toString() {
        return "com.sprxavier.springdemo.pojo.myDataSource{" +
                "drvier='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
