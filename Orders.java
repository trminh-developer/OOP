import java.util.ArrayList;

public class Orders {
    public static void main(String[] args) {
        Customers cus = new Customers("Trần Đức Minh", "0848013907", "Thôn 4 Xã Diên Sanh, Quảng Trị");
        cus.ShowInfo();
    }

    Customers cus;
    ArrayList<foods> foodslist;

    public Orders(Customers _cus) {
        this.cus = _cus;
        this.foodslist = new ArrayList<>();
    }

    public void addFood(foods f) {
        foodslist.add(f);
    }

    public double SumPrice() {
        double sum = 0;
        for (foods f : foodslist) {
            sum += f.RealPrice();
        }
        return sum;
    }

    public void showOrder() {
        cus.ShowInfo();
        System.out.println("Food");

        for (foods f : foodslist) {
            f.ShowInfo();
            System.out.println("Real Price: " + f.RealPrice());
        }

        System.out.println("Tổng = " + SumPrice());
    }
}
