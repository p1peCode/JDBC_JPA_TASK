package overridetech.jdbc.jpa;

import overridetech.jdbc.jpa.service.UserService;
import overridetech.jdbc.jpa.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userDao = new UserServiceImpl();

        userDao.createUsersTable();
        userDao.saveUser("Anton", "Ivanov", (byte) 40);
        System.out.println("User с именем Anton добавлен в базу данных");
        userDao.saveUser("Andrey", "Javovich", (byte) 22);
        System.out.println("User с именем Andrey добавлен в базу данных");
        userDao.saveUser("Tolya", "Twitchev", (byte) 30);
        System.out.println("User с именем Tolya добавлен в базу данных");
        userDao.saveUser("Valery", "Userovich", (byte) 18);
        System.out.println("User с именем Valery добавлен в базу данных");

        System.out.println(userDao.getAllUsers().toString());

        userDao.cleanUsersTable();

        userDao.dropUsersTable();
    }
}