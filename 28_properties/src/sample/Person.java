package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

    private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");

    //returns the StringProperty
    public StringProperty firstNameProperty() {
        return firstName;
    }

    //return the firstName value
    public String getFirstName() {
        return firstName.get();
    }

    //set the firstName value
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    //    String firstName = "";
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
}
