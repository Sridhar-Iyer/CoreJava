package practice.json;

public class Employee {

    private int identity;
    private  String name;
    private boolean isPermanent;
    private Address address;
    private long[] phoneNumbers;
    private String role;

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPermanent() {
        return isPermanent;
    }

    public void setPermanent(boolean permanent) {
        isPermanent = permanent;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(long[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Employee{" +
                "identity=" + identity +
                ", name='" + name + '\'' +
                ", isPermanent=" + isPermanent +
                ", address=" + address +
                ", phoneNumbers=" + java.util.Arrays.toString(phoneNumbers) +
                ", role='" + role + '\'' +
                '}';
    }
}