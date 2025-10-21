import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Fish extends Animals {
    private String imageURL;
    private String binomialName;
    private String taxonomicClass;
    private String comparisonURL;
    static ArrayList<Fish> fishes = new ArrayList<Fish>();


    public Fish(int rank, String name, float length, int maxMass, String imageURL, String binomialName, String taxonomicClass, String comparisonURL) {
        super(rank, name, length, maxMass);
        this.imageURL = imageURL;
        this.binomialName = binomialName;
        this.taxonomicClass = taxonomicClass;
        this.comparisonURL = comparisonURL;
        fishes.add(this);
    }

    public static ArrayList<Fish> getFishes() {
        return fishes;
    }

    public static void setFishes(ArrayList<Fish> fishes) {
        Fish.fishes = fishes;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getBinomialName() {
        return binomialName;
    }

    public void setBinomialName(String binomialName) {
        this.binomialName = binomialName;
    }

    public String getTaxonomicClass() {
        return taxonomicClass;
    }

    public void setTaxonomicClass(String taxonomicClass) {
        this.taxonomicClass = taxonomicClass;
    }

    public String getComparisonURL() {
        return comparisonURL;
    }

    public void setComparisonURL(String comparisonURL) {
        this.comparisonURL = comparisonURL;
    }

    public String toString() {return getName() + " has a max mass of " + getMaxMass() + "lbs"; }


    public static void readFishData() {
        File myData = new File("FishData");
        Scanner myReader = new Scanner(myData);
        while (myReader.hasNextLine()) {
            String firstLine = myReader.nextLine();
            System.out.println(data);

            Scanner lineScanner = new Scanner(dataLine);
            lineScanner.useDelimiter("\t");
            // 1     1   Whale Shark   61.7f   47,000 lbs

            int rank = lineScanner.nextInt();
            String name = lineScanner.nextInt();
            float length = lineScanner.nextInt();
            int maxMass = lineScanner.nextInt();
            int peak = lineScanner.nextInt();

            String revenueChunk = lineScanner.next();
            revenueChunk = revenueChunk.replace()
            String imageURL = "https://en.wikipedia.org/wiki/File:Similan_Dive_Center_-_great_whale_shark.jpg";
            String binomialName = "Rhincodon Typus";
            String taxonomicClass = "Chondrichthyes";
            String comparisonURL = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Whaleshark_scale.jpg/250px-Whaleshark_scale.jpg";

            new  Fish(rank, name, length, maxMass, imageURL, binomialName, taxonomicClass, comparisonURL)
        }

        //create a fish object
        // 1     1   Whale Shark   61.7f   47,000 lbs
        int rank = 1;
        String name = "Whale Shark";
        float length = 61.7f;
        int maxMass = 47000;
        int peak = 1;
        String imageURL = "https://en.wikipedia.org/wiki/File:Similan_Dive_Center_-_great_whale_shark.jpg";
        String binomialName = "Rhincodon Typus";
        String taxonomicClass = "Chondrichthyes";
        String comparisonURL = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Whaleshark_scale.jpg/250px-Whaleshark_scale.jpg";

        new  Fish(rank, name, length, maxMass, imageURL, binomialName, taxonomicClass, comparisonURL);



    }
}
