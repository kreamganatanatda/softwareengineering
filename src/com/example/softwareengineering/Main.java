package com.example.softwareengineering;


import static com.example.softwareengineering.Permission.*;

public class Main {

    public static void main(String[] args) {

        User[] anArrayOfUsers = new User[10];
        Role[] anArrayOfRoles = new Role[4];

        anArrayOfUsers[0]= new User(1, "jdoe", "sup3rpaZZ", "John Doe" );
        anArrayOfUsers[1]= new User(2, "jrow", "Qweqrty12", "Jane Row" );

        anArrayOfRoles[0] = new Role(1, 1, READ.code(), "a");
        anArrayOfRoles[1] = new Role(2, 1, WRITE.code(), "a.b");
        anArrayOfRoles[2] = new Role(3, 2, EXECUTE.code(), "a.b.c");
        anArrayOfRoles[3] = new Role(4, 1, EXECUTE.code(), "a.bc");

    System.out.println(args[0]+" "+args[1]+" "+args[2]);
        System.out.println(anArrayOfRoles[1].Resource);
    System.exit(0);
    }
}
