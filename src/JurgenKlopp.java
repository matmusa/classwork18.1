import java.time.LocalDate;
import java.time.Period;

public class JurgenKlopp extends Sportsmen {
    public JurgenKlopp(String fullName, LocalDate age, double height, double weight) {
        super(fullName, age, height, weight);
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
        return null;
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

    @Override
    public String forward() {
        return null;
    }

    Period ped = Period.between(getAge(), LocalDate.now());

    @Override
    public String toString() {
        return "\nBoss name : " + getFullName() +
                "\nage  :" + ped;

    }
}
