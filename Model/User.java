package Model;

public class User {
    public int id;
    public String name;
    public String username;
    public String password;
    static int counterId = 0;

    public User(String name, String username, String password) {
        this.id = ++counterId;
        this.name = name;
        this.username = username;
        this.password = password;
    }

}
