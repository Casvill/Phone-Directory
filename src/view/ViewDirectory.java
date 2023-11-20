/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.ActionListener;

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
        jcbSelectType.setSelectedIndex(-1);
        jcbTelType.setSelectedIndex(-1);
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
    
    public String getTexjtfAdress() {
        String text = jtfAdress.getText();
        return text;
    }
    
    public String getTextjtfTelNumber() {
        String text = jtfTelNumber.getText();
        return text;
    }
    
    public String getSelectedjcbSelectType() {
        return (String) jcbSelectType.getSelectedItem();
        
    }
    
    public String getSelectedjcbTelType() {
        Object selected = jcbTelType.getSelectedItem();
        return (String) selected;
    }
    
    public void setJtaInfo(String text)
    {
        jTextArea2.setText(text);
    }
    
    public String getJtaInfo()
    {
        return jTextArea2.getText();
    }
    
    public void clearAddres()
    {
        jtfAdress.setText("");
    }
    
    public void clearPhone()
    {
        jtfTelNumber.setText("");
        jcbTelType.setSelectedIndex(-1);
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
        jlErrorPanel1 = new javax.swing.JLabel();
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
        jtfAdress = new javax.swing.JTextField();
        jtfTelNumber1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jlType8 = new javax.swing.JLabel();
        jcbTelType = new javax.swing.JComboBox<>();
        jbAddAddress = new javax.swing.JButton();
        jbAddTelNumber = new javax.swing.JButton();
        jbSearchId = new javax.swing.JButton();
        jtfTelNumber = new javax.swing.JTextField();
        jlId2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 650));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(null);

        jlHeader1.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jlHeader1.setText("DIRECTORIO ");
        getContentPane().add(jlHeader1);
        jlHeader1.setBounds(280, 10, 317, 88);

        jlErrorPanel1.setText("error panel ");
        getContentPane().add(jlErrorPanel1);
        jlErrorPanel1.setBounds(40, 110, 581, 16);

        jlType1.setText("TIPO:");
        getContentPane().add(jlType1);
        jlType1.setBounds(40, 140, 130, 16);

        jlNames1.setText("NOMBRES:");
        getContentPane().add(jlNames1);
        jlNames1.setBounds(40, 170, 110, 16);

        jlLastName1.setText("APELLIDOS:");
        getContentPane().add(jlLastName1);
        jlLastName1.setBounds(40, 200, 120, 16);

        jlId1.setText("ID QUE DESEA BUSCAR:");
        getContentPane().add(jlId1);
        jlId1.setBounds(610, 620, 140, 16);

        jlBirthDate1.setText("FECHA DE NACIMIENTO:");
        getContentPane().add(jlBirthDate1);
        jlBirthDate1.setBounds(40, 260, 180, 16);

        jlAdress1.setText("DIRECCION(ES):");
        getContentPane().add(jlAdress1);
        jlAdress1.setBounds(40, 290, 110, 16);

        jlTelNumber1.setText("TELEFONO(S):");
        getContentPane().add(jlTelNumber1);
        jlTelNumber1.setBounds(40, 320, 100, 16);

        jcbSelectType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PROFESOR", "ESTUDIANTE ", "EMPLEADO" }));
        getContentPane().add(jcbSelectType);
        jcbSelectType.setBounds(280, 140, 110, 26);

        jbAdd.setText("GUARDAR");
        getContentPane().add(jbAdd);
        jbAdd.setBounds(420, 670, 120, 27);

        jbUpdate.setText("ACTUALIZAR");
        getContentPane().add(jbUpdate);
        jbUpdate.setBounds(290, 670, 120, 27);

        jbDelete.setText("BORRAR");
        getContentPane().add(jbDelete);
        jbDelete.setBounds(30, 670, 120, 27);

        jbList.setText("LISTAR");
        getContentPane().add(jbList);
        jbList.setBounds(160, 670, 120, 27);
        getContentPane().add(jtfName);
        jtfName.setBounds(280, 170, 340, 26);
        getContentPane().add(jtfLastName);
        jtfLastName.setBounds(280, 200, 340, 26);
        getContentPane().add(jtfId);
        jtfId.setBounds(280, 230, 167, 26);

        jtfBirthDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBirthDateActionPerformed(evt);
            }
        });
        getContentPane().add(jtfBirthDate);
        jtfBirthDate.setBounds(280, 260, 167, 26);
        getContentPane().add(jtfAdress);
        jtfAdress.setBounds(280, 290, 167, 26);
        getContentPane().add(jtfTelNumber1);
        jtfTelNumber1.setBounds(590, 640, 167, 26);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 360, 760, 245);

        jLabel2.setText("(MM/DD/AAAA)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 260, 88, 16);

        jlType8.setText("TIPO:");
        getContentPane().add(jlType8);
        jlType8.setBounds(460, 320, 40, 16);

        jcbTelType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MOVIL", "CASA", "OFICINA", "OTRO" }));
        getContentPane().add(jcbTelType);
        jcbTelType.setBounds(510, 320, 90, 26);

        jbAddAddress.setText("AÑADIR DIR");
        getContentPane().add(jbAddAddress);
        jbAddAddress.setBounds(610, 290, 120, 27);

        jbAddTelNumber.setText("AÑADIR TEL");
        getContentPane().add(jbAddTelNumber);
        jbAddTelNumber.setBounds(610, 320, 120, 27);

        jbSearchId.setText("BUSCAR POR ID");
        jbSearchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSearchIdActionPerformed(evt);
            }
        });
        getContentPane().add(jbSearchId);
        jbSearchId.setBounds(570, 670, 200, 27);
        getContentPane().add(jtfTelNumber);
        jtfTelNumber.setBounds(280, 320, 167, 26);

        jlId2.setText("ID:");
        getContentPane().add(jlId2);
        jlId2.setBounds(40, 230, 130, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSearchIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSearchIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSearchIdActionPerformed

    private void jtfBirthDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBirthDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBirthDateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbAddAddress;
    private javax.swing.JButton jbAddTelNumber;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbList;
    private javax.swing.JButton jbSearchId;
    private javax.swing.JButton jbUpdate;
    private javax.swing.JComboBox<String> jcbSelectType;
    private javax.swing.JComboBox<String> jcbTelType;
    private javax.swing.JLabel jlAdress1;
    private javax.swing.JLabel jlBirthDate1;
    private javax.swing.JLabel jlErrorPanel1;
    private javax.swing.JLabel jlHeader1;
    private javax.swing.JLabel jlId1;
    private javax.swing.JLabel jlId2;
    private javax.swing.JLabel jlLastName1;
    private javax.swing.JLabel jlNames1;
    private javax.swing.JLabel jlTelNumber1;
    private javax.swing.JLabel jlType1;
    private javax.swing.JLabel jlType8;
    private javax.swing.JTextField jtfAdress;
    private javax.swing.JTextField jtfBirthDate;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfLastName;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfTelNumber;
    private javax.swing.JTextField jtfTelNumber1;
    // End of variables declaration//GEN-END:variables
}
