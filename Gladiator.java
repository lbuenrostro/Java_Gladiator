import java.util.Random;

public class Gladiator {
    public String name;
    public Integer health;
    public Integer rage;
    public Integer damageLow;
    public Integer damageHigh;
//    random is  assigned to rand
    Random rand = new Random();


    public Gladiator(String name, Integer health, Integer rage, Integer damageLow, Integer damageHigh){
        this.name = name;
        this.health = health;
        this.rage = rage;
        this.damageLow = damageLow;
        this.damageHigh = damageHigh;
    }

    public void attack(Gladiator defender){
        int strike = rand.nextInt(this.damageHigh) + this.damageLow;
        int good = rand.nextInt(100) + 1;
        if (good <= this.rage) {
            defender.health -= (strike * 2);
            this.rage = 0;
        }
        else{
            this.rage += 15;
            defender.health -= strike;
        }
    }

    public void heal(){
        if (this.rage >= 10) {
            this.health = Integer.min(100, this.health + 15);
            this.rage = Integer.max(0, this.rage - 10);
        } else {
            this.rage = 0;
        }

    }

//will return True if dead or False if not
    public boolean isDead(){
        return this.health <= 0;
    }
}
