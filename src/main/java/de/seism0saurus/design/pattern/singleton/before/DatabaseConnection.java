package de.seism0saurus.design.pattern.singleton.before;

public class DatabaseConnection {

    public DatabaseConnection(){
        System.out.println("Connecting to database...");
        //simulate slow connection initialization
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Connection established");
    }

    public void executeStatement(String statement){
        System.out.println("Executing "+statement);
    }
}
