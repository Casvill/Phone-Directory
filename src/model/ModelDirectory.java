package model;

import dao.ContactDaoImplementation;
import dao.IContactDao;
import java.util.List;

/**
 *
 * @author Daniel Castillo
 */
public class ModelDirectory 
{
    private IContactDao contactDao;

    public ModelDirectory() 
    {
        this.contactDao = new ContactDaoImplementation();
    }
    
    public boolean addContact(ModelContact contact)
    {
        return this.contactDao.addContact(contact);
    }
    
    public List<ModelContact> getAllContacts()
    {
        return this.contactDao.getAllContacts();
    }
    
    public ModelContact getContact(String contactId)
    {
        return this.contactDao.getContact(contactId);
    }
    
    public boolean updateContact(ModelContact contact)
    {
        return this.contactDao.updateContact(contact);
    }
    
    public boolean deleteContact(String contactId)
    {
        return this.contactDao.deleteContact(contactId);
    }
}
