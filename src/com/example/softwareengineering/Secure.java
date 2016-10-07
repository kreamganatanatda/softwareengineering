package com.example.softwareengineering;

//Класс больших чисел
import java.math.BigInteger;
//То, что помогает генерировать соль\хэш
import java.security.SecureRandom;


public class Secure {

    //Генерируем соль (код найденный на просторах интернета)
    public static String generateSalt(){
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(32);
    }

    //Генерируем хэш посредством MD5 (код найденный на просторах интернета)
    public static String MD5(String md5) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println("Wrong HASH");

            //Используется для подробного вывода возникающих ошибок
            e.printStackTrace();
        }
        return null;
    }
}