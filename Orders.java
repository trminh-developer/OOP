import java.util.ArrayList;

public class Orders {
    Customers cus;
    ArrayList<Foods> list_foods;

    public Orders(Customers _cus) {
        this.cus = _cus;
        this.list_foods = new ArrayList<>();
    }

    public void addFood(Foods f) {
        list_foods.add(f);
    }

    public double SumPrice() {
        double sum = 0;
        for (Foods f : list_foods) {
            sum += f.RealPrice();
        }
        return sum;
    }

    public void showOrder() {
        System.out.println("----- Food information -----");
        cus.ShowInfo();
        System.out.println("\n----- Dish list -----");
        for (Foods f : list_foods) {
            f.ShowInfo();
            System.out.println("Real Price: " + f.RealPrice());
        }

        System.out.printf("Total amount: %.2f%n", SumPrice());
    }

    public static void main(String[] args) {
        Customers cus = new Customers("TrMinh", "0123456789", "Quang Tri Province");

        Orders odr = new Orders(cus);
        odr.addFood(new Foods("Phở bò", 50000, 0));
        odr.addFood(new Foods("Cơm Sườn chả", 20000, 0));
        odr.addFood(new Foods("Bánh mì", 20000, 0));
        odr.showOrder();
    }
}
