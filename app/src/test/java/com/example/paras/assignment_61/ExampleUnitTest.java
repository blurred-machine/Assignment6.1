package com.example.paras.assignment_61;

import android.provider.ContactsContract;

import org.junit.Test;
import org.junit.*;

import javax.xml.validation.Validator;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
   @Test
    public void isUsernameCorrect() throws Exception{
       assertTrue("Invalid Username",CheckUsername.isUsernameValid("paras"));
   }

    @Test
    public void isPasswordCorrect() throws Exception{
        assertTrue("Invalid Password",CheckPassword.isPasswordValid("12345678"));
    }
}
