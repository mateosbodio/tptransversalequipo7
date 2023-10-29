package transeversal.datos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import transeversal.entidades.Materia;

public class MateriaData {

    private Connection con;

    public MateriaData() {
        con = Conexion.getConexion();
    }

     public void cargarMateria(Materia materia) {
        String cargarMateria = "INSERT INTO materia (nombre, año, estado) VALUES (?, ?, ?)";
        try {
            try (PreparedStatement ps = con.prepareStatement(cargarMateria, Statement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, materia.getNombre());
                ps.setInt(2, materia.getAño());
                ps.setBoolean(3, materia.isEstado());
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    materia.setIdMateria(rs.getInt(1));
                   // JOptionPane.showMessageDialog(null, "Materia cargada correctamente");
                }
                rs.close();
            }
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "Ya existe una materia con ese nombre");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la materia: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void modificarMateria(Materia materia) {
        String actualizarMateria = "UPDATE materia SET nombre=?, año=?, estado=? WHERE idMateria=?";

        try {
            try (PreparedStatement ps = con.prepareStatement(actualizarMateria)) {
                ps.setString(1, materia.getNombre());
                ps.setInt(2, materia.getAño());
                ps.setBoolean(3, materia.isEstado());
                ps.setInt(4, materia.getIdMateria());
                int filasActualizadas = ps.executeUpdate();

                if (filasActualizadas > 0) {
                    //JOptionPane.showMessageDialog(null, "Materia modificada exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar la materia.");
                }
            }
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar la materia debido a una restricción de integridad.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar la materia: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public Materia buscarMateria(int idMateria) {
        Materia materia = null;
        String buscarMateria = "SELECT idMateria, nombre, año, estado FROM materia WHERE idMateria=?";
        try {
            try (PreparedStatement ps = con.prepareStatement(buscarMateria)) {
                ps.setInt(1, idMateria);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    materia = new Materia();
                    materia.setIdMateria(rs.getInt("idMateria"));
                    materia.setNombre(rs.getString("nombre"));
                    materia.setAño(rs.getInt("año"));
                    materia.setEstado(rs.getBoolean("estado"));
                } else {
                    JOptionPane.showMessageDialog(null, "La materia no existe con ese código");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la materia: " + ex.getMessage());
            ex.printStackTrace();
        }
        return materia;
    }

    public Materia buscarMateria(String nombre) {
        Materia materia = null;
        String bm = "SELECT idMateria, nombre, año, estado FROM materia WHERE nombre=?";
        try {
            try (PreparedStatement ps = con.prepareStatement(bm)) {
                ps.setString(1, nombre);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    materia = new Materia();
                    materia.setIdMateria(rs.getInt("idMateria"));
                    materia.setNombre(rs.getString("nombre"));
                    materia.setAño(rs.getInt("año"));
                    materia.setEstado(rs.getBoolean("estado"));
                } else {
                    JOptionPane.showMessageDialog(null, "La materia no existe");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la materia: " + ex.getMessage());
            ex.printStackTrace();
        }
        return materia;
    }

    public Materia buscarMateria(Materia mat) {
        String bm = "";
        String aux = "";
        if (mat.getIdMateria() != 0) {
            bm = "SELECT idMateria, nombre, año, estado FROM materia WHERE idMateria=?";
            aux = "" + mat.getIdMateria();
        } else if (!mat.getNombre().equals("")) {
            bm = "SELECT idMateria, nombre, año, estado FROM materia WHERE nombre=?";
            aux = mat.getNombre();
        }
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(bm);
            ps.setString(1, aux);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mat.setIdMateria(rs.getInt("idMateria"));
                mat.setNombre(rs.getString("nombre"));
                mat.setAño(rs.getInt("año"));
                mat.setEstado(rs.getBoolean("estado"));
            } else {
                bm = "SELECT idMateria, nombre, año, estado FROM materia WHERE nombre=?";
                aux = mat.getNombre();
                try {
                    ps = con.prepareStatement(bm);
                    ps.setString(1, aux);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        mat.setIdMateria(rs.getInt("idMateria"));
                        mat.setNombre(rs.getString("nombre"));
                        mat.setAño(rs.getInt("año"));
                        mat.setEstado(rs.getBoolean("estado"));
                    } else {
                        JOptionPane.showMessageDialog(null, "La materia no existe");
                        mat.setIdMateria(0);
                    }
                } catch (SQLException ex) {

                }
            }
            ps.close();
        } catch (SQLSyntaxErrorException ex) {
            JOptionPane.showMessageDialog(null, "No existe materia con código '0'");
        } catch (SQLException ex) {

        }
        return mat;
    }

    public void eliminarMateria(int id) {
        String eliminarMateria = "UPDATE materia SET  estado = 0 WHERE idMateria =?";
        try {
            try (PreparedStatement ps = con.prepareStatement(eliminarMateria)) {
                ps.setInt(1, id);
                int fila = ps.executeUpdate();
            }
        } catch (SQLException ex) {

        }
    }

    public List<Materia> listarMateria() {
        ArrayList<Materia> listaMat = new ArrayList<>();
        try (PreparedStatement ps = con.prepareStatement("SELECT idMateria, nombre, año, estado FROM materia WHERE estado = 1")) {;
            try (ResultSet rs = ps.executeQuery();) {
                while (rs.next()) {
                    Materia materia = new Materia();
                    materia.setIdMateria(rs.getInt("idMateria"));
                    materia.setNombre(rs.getString("nombre"));
                    materia.setAño(rs.getInt("año"));
                    materia.setEstado(rs.getBoolean("estado"));
                    listaMat.add(materia);
                }
                ps.close();
            } catch (SQLException ex) {

            }
        } catch (SQLException ex) {

        }
        return listaMat;
    }

}
