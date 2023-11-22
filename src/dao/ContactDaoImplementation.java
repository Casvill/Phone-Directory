package dao;
/**
 * Estudiantes: 
 * Daniel Castillo Villamarín - 1727303
 * Andres Valencia - 1960722
 * Profesor: Luis Johany Romo Portilla
 * Fundamentos de programacion orientada a eventos
 * @FPOE group 81
 * @Lab number 3
 */
import java.util.ArrayList;
import java.util.List;
import model.ModelContact;

/**
 *
 * @author Daniel Casvill
 */
public class ContactDaoImplementation implements IContactDao
{
    List<ModelContact> contacts; 

    public ContactDaoImplementation() 
    {
        this.contacts = new ArrayList<>();
    }    

    @Override
    public List<ModelContact> getAllContacts() 
    {
        return contacts;
    }

    @Override
    public ModelContact getContact(String contactID) 
    {
        ModelContact contact = null;
        
        for(ModelContact current : contacts)
        {
            if(current.getId().equals(contactID))
            {
                contact = current;
                break;
            }
        }
        
        return contact;
    }

    @Override
    public boolean addContact(ModelContact contact) 
    {
        for(ModelContact contactB: contacts)
        {
            if(contactB.getId().strip().equals(contact.getId().strip()))
            {
                return false;
            }
        }
        
        contacts.add(contact);
        return true;
    }

    @Override
    public boolean updateContact(ModelContact contact) 
    {
        for(ModelContact contactB: contacts)
        {
            if(contactB.getId().strip().equals(contact.getId().strip()))
            {
                int pos = contacts.indexOf(contactB);
                contacts.set(pos, contact);
            
                return true;
            }
        }
        
        return false;
    }

    @Override
    public boolean deleteContact(String contactId) 
    {
        for(ModelContact contactB: contacts)
        {
            if(contactB.getId().strip().equals(contactId.strip()))
            {
                int pos = contacts.indexOf(contactB);
                contacts.remove(pos);
                return true;
            }
        }
        return false;
    }
    
}
