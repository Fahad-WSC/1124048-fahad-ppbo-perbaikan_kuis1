package src.views;

import models.Product;
import util.InputUtil;
import java.util.List;

public class ProductView {

    public int showMainMenu() {
        System.out.println("1. Tambah Produk");
        System.out.println("2. Print Semua Perangkat");
        System.out.println("3. Keluar");
        System.out.print("Pilihan: ");
        return InputUtil.readInt();
    }

    public int showProductTypeMenu() {
        System.out.println("1. Mie");
        System.out.println("2. Buah Buahan");
        System.out.println("3. FrozenFood");
        System.out.print("Pilihan: ");
        return InputUtil.readInt();
    }

    public void displayProducts(List<product> products) {
        if (products.isEmpty()) {
            System.out.println("Belum ada produk");
            return;
        }
        for (product produk : products) {
            System.out.println(produk.getProductDetails());
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}