package com.bigcake.service;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by Bigcake on 9/9/2017
 */
public class Authority implements GrantedAuthority {
    private String role;

    public Authority(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role;
    }
}
