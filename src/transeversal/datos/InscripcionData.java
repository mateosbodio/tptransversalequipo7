package transeversal.datos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import transeversal.entidades.Alumno;
import transeversal.entidades.Inscripcion;
import transeversal.entidades.Materia;



public class InscripcionData {

    private final Connection con;
    private AlumnoData aluGestion;
    private MateriaData matGestion;

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void cargarInscripcion(Inscripcion inscripcion) {
        String cargarInscripcion = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (?, ?, ?)";
        try {
            try (PreparedStatement ps = con.prepareStatement(cargarInscripcion, Statement.RETURN_GENERATED_KEYS)) {
                ps.setDouble(1, inscripcion.getNota());
                ps.setInt(2, inscripcion.getAlumno().getIdAlumno());
                ps.setInt(3, inscripcion.getMateria().getIdMateria());
                int filasAfectadas = ps.executeUpdate();

                if (filasAfectadas > 0) {
                    ResultSet rs = ps.getGeneratedKeys();
                    if (rs.next()) {
                        inscripcion.setIdInscripto(rs.getInt(1));
                    }
                    rs.close();
                    JOptionPane.showMessageDialog(null, "La inscripción se cargó correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo cargar la inscripción.");
                }
            }
        } catch (SQLException ex) {

            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar la inscripción: " + ex.getMessage());
        }
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {
        List<Inscripcion> lista = new ArrayList<>();
        String sql = "SELECT inscripcion.idMateria, materia.nombre, inscripcion.nota "
                + "FROM inscripcion JOIN materia ON (inscripcion.idMateria = materia.idMateria) "
                + "WHERE inscripcion.idAlumno = ?";

        try {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idAlumno);
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        Inscripcion inscrip = new Inscripcion();
                        Materia matt = new Materia();

                        matt.setIdMateria(rs.getInt("idMateria"));
                        matt.setNombre(rs.getString("nombre"));

                        inscrip.setMateria(matt);
                        inscrip.setNota(rs.getDouble("nota"));

                        lista.add(inscrip);
                    }
                }
            }
        } catch (SQLException ex) {

            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener las inscripciones: " + ex.getMessage());
        }

        return lista;
    }

    public List<Materia> obtenerMateriasCursadas(int idAlumno) {
        ArrayList<Materia> lista = new ArrayList<>();
        String sql = "SELECT inscripcion.idMateria, materia.nombre, materia.año, materia.estado "
                + "FROM inscripcion JOIN materia ON (inscripcion.idMateria = materia.idMateria) "
                + "WHERE inscripcion.idAlumno = ?";

        try {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idAlumno);
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        Materia matt = new Materia();
                        matt.setIdMateria(rs.getInt("idMateria"));
                        matt.setNombre(rs.getString("nombre"));
                        matt.setAño(rs.getInt("año"));
                        matt.setEstado(rs.getBoolean("estado"));
                        lista.add(matt);
                    }
                }
            }
        } catch (SQLException ex) {

            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener las materias cursadas: " + ex.getMessage());
        }

        return lista;
    }

    public List<Materia> obtenerMateriasNoCursadas(int idAlumno) {
        ArrayList<Materia> lista = new ArrayList<>();
        String sql = "SELECT materia.idMateria, materia.nombre, materia.año "
                + "FROM materia "
                + "WHERE materia.idMateria NOT IN (SELECT inscripcion.idMateria FROM inscripcion WHERE inscripcion.idAlumno = ?) "
                + "AND materia.estado = 1";

        try {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idAlumno);
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        Materia matt = new Materia();
                        matt.setIdMateria(rs.getInt("idMateria"));
                        matt.setNombre(rs.getString("nombre"));
                        matt.setAño(rs.getInt("año"));
                        lista.add(matt);
                    }
                }
            }
        } catch (SQLException ex) {

            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener las materias no cursadas: " + ex.getMessage());
        }

        return lista;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        try {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idAlumno);
                ps.setInt(2, idMateria);
                int filasEliminadas = ps.executeUpdate();

                if (filasEliminadas > 0) {
                    JOptionPane.showMessageDialog(null, "La inscripción fue anulada correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró una inscripción con los ID especificados");
                }
            }
        } catch (SQLException ex) {

            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al anular la inscripción: " + ex.getMessage());
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String actualizarNota = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        try {
            try (PreparedStatement ps = con.prepareStatement(actualizarNota)) {
                ps.setDouble(1, nota);
                ps.setInt(2, idAlumno);
                ps.setInt(3, idMateria);
                int filasActualizadas = ps.executeUpdate();

                if (filasActualizadas > 0) {
                    JOptionPane.showMessageDialog(null, "Se actualizó la nota correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró una inscripción con los ID especificados");
                }
            }
        } catch (SQLException ex) {

            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al actualizar la nota: " + ex.getMessage());
        }
    }

    public List<Alumno> obtenerAlumnosPorMateria(int idMateria) {
        ArrayList<Alumno> lista = new ArrayList<>();
        String obtenerAlumno = "SELECT alumno.dni, alumno.apellido, alumno.nombre, alumno.estado "
                + "FROM inscripcion JOIN alumno ON (inscripcion.idAlumno = alumno.idAlumno) WHERE idMateria = ?";
        try {
            try (PreparedStatement ps = con.prepareStatement(obtenerAlumno)) {
                ps.setInt(1, idMateria);
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        Alumno alum = new Alumno();
                        alum.setDni(rs.getInt("dni"));
                        alum.setApellido(rs.getString("apellido"));
                        alum.setNombre(rs.getString("nombre"));
                        alum.setEstado(rs.getBoolean("estado"));
                        lista.add(alum);
                    }
                }
            }
        } catch (SQLException ex) {

            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener alumnos por materia: " + ex.getMessage());
        }
        return lista;
    }

    public List<Materia> listaMaterias() {
        ArrayList<Materia> lista = new ArrayList<>();
        String sql = "SELECT idMateria, nombre, año, estado FROM materia";
        try {
            try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Materia matt = new Materia();
                    matt.setIdMateria(rs.getInt("idMateria"));
                    matt.setNombre(rs.getString("nombre"));
                    matt.setAño(rs.getInt("año"));
                    matt.setEstado(rs.getBoolean("estado"));
                    lista.add(matt);
                }
            }
        } catch (SQLException ex) {

            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener la lista de materias: " + ex.getMessage());
        }
        return lista;
    }

}
