package DesignPatterns.Adapter.Library;

public class YesBankBalanceResponse {
    String accountName;
    Integer value;
    boolean minBalReached;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public boolean isMinBalReached() {
        return minBalReached;
    }

    public void setMinBalReached(boolean minBalReached) {
        this.minBalReached = minBalReached;
    }
}
