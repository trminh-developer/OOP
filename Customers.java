public class Customers {
    private String name;
    private String phone;
    private String address;

    public Customers(String _name, String _phone, String _address) {
        this.name = _name;
        this.phone = _phone;
        this.address = _address;
    }

    public void ShowInfo() {
        System.out.println("Name: " + this.name + "\nPhone: " + this.phone + "\nAddress: " + this.address);
    }
}
