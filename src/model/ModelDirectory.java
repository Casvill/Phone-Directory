package model;

import dao.IContactDao;
import java.util.List;

/**
 *
 * @author Daniel Casvill
 */
public class ModelDirectory 
{
    private IContactDao contactDao;

    public ModelDirectory() {
    }
    
    public boolean addContact(ModelContact contact)
    {
        return this.contactDao.addContact(contact);
    }
    
    public List<ModelContact> getAllContacts()
    {
        return this.contactDao.getAllContacts();
    }
}
