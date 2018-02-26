import java.util.ArrayList;

/**
 * Exemple de début de pattern builde sur Pizza
 */

public class Pizza {
    private int largeur;
    private int longueur;
    private List<Cellule> cels = new ArrayList<Cellule>();
    
    public ArrayList<Integer> videos;

    public Cache(int capacity) {
        this.capacity = capacity;
        this.videos = new ArrayList<Integer>();
    }

    public void addVideo(int id, int size) {
        if (videos.contains(id)) { return; }
        videos.add(id);
        this.capacity -= size;
    }
}
