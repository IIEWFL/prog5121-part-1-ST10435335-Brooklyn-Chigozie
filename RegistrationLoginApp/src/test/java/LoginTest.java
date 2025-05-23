/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mycompany.registrationloginapp.Login;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author brook
 */

public class LoginTest {

    @Test
    void testLoginUserSuccessful() {
        Login login = new Login("testuser", "TestPass1!");
        assertTrue(login.loginUser("testuser", "TestPass1!"));
    }

    @Test
    void testLoginUserIncorrectCredentials() {
        Login login = new Login("testuser", "TestPass1!");
        assertFalse(login.loginUser("wronguser", "TestPass1!"));
        assertFalse(login.loginUser("testuser", "wrongpass"));
        assertFalse(login.loginUser("wronguser", "wrongpass"));
    }

    @Test
    void testReturnLoginStatusSuccessful() {
        Login login = new Login("testuser", "TestPass1!");
        assertEquals("Welcome testuser, it is great to see you again.", login.returnLoginStatus(true, "testuser"));
    }

    @Test
    void testReturnLoginStatusFailed() {
        Login login = new Login("testuser", "TestPass1!");
        assertEquals("Username or password incorrect, please try again.", login.returnLoginStatus(false, "anyuser"));
    }
}