package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    private static final UserDao userDa= new UserDaoHibernateImpl();


    public void createUsersTable() throws SQLException {
        userDa.createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        userDa.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        userDa.saveUser(name,lastName,age);
    }

    public void removeUserById(long id) throws SQLException {
        userDa.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        return userDa.getAllUsers();
    }

    public void cleanUsersTable() throws SQLException {
        userDa.cleanUsersTable();
    }
}