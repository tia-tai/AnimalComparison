import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Fish extends Animals {
    //private String imageURL;
    private String binomialName;
    private String taxonomicClass;
    //private String comparisonURL;
    static ArrayList<Fish> fishes = new ArrayList<Fish>();


    public Fish(int rank, String name, float length, int maxMass, String binomialName, String taxonomicClass) {
        super(rank, name, length, maxMass);
        //this.imageURL = imageURL;
        this.binomialName = binomialName;
        this.taxonomicClass = taxonomicClass;
        //this.comparisonURL = comparisonURL;
        fishes.add(this);
    }

    public static ArrayList<Fish> getFishes() {
        return fishes;
    }

    public static void setFishes(ArrayList<Fish> fishes) {
        Fish.fishes = fishes;
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

    public String toString() {return getName() + " has a max mass of " + getMaxMass() + "lbs"; }


    public static void readFishData() throws Exception {
        File myData = new File("FishData");
        Scanner myReader = new Scanner(myData);
        myReader.nextLine();
        myReader.nextLine();
        myReader.nextLine();
        myReader.nextLine();

        while (myReader.hasNextLine()) {
            // Line 1
            //1	Whale shark	Rhincodon typus	Chondrichthyes
            String wholeFirstLine = myReader.nextLine();
            Scanner lineReader1 = new Scanner(wholeFirstLine);
            lineReader1.useDelimiter("\t");
            int rank = lineReader1.nextInt();
            String name = lineReader1.next();
            String binomialName = lineReader1.next();
            String taxonomicClass = lineReader1.next();

            // Line 2
            //        (Cartilaginous fish)
            String wholeSecondLine = myReader.nextLine();
            Scanner lineReader2 = new Scanner(wholeSecondLine);
            lineReader2.useDelimiter("\t");
            String taxonomicClass2 = lineReader2.next();
            taxonomicClass = taxonomicClass + taxonomicClass2;

            // Line 3
            //
            String wholeThirdLine = myReader.nextLine();

            // Line 4
            //21.5 tonnes (47,000 lb)[7]	18.8 metres (61.7 ft)[8]

            //String lengthChunk = lineScanner.next();
            //lengthChunk = lengthChunk.replace();
            float length = lineScanner.nextInt();

            //String massChunk = lineScanner.next();
            //massChunk = massChunk.replace();
            int maxMass = lineScanner.nextInt();



            new  Fish(rank, name, length, maxMass, binomialName, taxonomicClass);
        }
    }
}
