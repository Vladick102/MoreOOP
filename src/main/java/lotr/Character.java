package lotr;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Character {
    protected int hp;
    protected int power;
    private KickStrategy kickStrategy;

    public void kick(Character c) {
        kickStrategy.kick(this, c);
    };

    public boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int h) {
        hp = h < 0 ? 0 : h;
    }

    public void setPower(int p) {
        power = p < 0 ? 0 : p;
    }

    public Character(int h, int p, KickStrategy kickSt) {
        hp = h;
        power = p;
        kickStrategy = kickSt;
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

