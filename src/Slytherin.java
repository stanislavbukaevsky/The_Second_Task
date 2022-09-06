public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, String surname, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, surname, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public static void comparisonOfStudents(Slytherin studentOne, Slytherin studentTwo) {
        int comparisonOne = studentOne.getCunning() + studentOne.getDetermination() + studentOne.getAmbition() + studentOne.getResourcefulness() + studentOne.getThirstForPower();
        int comparisonTwo = studentTwo.getCunning() + studentTwo.getDetermination() + studentTwo.getAmbition() + studentTwo.getResourcefulness() + studentTwo.getThirstForPower();

        if (comparisonOne > comparisonTwo) {
            System.out.println(studentOne.getName() + " " + studentOne.getSurname() + " лучший слизеринец, чем " + studentTwo.getName() + " " + studentTwo.getSurname());
        } else if (comparisonTwo > comparisonOne) {
            System.out.println(studentTwo.getName() + " " + studentTwo.getSurname() + " лучший слизеринец, чем " + studentOne.getName() + " " + studentOne.getSurname());
        } else if (comparisonOne == comparisonTwo) {
            System.out.println(studentOne.getName() + " " + studentOne.getSurname() + " одинаково сильны в мощности магии, как " + studentTwo.getName() + " " + studentTwo.getSurname());
        }
    }

    public int getCunning() {
        return this.cunning;
    }

    public int getDetermination() {
        return this.determination;
    }

    public int getAmbition() {
        return this.ambition;
    }

    public int getResourcefulness() {
        return this.resourcefulness;
    }

    public int getThirstForPower() {
        return this.thirstForPower;
    }

    @Override
    public String toString() {
        return "СТУДЕНТ ФАКУЛЬТЕТА СЛИЗЕРИН:" + "\n" + "Имя: " + getName() + "; Фамилия: " + getSurname() + "; Магия: " + getMagic() + "; Трансгрессия: " + getTransgression() + "; Хитрость: " + getCunning() + "; Решительность: " + getDetermination() + "; Амбициозность: " + getAmbition() + "; Ноходчивость: " + getResourcefulness() + "; Жажда власти: " + getThirstForPower() + ".";
    }
}
