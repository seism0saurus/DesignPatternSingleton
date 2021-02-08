package de.seism0saurus.design.pattern.singleton.after;

import java.util.Date;

public class Example {

    public static void main(String[] args) {
        long start = new Date().getTime();

        DatabaseConnectionSingleton mariadb = DatabaseConnectionSingleton.getInstance();
        mariadb.executeStatement("SELECT * FROM USERS");

        mariadb = DatabaseConnectionSingleton.getInstance();
        mariadb.executeStatement("SELECT * FROM PRODUCTS");

        mariadb = DatabaseConnectionSingleton.getInstance();
        mariadb.executeStatement("SELECT * FROM ADDRESSES");

        mariadb = DatabaseConnectionSingleton.getInstance();
        mariadb.executeStatement("SELECT * FROM STOCK");

        long end = new Date().getTime();
        System.out.println("Duration: "+ (end-start) + " ms");
    }
}
