import java.util.ArrayList;

/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost
{
    // Almacena el nombre de usuario
    private String username;
    // Almacena un mensaje
    private String message;
    // Almacena  la cantidad de milisegundos trasncurridos entre el mometo en el que se crea el post y la medianoche del 1 de enero de 1970
    private long timestamp;
    // Almacena el numero de likes
    private int likes;
    // Almacena los comentarios en una lista
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
        username = author;
        message = text;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }
    
    /**
     * Añade un "me gusta"
     */
    public void like()
    {
        likes++;
    }
    
    /**
     * Qhita un like
     */
    public void unlike()
    {
        if (likes > 0) {
            likes--;
        }
    }
    
    /**
     * Añade un comentario
     */
    public void addComment(String text)
    {
        comments.add(text);
    }
    
    /**
     * Devuelve el comentario que se ha hecho
     */
    public String getText()
    {
        return message;
    }
    
    /**
     * Devuelve el tiempo desde que se creo el post
     */
    public long getTimeStamp()
    {
        return timestamp;
    }
    
    /**
     * Mustra todas las caracteristicas de las entradas
     */
    public void display()
    {         
        System.out.println("Autor: " + username);
        System.out.println("Mensaje: " + message);
        System.out.println("Likes: " + likes);
        System.out.println("Comentarios: " + likes);
        
        if (comments.size() == 0) {
            System.out.println("    No hay comentarios");
        }
        else {
            for (int i = 0; i < comments.size(); i++) {
                System.out.println("    - " + comments.get(i));
            }
        }             
        
        System.out.println("Creado hace " + timeString(timestamp));        
    }
    
    /**
     * 
     */
    public String timeString(long time)
    {
        long principio = timestamp;
        long fin = System.currentTimeMillis();;
        long tiempoMilesimas;
        float tiempoSegundos;
        int tiempoMinutos = 0;
        tiempoMilesimas = fin - principio;
        tiempoSegundos = tiempoMilesimas / 1000.0f;
        while (tiempoSegundos > 59) {
            if (tiempoSegundos > 59) {
                tiempoMinutos++;
                tiempoSegundos = tiempoSegundos - 59;
           }
        }
        return tiempoMinutos + " minutos y " + tiempoSegundos + " segundos";
    }
}