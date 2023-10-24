package transeversal.datos;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import transeversal.entidades.Alumno;


public class AlumnoData {

    private final Connection con;

    public AlumnoData() {
        con = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());

            int filasInsertadas = ps.executeUpdate();

            if (filasInsertadas > 0) {
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        alumno.setIdAlumno(rs.getInt(1));
                    }
                }
                JOptionPane.showMessageDialog(null, "Se cargó el alumno correctamente!!");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo cargar el alumno.");
            }
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "Ya existe ese DNI");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar el alumno: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void modificarAlumno(Alumno alumno) {
        String sql = "UPDATE alumno SET dni=?, apellido=?, nombre=?, fechaNacimiento=?, estado=? WHERE idAlumno=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.setInt(6, alumno.getIdAlumno());

            int filasModificadas = ps.executeUpdate();

            if (filasModificadas > 0) {
                JOptionPane.showMessageDialog(null, "Alumno modificado correctamente!!");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el registro");
            }
        } catch (SQLException ex) {

            ex.printStackTrace();

        }
    }

    public Alumno buscarAlumno(int idAlumno) {
        Alumno alumno = null;
        String buscarAlumno = "SELECT dni, apellido, nombre, fechaNacimiento, estado FROM alumno WHERE idAlumno=? AND estado=1";
        try (PreparedStatement ps = con.prepareStatement(buscarAlumno)) {
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(idAlumno);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }
        } catch (SQLException ex) {

            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar el alumno: " + ex.getMessage());
        }
        return alumno;
    }

    public Alumno buscarAlumnoPorDni(int dni) {
        Alumno alumno = null;
        String buscarDni = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento, estado FROM alumno WHERE dni=? AND estado=1";
        try (PreparedStatement ps = con.prepareStatement(buscarDni)) {
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un alumno con ese número de documento");
            }
        } catch (SQLException ex) {

            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar el alumno por DNI: " + ex.getMessage());
        }
        return alumno;
    }
    
   

    public List<Alumno> obtenerAlumnos() {
        ArrayList<Alumno> lista = new ArrayList<>();
        String consulta = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento, estado FROM alumno WHERE estado = 1";

        try (PreparedStatement ps = con.prepareStatement(consulta); 
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Alumno alum = new Alumno();
                alum.setIdAlumno(rs.getInt("idAlumno"));
                alum.setDni(rs.getInt("dni"));
                alum.setApellido(rs.getString("apellido"));
                alum.setNombre(rs.getString("nombre"));
                alum.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alum.setEstado(rs.getBoolean("estado"));
                lista.add(alum);
            }
        } catch (SQLException ex) {

            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener la lista de alumnos: " + ex.getMessage());
        }

        return lista;
    }

    public void eliminarAlumno(int id) {
        Alumno alum = buscarAlumno(id);
        if (alum != null) {
            if (alum.isEstado() == false) {
                JOptionPane.showMessageDialog(null, "El alumno ya se encuentra dado de baja");
            } else {
                String eliminarAlumno = "UPDATE alumno SET estado = 0 WHERE idAlumno = ?";
                try {
                    try (PreparedStatement ps = con.prepareStatement(eliminarAlumno)) {
                        ps.setInt(1, id);
                        int filasAfectadas = ps.executeUpdate();
                        if (filasAfectadas > 0) {
                            JOptionPane.showMessageDialog(null, "Se dio de baja al alumno");
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo dar de baja al alumno");
                        }
                    }
                } catch (SQLException ex) {

                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al dar de baja al alumno: " + ex.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "El alumno no existe");
        }
    }

    public List<Alumno> obtenerListaAlumnos(int estado, int orden) {
        ArrayList<Alumno> lista = new ArrayList<>();
        String sql = formarSQL(estado, orden);
        try {
            try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Alumno alum = new Alumno();
                    alum.setIdAlumno(rs.getInt("idAlumno"));
                    alum.setDni(rs.getInt("dni"));
                    alum.setApellido(rs.getString("apellido"));
                    alum.setNombre(rs.getString("nombre"));
                    alum.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                    alum.setEstado(rs.getBoolean("estado"));
                    lista.add(alum);
                }
            }
        } catch (SQLException ex) {

            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener la lista de alumnos: " + ex.getMessage());
        }
        return lista;
    }

    private String formarSQL(int estado, int orden) {
        StringBuilder sql = new StringBuilder("SELECT idAlumno, dni, apellido, nombre, fechaNacimiento, estado FROM alumno");

        switch (estado) {
            case 1:
                sql.append(" WHERE estado = 1");
                break;
            case 2:
                sql.append(" WHERE estado = 0");
                break;
        }

        switch (orden) {
            case 1:
                sql.append(" ORDER BY dni");
                break;
            case 2:
                sql.append(" ORDER BY apellido");
                break;
            case 3:
                sql.append(" ORDER BY nombre");
                break;
            case 4:
                sql.append(" ORDER BY fechaNacimiento");
                break;
            default:
                sql.append(" ORDER BY idAlumno");
                break;
        }

        return sql.toString();
    }

}
