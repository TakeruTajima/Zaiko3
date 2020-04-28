package com.example.zaiko.domain.inhouse.user;

import com.example.zaiko.domain.common.Identity;

public class UserId extends Identity {
    public UserId() {
        super();
    }

    protected UserId(String uuid) {
        super(uuid);
    }


}
