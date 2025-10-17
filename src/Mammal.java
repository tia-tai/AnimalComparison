public class Mammal extends Animals{
    private int avgMass;

    public Mammal(int rank, String name, float length, int maxMass, int avgMass) {
        super(rank, name, length, maxMass);
        this.avgMass = avgMass;
    }

    public long getAvgMass() {
        return avgMass;
    }

    public void setAvgMass(int avgMass) {
        this.avgMass = avgMass;
    }

    public String toString() {
        return "All Mammals";
    }
}
