package JavaDay2.ClassificationAnimals;


/**
 * Created by student on 28-Jun-16.
 */
public class AnimalClass extends Animal {

    private boolean backbone = true;
    private String nameType;

    public AnimalClass(){}

    public AnimalClass(String nameType, String species)
    {
        super(species);
        this.nameType = nameType;
    }


    @Override
    public String toString()
    {
        return "Name: " + nameType + " type: " + getTypeSpecies() ;
    }
}

