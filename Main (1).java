package Clase12;

public class Main 
{
        public static void main(String args[])
        {
            Curso curso = new Curso("2h 30min",128.4,"colegio Max Plack");
    
            System.out.println(curso.getHoras());
            System.out.println(curso.getCosto());
            System.out.println(curso.getInstitucion());
           
    
            curso.setDocente(new Docente("Jose", "Martinez"));
            System.out.println("nombre del docente: "+curso.getDocente().getNombres());
            System.out.println("apellido del docente; "+curso.getDocente().getApellido());

            curso.setEstudiante(new Estudiante("Alonso", 12345678));
            System.out.println("nombre del alumno: "+curso.getEstudiante().getNombres());
            System.out.println("codigo del alumno: "+curso.getEstudiante().getCodigo());
           
        }
        
}
