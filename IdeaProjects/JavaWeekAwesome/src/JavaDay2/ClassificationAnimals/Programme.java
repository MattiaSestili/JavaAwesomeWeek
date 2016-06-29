package JavaDay2.ClassificationAnimals;

import java.util.ArrayList;
import java.util.Collection;

import static JavaDay2.ClassificationAnimals.Fish.*;

/**
 * Created by student on 28-Jun-16.
 */
public class Programme {

    public static void main (String[] args)
    {
        Collection<AnimalClass> fishs = new ArrayList<>();
        fishs.add(whiteShark);
        fishs.add(rainbowTrout);

        for (AnimalClass a : fishs)
        {
            System.out.println(a);
        }

    }
}
