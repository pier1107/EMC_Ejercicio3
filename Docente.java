package Clase12;

public class Docente {

    private String nombre;

    private String apellido;

    Docente(String nombre, String apell)
{
    setNombre(nombre);
    setApellido(apell);
  
    
    
}
    void setNombre(String nombre)
    {
        this.nombre= nombre;
    }

    String getNombres()
    {
      return nombre;
    }

    void setApellido(String apell)
    {
        apellido = apell;
    }
    String getApellido()
    {
        return apellido;
    }
   
    
}
