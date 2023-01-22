package com.lazyguys.lazycraft.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ItemControllerTest{

    @Autowired
    MockMvc mockMvc;

//    @MockBean
//    ItemManagerService itemManagerService;

    @Test
    void should_not_find_unexisting_customer() throws Exception {
        mockMvc.perform(get("/item/1")).andExpect(status().isNotFound());
    }

}