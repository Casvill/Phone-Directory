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
