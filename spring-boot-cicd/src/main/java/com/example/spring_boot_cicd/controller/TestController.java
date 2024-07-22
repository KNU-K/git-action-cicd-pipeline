package com.example.spring_boot_cicd.controller;

import com.example.spring_boot_cicd.service.CalcService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/calc")
public class TestController {

    CalcService calcService;

    @GetMapping("/add")
    public Integer addWithIntegers(
            @RequestParam(value = "operand1", defaultValue = "0") Integer operand1,
            @RequestParam(value = "operand2", defaultValue = "0") Integer operand2) {
        return calcService.add(operand1, operand2);
    }
}
