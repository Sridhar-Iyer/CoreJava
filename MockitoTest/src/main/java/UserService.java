public class UserService {

    UserDAO userDao = new UserDAOImpl();

    public User findUserId(String userId) {

        return userDao.findByUserId(userId);

    }
}
