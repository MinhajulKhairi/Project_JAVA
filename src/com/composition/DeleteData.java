package com.composition;

import java.sql.SQLException;
import java.util.Scanner;
import com.config.MyConnection;

public class DeleteData extends MyConnection{
    public static void deleteDataBase() {
        conn();
        try {
            Scanner inputan = new Scanner(System.in);
            ReadData.readDataBase();
            System.out.println("Data yang ingin dihapus (ID): ");
            int pilihan = inputan.nextInt();
            inputan.nextLine();

            statement = connect.createStatement();
            String sql = "DELETE FROM table_product WHERE ID = " + pilihan;
            int jumlahBaris = statement.executeUpdate(sql);
            if (jumlahBaris > 0) {
                System.out.println("Data berhasil dihapus.");
            } else {
                System.out.println("Data dengan ID tersebut tidak ditemukan.");
            }
            statement.executeUpdate(sql);
            inputan.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}