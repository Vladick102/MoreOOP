package lotr;

import java.util.Random;

public class Noble extends Character {

    public Noble(int lowerBound, int upperBound) {
        super(new Random().nextInt(upperBound - lowerBound + 1) + lowerBound,
                new Random().nextInt(upperBound - lowerBound + 1) + lowerBound);
    }
}
