package lotr;

public class GameManager {
    void fight(Character c1, Character c2) {
        int i = 0;
        while (c1.getHp() > 0 && c2.getHp() > 0) {
            if (i % 2 == 0) {
                c1.kick(c2);
                System.out.println(c1 + "kicked" + c2);
            } else {
                c2.kick(c1);
                System.out.println(c2 + "kicked" + c1);
            }
            i++;
        }
    }
}
