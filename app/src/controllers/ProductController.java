package src.controllers;

import models.*;
import views.ProductView;
import util.InputUtil;
import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private List<Product> products;
    private ProdcutView view;

    public ProductController() {
        this.products = new ArrayList<>();
        this.view = new ProductView();
    }

    public void run() {
        boolean running = true;
        while (running) {
            int choice = view.showMainMenu();
            switch (choice) {
                case 1:
                    handleAddProduct();
                    break;
                case 2:
                    view.displayProducts(products);
                    break;
                case 3:
                    running = false;
                    view.showMessage("Keluar dari sistem.");
                    break;
                default:
                    view.showMessage("Pilihan tidak valid!");
            }
        }
    }

    private void handleAddProduct() {
        int typeChoice = view.showProductTypeMenu();

        if (typeChoice < 1 || typeChoice > 3) {
            view.showMessage("Jenis produk tidak valid!");
            return;
        }

        System.out.print("ID: ");
        String id = InputUtil.readLine();

        System.out.print("Nama: ");
        String nama = InputUtil.readLine();

        System.out.print("Harga: ");
        double harga = InputUtil.readDouble();

        System.out.print("Stock: ");
        int stock = InputUtil.readInt();

        System.out.print("Amount: ");
        int amount = InputUtil.readInt();

        switch (typeChoice) {
            case 1:
                System.out.println("Pilih rasa (1. GORENG / 2. SOTO / 3. KARI): ");
                int rasaChoice = InputUtil.readInt();
                Rasa rasaMie = (rasaChoice == 3) ? Rasa.GORENG : rasa.SOTO : Rasa.KARI;
                System.out.print("Berat: ");
                double mieBerat = InputUtil.readDouble();

                products.add(new Mie(id, nama, harga, stock , rasaMie, mieBerat));
                view.showMessage("Mie berhasil ditambahkan!");
                break;

            case 2:
                System.out.println("Pilih  Jenis (1. IMPORT / 2. LOKAL): ");
                int jenisChoice = InputUtil.readInt();
                Jenis jenisProduk = (jenisChoice == 2) ? Rasa.IMPORT : rasa.LOKAL;
                System.out.print("Berat: ");
                double buahBerat = InputUtil.readDouble();
                System.out.print("Expire buah: ");
                String bauhEXP = InputUtil.readLine();

                products.add(new BuahBuahan(id, nama, harga, stock , jenisProduk, buahBerat , buahEXP));
                view.showMessage("Buah berhasil ditambahkan!");
                break;

            case 3:
                System.out.print("Suhu: ");
                double suhuFF = InputUtil.readDouble();
                System.out.print("Expire Frozen Food: ");
                String ffEXP = InputUtil.readLine();

                products.add(new FrozenFood(id, nama, harga, stock , suhuFF, ffEXP));
                view.showMessage("FrozenFood berhasil ditambahkan!");
                break;
        }
    }
}