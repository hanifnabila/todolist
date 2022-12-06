package Database;

import java.util.ArrayList;

import Model.User;

public class Database {
    private ArrayList<User> users = new ArrayList<User>();

    public void add(User user) {
        this.users.add(user);
    }

    public ArrayList<User> getUsers() {
        return this.users;
    }

}
