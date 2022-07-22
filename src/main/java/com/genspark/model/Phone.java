package com.genspark.model;

import org.springframework.stereotype.Component;

@Component
public class Phone {

    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
