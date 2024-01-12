package Interfaces;

public class YesBankAPI implements InterfaceUPI{
    int getBalance(String accnt){
        System.out.println("GetBalance of YEs BANK");
        return 0;
    }
    void transferMoney(String accntFrom, String accntTo){
        System.out.println("Trasfering money through Yesbank");
    }

    @Override
    public int checkBalance(String accntNo) {
        System.out.println("GetBalance of YEs BANK");
        return 0;
    }

    @Override
    public void transfer(String accntFrom, String accntTo) {
        System.out.println("Trasfering money through Yesbank");
    }
}
