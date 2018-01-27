package com.acey;

import com.acey.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = "com.acey:server:+:stubs:10001", workOffline = true)
@ActiveProfiles("test")
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void getUserInfo() throws Exception {
        ResponseEntity userInfo = userService.getUserInfo(1L);
        Map user = (Map) userInfo.getBody();
        assertEquals(HttpStatus.OK, userInfo.getStatusCode());
        assertEquals("acey", user.get("username"));
    }
}
