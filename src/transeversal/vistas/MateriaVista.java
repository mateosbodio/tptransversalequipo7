package transeversal.vistas;

import javax.swing.JOptionPane;
import transeversal.datos.MateriaData;
import transeversal.entidades.Materia;

/**
 *
 * @author Julian Rios
 */
public class MateriaVista extends javax.swing.JFrame {

    public MateriaVista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        btnCargar = new javax.swing.JButton();
        btnModif = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        checkNueva = new javax.swing.JCheckBox();
        checkModificar = new javax.swing.JCheckBox();
        btnBuscar = new javax.swing.JButton();
        cmbEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MATERIA");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(98, 160, 221));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("MATERIAS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("NOMBRE");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("AÑO");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("ESTADO");

        txtAño.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnCargar.setBackground(new java.awt.Color(153, 153, 0));
        btnCargar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCargar.setForeground(new java.awt.Color(255, 255, 255));
        btnCargar.setText("CARGAR");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnModif.setBackground(new java.awt.Color(153, 153, 0));
        btnModif.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModif.setForeground(new java.awt.Color(255, 255, 255));
        btnModif.setText("MODIFICAR");
        btnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(153, 153, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        checkNueva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkNueva.setText("NUEVA");
        checkNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNuevaActionPerformed(evt);
            }
        });

        checkModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkModificar.setText("MODIFICAR");
        checkModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkModificarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(153, 153, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cmbEstado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "NO ACTIVO" }));
        cmbEstado.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCargar)
                        .addGap(81, 81, 81)
                        .addComponent(btnModif)
                        .addGap(72, 72, 72)
                        .addComponent(btnLimpiar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(51, 51, 51)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAño, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkNueva)
                            .addComponent(checkModificar))
                        .addGap(104, 104, 104))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1))
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(checkNueva)
                        .addGap(104, 104, 104)
                        .addComponent(checkModificar)))
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar)
                    .addComponent(btnModif)
                    .addComponent(btnLimpiar))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        if (txtNombre.getText().equals("") || txtAño.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Complete los campos");
        } else {
            MateriaData mg = new MateriaData();
            Materia mater = new Materia();
            JOptionPane.showMessageDialog(this, "Materia cargada correctamente");
            try {
                mater.setNombre(txtNombre.getText());
                mater.setAño(Integer.parseInt(txtAño.getText()));
                mater.setEstado(true);
                mg.cargarMateria(mater);
                limpiar();
            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(this, "Datos no validos, ingrese solo numeros");
            } catch (NullPointerException ex) {

                JOptionPane.showMessageDialog(this, "Debe cargar el campo año");
            }
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifActionPerformed
        if (txtNombre.getText().isEmpty() || txtAño.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos.");
        } else {
            MateriaData md = new MateriaData();
            Materia mater = new Materia();
            try {
                mater.setIdMateria(Integer.parseInt(txtID.getText()));
                mater.setNombre(txtNombre.getText());
                mater.setAño(Integer.parseInt(txtAño.getText()));

               
                mater.setEstado(cmbEstado.isEnabled());

                md.modificarMateria(mater);
                JOptionPane.showMessageDialog(this, "Materia modificada correctamente");
                limpiar();
                modificar();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese solo números en los campos correspondientes.");
            }
        }
    }//GEN-LAST:event_btnModifActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            MateriaData md = new MateriaData();
            Materia mater = new Materia();
            if (txtID.getText().equals("") && txtNombre.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese codigo o nombre de materia para buscar");

            } else if (txtID.getText().equals("")) {
                mater.setIdMateria(0);
                mater.setNombre(txtNombre.getText());
                md.buscarMateria(mater);
            } else {
                mater.setIdMateria(Integer.parseInt(txtID.getText()));
                mater.setNombre(txtNombre.getText());
                md.buscarMateria(mater);
            }
            if (mater.getIdMateria() == 0) {
                limpiar();
            } else {
                txtID.setText(mater.getIdMateria() + "");
                txtNombre.setText(mater.getNombre());
                txtAño.setText(mater.getAño() + "");

                cmbEstado.setSelectedItem(1);
                if (mater.isEstado() == true) {

                    cmbEstado.setSelectedItem(0);
                } else {

                    cmbEstado.setSelectedItem(1);
                }
                btnModif.setEnabled(true);
            }
        } catch (NumberFormatException ex) {
            limpiar();
            JOptionPane.showMessageDialog(this, "Ingrese numeros donde corresponda");

        } catch (NullPointerException ex) {

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void checkNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNuevaActionPerformed
         nueva();
        limpiar();
    }//GEN-LAST:event_checkNuevaActionPerformed

    private void checkModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkModificarActionPerformed
        modificar();
        limpiar();
    }//GEN-LAST:event_checkModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModif;
    private javax.swing.JCheckBox checkModificar;
    private javax.swing.JCheckBox checkNueva;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
private void limpiar() {
        txtID.setText("");
        txtNombre.setText("");
        txtAño.setText("");
        cmbEstado.setSelectedItem(-1);
    }

    public void nueva() {
        checkNueva.setSelected(true);
        checkModificar.setSelected(false);
        cmbEstado.setSelectedItem(-1);
        txtID.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnCargar.setEnabled(true);
        btnModif.setEnabled(false);
    }

    public void modificar() {
        checkNueva.setSelected(false);
        checkModificar.setSelected(true);
        cmbEstado.setSelectedItem(-1);
        txtID.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnCargar.setEnabled(false);
    }

}
