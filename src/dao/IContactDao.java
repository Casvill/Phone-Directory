package dao;

import java.util.List;
import model.ModelContact;

/**
 *
 * @author Daniel Casvill
 */
public interface IContactDao 
{
    public List<ModelContact> getAllContacts();
    public ModelContact getContact(String contactID);
    public boolean addContact(ModelContact contact);
    public boolean updateContact(ModelContact contact);
    public boolean deleteContact(String contactId);
}
