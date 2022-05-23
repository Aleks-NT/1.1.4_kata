package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.cleanUsersTable();

        userService.saveUser("Иван", "Стрельцов", (byte) 23);
        userService.saveUser("Алена", "Вишневская", (byte) 28);
        userService.saveUser("Максим", "Карпин", (byte) 20);
        userService.saveUser("Наталья", "Соловьева", (byte) 33);

        userService.removeUserById(3);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();

        Util.shutdownSession();
        // реализуйте алгоритм здесь
    }
}
