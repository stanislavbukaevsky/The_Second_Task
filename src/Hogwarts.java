public class Hogwarts {
    private String name;
    private String surname;
    private int magic;
    private int transgression;


    public Hogwarts(String name, String surname, int magic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.transgression = transgression;
    }


    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getMagic() {
        return this.magic;
    }

    public int getTransgression() {
        return this.transgression;
    }

}
