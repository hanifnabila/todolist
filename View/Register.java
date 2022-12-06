package View;

import java.util.Scanner;

import Controller.RegisterController;
import Database.Database;
import Model.User;

public class Register {

    public String inputData(String placeholder) {
        Scanner input = new Scanner(System.in);

        System.out.println("===============");
        System.out.println(placeholder);
        String str = input.nextLine();

        return str;
    }

    public static void main(String args[]) {
        Database db = new Database();
        Register thisClass = new Register();
        var regist = new RegisterController();
        for (int i = 0; i < 3; i++) {
            String name = thisClass.inputData("Masukan name: ");
            String username = thisClass.inputData("Masukan username: ");
            String password = thisClass.inputData("Masukan password: ");

            regist.store(db, new User(name, username, password));
        }
        regist.printUsers(db.getUsers());
    }
}