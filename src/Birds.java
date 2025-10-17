class Birds extends Animals{
    // fields
    String scientificlName;
    float wingSpan;
    String conservationStatus;

    public Birds(int rank, String name, float length, int maxMass, String scientificlName, float wingSpan, String conservationStatus) {
        super(rank, name, length, maxMass);
        this.scientificlName = scientificlName;
        this.wingSpan = wingSpan;
        this.conservationStatus = conservationStatus;
    }

    public String getScientificlName() {
        return scientificlName;
    }

    public void setScientificlName(String scientificlName) {
        this.scientificlName = scientificlName;
    }

    public float getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(float wingSpan) {
        this.wingSpan = wingSpan;
    }

    public String getConservationStatus() {
        return conservationStatus;
    }

    public void setConservationStatus(String conservationStatus) {
        this.conservationStatus = conservationStatus;
    }


    // methods
    public String toString() {return "All Birds"; }


}
