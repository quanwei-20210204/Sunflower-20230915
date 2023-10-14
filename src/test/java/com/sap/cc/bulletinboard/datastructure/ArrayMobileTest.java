package com.sap.cc.bulletinboard.datastructure;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMobileTest {

    @Test
    public void given_user_when_login_then_(){
        ArrayMobile arrayMobile = new ArrayMobile();
        arrayMobile.LoggedInUserArray();
        assertEquals(0, arrayMobile._users.length);
    }

}