package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println(test(-100,-100));System.out.println(test(25,20));
        System.out.println(test(12,1));System.out.println(test(46,10));
        System.out.println(test(46,26));
    }

    public static String test(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return"Можно идти гулять";}
        else if (age < 20 && temperature>0 && temperature<28){return"Можно идти гулять";}
        else if (age>45 && temperature>-20 && temperature<25 ){return "Можно идти гулять";}
        else {return "Сидите дома";}}
}
//дз