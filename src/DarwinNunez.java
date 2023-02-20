import java.time.LocalDate;
import java.time.Period;

public class DarwinNunez extends Sportsmen {
    public DarwinNunez(String fullName, LocalDate age, double height, double weight) {
        super(fullName, age, height, weight);
    }

    @Override
    public String goalKeeper() {
        return null;
    }
    @Override
    public String forward() {
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
        return "\nleft wingers -extreme attackers, more often they are called aggressive flank attackers who are able not only to make overhangs (Crossing)";

    }

    @Override
    public String leftWinger() {
        return null;
    }

    Period ped = Period.between(getAge(), LocalDate.now());

    @Override
    public String toString() {
        return "\nname of right winger  : " + getFullName() +
                "\nage  :" + ped +
                "\n Height :" + getHeight() +
                "\nweight :" + getWeight() +
               rightWinger()


                ;
    }
}
