public class App {
    public static void main(String[] args) throws Exception {

        //A partir de Metflix, buscar la temporada 5 episodio 1
        //de la serie HOW I MET YOUR MOTHER 
        //y reproducir

        Metflix miMetflix = new Metflix();

        System.out.println(" ");

        System.out.println("Inicializando catalogo de Metflix");

        miMetflix.inicializarCatalogo(); //Estoy llamando al metodo que crea las pelis y series

        


        Pelicula peliculaBuscada = miMetflix.buscarPelicula("Batman: el caballero de la noche");

        System.out.println(" ");

        if (peliculaBuscada == null) {

            System.out.println("No se encontró la pelicula");

            return;
        }

        Pelicula pelicula = peliculaBuscada.buscarPelicula("Batman: el caballero de la noche");

        pelicula.reproducir();


        /////////////////////////////SERIE////////////////////////////////////////
        
        Serie serieBuscada = miMetflix.buscarSerie("How I Met Your Mother");

        System.out.println(" ");

        if (serieBuscada == null) {

            System.out.println("No se encontró la serie");

            return;
        }

        Temporada temporada = serieBuscada.buscarTemporada(5);

        Episodio episodio = temporada.buscarEpisodio(1);

        episodio.reproducir();


    }
}

