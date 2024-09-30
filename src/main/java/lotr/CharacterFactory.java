package lotr;

import java.util.Random;

public class CharacterFactory {
    public Character createCharacter() {
        Character[] arr = {new Hobbit(), new Elf(), new King(), new Knight()};
        return arr[new Random().nextInt(4)];
    }
}
