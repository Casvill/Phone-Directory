package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import model.ModelContact;
import model.ModelDirectory;
import view.ViewDirectory;
//                            FAAAALTAAAAAA ARREGLAR EL ACTUALIZAR CONTACTO Y MODIFICAR
//                    LAS FUNCIONES DE MODIFICAR Y DE BORRAR CONTACTO EN CONTACTODAOIMPLEMENTEISHON
/**
 *
 * @author Daniel Casvill
 */
public class ControllerDirectory 
{
    private ModelDirectory directory;
    private ViewDirectory viewDirectory;
    List<String> address = new ArrayList<>();
    HashMap<String,String> phone = new HashMap<>();

    public ControllerDirectory(ModelDirectory directory, ViewDirectory viewDirectory) 
    {
        this.directory = directory;
        this.viewDirectory = viewDirectory;
        this.viewDirectory.setLocationRelativeTo(null);
        this.viewDirectory.setVisible(true);
        
        this.viewDirectory.addBtnjbAddAddressListener(new DirectoryListener());
        this.viewDirectory.addBtnjbAddTelNumberListener(new DirectoryListener());
        this.viewDirectory.addBtnjbAddListener(new DirectoryListener());
        this.viewDirectory.addBtnjbDeleteListener(new DirectoryListener());
        this.viewDirectory.addBtnjbListListener(new DirectoryListener());
        this.viewDirectory.addBtnjbSearchIdListener(new DirectoryListener());
        this.viewDirectory.addBtnjbUpdateListener(new DirectoryListener());
        
        addExampleContacts();
    } 
    
    public boolean addContact(ModelContact contact)
    {
        List<ModelContact> contacts = directory.getAllContacts();
        String id = contact.getId();
        for (ModelContact contact2 : contacts) 
        {
            if(contact2.getId().equals(id))
            {
                return false;
            }
        }
        directory.addContact(contact);
        return true;
    }
    
    public String getContacts() 
    {
        List<ModelContact> contacts = directory.getAllContacts();
        StringBuilder message = new StringBuilder();

        for (ModelContact contact : contacts) 
        {
            message.append("-----------------------------------------\n");
            message.append("  Nombres: ").append(contact.getName()).append("\n");
            message.append("  Apellidos: ").append(contact.getLastName()).append("\n");
            message.append("  ID: ").append(contact.getId()).append("\n");
            message.append("  Fecha de nacimiento: ").append(contact.getBirthDate()).append("\n");
            message.append("  Tipo: ").append(contact.getType()).append("\n");
          
            List<String> addresses = contact.getAddress();
            message.append("  Direcciones: ");
            
            for (String address : addresses) 
            {
                message.append(address).append(", ");
            }

            message.delete(message.length() - 2, message.length()).append("\n");

            HashMap<String, String> phones = contact.getPhone();
            message.append("  Teléfonos: ");
            
            for (Map.Entry<String, String> entry : phones.entrySet()) 
            {
                message.append(entry.getKey()).append(": ").append(entry.getValue()).append(", ");
            }
            
            message.delete(message.length() - 2, message.length()).append("\n");

            message.append("-----------------------------------------\n");
        }

        return message.toString();
    }   
    
    public String getContact(ModelContact contact2)
    {
        StringBuilder message = new StringBuilder();

        ModelContact contact = contact2;

        message.append("-----------------------------------------\n");
        message.append("  Nombres: ").append(contact.getName()).append("\n");
        message.append("  Apellidos: ").append(contact.getLastName()).append("\n");
        message.append("  ID: ").append(contact.getId()).append("\n");
        message.append("  Fecha de nacimiento: ").append(contact.getBirthDate()).append("\n");
        message.append("  Tipo: ").append(contact.getType()).append("\n");

        List<String> addresses = contact.getAddress();
        message.append("  Direcciones: ");

        for (String address : addresses) 
        {
            message.append(address).append(", ");
        }

        message.delete(message.length() - 2, message.length()).append("\n");

        HashMap<String, String> phones = contact.getPhone();
        message.append("  Teléfonos: ");

        for (Map.Entry<String, String> entry : phones.entrySet()) 
        {
            message.append(entry.getKey()).append(": ").append(entry.getValue()).append(", ");
        }

        message.delete(message.length() - 2, message.length()).append("\n");

        message.append("-----------------------------------------\n");
                                        
        
        return message.toString();
    }
    
