package model;

import java.util.Date;
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
    private Date bithDate;
    private List<String> address;
    private HashMap<String,String> phone;
    private byte type;

    public ModelContact() {
    }

    public ModelContact(String name, String lastName, String id, Date bithDate, List<String> address, HashMap<String, String> phone, byte type) 
    {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.bithDate = bithDate;
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

    public Date getBithDate() {
        return bithDate;
    }

    public void setBithDate(Date bithDate) {
        this.bithDate = bithDate;
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

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }
    
    
}
