package DesignPatterns.Adapter;

public interface BankAdapter {
    BalanceResponse getBalance(BalanceRequest balanceRequest);
}
