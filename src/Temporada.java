import java.util.ArrayList;
import java.util.List;

public class Temporada {
    
    private int numero;
    private String nombre; //Esto es el nombre de la temporada y no del capitulo
    public List<Episodio> episodios = new ArrayList<>();

    ///////////NUMERO///////////

    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    ///////////NOMBRE///////////
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }


    public Episodio buscarEpisodio(int numeroEpisodio){
        for(Episodio episodio : this.episodios){
            if(episodio.getNumero() == numeroEpisodio)
                return episodio;
        }
        return null;
    }
}
