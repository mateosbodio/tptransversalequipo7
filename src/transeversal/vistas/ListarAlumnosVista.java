package transeversal.vistas;

import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import transeversal.datos.AlumnoData;
import transeversal.entidades.Alumno;

/**
 *
 * @author Julian Rios
 */
public class ListarAlumnosVista extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public ListarAlumnosVista() {
        initComponents();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        checkAct = new javax.swing.JCheckBox();
        checkNoAct = new javax.swing.JCheckBox();
        checkTodos = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LISTAR ALUMNOS ULP");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(98, 160, 221));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        checkAct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkAct.setText("ACTIVOS");
        checkAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActActionPerformed(evt);
            }
        });

        checkNoAct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkNoAct.setText("NO ACTIVOS");
        checkNoAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNoActActionPerformed(evt);
            }
        });

        checkTodos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkTodos.setText("TODOS");
        checkTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTodosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("ALUMNOS");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(checkAct)
                .addGap(162, 162, 162)
                .addComponent(checkNoAct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkTodos)
                .addGap(102, 102, 102))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(jButton1)
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAct)
                    .addComponent(checkNoAct)
                    .addComponent(checkTodos))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
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

    private void checkActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActActionPerformed
        checkNoAct.setSelected(false);
        checkTodos.setSelected(false);
        actualizarTabla(1);
    }//GEN-LAST:event_checkActActionPerformed

    private void checkNoActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNoActActionPerformed
        checkAct.setSelected(false);
        checkTodos.setSelected(false);
        actualizarTabla(2);
    }//GEN-LAST:event_checkNoActActionPerformed

    private void checkTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTodosActionPerformed
        checkAct.setSelected(false);
        checkNoAct.setSelected(false);
        actualizarTabla(0);
    }//GEN-LAST:event_checkTodosActionPerformed

    private void actualizarTabla(int estado) {
        int orden = 0;
        switch (estado) {
            case 0:
                // Orden predeterminado
                break;
            case 1:
                // Orden para alumnos activos
                orden = 1; // Aquí defines el orden para alumnos activos
                break;
            case 2:
                // Orden para alumnos no activos
                orden = 2; // Aquí defines el orden para alumnos no activos
                break;
            default:
                // Manejar otros casos de estado aquí
                break;
        }

        borrarFilas();
        AlumnoData zzz = new AlumnoData();
        List<Alumno> lista = zzz.obtenerListaAlumnos(estado, orden);
        for (Alumno alum : lista) {
            modelo.addRow(new Object[]{
                alum.getIdAlumno(),
                alum.getDni(),
                alum.getApellido(),
                alum.getNombre(),
                alum.getFechaNacimiento(),
                alum.isEstado()
            });
        }
    }

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha Nac.");
        modelo.addColumn("Estado");
        jTable1.setModel(modelo);
    }

    private void borrarFilas() {
        int f = jTable1.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkAct;
    private javax.swing.JCheckBox checkNoAct;
    private javax.swing.JCheckBox checkTodos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
