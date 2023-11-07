package sr.bitdynamics.personalinfodb.entities;

public class Car {
    private int id;
    private String model;
    private Person person;

    public Car(int id, String model, Person person) {
        this.id = id;
        this.model = model;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
