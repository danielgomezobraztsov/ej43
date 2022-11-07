
package dominio;
public class Localidad
{
    private int nDeHabitantes;
    private String nombre;
    
    public Localidad (String nombre_, int nDeHabitantes_)
    {
        nombre = nombre_;
        nDeHabitantes = nDeHabitantes_;
    }
    
    public int getNDeHabitantes()
    {
        return nDeHabitantes;
    }
    
    public void setNDeHabitantes(int nDeHabitantes)
    {
        this.nDeHabitantes = nDeHabitantes;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String toString()
    {
        return "localidad: "+nombre+ " habitantes: "+nDeHabitantes; 
    }
}
