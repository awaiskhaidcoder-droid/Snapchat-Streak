public class Streak {
    private int streakID;
    private int currentStreak;
    private int highest;
    private String status;

    Streak(int ID) {
        this.streakID = ID;
        this.highest = 0;
        this.currentStreak = 0;
        this.status = "Active";
    }

    public int getStreakID() {
        return this.streakID;
    }

    public int getCurrentStreak() {
        return this.currentStreak;
    }

    public int getHighest() {
        return this.highest;
    }

    public String getStatus() {
        return this.status;
    }

    public void StreakCount() {
        if (getStatus().equals("Broken")) {
            System.out.println("Please restart th streak");
        } else {
            this.currentStreak++;
        }
        if (getCurrentStreak() > highest) {
            highest = currentStreak;
        }


    }

    public void breakStreak() {
        if (getStatus().equals("Broken")) {
            System.out.println("Streak is already breaked");
        } else {
            this.status = "Broken";
            this.currentStreak = 0;

        }
    }

    public void restart() {
        if (getStatus().equals("Active")) {
            System.out.println("You are already active");
        } else this.status = "Active";
    }

    public void display() {
        System.out.println("ID : " + getStreakID());
        System.out.println("current Streak : " + getCurrentStreak());
        System.out.println("Highest : " + getHighest());
        System.out.println("Status : " + getStatus());
    }
}
    class Main{
        static void main(String[] args) {
            Streak streak=new Streak(101);
            streak.StreakCount();
            streak.display();
            streak.StreakCount();
            streak.StreakCount();
            streak.StreakCount();
            streak.display();
            streak.breakStreak();
            streak.display();
            streak.StreakCount();
            streak.restart();
            streak.StreakCount();
            streak.StreakCount();
            streak.display();

        }
    }

