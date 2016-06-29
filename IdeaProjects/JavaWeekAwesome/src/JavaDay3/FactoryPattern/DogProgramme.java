package JavaDay3.FactoryPattern;

/**
 * Created by student on 29-Jun-16.
 */
public class DogProgramme {
    public static void main(String[] args)
    {
        Dog dog = DogFactory.makeDog(DogBreed.HUSKY);
        dog.bark();
        dog.doubleCoat = true;
        Husky husky1 = (Husky) dog;
        husky1.Speak();

        Dog dog2 = DogFactory.makeDog(DogBreed.LABRADOR);
    }
}
