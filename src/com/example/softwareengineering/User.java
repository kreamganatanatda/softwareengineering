package com.example.softwareengineering;

class User {
    public int Id;
    public String Login;
    public String Password;
    public String Name;


    public User(int id, String login, String password, String name) {
        Id = id;
        Login = login;
        Password = password;
        Name = name;
    }

    public String getLogin(){return Login;}
    public String getPassword(){return Password;}
}
