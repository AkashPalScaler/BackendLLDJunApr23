package Interfaces;
//Given RBI
public interface InterfaceUPI {
    int checkBalance(String accntNo);
    void transfer(String accntFrom, String accntTo);
}
