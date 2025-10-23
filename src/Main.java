import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        Mammal.readMammalData();

        new Mammal(1, "Blue Whale", 79f, 418878, 242508);
        new Fish(1, "Whale Shark", 61.7f, 47000, "https://en.wikipedia.org/wiki/File:Similan_Dive_Center_-_great_whale_shark.jpg", "Rhincodon typus", "Chondrichthyes", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Whaleshark_scale.jpg/250px-Whaleshark_scale.jpg");
        new Birds(1,"Snowy Albatross",53.1f,28,"Diomedea Exulans",3.7f,"Vulnerable");

        for (Animals animal: Animals.getAnimals()) {
            System.out.println(animal);
        }

        Animals.summarize();
    }
}