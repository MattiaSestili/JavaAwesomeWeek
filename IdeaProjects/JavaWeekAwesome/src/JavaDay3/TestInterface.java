package JavaDay3;

/**
 * Test Interface
 * Created by student on 29-Jun-16.
 */
interface CallBack
{
    void callback(int param); // no implementation;
}

class Client implements CallBack
{
    @Override
    public void callback(int param)
    {
        System.out.println("Callback with a Limo!");
    }
}

class AnotherClient implements CallBack
{
    @Override
    public void callback(int param)
    {
        System.out.println("Callback without a Limo!");
    }
}

public class TestInterface
{

}
