package de.seism0saurus.design.pattern.singleton.before;

import java.util.Date;

public class Example {

    public static void main(String[] args) {
        long start = new Date().getTime();

        DatabaseConnection mariadb = new DatabaseConnection();
        mariadb.executeStatement("SELECT * FROM USERS");

        mariadb = new DatabaseConnection();
        mariadb.executeStatement("SELECT * FROM PRODUCTS");

        mariadb = new DatabaseConnection();
        mariadb.executeStatement("SELECT * FROM ADDRESSES");

        mariadb = new DatabaseConnection();
        mariadb.executeStatement("SELECT * FROM STOCK");

        long end = new Date().getTime();
        System.out.println("Duration: "+ (end-start) + " ms");
    }
}
