package DesignPatterns.Adapter;

import DesignPatterns.Adapter.HDFCBankAdapter.HDFCBankAdapter;
import DesignPatterns.Adapter.Library.YesBank;
import DesignPatterns.Adapter.YesBankAdapter.YesBankAdapter;

public class App {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe(new HDFCBankAdapter());

        System.out.println("Account Balance :" + phonePe.getBalance("1233455"));

    }
}
