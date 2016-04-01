
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String apellido;
    private String apellidoMadre;
    private String nombreCiudad;

    /**
     * Constructor for objects of class NameGenerator.
     */
    public NameGenerator(String nombre, String apellido, String apellidoMadre, String nombreCiudad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellidoMadre = apellidoMadre;
        this.nombreCiudad = nombreCiudad;
    }
    
    /**
     * Metodo que genera el nombre.
     */
    public String Nombre(String nombre, String apellido){
        String nombreDevolver = null;
        nombreDevolver = apellido.substring(0,3) + nombre.substring(0,3);
        return nombreDevolver;
    }
    
    /**
     * Metodo que genera el apellido.
     */
    public String Apellido(String apellidoMadre, String nombreCiudad){
        String apellidoDevolver = null;
        apellidoDevolver = apellidoMadre.substring(0,2) + nombreCiudad.substring(0,3);
        return apellidoDevolver;
    }
    
    /**
     * Metodo que imprime por pantalla el nombre y apellido generado.
     */
    public void generateStarWarsName(){
        System.out.println(Nombre(nombre,apellido) + " " + Apellido(apellidoMadre,nombreCiudad));
    }
}
