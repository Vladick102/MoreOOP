package lotr;

public class Elf extends Character {
    public Elf() {
        super(10, 10, new ElfKick());
    }

    public String toString() {
        return "Elf" + super.toString();
    }

}
