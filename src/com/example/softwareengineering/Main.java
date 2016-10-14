package com.example.softwareengineering;
import java.util.ArrayList;

import static com.example.softwareengineering.Permission.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<User> anArrayOfUsers = new ArrayList<User>();
        ArrayList<Role> anArrayOfRoles = new ArrayList<Role>();


        anArrayOfUsers.add(new User(1, "jdoe", "sup3rpaZZ", "John Doe"));
        anArrayOfUsers.add(new User(2, "jrow", "Qweqrty12", "Jane Row"));


        anArrayOfRoles.add(new Role(1, 1, READ.code(), "a"));
        anArrayOfRoles.add(new Role(2, 1, WRITE.code(), "a.b"));
        anArrayOfRoles.add(new Role(3, 2, EXECUTE.code(), "a.b.c"));
        anArrayOfRoles.add(new Role(4, 1, EXECUTE.code(), "a.bc"));


        for (int i = 0; i < anArrayOfUsers.size(); i++) {
            if (anArrayOfUsers.get(0).Login != args[1]) {
                System.out.println("User is not found\n");
                //System.exit(1);
                //неверно сравнивает аргументы
            }
            else System.out.println("User is found\n");
            break;}
        for (int i = 0; i < anArrayOfUsers.size(); i++) {
            if (anArrayOfUsers.get(i).Password != args[2]) {
                System.out.println("Wrong password\n");
                //System.exit(2);
                //неверно сравнивает аргументы
            }
            else System.out.println("Correct password\n");
            break;

        }

        System.out.println(anArrayOfUsers.get(0).Login); //jdoe
        System.out.println(args[1]); //jdoe
        System.out.println(anArrayOfUsers.get(0).Password); //sup3rpaZZ
        System.out.println(args[2]); //sup3rpaZZ
        System.exit(0);
    }
}
