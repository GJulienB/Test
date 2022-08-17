import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CostumerDatabase {
        public static void getCustomerData() {
        String path = "C:\\Users\\BedrichJ\\Desktop\\Kundenliste\\kunden.csv";
        String line = "";
        BufferedReader br;

        {
                try {
                      br = new BufferedReader(new FileReader(path));
                        while ((line = br.readLine()) != null) {
                          String[] values = line.split(",");

                        }
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();

                }
        }
        }
}
