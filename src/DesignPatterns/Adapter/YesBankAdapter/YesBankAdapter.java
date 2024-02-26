package DesignPatterns.Adapter.YesBankAdapter;

import DesignPatterns.Adapter.BalanceRequest;
import DesignPatterns.Adapter.BalanceResponse;
import DesignPatterns.Adapter.BankAdapter;
import DesignPatterns.Adapter.Library.YesBank;
import DesignPatterns.Adapter.Library.YesBankBalanceRequest;
import DesignPatterns.Adapter.Library.YesBankBalanceResponse;

public class YesBankAdapter implements BankAdapter {
    YesBank yb = new YesBank();


    public YesBankBalanceRequest convertBalanceRequest(BalanceRequest balanceRequest){
        //Conversion logic
        if(balanceRequest.getAccountName() != null){
            return new YesBankBalanceRequest(balanceRequest.getAccountName());
        }
        //Throw an exception
        return null;
    }

    public BalanceResponse convertBalanceResponse(YesBankBalanceResponse ybResponse){
        BalanceResponse balanceResponse = new BalanceResponse();

        balanceResponse.setAccountName(ybResponse.getAccountName());
        balanceResponse.setAmount(ybResponse.getValue());
        balanceResponse.setUserID("akash123"); // getIdFromAccount();

        return balanceResponse;
    }

    @Override
    public BalanceResponse getBalance(BalanceRequest balanceRequest) {
        YesBankBalanceRequest ybReq = convertBalanceRequest(balanceRequest);
        YesBankBalanceResponse ybRes =  yb.balance(ybReq);
        return convertBalanceResponse(ybRes);
    }
}
