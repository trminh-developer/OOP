public class foods {
    String name;
    double price;
    double discount;

    public foods(String _name, double _price, double _discount) {
        this.name = _name;
        this.price = _price;
        this.discount = _discount;
    }

    public void ShowInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Discount: " + this.discount);
    }

    public double RealPrice() {
        return this.price * (100 - this.discount) / 100.0;
    }
}
