package com.example.softwareengineering;


import static com.example.softwareengineering.Permission.*;

public class Main {

    public static void main(String[] args) {

        User[] anArrayOfUsers = new User[10];

        //Role[] anArrayOfRoles = new Role[4];

        anArrayOfUsers[0]= new User(1, "jdoe", "sup3rpaZZ", "John Doe" );
        anArrayOfUsers[1]= new User(2, "jrow", "Qweqrty12", "Jane Row" );

       /* Role[0] = new Role(1, 1, READ.code(), "a");
        Role[1] = new Role(2, 1, WRITE.code(), "a.b");
        Role[2] = new Role(3, 2, EXECUTE.code(), "a.b.c");
        Role[3] = new Role(4, 1, EXECUTE.code(), "a.bc");*/

    System.out.println(args[0]+" "+args[1]+" "+args[2]);
        System.out.println(anArrayOfUsers[1].Id);
    System.exit(0);
    }
}
