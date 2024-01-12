package Interfaces;

public class PhonePe {

    //PhonePe -> YEsBank(bankcrupted) RBi banned yesbank
    //with in 24hrs Phone Pe was able to replace yesBank with ICICI
//    YesBankAPI yb = new YesBankAPI();
//
//    int getBalance(String accnt){
//        return yb.getBalance(accnt);
//    }
//
//    void transfer(String accntFrm, String accntTo){
//        yb.transferMoney(accntFrm, accntTo);
//    }

//    ICICIAPI ic = new ICICIAPI();
//
//    int getBalance(String accnt){
//        String userID = "12"; //FetchUserID(accnt)
//        return ic.fetchBalance(userID);
//    }
//
//    void transfer(String accntFrm, String accntTo){
//        ic.sendMoney(accntTo, accntFrm);
//    }

    //What it should have been from beginning

    InterfaceUPI upi = new ICICIAPI();

    int getBalance(String accnt){
        return upi.checkBalance(accnt);
    }

    void transfer(String accntFrm, String accntTo){
        upi.transfer(accntFrm, accntTo);
    }


}
