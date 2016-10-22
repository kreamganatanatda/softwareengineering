package com.example.softwareengineering;

public class Userdata {
    private String arrlogin;
    private String arrpassword;
    private String arrresource;
    private String arrrole;

    public Userdata(String arrlogin, String arrpassword, String arrresource, String arrrole) {
        this.arrlogin = arrlogin;
        this.arrpassword = arrpassword;
        this.arrresource = arrresource;
        this.arrrole = arrrole;
    }

    public Userdata() {
        this.arrlogin = null;
        this.arrpassword = null;
        this.arrresource = null;
        this.arrrole = null;
    }

    public boolean isEmpty() {
        return ((arrlogin == null) && (arrrole == null) && (arrpassword == null) && (arrresource == null));
    }

    public boolean authentication() {
        return ((arrlogin != null) && (arrpassword != null));
    }

    public boolean authorization() {
        return (authentication() && (arrrole != null) && (arrresource != null));
    }


    public void setLogin(String login) {
        this.arrlogin = login;
    }

    public void setPassword(String password) {
        this.arrpassword = password;
    }

    public void setResource(String resource) {
        this.arrresource = resource;
    }

    public void setRole(String role) {
        this.arrrole = role;
    }

    public String getLogin() {
        return arrlogin;
    }

    public String getPassword() {
        return arrpassword;
    }

    public String getResource() {
        return arrresource;
    }

    public String getRole() {
        return arrrole;
    }

}
