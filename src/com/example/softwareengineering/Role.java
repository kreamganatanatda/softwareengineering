package com.example.softwareengineering;


public class Role {
    public int      Id;
    public int      User_id;
    public Permission      Name;
    public String   Resource;

    public Role(int id, int user_id, Permission name, String resource) {
        Id       = id;
        User_id  = user_id;
        Name     = name;
        Resource = resource;
    }
}