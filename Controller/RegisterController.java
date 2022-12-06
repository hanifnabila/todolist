package Controller;

import java.util.ArrayList;

import Database.Database;
import Model.User;

public class RegisterController {
    public void store(Database db, User user) {
        db.add(user);
    }

    public void printUsers(ArrayList<User> db) {
        for (User user : db) {
            System.out.println("========= USER " + user.id + "=========");
            System.out.println("Name\t:" + user.name);
            System.out.println("Userame\t:" + user.username);
            System.out.println("Password\t:" + user.password);
            System.out.println();
        }
    }
}
