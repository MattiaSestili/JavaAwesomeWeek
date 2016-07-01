package domain;

/**
 * Created by student on 01-Jul-16.
 */
public enum Ram {
    FOUR(4), EIGHT(8), SIXTEEN(16);

    private int ramSize;

    Ram(int size) {
        this.ramSize = size;
    }

    int getRamSize()
    {
        return ramSize;
    }
}
