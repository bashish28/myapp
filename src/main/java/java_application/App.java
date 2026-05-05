import java.util.ArrayList;
import java.util.List;

class Kite {
    String name;
    String size;
    double price;

    Kite(String name, String size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    void displayKite() {
        System.out.println("Kite Name : " + name);
        System.out.println("Kite Size : " + size);
        System.out.println("Price     : ₹" + price);
        System.out.println("--------------------------------");
    }
}

class Material {
    String materialName;
    int quantity;

    Material(String materialName, int quantity) {
        this.materialName = materialName;
        this.quantity = quantity;
    }

    void displayMaterial() {
        System.out.println(materialName + " : " + quantity);
    }
}

public class PriyankaKiteShop {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("      PRIYANKA KITE SHOP");
        System.out.println("======================================\n");

        // Kite List
        List<Kite> kites = new ArrayList<>();

        kites.add(new Kite("Dragon Kite", "Large", 450));
        kites.add(new Kite("Eagle Kite", "Medium", 300));
        kites.add(new Kite("Rainbow Kite", "Small", 180));
        kites.add(new Kite("Box Kite", "Large", 550));
        kites.add(new Kite("Delta Kite", "Medium", 350));

        System.out.println("AVAILABLE KITES");
        System.out.println("--------------------------------");

        for (Kite kite : kites) {
            kite.displayKite();
        }

        // Materials List
        List<Material> materials = new ArrayList<>();

        materials.add(new Material("Nylon Thread Rolls", 50));
        materials.add(new Material("Bamboo Sticks", 200));
        materials.add(new Material("Color Papers", 500));
        materials.add(new Material("Glue Bottles", 40));
        materials.add(new Material("Decorative Stickers", 150));
        materials.add(new Material("Plastic Tails", 75));

        System.out.println("\nSHOP MATERIALS");
        System.out.println("--------------------------------");

        for (Material material : materials) {
            material.displayMaterial();
        }

        System.out.println("\n======================================");
        System.out.println(" Thank You For Visiting");
        System.out.println(" PRIYANKA KITE SHOP");
        System.out.println("======================================");
    }
}
