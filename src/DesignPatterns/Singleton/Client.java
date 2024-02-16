package DesignPatterns.Singleton;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        DatabaseConnection db3 = DatabaseConnection.getInstance();


        DatabaseConnection2 db4 = DatabaseConnection2.getInstance();
        DatabaseConnection2 db5 = DatabaseConnection2.getInstance();
        DatabaseConnection2 db6 = DatabaseConnection2.getInstance();

        DatabaseConnection3 db7 = DatabaseConnection3.getInstance();
        DatabaseConnection3 db8 = DatabaseConnection3.getInstance();
        DatabaseConnection3 db9 = DatabaseConnection3.getInstance();
        System.out.println();
    }
}
