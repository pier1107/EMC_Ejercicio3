package Clase12;

public class Estudiante 
{
    private String nombres;

    private int codigoAlum;



    Estudiante(String nombres, int cod)
{
    setNombre(nombres);
    setCodigo(cod);
    
}
    void setNombre(String nombres)
    {
        this.nombres= nombres;
    }

    String getNombres()
    {
      return nombres;
    }

    void setCodigo(int cod)
    {
        codigoAlum=cod;
    }
    int getCodigo()
    {
        return codigoAlum;
    }
    
}
