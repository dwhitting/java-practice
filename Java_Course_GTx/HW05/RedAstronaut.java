import java.util.Arrays;
public class RedAstronaut extends Player implements Impostor {
    private String skill;

    public RedAstronaut(String name, int susLevel, String skill) {
        super(name, susLevel);
        this.skill = skill.toLowerCase();
    }

    public RedAstronaut(String name) {
        this(name, 15, "experienced");
    }

    public void setSkill(String skill) {
        this.skill = skill.toLowerCase();
    }
    public String getSkill() {
        return this.skill;
    }

    public void emergencyMeeting() {

        if (this.isFrozen() == true) {
            System.out.println("Frozen player cannot call meeting");
            return;
        }

        Player[] internArr = this.getPlayers();
        Arrays.sort(internArr);
        boolean isGameOver = false;

        for (int i = internArr.length - 1; i >= 0; i--) {
            //System.out.println(internArr[i].getSusLevel());
            if (i != 0 && internArr[i] != this && internArr[i].isFrozen() == false &&
                    internArr[i].getSusLevel() != internArr[i-1].getSusLevel()) {

                internArr[i].frozen = true;
                if (this.gameOver()) {
                    isGameOver = true;
                }
                return;
            }
        }
        if (internArr[0] != this && internArr[0].isFrozen() == false) {
            internArr[0].frozen = true;
            if (this.gameOver()) {
                isGameOver = true;
            }
            return;
        }
    }


    public  void freeze(Player p) {
        boolean isGameOver = false;
        if (p instanceof Impostor) {
            return;
        }
        if (!(p instanceof Impostor) && !(this.isFrozen())) {
            if (this.getSusLevel() < p.getSusLevel()) {
                p.frozen = true;
            } else {
                this.setSusLevel((this.getSusLevel() *2));
            }
        }
        if (this.gameOver()) {
            isGameOver = true;
        }
    }

    public void sabotage(Player p) {
        if (p instanceof Impostor || this.isFrozen()) {
            return;
        }
        if (this.getSusLevel() < 20) {
            p.setSusLevel((int)(p.getSusLevel() * 1.5));
        } else {
            p.setSusLevel((int)(p.getSusLevel() * 1.25));
        }
    }

    public boolean equals(Object o) {
        RedAstronaut  o2 = (RedAstronaut)o;
        if (this.getName() == o2.getName() && this.isFrozen() == o2.isFrozen() &&
                this.getSusLevel() == o2.getSusLevel() && this.skill == o2.skill) {
                    return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return super.toString() + String.format(" I am an %s player!", this.skill);
    }

}