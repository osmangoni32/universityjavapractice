// This class acts as a model class,holding getters,setters and properties
package youtubeuser;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author admin
 */
public class UserDetails {

    private final StringProperty name;
    private final StringProperty gender;


    //Default constructor
    public UserDetails(String name, String gender) {
        this.name = new SimpleStringProperty(name);
        this.gender = new SimpleStringProperty(gender);

    }

    //Getters
    public String getName() {
        return name.get();
    }

    public String getEmail() {
        return gender.get();
    }

  

    //Setters
    public void setName(String value) {
        name.set(value);
    }

    public void setEmail(String value) {
        gender.set(value);
    }

  

    //Property values
    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty genderProperty() {
        return gender;
    }

   
}
