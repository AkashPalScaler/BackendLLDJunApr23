package DesignPatterns.Adapter;

public class BalanceRequest {
    private String userId;
    private String accountName;

    public BalanceRequest(String userId, String accountName) {
        this.userId = userId;
        this.accountName = accountName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
