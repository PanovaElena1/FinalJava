import HW6.Notebook;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("Macbook Pro", "Apple", 2000.0, "Silver", 13.3, 8, 256));
        notebooks.add(new Notebook("ThinkPad X1 Carbon", "Lenovo", 1500.0, "Black", 14.0, 16, 512));
        notebooks.add(new Notebook("Surface Laptop 3", "Microsoft", 1800.0, "Platinum", 13.5, 16, 512));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter filter criteria:");
        System.out.print("Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Max price: ");
        double maxPrice = scanner.nextDouble();
        System.out.print("Min screen size: ");
        double minScreenSize = scanner.nextDouble();

        filterNotebooks(notebooks, brand, maxPrice, minScreenSize);
    }

    public static void filterNotebooks(Set<Notebook> notebooks, String brand, double maxPrice, double minScreenSize) {
        for (Notebook notebook : notebooks) {
            if (notebook.getBrand().equals(brand) && notebook.getPrice() <= maxPrice && notebook.getScreenSize() >= minScreenSize) {
                notebook.printNotebookInfo();
            }
        }
    }
}