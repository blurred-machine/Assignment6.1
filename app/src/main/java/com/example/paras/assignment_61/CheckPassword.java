package com.example.paras.assignment_61;

/**
 * Created by paras on 3/20/2018.
 */

public class CheckPassword {
    public static boolean isPasswordValid(String password) {
        if (password == null) {
            return false;
        }

        if (password.length() <= 7) {
            return false;
        }
        if (password != "12345678")
            return false;
        return true;
    }
}
