public class Mammal extends Animals{
    private long avgMass;

    public Mammal(int rank, String name, float length, long maxMass, long avgMass) {
        super(rank, name, length, maxMass);
        this.avgMass = avgMass;
    }

    public long getAvgMass() {
        return avgMass;
    }

    public void setAvgMass(long avgMass) {
        this.avgMass = avgMass;
    }

    public String toString() {
        return "All Mammals";
    }
}
