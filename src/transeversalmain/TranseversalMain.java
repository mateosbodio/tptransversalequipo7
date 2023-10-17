package transeversalmain;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;
import transeversal.datos.AlumnoData;
import transeversal.datos.MateriaData;
import transeversal.entidades.Alumno;
import transeversal.entidades.Materia;

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
        
    //busqueda de alumno por dni.
        
        Alumno encontrado = ad1.buscarAlumnoPorDni(30200666);
        System.out.println("alumno encontrado " + encontrado);
    
    //busqueda de alumnos por listado.
       
        List<Alumno> listado = ad1.obtenerAlumnos();
        for (Alumno alumno : listado) {
            System.out.println(alumno);
        }
    //modificar nombre de alumno encontrado.
        encontrado.setNombre("Hugo Gabriel");
        ad1.modificarAlumno(encontrado);
    //eliminar alumno encontrado.
        ad1.eliminarAlumno(encontrado.getIdAlumno());

    //cargar materias.
       MateriaData md1= new MateriaData();
       Materia m1= new Materia();
       m1.setNombre("Laboratorio");
       m1.setAño(2);
       m1.setEstado(true);
       md1.cargarMateria(m1);

       Materia m2= new Materia();
       m2.setNombre("Lengua");
       m2.setAño(1);
       m2.setEstado(true);
       md1.cargarMateria(m2);
       
       Materia m3= new Materia();
       m3.setNombre("Matemática");
       m3.setAño(1);
       m3.setEstado(false);
       
      
    //metodo para mostar notas
    
    
    //no tocar el codigo de abajo.
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

    //metodo desincripccion.
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
