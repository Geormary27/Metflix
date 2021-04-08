public class Pelicula extends Contenido {

    private int duracion; // en minutos
    private Director director;
    private boolean filmadaEnIMAX;

    

    /////////////DURACION///////////

    public int getDuracion(){
        return this.duracion;
    }
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }

    /////////////DIRECTOR///////////

    public Director getDirector(){
        return this.director;
    }
    public void setDirector(Director director){
        this.director = director;
    }

    /////////////FILMADA EN IMAX///////////

    public boolean filmadaEnIMAX(){
        return this.filmadaEnIMAX;
    }
    public void setFilmadaEnIMAX(boolean filmadaEnIMAX){
        this.filmadaEnIMAX = filmadaEnIMAX;
    }

    


    public Pelicula buscarPelicula (String nombre){
        for (Pelicula pelicula : this.peliculas){
            if(pelicula.getNombre() == nombre){
                return pelicula;
            }

        }
        return null;
    }

    public void reproducir(){

        System.out.println(" ");

            System.out.println("Reproduciendo pelicula: "+nombre);

        System.out.println(" ");

    }
        
}
