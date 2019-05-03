package com.sv.samples.func.impl;

import com.sv.samples.func.contract.Function;

public class Print implements Function {
    public int evaluate(int n) {
        System.out.println(n);
        return n;
    }


}
