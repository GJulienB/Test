import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
                            System.out.println(values[0]);

                        }
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();

                }
        }


        }
}
