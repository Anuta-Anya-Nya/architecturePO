package Model.Domain;

public class Customer {
    
    private String name;
    private String birthDate;
    private String phone;
    
    public Customer(String name, String birthDate, String phone) {
        this.name = name;
        this.birthDate = birthDate;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBirthDate() {
        return birthDate;
    }
    
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Customer [name=" + name + ", birthDate=" + birthDate + ", phone=" + phone + "]";
    }
}
