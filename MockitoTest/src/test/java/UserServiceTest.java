import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;


@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UserDAO userDAO;
    @InjectMocks
    private UserService service;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void findUserIdTest() {
        when(userDAO.findByUserId("ABC")).thenReturn(createUser());
        User user = service.findUserId("ABC");
        System.out.print(user.getUserId());
        assertEquals(user.getFirstName(),"Sridhar");

    }

    public User createUser() {
        User user = new User();
        user.setUserId("ABC");
        user.setFirstName("Sridhar");
        user.setLastName("Iyer");
        user.setDateOfBirth("13-06-1984");
        return user;
    }
}
