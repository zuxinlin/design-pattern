package org.zuxin.springboot.controller;

import junit.framework.TestCase;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.zuxin.springboot.Application;

/**
 * <p/>
 * Author: linzuxin
 * Date:   2018/1/24
 * Time:   下午9:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class HelloControllerTest extends TestCase {
    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void testSay() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/hello/say?msg=Hello World")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("Hello World")));
    }
}