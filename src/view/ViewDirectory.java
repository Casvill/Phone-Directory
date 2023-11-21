/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class ViewDirectory extends javax.swing.JFrame {

    /**
     * Creates new form ViewDirectory2
     */
    public ViewDirectory() {
        initComponents();  
        DefaultListModel<String> listModelDirs = new DefaultListModel<>();
        DefaultListModel<String> listModelNumbers = new DefaultListModel<>();
        jlDirs.setModel(listModelDirs);
        jlNumbers.setModel(listModelNumbers);
        
        jcbSelectType.setSelectedIndex(-1);
        setSize(850, 800);
    }
    
    public void addBtnjbAddAddressListener(ActionListener listenControllers){
        jbAddAddress.addActionListener(listenControllers);}
        
    public void addBtnjbAddTelNumberListener(ActionListener listenControllers){
        jbAddTelNumber.addActionListener(listenControllers);} 
     
    public void addBtnjbAddListener(ActionListener listenControllers){
        jbAdd.addActionListener(listenControllers); }
        
    public void addBtnjbDeleteListener(ActionListener listenControllers){
        jbDelete.addActionListener(listenControllers);}
        
    public void addBtnjbListListener(ActionListener listenControllers){
        jbList.addActionListener(listenControllers);}
                
    public void addBtnjbUpdateListener(ActionListener listenControllers){
        jbUpdate.addActionListener(listenControllers);}
    
    public void addBtnjbSearchIdListener(ActionListener listenControllers){
        jbSearchId.addActionListener(listenControllers);}
    
    public void addBtnjbremoveDirListener(ActionListener listenControllers){
        jbRemoveDir.addActionListener(listenControllers);}
    
    public void addBtnjbremoveTelListener(ActionListener listenControllers){
        jbRemoveTel.addActionListener(listenControllers);}
    
    public String getTextjtfRemoveContact()
    {
        String text = jtfRemoveContact.getText();
        return text;
    }
    
    public String getTextjtfName() {
        String text = jtfName.getText();
        return text;
    }
    
    public String getTextjtfLastName() {
        String text = jtfLastName.getText();
        return text;
    }
    
    public String getTextjtfId() {
        String text = jtfId.getText();
        return text;
    }
    
    public String getTexjtfBirthDate() {
        String text = jtfBirthDate.getText();
        return text;
    }
    
    public String getSelectedjcbSelectType() {
        return (String) jcbSelectType.getSelectedItem();
        
    }
    
    public void setJtfRemoveContact(String text)
    {
        jtfRemoveContact.setText(text);
    }
    
    public void setJtaInfo(String text)
    {
        jTextArea2.setText(text);
    }
    
    public String getJtaInfo()
    {
        return jTextArea2.getText();
    }
    
    public String getJtfTelNumber1Text()
    {
        return jtfTelNumber1.getText();
    }

    public void setJtfBirthDate(String text) {
        this.jtfBirthDate.setText(text);
    }

    public void setJtfId(String text) {
        this.jtfId.setText(text);
    }

    public void setJtfLastName (String text) {
        this.jtfLastName.setText(text);
    }

    public void setJtfName(String text) {
        this.jtfName.setText(text);
    }     

    public void setJcbSelectType(String selected) {
        this.jcbSelectType.setSelectedItem(selected);
    }

    public boolean removeDir()
    {
        DefaultListModel<String> model = (DefaultListModel<String>) jlDirs.getModel();

        int selectedIndex = jlDirs.getSelectedIndex();

        if (selectedIndex != -1) 
        {
            model.remove(selectedIndex);
            return true;
        } 
        return false;
    }
            
    public boolean removeTel()
    {
        DefaultListModel<String> model = (DefaultListModel<String>) jlNumbers.getModel();

        int selectedIndex = jlNumbers.getSelectedIndex();

        if (selectedIndex != -1) 
        {
            model.remove(selectedIndex);
            return true;
        } 
        return false;
    }
    
    public List<String> getDirs() 
    {
        // Obtén el modelo de datos del JList
        DefaultListModel<String> model = (DefaultListModel<String>) jlDirs.getModel();

        // Obtén los elementos del modelo y guárdalos en una lista
        List<String> elements = new ArrayList<>();
        int size = model.getSize();
        for (int i = 0; i < size; i++) {
            String elemento = model.getElementAt(i);
            elements.add(elemento);
        }

        return elements;
    }
    
    public HashMap<String,String> getNumbers() 
    {
        // Obtén el modelo de datos del JList
        DefaultListModel<String> model = (DefaultListModel<String>) jlNumbers.getModel();

        // Obtén los elementos del modelo y guárdalos en una lista
        HashMap<String,String> elements = new HashMap<>();
        int size = model.getSize();
       
        for (int i = 0; i < size; i++) 
        {
            String element = model.getElementAt(i);
            String[] parts = element.split(":");
            elements.put(parts[1],parts[0]);
        }

        return elements;
    }
    
    public boolean isEmptyDirs()
    {
        DefaultListModel<String> model = (DefaultListModel<String>) jlDirs.getModel();

        return model.isEmpty();
    }
    
    public boolean isEmptyNumbers()
    {
        DefaultListModel<String> model = (DefaultListModel<String>) jlNumbers.getModel();

        return model.isEmpty();
    }
    
    public void clearDirList()
    {
        DefaultListModel<String> listModelDirs = new DefaultListModel<>();
        jlDirs.setModel(listModelDirs);
    }
    
    public void clearNumbersList()
    {
        DefaultListModel<String> listModelNumbers = new DefaultListModel<>();
        jlNumbers.setModel(listModelNumbers);
    }
    public void clearForm()
    {
        jcbSelectType.setSelectedIndex(-1);
        jtfName.setText("");
        jtfLastName.setText("");
        jtfId.setText("");
        jtfBirthDate.setText("");
        jtfRemoveContact.setText("");
        clearDirList();
        clearNumbersList();
    }
    
    public void addPhone(String phone)
    {
        DefaultListModel<String> model = (DefaultListModel<String>) jlNumbers.getModel();
        model.addElement(phone); 
    }
    
    public void addPhoneButton() 
    {
        // Crear un panel personalizado con un JTextField y un JComboBox
        JPanel panel = new JPanel(new GridLayout(2, 2));
        JTextField textField = new JTextField();
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"MOBIL", "CASA", "OFICINA", "OTRO"});
        panel.add(new JLabel("Número Telefónico:"));
        panel.add(textField);
        panel.add(new JLabel("Tipo:"));
        panel.add(comboBox);

        int result = JOptionPane.showConfirmDialog(null, panel, "Añadir teléfono", JOptionPane.OK_CANCEL_OPTION);

        // Manejar la respuesta del usuario
        if (result == JOptionPane.OK_OPTION) {
            String inputText = textField.getText();
            String selectedOption = comboBox.getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "Número ingresado: " + inputText + "\nTipo: " + selectedOption);
            addPhone(selectedOption+": "+inputText);
        }
    }
    
    public void addDir(String dir)
    {
        DefaultListModel<String> model = (DefaultListModel<String>) jlDirs.getModel();
        model.addElement(dir); 
    }
    
    public void addDirButton() 
    {
        // Crear un panel personalizado con un JTextField y un JComboBox
        JPanel panel = new JPanel(new GridLayout(2, 2));
        JTextField textField = new JTextField();        
        panel.add(new JLabel("Dirección:"));
        panel.add(textField);

        int result = JOptionPane.showConfirmDialog(null, panel, "Añadir dirección", JOptionPane.OK_CANCEL_OPTION);
        
        // Manejar la respuesta del usuario
        if (result == JOptionPane.OK_OPTION) 
        {
            String inputText = textField.getText();
            JOptionPane.showMessageDialog(null, "Dirección ingresado: " + inputText);
            addDir(inputText);
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlHeader1 = new javax.swing.JLabel();
        jlType1 = new javax.swing.JLabel();
        jlNames1 = new javax.swing.JLabel();
        jlLastName1 = new javax.swing.JLabel();
        jlId1 = new javax.swing.JLabel();
        jlBirthDate1 = new javax.swing.JLabel();
        jlAdress1 = new javax.swing.JLabel();
        jlTelNumber1 = new javax.swing.JLabel();
        jcbSelectType = new javax.swing.JComboBox<>();
        jbAdd = new javax.swing.JButton();
        jbUpdate = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        jbList = new javax.swing.JButton();
        jtfName = new javax.swing.JTextField();
        jtfLastName = new javax.swing.JTextField();
        jtfId = new javax.swing.JTextField();
        jtfBirthDate = new javax.swing.JTextField();
        jtfTelNumber1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jbAddAddress = new javax.swing.JButton();
        jbAddTelNumber = new javax.swing.JButton();
        jbSearchId = new javax.swing.JButton();
        jlId2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlNumbers = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlDirs = new javax.swing.JList<>();
        jbRemoveDir = new javax.swing.JButton();
        jbRemoveTel = new javax.swing.JButton();
        jlId3 = new javax.swing.JLabel();
        jtfRemoveContact = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 650));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(null);

        jlHeader1.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jlHeader1.setText("DIRECTORIO ");
        getContentPane().add(jlHeader1);
        jlHeader1.setBounds(280, 10, 317, 88);

        jlType1.setText("TIPO:");
        getContentPane().add(jlType1);
        jlType1.setBounds(40, 110, 130, 16);

        jlNames1.setText("NOMBRES:");
        getContentPane().add(jlNames1);
        jlNames1.setBounds(40, 140, 110, 16);

        jlLastName1.setText("APELLIDOS:");
        getContentPane().add(jlLastName1);
        jlLastName1.setBounds(40, 170, 120, 16);

        jlId1.setText("ID QUE DESEA BUSCAR:");
        getContentPane().add(jlId1);
        jlId1.setBounds(600, 650, 170, 16);

        jlBirthDate1.setText("FECHA DE NACIMIENTO:");
        getContentPane().add(jlBirthDate1);
        jlBirthDate1.setBounds(40, 230, 180, 16);

        jlAdress1.setText("DIRECCION(ES):");
        getContentPane().add(jlAdress1);
        jlAdress1.setBounds(40, 280, 110, 16);

        jlTelNumber1.setText("TELEFONO(S):");
        getContentPane().add(jlTelNumber1);
        jlTelNumber1.setBounds(40, 370, 100, 16);

        jcbSelectType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PROFESOR", "ESTUDIANTE", "EMPLEADO" }));
        getContentPane().add(jcbSelectType);
        jcbSelectType.setBounds(280, 110, 104, 26);

        jbAdd.setText("GUARDAR");
        getContentPane().add(jbAdd);
        jbAdd.setBounds(420, 700, 120, 27);

        jbUpdate.setText("ACTUALIZAR");
        getContentPane().add(jbUpdate);
        jbUpdate.setBounds(290, 700, 120, 27);

        jbDelete.setText("BORRAR");
        getContentPane().add(jbDelete);
        jbDelete.setBounds(30, 700, 120, 27);

        jbList.setText("LISTAR");
        getContentPane().add(jbList);
        jbList.setBounds(160, 700, 120, 27);
        getContentPane().add(jtfName);
        jtfName.setBounds(280, 140, 340, 26);
        getContentPane().add(jtfLastName);
        jtfLastName.setBounds(280, 170, 340, 26);
        getContentPane().add(jtfId);
        jtfId.setBounds(280, 200, 167, 26);
        getContentPane().add(jtfBirthDate);
        jtfBirthDate.setBounds(280, 230, 167, 26);
        getContentPane().add(jtfTelNumber1);
        jtfTelNumber1.setBounds(590, 670, 167, 26);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 430, 760, 210);

        jLabel2.setText("(MM/DD/AAAA)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 230, 88, 16);

        jbAddAddress.setText("AÑADIR DIR");
        getContentPane().add(jbAddAddress);
        jbAddAddress.setBounds(610, 260, 120, 27);

        jbAddTelNumber.setText("AÑADIR TEL");
        getContentPane().add(jbAddTelNumber);
        jbAddTelNumber.setBounds(610, 350, 120, 27);

        jbSearchId.setText("BUSCAR POR ID");
        getContentPane().add(jbSearchId);
        jbSearchId.setBounds(570, 700, 200, 27);

        jlId2.setText("ID:");
        getContentPane().add(jlId2);
        jlId2.setBounds(40, 200, 130, 16);

        jScrollPane1.setViewportView(jlNumbers);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 350, 300, 60);

        jScrollPane3.setViewportView(jlDirs);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(280, 260, 300, 60);

        jbRemoveDir.setText("ELIMINAR DIR");
        getContentPane().add(jbRemoveDir);
        jbRemoveDir.setBounds(610, 290, 120, 27);

        jbRemoveTel.setText("ELIMINAR TEL");
        getContentPane().add(jbRemoveTel);
        jbRemoveTel.setBounds(610, 380, 120, 27);

        jlId3.setText("ID DEL CONTACTO QUE DESEA ELIMINAR:");
        getContentPane().add(jlId3);
        jlId3.setBounds(30, 650, 260, 16);
        getContentPane().add(jtfRemoveContact);
        jtfRemoveContact.setBounds(40, 670, 100, 26);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbAddAddress;
    private javax.swing.JButton jbAddTelNumber;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbList;
    private javax.swing.JButton jbRemoveDir;
    private javax.swing.JButton jbRemoveTel;
    private javax.swing.JButton jbSearchId;
    private javax.swing.JButton jbUpdate;
    private javax.swing.JComboBox<String> jcbSelectType;
    private javax.swing.JLabel jlAdress1;
    private javax.swing.JLabel jlBirthDate1;
    private javax.swing.JList<String> jlDirs;
    private javax.swing.JLabel jlHeader1;
    private javax.swing.JLabel jlId1;
    private javax.swing.JLabel jlId2;
    private javax.swing.JLabel jlId3;
    private javax.swing.JLabel jlLastName1;
    private javax.swing.JLabel jlNames1;
    private javax.swing.JList<String> jlNumbers;
    private javax.swing.JLabel jlTelNumber1;
    private javax.swing.JLabel jlType1;
    private javax.swing.JTextField jtfBirthDate;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfLastName;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfRemoveContact;
    private javax.swing.JTextField jtfTelNumber1;
    // End of variables declaration//GEN-END:variables
}
