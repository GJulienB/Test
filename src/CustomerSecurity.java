import java.util.Scanner;

public class CustomerSecurity {
    public static void insertCustomerNumber(){
        Scanner sc = new Scanner(System.in);
        int knummer = sc.nextInt();
        if (knummer == 22004) {
            System.out.println("Richtige Kundennummer! Herzlich Willkommen");
        } else {
            System.out.println("Falsche Kontonummer bitte erneut eingeben!");
            ATMOutput.startText();

        }
    }

    public static void insertPin(){
        final String PIN = "1234";
        boolean wrongPin = true;

        for (int pinAttempts = 0; pinAttempts < 3 && wrongPin; pinAttempts++) {
            System.out.print("Bitte Pin eigeben: ");
            Scanner input = new Scanner(System.in);
            String inputPin = input.nextLine();

            if (!(inputPin.equals(PIN))) {
                System.out.println("Bitte Pin erneut eingeben!");
            } else {
                System.out.println("Willkommen");
                wrongPin = false;
                Account account = new Account("Frau Wagner", "22004");
                account.showMenu();
            }
        }
        if(wrongPin){
            System.out.println("Sie haben 3/3 Versuche, ihr Konto ist gesperrt bitte kontaktieren Sie einen Mitarbeiter!");
        }
    }



}
