public class Fish extends Animals {
    private String imageURL;
    private String binomialName;
    private String taxonomicClass;
    private String comparisonURL;

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

    public Fish(int rank, String name, float length, int maxMass, String imageURL) {
        super(rank, name, length, maxMass);
        this.imageURL = imageURL;
    }

    public String toString() {return "All Fish"; }
}
