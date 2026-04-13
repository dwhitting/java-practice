import java.util.Arrays;
public class BlueAstronaut extends Player implements Crewmate {
    private int numTasks;
    private int taskSpeed;

    public BlueAstronaut(String name, int susLevel, int numTasks, int taskSpeed) {
        super(name, susLevel);
        this.numTasks = numTasks;
        this.taskSpeed = taskSpeed;
    }
    public BlueAstronaut(String name) {
        super(name, 15);
        this.numTasks = 6;
        this.taskSpeed = 10;
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

    public void completeTask() {
        if (this.isFrozen()) {
            System.out.println("Frozen, can't complete tasks");
            return;
        }
        if (this.numTasks == 0) {
            return;
        }
        if (this.taskSpeed > 20) {
            this.numTasks -= 2;
        } else {
            this.numTasks -= 1;
        }
        if (this.numTasks < 0) {
            this.numTasks = 0;
        }
        if (this.numTasks == 0) {
            System.out.println("I have completed all my tasks");
            this.setSusLevel((int)(this.getSusLevel() / 2));
        }

    }

    public boolean equals(Object o) {
        BlueAstronaut  o2 = (BlueAstronaut)o;
        if (this.getName() == o2.getName() && this.isFrozen() == o2.isFrozen() &&
                this.getSusLevel() == o2.getSusLevel() && this.numTasks == o2.numTasks &&
                this.taskSpeed == o2.taskSpeed) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {

        if (this.getSusLevel() <= 15) {
            return super.toString() + String.format(" I have %d left over.", this.numTasks);
        } else {
            return (super.toString() + String.format(" I have %d left " +
                    "over.", this.numTasks)).toUpperCase();
        }


    }


}