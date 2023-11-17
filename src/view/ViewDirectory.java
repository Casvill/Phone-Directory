/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author Daniel Casvill
 */
public class ViewDirectory extends javax.swing.JPanel {

    /**
     * Creates new form ViewDirectory
     */
    public ViewDirectory() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlHeader = new javax.swing.JLabel();
        jlErrorPanel = new javax.swing.JLabel();
        jlType = new javax.swing.JLabel();
        jlNames = new javax.swing.JLabel();
        jlLastName = new javax.swing.JLabel();
        jlId = new javax.swing.JLabel();
        jlBirthDate = new javax.swing.JLabel();
        jlAdress = new javax.swing.JLabel();
        jlTelNumber = new javax.swing.JLabel();
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
        jtfTelNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jlType7 = new javax.swing.JLabel();
        jcbTelType = new javax.swing.JComboBox<>();
        jbAddAddress = new javax.swing.JButton();
        jbAddTelNumber = new javax.swing.JButton();

        jlHeader.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jlHeader.setText("DIRECTORIO ");

        jlErrorPanel.setText("error panel ");

        jlType.setText("TIPO:");

        jlNames.setText("NOMBRES:");

        jlLastName.setText("APELLIDOS:");

        jlId.setText("ID:");

        jlBirthDate.setText("FECHA DE NACIMIENTO:");

        jlAdress.setText("DIRECCION(ES):");

        jlTelNumber.setText("TELEFONO(S):");

        jcbSelectType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Profesor", "Estudiante ", "Empleado" }));

        jbAdd.setText("AGREGAR");

        jbUpdate.setText("ACTUALIZAR");

        jbDelete.setText("BORRAR");

        jbList.setText("LISTAR");

        jtfLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLastNameActionPerformed(evt);
            }
        });

        jtfBirthDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBirthDateActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("(MM/DD/AAAA)");

        jlType7.setText("TIPO:");

        jcbTelType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MOVIL", "CASA", "OFICINA", "OTRO" }));

        jbAddAddress.setText("AGREGAR");

        jbAddTelNumber.setText("AGREGAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlHeader)
                        .addGap(330, 330, 330))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlLastName)
                                    .addComponent(jlNames)
                                    .addComponent(jlType))
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbSelectType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtfLastName)
                                        .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1)
                            .addComponent(jlErrorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlTelNumber)
                                    .addComponent(jlAdress)
                                    .addComponent(jlBirthDate)
                                    .addComponent(jlId))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jtfId, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfBirthDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jtfTelNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfAdress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlType7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(163, 163, 163)
                                                .addComponent(jbAddAddress))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jcbTelType, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jbAddTelNumber)))))
                                .addGap(286, 286, 286)))
                        .addGap(32, 32, 32))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbList)
                .addGap(18, 18, 18)
                .addComponent(jbDelete)
                .addGap(27, 27, 27)
                .addComponent(jbUpdate)
                .addGap(18, 18, 18)
                .addComponent(jbAdd)
                .addGap(300, 300, 300))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jlErrorPanel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlType)
                    .addComponent(jcbSelectType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNames)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlBirthDate)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAdress)
                    .addComponent(jbAddAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTelNumber)
                    .addComponent(jlType7)
                    .addComponent(jcbTelType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAddTelNumber))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbUpdate)
                    .addComponent(jbAdd)
                    .addComponent(jbDelete)
                    .addComponent(jbList))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfLastNameActionPerformed

    private void jtfBirthDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBirthDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBirthDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbAddAddress;
    private javax.swing.JButton jbAddTelNumber;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbList;
    private javax.swing.JButton jbUpdate;
    private javax.swing.JComboBox<String> jcbSelectType;
    private javax.swing.JComboBox<String> jcbTelType;
    private javax.swing.JLabel jlAdress;
    private javax.swing.JLabel jlBirthDate;
    private javax.swing.JLabel jlErrorPanel;
    private javax.swing.JLabel jlHeader;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlLastName;
    private javax.swing.JLabel jlNames;
    private javax.swing.JLabel jlTelNumber;
    private javax.swing.JLabel jlType;
    private javax.swing.JLabel jlType7;
    private javax.swing.JTextField jtfAdress;
    private javax.swing.JTextField jtfBirthDate;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfLastName;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfTelNumber;
    // End of variables declaration//GEN-END:variables
}
