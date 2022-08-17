import java.util.Scanner;

public class ATMOutput {

    public static void main(String[] args) {
        CostumerDatabase.getCustomerData();
        startText();
        CustomerSecurity.insertCustomerNumber();
        CustomerSecurity.insertPin();

    }

    public static void startText() {
        System.out.println("B A N K O M A T EOS-Bank Standort: Hamburg");
        System.out.print("Hallo, herzlich willkommen  Frau Wagner" + "! Bitte geben Sie Ihre Kundennummer an: ");
    }

}