    public boolean updateContact(ModelContact contact)
    {
        return directory.updateContact(contact);
    }

    
    public void addExampleContacts() 
    {
        // Contacto 1
        HashMap<String, String> phones1 = new HashMap<>();
        phones1.put("MOBIL", "(+57) 3199900201");
        ModelContact contact1 = new ModelContact("Jairo", "Vélez", "123", "05-08-1983", List.of("Calle 2 #3-2", "Apartamento 5A"), phones1, "EMPLEADO");
        directory.addContact(contact1);

        // Contacto 2
        HashMap<String, String> phones2 = new HashMap<>();
        phones2.put("CASA", "(+57) 3111122334");
        ModelContact contact2 = new ModelContact("Ana", "Gómez", "456", "10-12-1990", List.of("Avenida 1 #456", "Condominio Bellavista"), phones2, "ESTUDIANTE");
        directory.addContact(contact2);

        // Contacto 3
        HashMap<String, String> phones3 = new HashMap<>();
        phones3.put("OFICINA", "(+57) 3222233445");
        ModelContact contact3 = new ModelContact("Carlos", "López", "789", "15-03-1985", List.of("Carrera 5 #678", "Edificio Central, Piso 10"), phones3, "PROFESOR");
        directory.addContact(contact3);

        // Contacto 4
        HashMap<String, String> phones4 = new HashMap<>();
        phones4.put("OTRO", "(+57) 3333344444");
        ModelContact contact4 = new ModelContact("Elena", "Rodríguez", "987", "20-07-1995", List.of("Avenida 3 #789", "Residencial Los Pinos, Bloque B"), phones4, "ESTUDIANTE");
        directory.addContact(contact4);

        // Contacto 5
        HashMap<String, String> phones5 = new HashMap<>();
        phones5.put("MOBIL", "(+57) 3444455555");
        ModelContact contact5 = new ModelContact("Felipe", "Hernández", "654", "12-06-1988", List.of("Calle 4 #567", "Torre Norte, Departamento 12"), phones5, "EMPLEADO");
        directory.addContact(contact5);

        // Contacto 6
        HashMap<String, String> phones6 = new HashMap<>();
        phones6.put("CASA", "(+57) 3555566666");
        ModelContact contact6 = new ModelContact("Gabriela", "Gutiérrez", "321", "30-09-1992", List.of("Carrera 7 #890", "Residencial Los Olivos, Casa 15"), phones6, "ESTUDIANTE");
        directory.addContact(contact6);

        // Contacto 7
        HashMap<String, String> phones7 = new HashMap<>();
        phones7.put("OFICINA", "(+57) 3666677777");
        ModelContact contact7 = new ModelContact("Héctor", "Sánchez", "9872", "05-04-1980", List.of("Avenida 2 #345", "Edificio Empresarial, Piso 5"), phones7, "PROFESOR");
        directory.addContact(contact7);

        // Contacto 8
        HashMap<String, String> phones8 = new HashMap<>();
        phones8.put("OTRO", "(+57) 3777788888");
        ModelContact contact8 = new ModelContact("Isabel", "Pérez", "876", "18-11-1997", List.of("Calle 8 #456", "Residencial Las Flores, Casa 20"), phones8, "ESTUDIANTE");
        directory.addContact(contact8);

        // Contacto 9
        HashMap<String, String> phones9 = new HashMap<>();
        phones9.put("MOBIL", "(+57) 3888899999");
        ModelContact contact9 = new ModelContact("Javier", "Martínez", "234", "22-03-1982", List.of("Carrera 9 #678", "Condominio Primavera, Torre 3"), phones9, "EMPLEADO");
        directory.addContact(contact9);

        // Contacto 10
        HashMap<String, String> phones10 = new HashMap<>();
        phones10.put("CASA", "(+57) 3999900000");
        phones10.put("OFICINA", "(+57) 3999911111");
        ModelContact contact10 = new ModelContact("Karla", "Gómez", "567", "08-09-1993", List.of("Avenida 6 #789", "Residencial Los Robles, Casa 30"), phones10, "ESTUDIANTE");
        directory.addContact(contact10);
    }


    
    class DirectoryListener implements ActionListener
    {
        
        
        @Override
        public void actionPerformed(ActionEvent e)
        {   
            //------------------------------------------------------------------------------------
            
            if(e.getActionCommand().equalsIgnoreCase("AÑADIR TEL"))
            {
                String type = viewDirectory.getSelectedjcbTelType();
                String number = viewDirectory.getTextjtfTelNumber();
                if(type == null)
                {
                    warningMessage("Por favor escoja el tipo de teléfono");
                }
                
                else if(number.strip().equals(""))
                {
                    warningMessage("Escriba el número telefónico");
                }
                
                else
                {
                    phone.put(type, number);
                    viewDirectory.clearPhone();
                    System.out.println("Phones:"+phone);
                }
                
            }
            
            //------------------------------------------------------------------------------------
            
            if(e.getActionCommand().equalsIgnoreCase("AÑADIR DIR"))
            {
                String dir = viewDirectory.getTexjtfAdress();
                
                if(dir.strip().equals(""))
                {
                    warningMessage("Por favor escriba la dirección");
                }
                
                else
                {
                    address.add(dir);
                    viewDirectory.clearAddres();
                }

            }
            
            //------------------------------------------------------------------------------------
            
            if(e.getActionCommand().equalsIgnoreCase("GUARDAR"))
            {
                String name = viewDirectory.getTextjtfName();
                String lastName = viewDirectory.getTextjtfLastName();
                String id = viewDirectory.getTextjtfId();
                String birthDate = viewDirectory.getTexjtfBirthDate();
                String type = viewDirectory.getSelectedjcbSelectType(); 
                
                if(name.strip().equals("") || lastName.strip().equals("") || id.strip().equals("") || birthDate.strip().equals("") || type.strip().equals(""))
                {
                    warningMessage("Por favor llene todos los campos.");
                }
                
                else if(address.size() < 1 && viewDirectory.getTexjtfAdress().strip().equals(""))
                {
                    warningMessage("Por favor agregue al menos una dirección.");
                    System.out.println(address.size());
                    System.out.println("Dirs 2:"+address);
                }
                
                else if(phone.size() < 1 && (viewDirectory.getTextjtfTelNumber().strip().equals("") || viewDirectory.getSelectedjcbTelType() == null))
                {
                    warningMessage("Por favor agregue al menos un número telefónico.");
                    System.out.println(address.size());
                    System.out.println("Phones:"+phone);
                }
                
                else
                {
                    String telNumber = viewDirectory.getTextjtfTelNumber();
                    String telType = viewDirectory.getSelectedjcbTelType();
                    String addrs = viewDirectory.getTexjtfAdress();
                    if(!(telNumber.strip().equals("")) && telType != null)
                    {
                        phone.put(telType, telNumber);
                    }
                    if(!(addrs.strip().equals("")))
                    {
                        address.add(addrs);
                    }
                    ModelContact contact = new ModelContact(name, lastName, id, birthDate, address, phone, type);
                    if(addContact(contact))
                    {
                        JOptionPane.showMessageDialog(null,"Contacto añadido exitosamente!","Contacto añadido",JRootPane.INFORMATION_DIALOG);   
                        viewDirectory.setJtaInfo(getContacts());
                        viewDirectory.clearForm();
                    }
                    else
                    {
                        warningMessage("Error. El contacto con código "+contact.getId()+ " ya existe.");
                    }
                }
            }
            
            //------------------------------------------------------------------------------------
            
            if(e.getActionCommand().equalsIgnoreCase("LISTAR"))
            {
                viewDirectory.setJtaInfo(getContacts());
            }
            
            //------------------------------------------------------------------------------------

            if(e.getActionCommand().equalsIgnoreCase("BUSCAR POR ID"))
            {
                String id = viewDirectory.getJtfTelNumber1Text();
                if(id.strip().equals(""))
                {
                    warningMessage("Escriba el ID del contacto que desea buscar.");
                }
                
                else
                {
                    try
                    {
                        ModelContact contact = directory.getContact(id);
                        viewDirectory.clearForm();
                        viewDirectory.setJcbSelectType(contact.getType());
                        viewDirectory.setJtfName(contact.getName());
                        viewDirectory.setJtfLastName(contact.getLastName());
                        viewDirectory.setJtfId(id);
                        viewDirectory.setJtfBirthDate(contact.getBirthDate());
                        viewDirectory.setJtaInfo(getContact(contact));
                    }
                    catch(Exception error)
                    {
                        warningMessage("Contacto no encontrado");
                    }
                }
            }
            
            //------------------------------------------------------------------------------------
            
            if(e.getActionCommand().equalsIgnoreCase("ACTUALIZAR"))
            {
                System.out.println("a");
                String name = viewDirectory.getTextjtfName();
                String lastName = viewDirectory.getTextjtfLastName();
                String id = viewDirectory.getTextjtfId();
                String birthDate = viewDirectory.getTexjtfBirthDate();
                String type = viewDirectory.getSelectedjcbSelectType(); 
                
                if(name.strip().equals("") || lastName.strip().equals("") || id.strip().equals("") || birthDate.strip().equals("") || type.strip().equals(""))
                {
                    warningMessage("Por favor llene todos los campos.");
                }
                                
                String telNumber = viewDirectory.getTextjtfTelNumber();
                String telType = viewDirectory.getSelectedjcbTelType();
                String addrs = viewDirectory.getTexjtfAdress();
                
                if(!(telNumber.strip().equals("")) && telType != null)
                {
                    phone.put(telType, telNumber);
                }
                
                if(!(addrs.strip().equals("")))
                {
                    address.add(addrs);
                }
                             
                ModelContact contact = new ModelContact(name, lastName, id, birthDate, address, phone, type);
                if(updateContact(contact))
                {
                    JOptionPane.showMessageDialog(null,"Contacto actualizado exitosamente!","Contacto actualizado",JRootPane.INFORMATION_DIALOG);   
                    viewDirectory.clearForm();
                }
                else
                {
                    warningMessage("El contacto no pudo ser actualizado.");
                }
            }
        }
        
        //------------------------------------------------------------------------------------
        
        public void warningMessage(String text)
        {
            JOptionPane.showMessageDialog(null,text,"warning",JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
