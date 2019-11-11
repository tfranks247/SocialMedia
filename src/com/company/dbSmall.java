package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class dbSmall {
   private String userName;
   private String password;

    public dbSmall() {
    }

    public dbSmall(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
