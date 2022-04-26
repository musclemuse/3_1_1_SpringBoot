package pp.springboot.service;

import pp.springboot.model.User;

import java.util.List;

public interface UserService {
    User add(User user);
    void removeUserById (long id);
    User update (User user);
    User getUserById (long id);
    List<User> listOfAllUsers();
}
