package JavaDay3.FactoryPattern;

/**
 * Created by student on 29-Jun-16.
 */
public class Husky extends Dog implements Robotic {

    @Override
    public void Speak() {
        System.out.println("Husky say I am handsome");
    }

    @Override
    public Object trackObject() {
        return null;
    }

    @Override
    public void remoteControl() {

    }
}
