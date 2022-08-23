
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerSecurity {

   public static boolean findCustomer(String input){
       boolean foundCustomer = false;
       ArrayList<ArrayList<String>> customerData = CustomerDatabase.getCustomerData();
       for (ArrayList<String> singleCustomer : customerData) {
           if(input.equals(singleCustomer.get(1))){
              foundCustomer = true;
              break;
           }
       }
       return foundCustomer;
   }
   
    public static void insertCustomerNumber() {
        Scanner sc = new Scanner(System.in);
        String knummer = sc.nextLine();
        boolean isCustomer = findCustomer(knummer);
        if (isCustomer) {
            System.out.println("Richtige Kundennummer! Herzlich Willkommen");
        } else {
            System.out.println("Falsche Kontonummer bitte erneut eingeben!");
            insertCustomerNumber();

        }
    }

    public static void insertPin() {
        final String PIN = "1234";
        boolean wrongPin = true;

        for (int pinAttempts = 0; pinAttempts < 3 && wrongPin; pinAttempts++) {
            System.out.print("Bitte Pin eigeben: ");
            Scanner input = new Scanner(System.in);
            String inputPin = input.nextLine();

            if (!(inputPin.equals(PIN))) {
                System.out.println("Bitte Pin erneut eingeben!");
            } else {
                System.out.println("");
                wrongPin = false;
                Account account = new Account();
                account.showMenu();
            }
        }
        if (wrongPin) {
            System.out.println("Sie haben 3/3 Versuche, ihr Konto ist gesperrt bitte kontaktieren Sie einen Mitarbeiter!");
        }
    }


}

