package com.example.spring_boot_cicd.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public Integer add(Integer op1, Integer op2){
        return op1 + op2;
    }
}

