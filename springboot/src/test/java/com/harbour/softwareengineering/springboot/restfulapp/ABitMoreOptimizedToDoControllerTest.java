package com.harbour.softwareengineering.springboot.restfulapp;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
class ABitMoreOptimizedToDoControllerTest {

    @MockBean
    private ToDoService service;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnDefaultMessage() throws Exception {
        //given
        when(service.getActiveItems()).thenReturn(List.of("1", "2"));

        //when
        var resultActions = this.mockMvc.perform(get("/v1/todo/items"))
                                        .andDo(print())
                                        .andExpect(status().isOk())
                                        .andExpect(jsonPath("$.items.length()").value(2));
        final var contentAsString = resultActions.andReturn()
                                                 .getResponse()
                                                 .getContentAsString();

        System.out.println(contentAsString);
    }
}
