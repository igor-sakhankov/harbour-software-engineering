package com.harbour.softwareengineering.springboot.restfulapp;

import static org.mockito.Mockito.when;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ToDoServiceTest {

    @Mock
    private ToDoRepository repository;
    @InjectMocks
    private ToDoService sut;

    @Test
    void test() {
        when(repository.getActiveItems()).thenReturn(List.of("1"));

        System.out.println(sut.getActiveItems());
    }

}
