public class Customers {

    String name;
    String phone;
    String address;

    public Customers(String _name, String _phone, String _address) {
        this.name = _name;
        this.phone = _phone;
        this.address = _address;
    }

    public void ShowInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Phone: " + this.phone);
        System.out.println("Address: " + this.address);
    }
}
