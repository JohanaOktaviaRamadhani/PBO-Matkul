package enemy;
import character.Hero;

public class MainEnemy extends Hero {

    public MainEnemy(String nama, int hp ) {
        super(nama, hp);
    }

    // Overriding attack
    @Override
    public void attack() {
        this.hp += 20; //ketika musuh nyerang hero ya enemy +20 hp tapi heronya yang -10 hp
    }

    // Overriding attack
    public void defend() {
        this.hp -= 20; // ini ketika bertahan atau diserang hp nya menjadi -20
    }

    //overloading yang di overriding
    public void defend(int damage) {
        this.hp -= damage; // ini ketika bertahan atau diserang hp nya menjadi - damage
    }

}
