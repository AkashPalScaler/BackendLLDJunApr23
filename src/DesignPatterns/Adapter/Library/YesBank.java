package DesignPatterns.Adapter.Library;

public class YesBank {
    public YesBankBalanceResponse balance(YesBankBalanceRequest ybBalReg){
        //Dummy response -  actual API call takes place and returns the response
        YesBankBalanceResponse ynResponse = new YesBankBalanceResponse();
        return ynResponse;
    }
}
