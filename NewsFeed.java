import java.util.ArrayList;

/**
 * Write a description of class NewsFeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed
{
    // Almacena una coleccion de objetos de tipo MessagePost
    private ArrayList<MessagePost> messages;
    // Almacena una coleccion de objetos de tipo PhotoPost
    private ArrayList<PhotoPost> photos;    

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        messages = new ArrayList<>();
        photos = new ArrayList<>();
    }

    /**
     * Añade a la coleccion un objeto de tipo MessagePost
     */
    public void addMessagePost(MessagePost mensaje)
    {
        messages.add(mensaje);
    }
    
    /**
     * Añade a la coleccion un objeto de tipo PhotoPost
     */
    public void addPhotoPost(PhotoPost foto)
    {
        photos.add(foto);
    }
    
    /**
     * Muesta informacion de todos los posts
     */
    public void show()
    {
        for (MessagePost mensaje : messages) {
            mensaje.display();
        }
        for (PhotoPost mensaje : photos) {
            mensaje.display();
        }
    }
}
