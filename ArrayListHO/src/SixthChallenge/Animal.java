package SixthChallenge;

public class Animal {
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "--------------------" +
                "\nName:" + name +
                "\nSpecies: " + species + "\n";
    }
}
