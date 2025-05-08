package databaseconnection;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertTrue;



public class UserServiceTest {

    @Test
    void givenUser_whenSaveUser_thenCorrect() {
        Database db = mock(Database.class);
        UserService userService = new UserService(db);
        User user = mock(User.class);

        boolean result = userService.saveUser(user);

        assertTrue(result);
        verify(db).save(user);
    }


}
