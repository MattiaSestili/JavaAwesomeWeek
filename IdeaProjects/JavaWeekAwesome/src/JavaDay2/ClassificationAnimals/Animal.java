package JavaDay2.ClassificationAnimals;

/**
 * Created by student on 28-Jun-16.
 */
public class Animal {

    private String typeSpecies;
    private boolean sexualReproduction;
    private int age;

    public String getTypeSpecies() {
        return typeSpecies;
    }

    public void setTypeSpecies(String typeSpecies) {
        this.typeSpecies = typeSpecies;
    }

    public Animal() {}

    public Animal(String typeSpecies)
    {
        this.typeSpecies = typeSpecies;
    }
}
