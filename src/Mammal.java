import java.util.ArrayList;

public class Mammal extends Animals{
    private int avgMass;
    static ArrayList<Mammal> mammals = new ArrayList<Mammal>();

    public Mammal(int rank, String name, float length, int maxMass, int avgMass) {
        super(rank, name, length, maxMass);
        this.avgMass = avgMass;
        mammals.add(this);
    }

    public static ArrayList<Mammal> getMammals() {
        return mammals;
    }

    public static void setMammals(ArrayList<Mammal> mammals) {
        Mammal.mammals = mammals;
    }

    public long getAvgMass() {
        return avgMass;
    }

    public void setAvgMass(int avgMass) {
        this.avgMass = avgMass;
    }

    public String toString() {
        return getName() + " has a max mass of " + getMaxMass() + "lb";
    }
}
