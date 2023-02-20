import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Sportsmen sportsmen = new AlisonBecker("Alison Becker ", LocalDate.of(1993, 12, 12), 195, 98);
        Sportsmen sportsmen1 = new AndryRobertson("Andry Robertson ", LocalDate.of(1996, 2, 9), 189, 90);
        Sportsmen sportsmen2 = new TrentAlexsandrArnold("Trent Alexandr Arnold  ", LocalDate.of(1998, 7, 04), 195, 98);
        Sportsmen sportsmen3 = new VirgilVanDake(" Virgil Vandake ", LocalDate.of(1990, 12, 5), 195, 90);
        Sportsmen sportsmen4 = new JoelMatip("Joel Matip ", LocalDate.of(1987, 11, 7), 199, 79);
        Sportsmen sportsmen5 = new StevanBajetij("Steven Baijejic ", LocalDate.of(2003, 1, 23), 178, 97);
        Sportsmen sportsmen6 = new TiagoAlcantara("Tiago Alcantara  ", LocalDate.of(1989, 4, 30), 178, 80);
        Sportsmen sportsmen7 = new JudeBelincam("Jude Belincam ", LocalDate.of(1997, 5, 17), 188, 78);
        Sportsmen sportsmen8 = new DarwinNunez("Darvin Nunez  ", LocalDate.of(1998, 7, 24), 194, 89);
        Sportsmen sportsmen9 = new MohamedSalah("Mohamed Salah ", LocalDate.of(1990, 3, 11), 186, 87);
        Sportsmen sportsmen10 = new CodyGakpo("Cody Gakpo  ", LocalDate.of(1996, 12, 18), 188, 99);
        Sportsmen sportsmen11 = new JurgenKlopp("Jurgen Klopp ", LocalDate.of(1966, 10, 10), 190, 99);

        Sportsmen[] sportsmen12 = {sportsmen, sportsmen1, sportsmen2, sportsmen3, sportsmen4, sportsmen5, sportsmen6, sportsmen7, sportsmen8, sportsmen9, sportsmen10, sportsmen11};



        Liverpool liverpool=new Liverpool(sportsmen12);
        System.out.println(liverpool.toString());

       /* Задачка:
        которая будет выводить информацию о футбольной команде. В команде должны быть
        игроки разных позиций (нападающие, защитники, вратарь) и тренер. Каждый игрок
        должен иметь имя, фамилию, Localdate возраст с помощь класса PEriod, рост и
        вес. Тренер должен иметь только имя и фамилию.
                Программа должна использовать полиморфизм и интерфейсы для создания объектов
        игроков и тренера. Интерфейс должен иметь метод для каждого игрока
        Также программа должна использовать абстракцию для создания абстрактного класса
        "Спортсмен", от которого будут наследоваться все игроки. В абстрактном классе
        должны быть определены методы для получения и установки имени, фамилии,
                возраста, роста и веса игрока.
                Для хранения игроков и тренера нужно использовать обычный массив. Программа
        должна выводить информацию о каждом игроке и тренере в отдельной строке.*/


    }
}