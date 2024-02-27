import java.util.Random;

class Boxer {
    private String name;
    private int health;
    public Boxer(String name, int health) {
        this.name = name;
        this.health = health;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public void punch(Boxer opponent) {
        Random random = new Random();
        int damage = random.nextInt(10) + 1;
        opponent.health -= damage;
        System.out.println(this.name + " hits " + opponent.name + " for " + damage + " damage.");
    }
    public boolean isKnockedOut() {
        return health <= 0;
}
public class Boks {
    public static void main(String[] args) {
        Boxer boxer1 = new Boxer("Mike Tyson", 100);
        Boxer boxer2 = new Boxer("Muhammad Ali", 100);

        Random random = new Random();
        boolean isFirstBoxerMikeTyson = random.nextBoolean();

        System.out.println("The match starts!");

        while (true) {
            if (isFirstBoxerMikeTyson) {
                boxer1.punch(boxer2);
                if (boxer2.isKnockedOut()) {
                    System.out.println(boxer1.getName() + " wins the match!");
                    break;
                }
                boxer2.punch(boxer1);
                if (boxer1.isKnockedOut()) {
                    System.out.println(boxer2.getName() + " wins the match!");
                    break;
                }
            } else {
                boxer2.punch(boxer1);
                if (boxer1.isKnockedOut()) {
                    System.out.println(boxer2.getName() + " wins the match!");
                    break;
                }
                boxer1.punch(boxer2);
                if (boxer2.isKnockedOut()) {
                    System.out.println(boxer1.getName() + " wins the match!");
                    break;
                }
            }
        }
    }
}
