package dominio;
public class Municipio
{
	private String nombre;
	private ArrayList<Localidad>
		localidades;
	
	public Municipio(String nombre_, Localidad localidades_)
	{
		nombre = nombre_;
		localidades = localidades;
	}
	
	public Municipio add(Localidad l)
	{
		localidades.add(l);
		return this;
	}
	
	public String getNombre()
    {
        return nombre;
    }
	
	public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
}