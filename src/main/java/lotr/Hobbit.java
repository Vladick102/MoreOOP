package lotr;

public class Hobbit extends Character {

    public Hobbit() {
        super(3, 0, new HobbitKick());
    }

    public String toString() {
        return "Hobbit" + super.toString();
    }
}
