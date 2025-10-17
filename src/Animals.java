public class Animals {
    private int rank;
    private String name;
    private float length;
    private long maxMass;

    public Animals(int rank, String name, float length, long maxMass) {
        this.rank = rank;
        this.name = name;
        this.length = length;
        this.maxMass = maxMass;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public long getMaxMass() {
        return maxMass;
    }

    public void setMaxMass(long maxMass) {
        this.maxMass = maxMass;
    }

    public String toString() {
        return "All Animals";
    }
}
