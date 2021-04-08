import java.util.ArrayList;
import java.util.List;

public class Metflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    //Metodo que inicializa el catalogo con las peliculas / series que querramos

    public void inicializarCatalogo(){
        
        //Pelis: 
        // 1) Titanic - 2) Batman: El caballero de la noche
        // 3) Mi Obra Maestra - 4) Toc Toc 
        // 5) Fragmentado - 6) El Pianista

        // Series:

        /////////////////-TITANIC-/////////////////////

        //Declaro una variable que apunta a una Pelicula

        Pelicula titanic;
        titanic = new Pelicula();

        //Estas ultimas dos lineas: Pelicula titanic = new Pelicula

        titanic.setNombre("Titanic");
        titanic.setAñoLanzamiento(1997);
        titanic.setDuracion(210); // 3hs 30 minutos

        //Generos Pelicula

        Genero genero = new Genero();
        genero.setNombre("Romance");
        titanic.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Catástrofe");
        titanic.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Épico");
        titanic.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Drama");
        titanic.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Drama histórico");
        titanic.generos.add(genero);

        //Actores

        Actor actor = new Actor();
        actor.nombre = "Leo DiCaprio";
        //Agrego a la lista de actores del objeto titanic
        titanic.actores.add(actor); 
        
        //metodo Add --> agregar a una lista

        actor = new Actor();
        actor.nombre = "Kate Winslet";
        titanic.actores.add(actor);

        //Personajes 

        Personaje personaje = new Personaje();
        personaje.nombre = "Jack Dawson";
        titanic.personajes.add(personaje);
        
        personaje = new Personaje();
        personaje.nombre = "Rose DeWitt Bukater";
        titanic.personajes.add(personaje);

        //Frases Personajes




        //Director

        Director director = new Director();
        director.nombre = "James Cameron";
        titanic.directores.add(director);

        //Recien ahora estoy agregando a Titanic al catalogo

        this.peliculas.add(titanic);

        /////////////////-BATMAN: EL CABALLERO DE LA NOCHE-/////////////////////

        Pelicula batman = new Pelicula();

        batman.setNombre("Batman: el caballero de la noche");
        batman.setAñoLanzamiento(2008);
        batman.setDuracion(152);

        //Generos

        genero = new Genero();
        genero.setNombre("Acción");
        batman.generos.add(genero);

        genero = new Genero(); 
        genero.setNombre("Película de superhéroes");
        batman.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Aventura");
        batman.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Suspenso");
        batman.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Crimen");
        batman.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Cine negro");
        batman.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Misterio");
        batman.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Drama");
        batman.generos.add(genero);

        //No voy a declarar otra variable actor, voy a rehusar 
        //Siempre primero antes rehusar se debe:
        //re instanciar

        actor = new Actor();
        actor.nombre = "Christian Bale";
        batman.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Michael Caine";
        batman.actores.add(actor);

        //Personajes 

        personaje = new Personaje();
        personaje.nombre = "Bruce Wayne / Batman";
        batman.personajes.add(personaje);

        personaje = new Personaje();
        personaje.nombre = "Alfred Pennyworth";
        batman.personajes.add(personaje);

        //Frases Personajes





        //Agrego director a la lista de directores del objeto titanic
        director = new Director();
        director.nombre ="Christopher Nolan";
        batman.directores.add(director);

        //Agrego la pelicula al catalogo
        
        this.peliculas.add(batman);

        /////////////////-MI OBRA MAESTRA-/////////////////////

        Pelicula miObraMaestra = new Pelicula();

        miObraMaestra.setNombre("Mi Obra Maestra");
        miObraMaestra.setAñoLanzamiento(2018);
        miObraMaestra.setDuracion(100);

        //Generos
        genero = new Genero();
        genero.setNombre("Comedia cinematográfica");
        miObraMaestra.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Comedia negra");
        miObraMaestra.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Drama");
        miObraMaestra.generos.add(genero);

        //Datos Actor

        actor = new Actor();
        actor.nombre = "Guillermo Francella";
        miObraMaestra.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Luis Brandoni";
        miObraMaestra.actores.add(actor);

        //Personajes 

        personaje = new Personaje();
        personaje.nombre = "Arturo Silva";
        miObraMaestra.personajes.add(personaje);

        personaje = new Personaje();
        personaje.nombre = "Renzo Nervi";
        miObraMaestra.personajes.add(personaje);

        //Frases personajes



        //Datos Director

        director = new Director();
        director.nombre = "Gastón Duprat";
        miObraMaestra.directores.add(director);

        this.peliculas.add(miObraMaestra);

        /////////////////-TOC TOC-/////////////////////


        Pelicula tocToc = new Pelicula();

        tocToc.setNombre("TOC TOC");
        tocToc.setAñoLanzamiento(2017);
        tocToc.setDuracion(96);

        genero = new Genero();
        genero.setNombre("Comedia");
        tocToc.generos.add(genero);

        actor = new Actor();
        actor.nombre = "Oscar Martínez"; 
        tocToc.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Rosa Elena García Echave / Rossy de Palma"; 
        tocToc.actores.add(actor);

        personaje = new Personaje();
        personaje.nombre = "Federico";
        tocToc.actores.add(actor);

        personaje = new Personaje();
        personaje.nombre = "Ana María Virginia Galindo de la Mata";
        tocToc.actores.add(actor);

        //Frase personaje

        director = new Director();
        director.nombre = "Vicente Villanueva";
        tocToc.directores.add(director);

        this.peliculas.add(tocToc);

        
        /////////////////-FRAGMENTADO-/////////////////////

        Pelicula fragmentado = new Pelicula();

        fragmentado.setNombre("Fragmentado");
        fragmentado.setAñoLanzamiento(2016);
        fragmentado.setDuracion(117);

        genero = new Genero();
        genero.setNombre("Terror psicológico");
        fragmentado.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Cine de terror");
        fragmentado.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Thiller");
        fragmentado.generos.add(genero);

        actor = new Actor();
        actor.nombre = "James McAvoy";
        fragmentado.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Anya Taylor-Joy";
        fragmentado.actores.add(actor);

        personaje = new Personaje();
        personaje.nombre = "Kevin Wendell Crumb";
        fragmentado.personajes.add(personaje);

        personaje = new Personaje();
        personaje.nombre = "Casey Cooke";
        fragmentado.personajes.add(personaje);

        this.peliculas.add(fragmentado);

        //franse personaje

        director = new Director();
        director.nombre = "Manoj Nelliyattu Shyamalan";
        fragmentado.directores.add(director);

        /////////////////-EL PIANISTA-/////////////////////

        Pelicula elPianista = new Pelicula();

        elPianista.setNombre("El Pianista");
        elPianista.setAñoLanzamiento(2002);
        elPianista.setDuracion(151);

        genero = new Genero();
        genero.setNombre("Música");
        elPianista.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Drama");
        elPianista.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Guerra");
        elPianista.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Drama histórico");
        elPianista.generos.add(genero);

        actor = new Actor();
        actor.nombre = "Adrien Nicholas Brody";
        elPianista.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Thomas Kretschmann";
        elPianista.actores.add(actor);

        personaje = new Personaje();
        personaje.nombre = "Władysław Szpilman";
        elPianista.personajes.add(personaje);

        personaje = new Personaje();
        personaje.nombre = "Wilm Hosenfeld";
        elPianista.personajes.add(personaje);

        //Frase personaje

        director = new Director();
        director.nombre = "Roman Polanski";
        elPianista.directores.add(director);

        this.peliculas.add(elPianista);

        //Series:
        // 1) How I Met Your Mother - // 2) The BigBang Theory
        // 3) New Amsterdam         - // 4) Madre Solo Hay Dos
        // 5) Lupin                 - // 6) La Casa De Papel

        /////////////////-HOW I MET YOUR MOTHER-/////////////////////

        Serie howIMetYM = new Serie();
        howIMetYM.setNombre("How I Met Your Mother");
        howIMetYM.setAñoLanzamiento(2005);

        //Generos 

        genero = new Genero();
        genero.setNombre("Comedia de situación");
        howIMetYM.generos.add(genero); 

        genero = new Genero();
        genero.setNombre("Comedia cinematográfica");
        howIMetYM.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Romance");
        howIMetYM.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Drama");
        howIMetYM.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Comedia romántica");
        howIMetYM.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Comedia dramática");
        howIMetYM.generos.add(genero);

        //Actores 

        actor = new Actor();
        actor.nombre = "Neil Patrick Harris";
        howIMetYM.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Cobie Smulders";
        howIMetYM.actores.add(actor);

        // Personaje 

        personaje = new Personaje();
        personaje.nombre = "Barney Stinson";
        howIMetYM.personajes.add(personaje);

        personaje = new Personaje();
        personaje.nombre = "Robin Scherbatsky";
        howIMetYM.personajes.add(personaje);

        // Frase personaje



        // Director 

        director = new Director();
        director.nombre = "Pamela Fryman";
        howIMetYM.directores.add(director);

        director = new Director();
        director.nombre = "Rob Greenberg";
        howIMetYM.directores.add(director);

        // Temporada 5

        Temporada temporada = new Temporada();
        temporada.setNumero(5);

        //Episodio 1

        Episodio episodio = new Episodio();
        episodio.setNombre("The last cigarrette");
        episodio.setNumero(11);

        //vinculo temporada con episodio 
        temporada.episodios.add(episodio);

        //Episodio 2

        episodio = new Episodio();
        episodio.setNombre("Definitions");
        episodio.setNumero(1);

        temporada.episodios.add(episodio);

        //Agrego la temporada

        howIMetYM.temporadas.add(temporada);

        //Temporada 3

        temporada = new Temporada();
        temporada.setNumero(3);

        //Episodio 1

        episodio = new Episodio();
        episodio.setNombre("Wait for it");
        episodio.setNumero(1);
        temporada.episodios.add(episodio);

        //Episodio 2 

        episodio = new Episodio();
        episodio.setNombre("Little Boys");
        episodio.setNumero(4);
        temporada.episodios.add(episodio);

        //Agrego la temporada
        howIMetYM.temporadas.add(temporada);

        //Aca esta todo la serie con 2 temporadas
        //Y cada una con 2 episodios
        this.series.add(howIMetYM);

        /////////////////-THE BIGBANG THEORY-/////////////////////

        Serie bbt = new Serie();
        bbt.setNombre("The Big Bang Theory");
        bbt.setAñoLanzamiento(2007);

        genero = new Genero();
        genero.setNombre("Comedia de situación");
        bbt.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Telecomedia");
        bbt.generos.add(genero);

        actor = new Actor();
        actor.nombre = "Jim Parsons";
        bbt.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Kaley Cuoco";
        bbt.actores.add(actor);

        personaje = new Personaje();
        personaje.nombre = "Sheldon Cooper";
        bbt.personajes.add(personaje);

        personaje = new Personaje();
        personaje.nombre = "Penny";
        bbt.personajes.add(personaje);

        //Frases personaje

        director = new Director();
        director.nombre = "Mark Cendrowski";
        bbt.directores.add(director);

        //Temporada 1

        temporada = new Temporada();
        temporada.setNumero(1);

        //Episodio 1

        episodio = new Episodio();
        episodio.setNombre("Pilot");
        episodio.setNumero(1);
        temporada.episodios.add(episodio);

        //Episodio 2

        episodio = new Episodio();
        episodio.setNombre("The Cooper-Hofstadter Polarization");
        episodio.setNumero(7);
        temporada.episodios.add(episodio);

        //Es una temporada con dos episodios

        //Agrego la temporada
        bbt.temporadas.add(temporada);

        this.series.add(bbt);

        /////////////////-NEW AMSTERDAM-/////////////////////

        Serie newA = new Serie();
        newA.setNombre("New Amsterdam");
        newA.setAñoLanzamiento(2018);

        genero = new Genero();
        genero.setNombre("Drama médico");
        newA.generos.add(genero);

        actor = new Actor();
        actor.nombre = "Ryan Eggold";
        newA.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Freema Agyeman";
        newA.actores.add(actor);

        personaje = new Personaje();
        personaje.nombre = "Dr. Max Goodwin";
        newA.personajes.add(personaje);

        personaje = new Personaje();
        personaje.nombre = "Dra. Helen Sharpe";
        newA.personajes.add(personaje);

        //Frases personajes

        director = new Director();
        director.nombre = "Eric Manheimer";
        newA.directores.add(director);
        
        //Temporada 1

        temporada = new Temporada();
        temporada.setNumero(1);

        episodio = new Episodio();
        episodio.setNombre("Santuario");
        episodio.setNumero(17);
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.setNombre("Luna");
        episodio.setNumero(22);
        temporada.episodios.add(episodio);

        newA.temporadas.add(temporada);

        //Temporada 2 

        temporada = new Temporada();
        temporada.setNumero(2);

        episodio = new Episodio();
        episodio.setNombre("Me oculto detrás de mi sonrisa");
        episodio.setNumero(11);
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.setNombre("Doble ciego");
        episodio.setNumero(15);
        temporada.episodios.add(episodio);

        newA.temporadas.add(temporada);

        this.series.add(newA);


        /////////////////-MADRE SOLO HAY DOS-/////////////////////

        Serie mSoloHD = new Serie();
        mSoloHD.setNombre("Madre Solo Hay Dos");
        mSoloHD.setAñoLanzamiento(2021);

        genero = new Genero();
        genero.setNombre("Drama");
        mSoloHD.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Comedia");
        mSoloHD.generos.add(genero);
        
        actor = new Actor();
        actor.nombre = "Ludwika Paleta";
        mSoloHD.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Paulina Goto";
        mSoloHD.actores.add(actor);

        personaje = new Personaje();
        personaje.nombre = "Ana Servín";
        mSoloHD.personajes.add(personaje);

        personaje = new Personaje();
        personaje.nombre = "Mariana Herrera";
        mSoloHD.personajes.add(personaje);

        //Frases personajes 

        director = new Director();
        director.nombre = "Carolina Rivera";
        mSoloHD.directores.add(director);

        //Temporada

        temporada = new Temporada();
        temporada.setNumero(1);

        //Episodio

        episodio = new Episodio();
        episodio.setNombre("Chin-chan-pú");
        episodio.setNumero(1);
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.setNombre("El bautizo");
        episodio.setNumero(9);
        temporada.episodios.add(episodio);

        //Agrego serie

        mSoloHD.temporadas.add(temporada);

        this.series.add(mSoloHD);

        /////////////////-LUPIN-/////////////////////

        Serie lupin = new Serie();
        lupin.setNombre("Lupin");
        lupin.setAñoLanzamiento(2021);

        genero = new Genero();
        genero.setNombre("Acción");
        lupin.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Thriller");
        lupin.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Drama");
        lupin.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Crimen");
        lupin.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Misterio");
        lupin.generos.add(genero);

        actor = new Actor();
        actor.nombre = "Omar Sy"; 
        lupin.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Vincent Londez";
        lupin.actores.add(actor);

        personaje = new Personaje();
        personaje.nombre = "Assane Diop";
        lupin.personajes.add(personaje);   

        personaje = new Personaje();
        personaje.nombre = "Capitán Romain Laugier";
        lupin.personajes.add(personaje);
        
        //Frase personaje

        director = new Director();
        director.nombre = "Marcela Said";
        lupin.directores.add(director);

        //Temporada

        temporada = new Temporada();
        temporada.setNumero(1);

        episodio = new Episodio();
        episodio.setNombre("Capitulo 1");
        episodio.setNumero(1);
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.setNombre("Capitulo 3");
        episodio.setNumero(3);
        temporada.episodios.add(episodio);

        lupin.temporadas.add(temporada);

        this.series.add(lupin);

        
        /////////////////-LA CASA DE PAPEL-/////////////////////

        Serie laCDP = new Serie();
        laCDP.setNombre("La Casa De Papel");
        laCDP.setAñoLanzamiento(2017);

        genero = new Genero();
        genero.setNombre("Robos");
        laCDP.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Drama");
        laCDP.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Thriller");
        laCDP.generos.add(genero);

        genero = new Genero();
        genero.setNombre("Crimen");
        laCDP.generos.add(genero);

        actor = new Actor();
        actor.nombre = "Álvaro Morte";
        laCDP.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Alba Flores";
        laCDP.actores.add(actor);

        personaje = new Personaje();
        personaje.nombre = "«El Profesor» / Sergio Marquina / Salvador Martín";
        laCDP.personajes.add(personaje);

        personaje = new Personaje();
        personaje.nombre = "«Nairobi» / Ágata Jiménez";
        laCDP.personajes.add(personaje);

        //Frases personaje

        director = new Director();
        director.nombre = "Álex Rodrigo";
        laCDP.directores.add(director);

        //Temporada 

        temporada = new Temporada();
        temporada.setNumero(1);

        //Episodio 1

        episodio = new Episodio();
        episodio.setNombre("Episodio 1");

        episodio.setSinopsis("El profesor recluta a una joven ladrona y a otros siete criminales para asaltar la Fabrica Nacional de Moneda y Timbre de España.");

        episodio.setNumero(1);
        temporada.episodios.add(episodio);

        //Episodio 2
        
        episodio = new Episodio();
        episodio.setNombre("Episodio 10");
        
        episodio.setSinopsis("Raquel entra a la Fábrica Nacional de Moneda y Timbre para confirmar que los rehenes estén a salvo. Nairobi le da consejos a Alison.");

        episodio.setNumero(10);
        temporada.episodios.add(episodio);

        //Agrego todo

        laCDP.temporadas.add(temporada);

        this.series.add(laCDP);

    }

    //Buscar pelicula 

    public Pelicula buscarPelicula(String nombreABuscarPelicula){

        for (Pelicula pelicula : this.peliculas){
            
            if (pelicula.getNombre().equals(nombreABuscarPelicula))
                return pelicula;
        }

        return null;
    }

    //Buscar Serie

    public Serie buscarSerie(String nombreABuscar){

        //Serie = | serie1 | serie2 | serie25 | serie40 |
        //vamos a usar el FOREACH: que sirve para recorrer listas
        //este ciclo, tiene una variable, que apunta en cada vuelta
        //a cada elemento de la lista
        //o sea la primera vez, va a apuntar a serie1, despues a serie2
        //despues a serie 25 hasta terminar.

        for(Serie serie : this.series){
            
            //pregunto si el nombre de la serie actual
            //que estoy recorriendo es la que necesito

            if (serie.getNombre().equals(nombreABuscar))
                return serie; //devuelvo esta serie.
        }

        //Si llego hasta aca, es porque no encontro la serie

        return null;

    }
    

}
