package DesignPatterns.Singleton;

import java.util.List;

/*
*
*  SOLUTION 2 - without sync
* */
public class DatabaseConnection2 {
    String url;
    String DBname;
    String Password;
    List<Integer> pools;

    private static DatabaseConnection2 dbConn = new DatabaseConnection2();

    private DatabaseConnection2(){

    }

    public static DatabaseConnection2 getInstance(){
        return dbConn;
    }
}
