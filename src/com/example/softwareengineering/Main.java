package com.example.softwareengineering;

import org.apache.commons.cli.ParseException;

import java.util.ArrayList;

import static com.example.softwareengineering.Permission.*;

public class Main {

    public static void main(String[] arg) throws ParseException {

        ArrayList<User> anArrayOfUsers = new ArrayList<User>();
        ArrayList<Role> anArrayOfRoles = new ArrayList<Role>();


        anArrayOfUsers.add(new User(1, "jdoe", "sup3rpaZZ", "John Doe"));
        anArrayOfUsers.add(new User(2, "jrow", "Qweqrty12", "Jane Row"));


        anArrayOfRoles.add(new Role(1, 1, READ.code(), "a"));
        anArrayOfRoles.add(new Role(2, 1, WRITE.code(), "a.b"));
        anArrayOfRoles.add(new Role(3, 2, EXECUTE.code(), "a.b.c"));
        anArrayOfRoles.add(new Role(4, 1, EXECUTE.code(), "a.bc"));


//        for (int i = 0; i < anArrayOfUsers.size(); i++) {
//            if (anArrayOfUsers.get(0).Login != ) {
//                System.out.println("User is not found\n");
//                //System.exit(1);
//                //неверно сравнивает аргументы
//            } else System.out.println("User is found\n");
//            break;
//        }
//        for (int i = 0; i < anArrayOfUsers.size(); i++) {
//            if (anArrayOfUsers.get(i).Password != args[2]) {
//                System.out.println("Wrong password\n");
//                //System.exit(2);
//                //неверно сравнивает аргументы
//            } else System.out.println("Correct password\n");
//            break;
//
//        }

        Userdata userdata = new Parse(arg).parseCMD();
        if (userdata.isEmpty()) {
            System.exit(0);
        } else if (userdata.authentication()) {
            boolean resL = checkLogin(userdata, anArrayOfUsers);
            if (resL) {
                boolean resP = checkPassword(userdata, anArrayOfUsers);
                if (resP) {
                    System.out.println("Successfully");
                    System.exit(0);
                }
            } else {
                System.out.println("Wrong login ");
                System.exit(1);
            }
            System.out.println("Wrong password");
            System.exit(2);
        } else if (userdata.authorization()) {
        } else {
            System.out.println("ERROR!!!");
        }
    }

    private static boolean checkLogin(Userdata userdata, ArrayList<User> anArrayOfUsers) {
        for (User anArrayOfUser : anArrayOfUsers) {
            if (userdata.getLogin().equals(anArrayOfUser.Login)) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkPassword(Userdata userdata, ArrayList<User> anArrayOfUsers) {
        for (User anArrayOfUser : anArrayOfUsers) {
            if (userdata.getPassword().equals(anArrayOfUser.Password)) {
                return true;
            }
        }
        return false;
    }
}
