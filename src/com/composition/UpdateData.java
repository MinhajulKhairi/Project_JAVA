package com.composition;

import java.sql.SQLException;
import java.util.Scanner;
import com.config.MyConnection;

public class UpdateData extends MyConnection{
    public static void updateDataBase() {
        conn();
        try {
            Scanner inputan = new Scanner(System.in);
            System.out.println("Tentukan data yang ingin diubah");
            System.out.println(
                "1. Nama Barang\n" +
                "2. Harga Barang\n" +
                "3. Stok Barang"
            );

            System.out.println("Pilih: ");
            int pilih = inputan.nextInt();
            System.out.println("=".repeat(50));
            ReadData.readDataBase();
            System.out.println("=".repeat(50));
            System.out.println("Tentukan data yang ingin diedit (ID): ");
            int pilih2 = inputan.nextInt();
            String sql = "";
            statement = connect.createStatement();

            switch (pilih) {
                case 1:
                    System.out.println("Nama Baru: ");
                    String newName = inputan.next();

                    sql = "UPDATE table_product SET `NAMA` = '" + newName + "' WHERE ID = " + pilih2;
                    statement.executeQuery(sql);
                    break;
                case 2:
                    System.out.println("Harga Baru: ");
                    int newPrice = inputan.nextInt();

                    sql = "UPDATE table_product SET `HARGA` = '" + newPrice + "' WHERE ID = " + pilih2;
                    statement.executeUpdate(sql);
                    break;
                case 3:
                    System.out.println("Stok Baru: ");
                    int newStock = inputan.nextInt();

                    sql = "UPDATE table_product SET `STOK` = '" + newStock + "' WHERE ID = " + pilih2;
                    statement.executeUpdate(sql);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
            System.out.println("Update berhasil");
            inputan.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}