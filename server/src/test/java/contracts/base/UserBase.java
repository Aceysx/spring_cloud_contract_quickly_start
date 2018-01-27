package contracts.base;

import com.acey.ServiceApp;
import com.acey.entities.User;
import com.acey.service.UserService;
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import java.util.Date;

import static org.mockito.BDDMockito.given;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceApp.class)
public class UserBase {

    @Autowired
    private WebApplicationContext context;
    @MockBean
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        User user = new User(1L, "acey");
        RestAssuredMockMvc.webAppContextSetup(context);
        given(userService.getUser(1L)).willReturn(user);
    }
}

