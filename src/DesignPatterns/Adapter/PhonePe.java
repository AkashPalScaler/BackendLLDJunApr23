package DesignPatterns.Adapter;

public class PhonePe {

    BankAdapter bank;

    public PhonePe(BankAdapter bank) {
        this.bank = bank;
    }

    public Integer getBalance(String JWT){
        //User user = fetchUser(JWT);
        //user.id, user.account
        BalanceRequest blReq = new BalanceRequest("12345", "Akash123");
        BalanceResponse blRes = bank.getBalance(blReq);
        return blRes.getAmount();
    };

}
