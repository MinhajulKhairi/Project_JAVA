import java.util.Scanner;

import com.composition.CreateData;
import com.composition.DeleteData;
import com.composition.ReadData;
import com.composition.UpdateData;

public class App {
    public static void main(String[] args) throws Exception {
        // MyConnection.conn();
        boolean running = true;
        Scanner input = new Scanner(System.in);
        int chose = 0;

        while (running) {
            System.out.println("=".repeat(50));
            System.out.println("WELCOME TO NAD-STORE");
            System.out.println("=".repeat(50));
            System.out.println(
                "1.] Read Data\n" +
                "2.] Insert Data\n" +
                "3.] Edit Data\n" +
                "4.] Delete Data"
            );
            System.out.println("=".repeat(50));
            System.out.println("Pilih: ");
            // chose = input.nextInt();
            if (input.hasNextInt()) {
                chose = input.nextInt();

            switch (chose) {
                case 1:
                    ReadData.readDataBase();
                    break;
                case 2:
                    CreateData.createDataBase();
                    break;
                case 3:
                    UpdateData.updateDataBase();
                    break;
                case 4:
                    DeleteData.deleteDataBase();
                    break;
                case 5:
                    running = false;
                    System.out.println("Terima kasih telah berkunjung di NAD-STORE");
                default:
                    System.out.println("Pilihan tidak tersedia");
            } 
            
            } else {
                System.out.println("Masukan pilihan berupa angka");
                input.nextInt(); // Membersihkan input yang tidak valid
            }
        }
        input.close();
    }
}
