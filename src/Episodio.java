public class Episodio {
    private int numero;
    private String nombre;
    private int duracion; // en minutos
    private Director director;
    private String sinopsis;

    //GETTERS  //SETTERS

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

    ///////////DURACION///////////

    public int getDuracion(){
        return this.duracion;
    }
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }

    ///////////DIRECTOR///////////

    public Director getDirector(){
        return this.director;
    }
    public void setDirector(Director director){
        this.director = director;
    }

    ///////////SINOPSIS///////////
    
    public String getSinopsis(){
        return this.sinopsis;
    }
    public void setSinopsis(String sinopsis){
        this.sinopsis = sinopsis;
    }


    public void reproducir(){

        System.out.println(" ");

            System.out.println("Serie ");

        System.out.println(" ");

            System.out.println("Reproduciendo episodio: "+nombre+ " - Numero : "+numero);

        System.out.println(" ");

            System.out.println("Sinopsis: "+sinopsis);

        System.out.println(" ");

            

    

    }
}
