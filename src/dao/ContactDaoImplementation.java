package dao;

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
        contacts.add(contact);
        return true;
    }

    @Override
    public boolean updateContact(ModelContact contact) 
    {
        if(contacts.contains(contact))
        {
            int pos = contacts.indexOf(contact);
            contacts.set(pos, contact);
            
            return true;                    
        }
        
        return false;
    }

    @Override
    public boolean deleteContact(ModelContact contact) 
    {
        contacts.remove(contact);
        return true;
    }
    
}
