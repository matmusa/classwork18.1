import java.time.LocalDate;
import java.time.Period;

public class TiagoAlcantara extends Sportsmen {
    public TiagoAlcantara(String fullName, LocalDate age, double height, double weight) {
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
        return null;
    }

    @Override
    public String centreDevensiveiveBack() {
        return "\n centre devence back -a player specializing in performing defensive functions, located near the central axis of the field, next to his penalty area. ";

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
        return "\nname of centre devensive back  : " + getFullName() +
                "\nage  :" + ped +
                "\n Height :" + getHeight() +
                "\nweight :" + getWeight() +
                centreDevensiveiveBack();

    }
}
