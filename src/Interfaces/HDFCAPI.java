package Interfaces;

public class HDFCAPI implements InterfaceUPI {

    @Override
    public int checkBalance(String accntNo) {
        System.out.println("GetBalance of HDFC BANK");
        return 0;
    }

    @Override
    public void transfer(String accntFrom, String accntTo) {
        System.out.println("Trasfering money through HDFC");
    }
}
