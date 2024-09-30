package lotr;

import java.util.Random;

public class NobleKick implements KickStrategy {

    public void kick(Character c1, Character c2) {
        int char2HP = c2.getHp();
        c2.setHp(char2HP - new Random().nextInt(c1.getPower()));
    }
}
