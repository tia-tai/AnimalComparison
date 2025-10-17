class Birds extends Animals{
    // fields
    String scientificlName;
    float wingSpan;
    String conservationStatus;

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

    public Birds(int rank, String name, float length, int maxMass, String scientificlName) {
        super(rank, name, length, maxMass);
        this.scientificlName = scientificlName;
    }


    // methods
    public String toString() {return "All Birds"; }


}
