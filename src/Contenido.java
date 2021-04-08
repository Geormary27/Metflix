import java.util.ArrayList;
import java.util.List;

public class Contenido {

    public String nombre;
    private Genero genero;
    private Idioma idiomaOrigen; //Idioma de Origen
    private int añoLanzamiento;

    //////////////////////////////////////////

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Genero getGenero(){
        return this.genero;
    }

    public void setGenero(Genero genero){
        this.genero = genero;
    }

    public Idioma idiomaOrigen(){
        return this.idiomaOrigen;
    }

    public void setIdiomaOrigen(Idioma idiomaOrigen){
        this.idiomaOrigen = idiomaOrigen;
    }

    public int añoLanzamiento(){
        return this.añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento){
        this.añoLanzamiento = añoLanzamiento;
    }

    //////////////////LISTAS////////////////////////

    
    public List<Genero> generos = new ArrayList<>();

    public List<Actor> actores = new ArrayList<>();

    public List<Personaje> personajes = new ArrayList<>();

    public List<Frase> frases = new ArrayList<>();

    public List<Director> directores = new ArrayList<>();

    public List<Productor> productores = new ArrayList<>();

    public List<Pelicula> peliculas = new ArrayList<>();


}
