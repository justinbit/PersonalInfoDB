package sr.bitdynamics.personalinfodb.entities;

public class ContactInfo {
    private int id;
    private String address;
    private int phoneNumber;
    private Person person;
    private Country country;

    public ContactInfo(int id, String address, int phoneNumber, Person person, Country country) {
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.person = person;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
