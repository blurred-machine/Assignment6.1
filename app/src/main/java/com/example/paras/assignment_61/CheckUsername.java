package com.example.paras.assignment_61;

/**
 * Created by paras on 3/20/2018.
 */

public class CheckUsername {

    public static boolean isUsernameValid(String username)
    {
        if(username == null){
            return false;
        }
        if (username != "paras")
            return false;
        return true;

    }
}
