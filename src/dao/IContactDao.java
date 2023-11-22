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
