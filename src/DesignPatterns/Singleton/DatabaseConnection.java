package DesignPatterns.Singleton;

import java.util.List;
/*
*
*  SOLUTION 1
* */
public class DatabaseConnection {
    String url;
    String DBname;
    String Password;
    List<Integer> pools;

    private static DatabaseConnection dbConn = null;

    private DatabaseConnection(){

    }

    public static synchronized DatabaseConnection getInstance(){
        if(dbConn == null){
            dbConn = new DatabaseConnection();
        }
        return dbConn;
    }
}
