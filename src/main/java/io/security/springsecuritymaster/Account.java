package io.security.springsecuritymaster;

import lombok.Data;

@Data
public class Account {
    private String owner;
    private boolean secure;

    public Account(String owner, boolean secure) {
        this.owner = owner;
        this.secure = secure;
    }
}
