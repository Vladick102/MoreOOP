package lotr;

public class ElfKick implements KickStrategy {
    public void kick(Character c1, Character c2) {
        int char1Power = c1.getPower();
        int char2Power = c2.getPower();
        if (char2Power < char1Power) {
            c2.setHp(0);
        } else {
            c2.setPower(char2Power - 1);
        }
    }
}
