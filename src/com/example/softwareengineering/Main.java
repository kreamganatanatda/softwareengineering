package com.example.softwareengineering;

//Класс, предоставляющий простой список, аналогичный массиву,
//за исключением того, что количество элементов не фиксировано
import java.util.ArrayList;

import static com.example.softwareengineering.Permission.*;

public class Main {

    public static void main(String[] args) {

        //new Client(args).parse();
        ArrayList<User> UserList = new ArrayList<>();
        UserList.add(new User(1, "jdoe", "sup3rpaZZ", "John Doe" ));
        UserList.add(new User(2, "jrow", "Qweqrty12", "Jane Row" ));

        ArrayList<Role> RoleList = new ArrayList<>();
        RoleList.add(new Role(1, 1, READ.code(), "a"));
        RoleList.add(new Role(2, 1, WRITE.code(), "a.b"));
        RoleList.add(new Role(3, 2, EXECUTE.code(), "a.b.c"));
        RoleList.add(new Role(4, 1, EXECUTE.code(), "a.bc"));


    System.exit(0);
    }
}
