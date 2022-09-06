public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри", "Поттер", 10, 8, 96, 100, 91);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона", "Грейнджер", 7, 10, 88, 95, 91);
        Gryffindor ronWeasley = new Gryffindor("Рон", "Уизли", 7, 9, 90, 99, 80);
        Slytherin dracoMalfoy = new Slytherin("Драко", "Малфой", 9, 9, 94, 91, 95, 88, 90);
        Slytherin grahamMontague = new Slytherin("Грэхэм", "Монтегю", 8, 9, 88, 85, 89, 92, 95);
        Slytherin gregoryGoyle = new Slytherin("Грегори", "Гойл", 7, 9, 81, 86, 87, 89, 92);
        Hufflepuff zachariahSmith = new Hufflepuff("Захария", "Смит", 9, 8, 88, 90, 91);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик", "Диггори", 8, 8, 92, 92, 90);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин", "Финч-Флетчли", 6, 7, 78, 84, 88);
        Ravenclaw zhouChang = new Ravenclaw("Чжоу", "Чанг", 8, 10, 90, 92, 85, 78);
        Ravenclaw padmaPatil = new Ravenclaw("Падма", "Патил", 6, 6, 80, 84, 86, 81);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус", "Белби", 8, 9, 90, 91, 82, 79);

        System.out.println(dracoMalfoy);
        Hogwarts.comparisonOfStudents(padmaPatil, harryPotter);
        Gryffindor.comparisonOfStudents(harryPotter, hermioneGranger);
        Slytherin.comparisonOfStudents(grahamMontague, gregoryGoyle);
        Hufflepuff.comparisonOfStudents(zachariahSmith, justinFinchFletchley);
        Ravenclaw.comparisonOfStudents(zhouChang, marcusBelby);

    }
}