import java.util.*;

public class Serie extends Contenido {
    
    public List<Temporada> temporadas = new ArrayList<>();

    public Temporada buscarTemporada (int numeroTemporada){
        for (Temporada temporada : this.temporadas){
            if(temporada.getNumero() == numeroTemporada){
                return temporada;
            }

        }
        return null;
    }
}
