package view;

import model.Bank;
import model.BankFactory;
import model.BankType;
import model.Vietcombank;

public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.TPBANK);
//        Bank a = new Vietcombank();
        System.out.println(bank.getBankName()); // TPBank
    }
}
