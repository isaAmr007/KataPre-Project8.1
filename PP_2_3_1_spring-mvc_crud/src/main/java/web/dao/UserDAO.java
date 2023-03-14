package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    void updateUser(User updateUser);

    void removeUserById(int id);

    List<User> getAllUsers();

    User getUserById(int id);

}
