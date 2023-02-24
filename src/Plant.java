public class Plant {
    private String name;
    private String nameInLatin;
    private boolean isAnnual;
    private String continentOfDistribution;
    private int growsUpToMeters;
    private boolean isEdible;

    //// Sukurti klasę Plant
    //        //Visi laukai turi būti private, turėti getterius ir setterius.
    //        //konstruktoriai - 2. tuščias ir su visais fieldais.
    //        //ToString()


    public String getName() {
        return name;
    }

    public String getNameInLatin() {
        return nameInLatin;
    }

    public boolean isAnnual() {
        return isAnnual;
    }

    public String getContinentOfDistribution() {
        return continentOfDistribution;
    }

    public int getGrowsUpToMeters() {
        return growsUpToMeters;
    }

    public boolean isEdible() {
        return isEdible;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameInLatin(String nameInLatin) {
        this.nameInLatin = nameInLatin;
    }

    public void setAnnual(boolean isAnnual) {
        this.isAnnual = isAnnual;
    }

    public void setContinentOfDistribution(String continentOfDistribution) {
        this.continentOfDistribution = continentOfDistribution;
    }

    public void setGrowsUpToMeters(int growsUpToMeters) {
        this.growsUpToMeters = growsUpToMeters;
    }

    public void setEdible(boolean isEdible) {
        this.isEdible = isEdible;
    }


    public Plant() {

    }

    public Plant(String name, String nameInLatin, boolean isAnnual, String continentOfDistribution, int growsUpToMeters, boolean isEdible) {
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.isAnnual = isAnnual;
        this.continentOfDistribution = continentOfDistribution;
        this.growsUpToMeters = growsUpToMeters;
        this.isEdible = isEdible;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", nameInLatin='" + nameInLatin + '\'' +
                ", isAnnual=" + isAnnual +
                ", continentOfDistribution='" + continentOfDistribution + '\'' +
                ", growsUpToMeters=" + growsUpToMeters +
                ", isEdible=" + isEdible +
                '}';
    }
}
