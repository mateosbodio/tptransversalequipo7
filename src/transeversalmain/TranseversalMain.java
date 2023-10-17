package transeversalmain;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;
import transeversal.datos.AlumnoData;
import transeversal.entidades.Alumno;

public class TranseversalMain {

    public static void main(String[] args) {

        //ALUMNOS
        int dni = 30200666;
        String apellido = "Torrez";
        String nombre = "Gabriel";
        LocalDate fechaNac = LocalDate.of(2000, 01, 15);
        boolean estado = true;
        Alumno a1 = new Alumno(dni, apellido, nombre, fechaNac, estado);
        AlumnoData ad1 = new AlumnoData();
            ad1.guardarAlumno(a1);
//      Alumno encontrado = ad1.buscarAlumnoPorDni(30200666);
//        System.out.println("alumno encontrado " + encontrado);
//
//        List<Alumno> listado = ad1.obtenerAlumnos();
//        for (Alumno alumno : listado) {
//            System.out.println(alumno);
//        }
//        encontrado.setNombre("Hugo Gabriel");
//        ad1.modificarAlumno(encontrado);
//
//        ad1.eliminarAlumno(encontrado.getIdAlumno());

        
        int dni2 = 32465789 ;
        String apellido2 = "Sbodio";
        String nombre2 = "Mateo";
        LocalDate fechaNac2 = LocalDate.of(1995, 04, 01);
        boolean estado2 = true;
        
        Alumno a2 = new Alumno(dni2, apellido2, nombre2, fechaNac2, estado2);
        ad1.guardarAlumno(a2);
        
        int dni3 = 33989017 ;
        String apellido3 = "Rios";
        String nombre3 = "Julian";
        LocalDate fechaNac3 = LocalDate.of(1990, 02, 10);
        boolean estado3 = true;
        
        Alumno a3 = new Alumno(dni3, apellido3, nombre3, fechaNac3, estado3);
        ad1.guardarAlumno(a3);
        
        int dni4 = 38657365 ;
        String apellido4 = "Suarez";
        String nombre4 = "Martin";
        LocalDate fechaNac4 = LocalDate.of(1999, 07, 15);
        boolean estado4 = true;
        
        Alumno a4 = new Alumno(dni4, apellido4, nombre4, fechaNac4, estado4);
        ad1.guardarAlumno(a4);
        
        int dni5 = 35435365 ;
        String apellido5 = "Sturniolo";
        String nombre5 = "Bruno";
        LocalDate fechaNac5 = LocalDate.of(1992, 03, 17);
        boolean estado5 = true;
        
        Alumno a5 = new Alumno(dni5, apellido5, nombre5, fechaNac5, estado5);
        ad1.guardarAlumno(a5);

        
//            ps.setInt(1, dni);
//            ps.setString(2, apellido);
//            ps.setString(3, nombre);
//            ps.setString(4, fechaNac);
//            ps.setBoolean(5, estado);
//            ps.executeUpdate();
//
//            int dni1 = 30200022;
//            String apellido1 = "Rios";
//            String nombre1 = "Julian";
//            String fechaNac1 = "2000-01-23";
//            boolean estado1 = true;
//
//            ps.setInt(1, dni1);
//            ps.setString(2, apellido1);
//            ps.setString(3, nombre1);
//            ps.setString(4, fechaNac1);
//            ps.setBoolean(5, estado1);
//            ps.executeUpdate();
//
//            int dni2 = 57846786;
//            String apellido2 = "Sturniolo";
//            String nombre2 = "Bruno";
//            String fechaNac2 = "2000-05-04";
//            boolean estado2 = true;
//
//            ps.setInt(1, dni2);
//            ps.setString(2, apellido2);
//            ps.setString(3, nombre2);
//            ps.setString(4, fechaNac2);
//            ps.setBoolean(5, estado2);
//            ps.executeUpdate();
//            
//            int dni3 = 54587521;
//            String apellido3 = "Suarez";
//            String nombre3 = "Martin";
//            String fechaNac3 = "2000-07-10";
//            boolean estado3 = false;
//
//            ps.setInt(1, dni3);
//            ps.setString(2, apellido3);
//            ps.setString(3, nombre3);
//            ps.setString(4, fechaNac3);
//            ps.setBoolean(5, estado3);
//            ps.executeUpdate();
//            
//            int dni4 = 45674872;
//            String apellido4 = "Sbodio";
//            String nombre4 = "Mateo";
//            String fechaNac4 = "2000-06-17";
//            boolean estado4 = true;
//
//            ps.setInt(1, dni4);
//            ps.setString(2, apellido4);
//            ps.setString(3, nombre4);
//            ps.setString(4, fechaNac4);
//            ps.setBoolean(5, estado4);
//            ps.executeUpdate();
//            System.out.println("Se cargo el alumno correctamente");
//        } catch (SQLException e) {
//            System.err.println("Error al cargar datos: " + e.getMessage());
//        }
//
//       String sql1 = "INSERT INTO materia (nombre, año, estado) VALUES (?, ?, ?)";
//
//        try (PreparedStatement ps = con.prepareStatement(sql1)) {
//            //  materia
//            ps.setString(1, "Laboratorio"); 
//            ps.setInt(2, 2023); 
//            ps.setBoolean(3, true); 
//            ps.executeUpdate();
//
//            System.out.println("Se cargo la materia.");
//        } catch (SQLException e) {
//            System.err.println("Error al cargar datos: " + e.getMessage());
//
//        }
//      //metodo para mostar notas
//        String consulta = "SELECT a.idAlumno, a.dni, a.apellido, a.nombre, i.nota, m.nombre AS nombreMateria "
//                + "FROM alumno a "
//                + "INNER JOIN inscripcion i ON a.idAlumno = i.idAlumno "
//                + "INNER JOIN materia m ON i.idMateria = m.idMateria "
//                + "WHERE i.nota >= 8";
//
//        try (PreparedStatement ps = con.prepareStatement(consulta); 
//                ResultSet rs = ps.executeQuery()) {
//
//            while (rs.next()) {
//                int idAlumno = rs.getInt("idAlumno");
//                int dni = rs.getInt("dni");
//                String apellido = rs.getString("apellido");
//                String nombre = rs.getString("nombre");
//                int nota = rs.getInt("nota");
//                String nombreMateria = rs.getString("nombreMateria");
//
//                System.out.println("ID Alumno: " + idAlumno + ", DNI: " + dni + ", Apellido: " + apellido + ", Nombre: " + nombre + ", Nota: " + nota + ", Materia: " + nombreMateria);
//            }
//        } catch (SQLException e) {
//            System.out.println("error"+e.getMessage());
//        }
//
//
////metodo desincripccion.
//
// try {
//            PreparedStatement ps = null;
//            int idAlumno = 1; 
//            int idMateria = 1; 
//            String consulta1 = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
//            ps = con.prepareStatement(consulta1);
//                   
//            ps.setInt(1, idAlumno);
//            ps.setInt(2, idMateria);
//           
//            int filasAfectadas = ps.executeUpdate();
//            if (filasAfectadas > 0) {
//                System.out.println("desinscripcin ok.");
//            } else {
//                System.out.println("No hay  registros para desinscribir.");
//            }
//        } catch (SQLException e) {
//            System.err.println("Error: " + e.getMessage());
//        }
    }

}
