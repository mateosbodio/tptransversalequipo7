package transeversal.vistas;

import java.awt.event.ItemEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transeversal.datos.AlumnoData;
import transeversal.datos.InscripcionData;
import transeversal.entidades.Alumno;
import transeversal.entidades.Inscripcion;
import transeversal.entidades.Materia;

/**
 *
 * @author Julian Rios
 */
public class InscripcionesVista extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public InscripcionesVista() {
        initComponents();
        Cabecera();
        carCombo();
        btnAnular.setEnabled(false);
        btnInsc.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInsc = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbAlum = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        checkInsc = new javax.swing.JCheckBox();
        checkNoInsc = new javax.swing.JCheckBox();
        btnInsc = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INSCRIPCIONES");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(98, 160, 221));

        tableInsc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableInsc);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("INSCRIPCIONES");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("SELECCIONE ALUMNO:");

        cmbAlum.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlumActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("MATERIAS");

        checkInsc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkInsc.setText("INSCRIPTO");
        checkInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInscActionPerformed(evt);
            }
        });

        checkNoInsc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkNoInsc.setText("NO INSCRIPTO");
        checkNoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNoInscActionPerformed(evt);
            }
        });

        btnInsc.setBackground(new java.awt.Color(153, 153, 0));
        btnInsc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInsc.setForeground(new java.awt.Color(255, 255, 255));
        btnInsc.setText("INSCRIBIR");
        btnInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscActionPerformed(evt);
            }
        });

        btnAnular.setBackground(new java.awt.Color(153, 153, 0));
        btnAnular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAnular.setForeground(new java.awt.Color(255, 255, 255));
        btnAnular.setText("ANULAR");
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("SELECCIONE LA FILA QUE DESEA EDITAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(223, 223, 223))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(cmbAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInsc)
                        .addGap(82, 82, 82)
                        .addComponent(btnAnular))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(checkInsc)
                        .addGap(71, 71, 71)
                        .addComponent(checkNoInsc)))
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(208, 208, 208)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(274, 274, 274))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkInsc)
                    .addComponent(checkNoInsc))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsc)
                    .addComponent(btnAnular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(93, 93, 93))
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

    private void cmbAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlumActionPerformed
        actualizarTabla();
    }//GEN-LAST:event_cmbAlumActionPerformed

    private void btnInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscActionPerformed
        if (cmbAlum.getSelectedIndex() >= 0) {
            if (tableInsc.getSelectedRow() >= 0) {
                InscripcionData xx = new InscripcionData();
                Inscripcion mm = new Inscripcion();
                mm.setNota(0);
                mm.setAlumno((Alumno) cmbAlum.getSelectedItem());
                mm.setMateria(seleccionJTable(tableInsc.getSelectedRow()));
                xx.cargarInscripcion(mm);
                actualizarTabla();
            } else {
                JOptionPane.showMessageDialog(this.btnInsc, "Seleccione la fila a modificar nota");
            }
        } else {

            JOptionPane.showMessageDialog(this.btnInsc, "Antes debe seleccionar un alumno");
        }
    }//GEN-LAST:event_btnInscActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        if (cmbAlum.getSelectedIndex() >= 0) {
            if (tableInsc.getSelectedRow() >= 0) {
                InscripcionData cc = new InscripcionData();
                Inscripcion ww = new Inscripcion();
                ww.setNota(0);
                ww.setAlumno((Alumno) cmbAlum.getSelectedItem());
                ww.setMateria(seleccionJTable(tableInsc.getSelectedRow()));

                String mensaje = "Desea anular la inscripci\u00f3n de:\n" + "Alumno:" + ww.getAlumno().getApellido() + ", " + ww.getAlumno().getNombre() + "\n"
                        + "Materia: " + ww.getMateria().getNombre() + "?";

                int opc = JOptionPane.showConfirmDialog(this, mensaje, "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (opc == JOptionPane.YES_OPTION) {
                    cc.borrarInscripcionMateriaAlumno(ww.getAlumno().getIdAlumno(), ww.getMateria().getIdMateria());
                    actualizarTabla();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione la fila para anular la inscripción");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un alumno");
        }
    }//GEN-LAST:event_btnAnularActionPerformed

    private void checkInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInscActionPerformed
        if (checkInsc.isSelected()) {
            // si checkInsc se seleccion deselecciona checkNoInsc
            checkNoInsc.setSelected(false);
            btnInsc.setEnabled(false);
            btnAnular.setEnabled(true);
            actualizarTabla();
        }
    }//GEN-LAST:event_checkInscActionPerformed

    private void checkNoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNoInscActionPerformed
        if (checkNoInsc.isSelected()) {
            checkInsc.setSelected(false);
            btnInsc.setEnabled(true);
            btnAnular.setEnabled(false);
            actualizarTabla();
        }
    }//GEN-LAST:event_checkNoInscActionPerformed

    private void Cabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        tableInsc.setModel(modelo);
    }

    private void carCombo() {
        AlumnoData ad = new AlumnoData();
        List<Alumno> list = ad.obtenerAlumnos();
        for (Object alum : list) {
            cmbAlum.addItem((Alumno) alum);
        }
        cmbAlum.setSelectedIndex(-1);
    }

    private void borrarFilas() {
        int f = tableInsc.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void actualizarTabla() {
        borrarFilas();
        InscripcionData ins = new InscripcionData();
        Alumno alum = new Alumno();
        if (cmbAlum.getSelectedItem() != null) {
            alum = (Alumno) cmbAlum.getSelectedItem();
            if (checkInsc.isSelected()) {
                List<Materia> lista = ins.obtenerMateriasCursadas(alum.getIdAlumno());
                for (Materia mat : lista) {
                    modelo.addRow(new Object[]{
                        mat.getIdMateria(),
                        mat.getNombre(),
                        mat.getAño()
                    });
                }
            } else if (checkNoInsc.isSelected()) {
                List<Materia> lista = ins.obtenerMateriasNoCursadas(alum.getIdAlumno());
                for (Materia mat : lista) {
                    modelo.addRow(new Object[]{
                        mat.getIdMateria(),
                        mat.getNombre(),
                        mat.getAño()
                    });
                }
            }
        }
    }

    private Materia seleccionJTable(int fila) {
        Materia mat = new Materia();
        mat.setIdMateria((int) tableInsc.getValueAt(fila, 0));
        mat.setNombre((String) tableInsc.getValueAt(fila, 1));
        return mat;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnInsc;
    private javax.swing.JCheckBox checkInsc;
    private javax.swing.JCheckBox checkNoInsc;
    private javax.swing.JComboBox<Alumno> cmbAlum;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableInsc;
    // End of variables declaration//GEN-END:variables
}
