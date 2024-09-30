package lotr;

public class HobbitKick implements KickStrategy {
    public void kick(Character c1, Character c2) {
        toCry();
    }

    private void toCry() {
        System.out.println("Plaki Plaki...");
    }

}
