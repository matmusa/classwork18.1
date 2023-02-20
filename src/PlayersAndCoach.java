import java.time.LocalDate;

public class PlayersAndCoach extends Sportsmen {


    public PlayersAndCoach(String fullName, LocalDate age, double height, double weight) {
        super(fullName, age, height, weight);
    }

    @Override
    public String goalKeeper() {
        return "\n goal keeper -a player defending the team's goal, whose main goal is not to miss, leaving his goal locked. ";
    }

    @Override
    public String leftBack() {
        return "\n left back- a player extreme defenders who act to the right of the center and are located almost on the edge of the field. ";
    }

    @Override
    public String centreBack() {
        return "\n  centre back- a player extreme defenders who act to the right of the center and are located almost on the edge of the field. ";

    }

    @Override
    public String rightBack() {
        return " \n right back -a player extreme defenders who act to the  left of the center and are located almost on the edge of the field.  ";
    }

    @Override
    public String centreDevensiveiveBack() {
        return "\n centre devence back -a player specializing in performing defensive functions, located near the central axis of the field, next to his penalty area. ";
    }

    @Override
    public String rightMidfielders() {
        return "\n right midfielders -these guys tend to attack more than RB(PP)/LB(LZ), and at the same time, they are more defensive than RM(PP) /LM(LP). ";
    }

    @Override
    public String leftMidfielders() {
        return "\nleft midfielders - these guys tend to attack more than RB(PP)/LB(LZ), and at the same time, they are more defensive than RM(PP) /LM(LP).  ";
    }

    @Override
    public String rightWinger() {
        return "\n right winger-extreme attackers, more often they are called aggressive flank attackers who are able not only to make overhangs (Crossing) ";
    }

    @Override
    public String leftWinger() {
        return "\nleft wingers -extreme attackers, more often they are called aggressive flank attackers who are able not only to make overhangs (Crossing)";
    }

    @Override
    public String forward() {
        return "\nforward -the attacking player who is closest to the opponent's goal. First of all, the player must be able to realize his moments, being in the right place at the right time (Attackposition) and make a quick decision in them (Reactions). ";
    }

    @Override
    public String toString() {
        return "\n  Liverpool "+getFullName();
    }
}


