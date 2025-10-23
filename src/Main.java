import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        Mammal.readMammalData();
        Fish.readFishData();

        new Birds(1,"Snowy Albatross",53.1f,28,"Diomedea Exulans",3.7f,"Vulnerable");

        for (Animals animal: Animals.getAnimals()) {
            System.out.println(animal);
        }

        Animals.summarize();
    }
}