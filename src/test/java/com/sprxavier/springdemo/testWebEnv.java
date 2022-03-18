package com.sprxavier.springdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 在test中测试用web环境测试接口
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class testWebEnv {

    @Test
    public void testWeb() {

    }
}
