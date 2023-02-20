import java.time.LocalDate;
import java.time.Period;

public class JoelMatip extends Sportsmen {
    public JoelMatip(String fullName, LocalDate age, double height, double weight) {
        super(fullName, age, height, weight);
    }
    @Override
    public String forward() {
        return null;
    }
    @Override
    public String goalKeeper() {
        return null;
    }

    @Override
    public String leftBack() {
        return null;
    }

    @Override
    public String centreBack() {
        return null;
    }

    @Override
    public String rightBack() {
        return "\nleft midfielders - these guys tend to attack more than RB(PP)/LB(LZ), and at the same time, they are more defensive than RM(PP) /LM(LP).  ";

    }

    @Override
    public String centreDevensiveiveBack() {
        return null;
    }

    @Override
    public String rightMidfielders() {
        return null;
    }

    @Override
    public String leftMidfielders() {
        return null;
    }

    @Override
    public String rightWinger() {
        return null;
    }

    @Override
    public String leftWinger() {
        return null;
    }

    Period ped = Period.between(getAge(), LocalDate.now());

    @Override
    public String toString() {
        return "\nname of right back  : " + getFullName() +
                "\nage  :" + ped +
                "\n Height :" + getHeight() +
                "\nweight :" + getWeight() +
                rightBack();
    }
}
