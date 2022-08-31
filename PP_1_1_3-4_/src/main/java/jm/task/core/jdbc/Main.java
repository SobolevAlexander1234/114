package jm.task.core.jdbc;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;


public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("sasha","sob",(byte) 25);
        System.out.println("User с именем sasha добавлен в базу данных");
        userDaoJDBC.saveUser("vasilisa","efim",(byte) 1);
        System.out.println("User с именем vasilisa добавлен в базу данных");
        userDaoJDBC.saveUser("pasha","hram",(byte) 24);
        System.out.println("User с именем pasha добавлен в базу данных");
        userDaoJDBC.saveUser("evgen","svistok",(byte) 12);
        System.out.println("User с именем evgen добавлен в базу данных");
        userDaoJDBC.getAllUsers();
        System.out.println();
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();


    }
}