package de.seism0saurus.design.pattern.singleton.after;

public class DatabaseConnectionSingleton {

    private static volatile DatabaseConnectionSingleton instance;

    private DatabaseConnectionSingleton(){
        System.out.println("Connecting to databse...");
        //simulate slow connection initialization
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Connection established");
    }

    public static DatabaseConnectionSingleton getInstance(){
        if (instance == null) {
            synchronized(DatabaseConnectionSingleton.class) {
                if (instance == null)
                    instance = new DatabaseConnectionSingleton();
            }
        }
        return instance;
    }

    public void executeStatement(String statement){
        System.out.println("Executing "+statement);
    }
}
