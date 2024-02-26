package DesignPatterns.Adapter.HDFCBankAdapter;

import DesignPatterns.Adapter.BalanceRequest;
import DesignPatterns.Adapter.BalanceResponse;
import DesignPatterns.Adapter.BankAdapter;

public class HDFCBankAdapter implements BankAdapter {

    //convertBalancerequest()
    //convertBalanceResponse()

    @Override
    public BalanceResponse getBalance(BalanceRequest balanceRequest) {
        //convertBalancerequest()
        //Call API
        //convertBalanceResponse()
        return new BalanceResponse();
    }
}
