package transeversal.vistas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import transeversal.datos.AlumnoData;
import transeversal.entidades.Alumno;

/**
 *
 * @author Julian Rios
 */
public class AlumnoVista extends javax.swing.JFrame {

    public AlumnoVista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jdcFechaNac = new com.toedter.calendar.JDateChooser();
        btnCargar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        cmbEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTION ALUMNOS");
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
        jLabel1.setText("GESTION ALUMNO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("DNI");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("APELLIDO");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("NOMBRE");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("FECHA NACIMIENTO");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("ESTADO");

        txtDNI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtApellido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jdcFechaNac.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnCargar.setBackground(new java.awt.Color(153, 153, 0));
        btnCargar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCargar.setForeground(new java.awt.Color(255, 255, 255));
        btnCargar.setText("NUEVO");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(153, 153, 0));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR DATO");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
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
        cmbEstado.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(158, 158, 158)
                .addComponent(jButton1)
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBuscar))
                                    .addComponent(txtApellido)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdcFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnCargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)))
                .addGap(7, 7, 7)
                .addComponent(btnLimpiar)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jdcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar)
                    .addComponent(btnModificar)
                    .addComponent(btnLimpiar))
                .addContainerGap(123, Short.MAX_VALUE))
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

    //Parsear la fecha Date del SQL a LocalDate
    public static LocalDate convertirLocalDate(Date d) {
        LocalDate xx = null;
        if (d != null) {
            Instant instant = d.toInstant();
            ZoneId zonaHoraria = ZoneId.systemDefault();
            xx = instant.atZone(zonaHoraria).toLocalDate();
        }
        return xx;
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            // Verificar si el campo DNI está vacío
            if (txtDNI.getText().isEmpty()) {
                throw new RuntimeException("El campo DNI está vacío");
            }

            int dni = Integer.parseInt(txtDNI.getText());
            AlumnoData ad = new AlumnoData();
            Alumno alum = ad.buscarAlumnoPorDni(dni);

            if (alum != null) {
                txtApellido.setText(alum.getApellido());
                txtNombre.setText(alum.getNombre());

                // Convertir LocalDate a Date
                LocalDate fechaNacimientoLocal = alum.getFechaNacimiento();
                Date fechaNacimientoDate = java.sql.Date.valueOf(fechaNacimientoLocal);
                jdcFechaNac.setDate(fechaNacimientoDate);

                // correccion combobox
                if (alum.isEstado()) {
                    cmbEstado.setSelectedIndex(0);
                } else {
                    cmbEstado.setSelectedIndex(1);
                }
            }
        } catch (NumberFormatException e) {
            // Manejar la excepción si el DNI no es un número válido
            JOptionPane.showMessageDialog(this, "DNI inválido. Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (RuntimeException e) {
            // Manejar la excepción si el campo DNI está vacío
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        //Variable para guardar msjs para el usuario
        //Dentro del try no la reconoce el catch
        String msj = "Error: Por favor ingrese, ";

        try {
            //alumnoData tiene el metodo agregar alumno que recibe un alumno de entidades
            //Capturamos los datos del form para armar la instancia de entidades
            //luego lo recibe el metodo agregarAlumno de AlumnoData
            Alumno alum = new Alumno();
            AlumnoData ad = new AlumnoData();
            boolean cumple = true;
            //Capturamos datos para crear alumno nuevo:
            String dniString = txtDNI.getText().trim();
            int dni = 0;
            if (dniString.isEmpty()) {
                msj = msj + "DNI .";
                cumple = false;
                JOptionPane.showMessageDialog(this, msj);
                return;
            } else {
                //Si es distinto a vacio:
                // Definir una expresión regular que permita de 7 a 8 dígitos numéricos
                String patronDNI = "^[0-9]{7,8}$";
                if (dniString.matches(patronDNI)) {
                    //si es asi lo parseamos a int
                    dni = Integer.parseInt(dniString);
                } else {
                    msj = msj + "un DNI que contenga al menos 7 números, maximo 8 y que solo contenga números";
                    cumple = false;
                    JOptionPane.showMessageDialog(this, msj);
                    return;
                }
            }

            String apellido = txtApellido.getText().trim().toUpperCase();

            if (apellido.isEmpty()) {
                msj = msj + "Apellido. ";
                cumple = false;
                JOptionPane.showMessageDialog(this, msj);
                return;
            } else {
                // Definir una expresión regular que solo permita letras mayúsculas y minúsculas, espacios y apóstrofes
                String patron = "^[a-zA-Z\\s']{4,20}$";
                if (!apellido.matches(patron)) {
                    msj = msj + "Apellido. Solo puede contener mayúsculas y minúsculas, espacios y apóstrofes(Minimo 4, maximo 20 caracteres)";
                    cumple = false;
                    JOptionPane.showMessageDialog(this, msj);
                    return;
                }
            }

            String nombre = txtNombre.getText().trim().toUpperCase();
            if (nombre.isEmpty()) {
                msj = msj + "Nombre. ";
                cumple = false;
                JOptionPane.showMessageDialog(this, msj);
                return;
            } else {
                // Definir una expresión regular que solo permita letras mayúsculas y minúsculas, espacios y apóstrofes
                String patron = "^[a-zA-Z\\s']{4,20}$";
                if (!nombre.matches(patron)) {
                    msj = msj + "Nombre.Solo puede contener mayúsculas y minúsculas, espacios y apóstrofes(Minimo 4, maximo 20 caracteres)";
                    cumple = false;
                    JOptionPane.showMessageDialog(this, msj);
                    return;
                }
            }

            //Guardamos la fecha ingresada para parsearla
            //ingresar la fecha del chooser de tipo Date
            java.util.Date fechaNacimientoUtil = jdcFechaNac.getDate();
            //Entidades recibe un LocalDate , la parseamos 
            LocalDate fechaNacimientoLocal = null;
            if (fechaNacimientoUtil != null) {
                java.sql.Date fechaNacimientoDate = new java.sql.Date(fechaNacimientoUtil.getTime());
                fechaNacimientoLocal = fechaNacimientoDate.toLocalDate();

                // Obtener la fecha actual para verificar si tiene 18 años de edad
                LocalDate fechaActual = LocalDate.now();
                // Calcular la diferencia de años entre la fecha actual y la fecha de nacimiento
                Period edad = Period.between(fechaNacimientoLocal, fechaActual);

                // Verificar si la edad es mayor o igual a 18 años
                if (edad.getYears() < 18) {
                    msj = msj + " personas mayores de 18 años de edad.";
                    cumple = false;
                    JOptionPane.showMessageDialog(this, msj);
                    return;
                }

            } else {
                msj = msj + "Fecha de Nacimiento. ";
                cumple = false;
                JOptionPane.showMessageDialog(this, msj);
                return;
            }

            int estadoInt = cmbEstado.getSelectedIndex();
            boolean estado = true;
            if (estadoInt < 0) {
                msj = msj + "Estado. ";
                cumple = false;
                JOptionPane.showMessageDialog(this, msj);
                return;
            } else if (estadoInt == 2) {
                estado = false;
            } else if (estadoInt == 1) {
                estado = true;
            }

            //Crea el Alumno alum de entidades
            alum.setDni(dni);
            alum.setApellido(apellido);
            alum.setNombre(nombre);
            alum.setFechaNacimiento(fechaNacimientoLocal);
            alum.setEstado(estado);

            //AlumnoData recibe alum y lo guarda en la base de datos 
            //con su metodo guardarAlumno(verifica que no exista el dni,en el SQL es unico
            if (cumple == true) {
                ad.guardarAlumno(alum);
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, msj);
        } catch (NumberFormatException e) {
            // Manejar la excepción si el DNI no es un número válido
            JOptionPane.showMessageDialog(this, msj);
        } catch (RuntimeException e) {
            // Manejar la excepción si el campo DNI está vacío
            JOptionPane.showMessageDialog(this, msj);
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //Variable para guardar msjs para el usuario
        //Dentro del try no la reconoce el catch
        String msj = "Error: Por favor ingrese, ";

        try {
            //alumnoData tiene el metodo modificar alumno que recibe un Alumno alum 
            //buscarAlumnoPorDni devuelve un Alumno alum filtrando por el dni
            //luego lo recibe el metodo modificarAlumno de AlumnoData
            Alumno alum = new Alumno();
            AlumnoData ad = new AlumnoData();
            boolean cumple = true;

            //Capturamos datos para modificar el alumno si existe:
            String dniString = txtDNI.getText().trim();
            int dni = 0;
            if (dniString.isEmpty()) {
                msj = msj + "DNI .";
                cumple = false;
                JOptionPane.showMessageDialog(this, msj);
                return;
            } else {
                //Si es distinto a vacio:
                // Definir una expresión regular que permita de 7 a 8 dígitos numéricos
                String patronDNI = "^[0-9]{7,8}$";
                if (dniString.matches(patronDNI)) {
                    //si es asi lo parseamos a int
                    dni = Integer.parseInt(dniString);
                    //GUARDAMOS EL Alumno alum PARA MODIFICARLO EN modificarAlumnoData(alum)
                    //Antes continuamos validando los datos que cumplan al igual que en Alumno Nuevo
                    alum = ad.buscarAlumnoPorDni(dni);
                } else {
                    msj = msj + "un DNI que contenga al menos 7 números, maximo 8 y que solo contenga números";
                    cumple = false;
                    JOptionPane.showMessageDialog(this, msj);
                    return;
                }
            }

            String apellido = txtApellido.getText().trim().toUpperCase();

            if (apellido.isEmpty()) {
                msj = msj + "Apellido. ";
                cumple = false;
                JOptionPane.showMessageDialog(this, msj);
                return;
            } else {
                // Definir una expresión regular que solo permita letras mayúsculas y minúsculas, espacios y apóstrofes
                String patron = "^[a-zA-Z\\s']{4,20}$";
                if (!apellido.matches(patron)) {
                    msj = msj + "Apellido. Solo puede contener mayúsculas y minúsculas, espacios y apóstrofes(Minimo 4, maximo 20 caracteres)";
                    cumple = false;
                    JOptionPane.showMessageDialog(this, msj);
                    return;
                }
            }

            String nombre = txtNombre.getText().trim().toUpperCase();
            if (nombre.isEmpty()) {
                msj = msj + "Nombre. ";
                cumple = false;
                JOptionPane.showMessageDialog(this, msj);
                return;
            } else {
                // Definir una expresión regular que solo permita letras mayúsculas y minúsculas, espacios y apóstrofes
                String patron = "^[a-zA-Z\\s']{4,20}$";
                if (!nombre.matches(patron)) {
                    msj = msj + "Nombre.Solo puede contener mayúsculas y minúsculas, espacios y apóstrofes(Minimo 4, maximo 20 caracteres)";
                    cumple = false;
                    JOptionPane.showMessageDialog(this, msj);
                    return;
                }
            }

            //Guardamos la fecha ingresada para parsearla
            //ingresar la fecha del chooser de tipo Date
            java.util.Date fechaNacimientoUtil = jdcFechaNac.getDate();
            //Entidades recibe un LocalDate , la parseamos 
            LocalDate fechaNacimientoLocal = null;
            if (fechaNacimientoUtil != null) {
                java.sql.Date fechaNacimientoDate = new java.sql.Date(fechaNacimientoUtil.getTime());
                fechaNacimientoLocal = fechaNacimientoDate.toLocalDate();

                // Obtener la fecha actual para verificar si tiene 18 años de edad
                LocalDate fechaActual = LocalDate.now();
                // Calcular la diferencia de años entre la fecha actual y la fecha de nacimiento
                Period edad = Period.between(fechaNacimientoLocal, fechaActual);

                // Verificar si la edad es mayor o igual a 18 años
                if (edad.getYears() < 18) {
                    msj = msj + " personas mayores de 18 años de edad.";
                    cumple = false;
                    JOptionPane.showMessageDialog(this, msj);
                    return;
                }

            } else {
                msj = msj + "Fecha de Nacimiento. ";
                cumple = false;
                JOptionPane.showMessageDialog(this, msj);
                return;
            }

            int estadoInt = cmbEstado.getSelectedIndex();
            boolean estado = true;
            if (estadoInt < 0) {
                msj = msj + "Estado. ";
                cumple = false;
                JOptionPane.showMessageDialog(this, msj);
                return;
            } else if (estadoInt == 2) {
                estado = false;
            } else if (estadoInt == 1) {
                estado = true;
            }

            //Crea el Alumno alum de entidades
            alum.setDni(dni);
            alum.setApellido(apellido);
            alum.setNombre(nombre);
            alum.setFechaNacimiento(fechaNacimientoLocal);
            alum.setEstado(estado);

            //AlumnoData recibe alum y lo guarda en la base de datos 
            //con su metodo guardarAlumno(verifica que no exista el dni,en el SQL es unico
            if (cumple == true) {
                ad.modificarAlumno(alum);
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, msj);
        } catch (NumberFormatException e) {
            // Manejar la excepción si el DNI no es un número válido
            JOptionPane.showMessageDialog(this, msj);
        } catch (RuntimeException e) {
            // Manejar la excepción si el campo DNI está vacío
            JOptionPane.showMessageDialog(this, msj);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       txtDNI.setText("");
       txtApellido.setText("");
       txtNombre.setText("");
       jdcFechaNac.setDateFormatString("");
       cmbEstado.setSelectedIndex(-1);
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jdcFechaNac;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
