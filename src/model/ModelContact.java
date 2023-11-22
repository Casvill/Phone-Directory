package model;
/**
 * Estudiantes: 
 * Daniel Castillo Villamarín - 1727303
 * Andres Valencia - 1960722
 * Profesor: Luis Johany Romo Portilla
 * Fundamentos de programacion orientada a eventos
 * @FPOE group 81
 * @Lab number 3
 */
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Daniel Casvill
 */
public class ModelContact 
{
    private String name;
    private String lastName;
    private String id;
    private String birthDate;
    private List<String> address;
    private HashMap<String,String> phone;
    private String type;

    public ModelContact() {
    }

    public ModelContact(String name, String lastName, String id, String birthDate, List<String> address, HashMap<String, String> phone, String type) 
    {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.type = type;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBithDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public HashMap<String, String> getPhone() {
        return phone;
    }

    public void setPhone(HashMap<String, String> phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
