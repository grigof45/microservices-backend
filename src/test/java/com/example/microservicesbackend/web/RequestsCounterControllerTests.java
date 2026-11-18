package com.example.microservicesbackend.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class RequestsCounterControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void firstRequest_one() throws Exception {
        mockMvc.perform(get("/requests"))
            .andExpect(status().isOk())
            .andExpect(MockMvcResultMatchers.content().string("1"));
    }
}
