package overridetech.jdbc.jpa;

import overridetech.jdbc.jpa.service.UserService;
import overridetech.jdbc.jpa.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        System.out.println("Created");
        userService.saveUser("Anton", "Ivanov", (byte) 40);
        System.out.println("User с именем Anton добавлен в базу данных");
        userService.saveUser("Andrey", "Javovich", (byte) 22);
        System.out.println("User с именем Andrey добавлен в базу данных");
        userService.saveUser("Tolya", "Twitchev", (byte) 30);
        System.out.println("User с именем Tolya добавлен в базу данных");
        userService.saveUser("Valery", "Userovich", (byte) 18);
        System.out.println("User с именем Valery добавлен в базу данных");

        System.out.println(userService.getAllUsers().toString());

        userService.cleanUsersTable();
        System.out.println("Cleaned");

        System.out.println(userService.getAllUsers().toString());

        userService.dropUsersTable();
        System.out.println("dropped");
    }
}