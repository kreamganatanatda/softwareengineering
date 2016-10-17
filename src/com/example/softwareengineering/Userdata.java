package com.example.softwareengineering;

/**
 * Created by Гертруда on 15.10.2016.
 */
public class Userdata {
    private String arrlogin;
    private String arrpassword;
    private String arrresourse;
    private String arrrole;

    public Userdata(String arrlogin, String arrpassword, String arrresourse, String arrrole) {
        this.arrlogin = arrlogin;
        this.arrpassword = arrpassword;
        this.arrresourse = arrresourse;
        this.arrrole = arrrole;
    }

    public Userdata() {
        this.arrlogin = null;
        this.arrpassword = null;
        this.arrresourse = null;
        this.arrrole = null;
    }

    public boolean isEmpty() {
        return ((arrlogin == null) && (arrrole == null) && (arrpassword == null) && (arrresourse == null));
    }

    public boolean authentication() {
        return ((arrlogin != null) && (arrpassword != null));
    }

    public boolean authorization(){
        return (authentication()&& (arrrole == null) && (arrresourse == null));
    }



    public void setLogin(String login) {
        this.arrlogin = login;
    }

    public void setPassword(String password) {
        this.arrpassword = password;
    }

    public void setResourse(String resourse) {
        this.arrresourse = resourse;
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

    public String getResourse() {
        return arrresourse;
    }

    public String getRole() {
        return arrrole;
    }
}
