package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import model.ModelContact;
import model.ModelDirectory;
import view.ViewDirectory;

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
    } 
    
    public String getContacts()
    {
        List<ModelContact> contacts = directory.getAllContacts();
        String message = "";
        for(int i = 0; i < contacts.size(); i++)
        {
            message += "-----------------------------------------\n";
            message += "Nombres: "+contacts.get(i).getName()+"\n";
            message += "Apellidos: "+contacts.get(i).getLastName()+"\n";
            message += "Fecha de nacimiento: "+contacts.get(i).getBithDate()+"\n";
            message += "Tipo: "+contacts.get(i).getType()+"\n";
            message += "-----------------------------------------\n";
            
        }
        
        return message;
    }
    
    class DirectoryListener implements ActionListener
    {
        
        
        @Override
        public void actionPerformed(ActionEvent e)
        {   
            // 0- Teacher, 1- Student, 2- Employee                        
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
                    System.out.println("Dirs:"+address);
                }

            }
            
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
                    ModelContact contact = new ModelContact(name, lastName, id, birthDate, address, phone, type);
                    if(directory.addContact(contact))
                    {
                        JOptionPane.showMessageDialog(null,"Contacto añadido exitosamente!","Contacto añadido",JRootPane.INFORMATION_DIALOG);   
                        viewDirectory.setJtaInfo(getContacts());
                    }
                }
            }
            
            
        }
        
        public void warningMessage(String text)
        {
            JOptionPane.showMessageDialog(null,text,"warning",JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
