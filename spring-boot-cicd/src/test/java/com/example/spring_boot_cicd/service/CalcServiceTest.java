package com.example.spring_boot_cicd.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalcServiceTest {
    @Autowired
    private  CalcService calcService;


    @Test
    @DisplayName("Addition Test")
    void addTest() {
        // Test cases for the add method
        assertionAddition(1, 2, 3);
        assertionAddition(4, 2, 6);
        assertionAddition(-1, 4, 3);
    }

    void assertionAddition(Integer op1, Integer op2, Integer result) {
        Assertions.assertThat(calcService.add(op1, op2)).isEqualTo(result);
    }
}
