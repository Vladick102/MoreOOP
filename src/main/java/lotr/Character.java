package lotr;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Character {
    protected int hp;
    protected int power;

    public void kick(Character c) {};

    public boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int h) {
        hp = h < 0 ? 0 : h;
    }

    public void setPower(int p) {
        power = p < 0 ? 0 : p;
    }

    public Character(int h, int p) {
        hp = h;
        power = p;
    }

    public Character() {
        hp = 1;
        power = 0;
    }

    @Override
    public String toString() {
        return "{hp=" + hp + ", power=" + power + "}";
    }
}

