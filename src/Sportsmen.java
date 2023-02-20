import java.time.LocalDate;

public abstract class Sportsmen implements Position {

    private String fullName;
    private LocalDate age;
    private double height;
    private double weight;

    public Sportsmen(String fullName, LocalDate age, double height, double weight) {
        this.fullName = fullName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "Sportsmen{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

