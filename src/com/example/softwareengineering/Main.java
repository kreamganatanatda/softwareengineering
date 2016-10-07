package com.example.softwareengineering;


import java.util.concurrent.atomic.AtomicReference;

import static com.example.softwareengineering.Permission.*;

public class Main {

    public static void main(String[] args) {

        User[] anArrayOfUsers = new User[10];
        Role[] anArrayOfRoles = new Role[4];

        anArrayOfUsers[0] = new User(1, "jdoe", "sup3rpaZZ", "John Doe");
        anArrayOfUsers[1] = new User(2, "jrow", "Qweqrty12", "Jane Row");

        anArrayOfRoles[0] = new Role(1, 1, READ.code(), "a");
        anArrayOfRoles[1] = new Role(2, 1, WRITE.code(), "a.b");
        anArrayOfRoles[2] = new Role(3, 2, EXECUTE.code(), "a.b.c");
        anArrayOfRoles[3] = new Role(4, 1, EXECUTE.code(), "a.bc");




       /* for (int i = 0; i < 10; i++) {
            if (anArrayOfUsers[i].Login != login) {
                System.out.println("User is not found");
                System.exit(1);
            }
            break;
            if (anArrayOfUsers[i].Password != password) {
                System.out.println("Wrong password");
                System.exit(2);
            }
            break;

        }
        */
        System.out.println(args[0] + " " + args[1] + " " + args[2]);
        System.out.println(anArrayOfRoles[1].Resource);
        System.exit(0);
    }
}
