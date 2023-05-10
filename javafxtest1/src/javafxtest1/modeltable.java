//setter getter properties in model class
package javafxtest1;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author user
 */
public class modeltable {

    private final IntegerProperty id;
    private final StringProperty name;
    private final StringProperty gender;

    public modeltable(Integer id, String name, String gender) {

        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleStringProperty(name);
        this.gender = new SimpleStringProperty(gender);

    }

    public String getname() {
        return name.get();
    }

    public Integer getid() {
        return id.get();
    }

    public String getgender() {
        return gender.get();
    }

    public void setid(Integer value) {
        id.set(value);
    }

    public void setname(String value) {
        name.set(value);
    }

    public void setgender(String value) {
        gender.set(value);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty genderProperty() {
        return gender;
    }

    public IntegerProperty idProperty() {
        return id;
    }

}
