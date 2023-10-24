
package transeversal.vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transeversal.datos.AlumnoData;
import transeversal.datos.InscripcionData;
import transeversal.entidades.Alumno;
import transeversal.entidades.Inscripcion;

/**
 *
 * @author Julian Rios
 */
public class NotasVista extends javax.swing.JFrame {

      private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public NotasVista() {
        initComponents();
        armarCabecera();
        carCombo();
        btnGuardar.setEnabled(false);
    }

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre Materia");
        modelo.addColumn("Nota");
        tabNotas.setModel(modelo);
    }

    private void carCombo() {
        AlumnoData ad = new AlumnoData();
        List<Alumno> list = ad.obtenerAlumnos();

        cmbAlumnos.removeAllItems(); 
        if (!list.isEmpty()) {
            for (Alumno alum : list) {
                cmbAlumnos.addItem(alum);
            }
        }

        cmbAlumnos.setSelectedIndex(-1); 
    }

    public void actCombo() {
        borrarFilas();
        InscripcionData xx = new InscripcionData();
        Alumno alum = new Alumno();
        if (cmbAlumnos.getSelectedItem() != null) {
            alum = (Alumno) cmbAlumnos.getSelectedItem();
            List<Inscripcion> lista = xx.obtenerInscripcionesPorAlumno(alum.getIdAlumno());
            for (Inscripcion inscrip : lista) {
                modelo.addRow(new Object[]{
                    inscrip.getMateria().getIdMateria(),
                    inscrip.getMateria().getNombre(),
                    inscrip.getNota()
                });
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabNotas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbAlumnos = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NOTAS");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(98, 160, 221));

        tabNotas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabNotas);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("NOTAS");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("SELECCIONE ALUMNO:");

        cmbAlumnos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlumnosActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(153, 153, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("SELECCIONE UNA FILA PARA EDITAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(287, 287, 287))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(80, Short.MAX_VALUE))
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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (tabNotas.getSelectedRow() >= 0) {
            InscripcionData xx = new InscripcionData();
            Alumno alum = new Alumno();
            alum = (Alumno) cmbAlumnos.getSelectedItem();
            try {
                double nota = pedirNota();
                xx.actualizarNota(alum.getIdAlumno(), (int) tabNotas.getValueAt(tabNotas.getSelectedRow(), 0), nota);
            } catch (NullPointerException ex) {
            }
            carCombo();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar nota");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlumnosActionPerformed
        btnGuardar.setEnabled(true);
        actCombo();
    }//GEN-LAST:event_cmbAlumnosActionPerformed

   private void borrarFilas() {
        int f = tabNotas.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private double pedirNota() {
        double calificacion = 0;
        boolean califValida = false;

        while (!califValida) {
            try {
                String input = JOptionPane.showInputDialog(this, "¿Cuál es la nota a ingresar?", "Atencion !!", JOptionPane.QUESTION_MESSAGE);
                if (input == null) {
                    return 0;
                }

                calificacion = Double.parseDouble(input);

                if (calificacion >= 1 && calificacion <= 10) {
                    califValida = true;
                } else {
                    JOptionPane.showMessageDialog(this, "Ingreso no válido. Debe ingresar un valor entre 1 y 10.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Debe ingresar solo números.");
            }
        }

        return calificacion;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<Alumno> cmbAlumnos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabNotas;
    // End of variables declaration//GEN-END:variables
}
