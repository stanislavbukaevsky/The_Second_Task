public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwartsStudents = {
                new Hogwarts("Гарри", "Поттер", 10, 8),
                new Hogwarts("Гермиона", "Грейнджер", 7, 10),
                new Hogwarts("Рон", "Уизли", 7, 9),
                new Hogwarts("Драко", "Малфой", 9, 9),
                new Hogwarts("Грэхэм", "Монтегю", 8, 9),
                new Hogwarts("Грегори", "Гойл", 7, 9),
                new Hogwarts("Захария", "Смит", 9, 8),
                new Hogwarts("Седрик", "Диггори", 8, 8),
                new Hogwarts("Джастин", "Финч-Флетчли", 6, 7),
                new Hogwarts("Чжоу", "Чанг", 8, 10),
                new Hogwarts("Падма", "Патил", 6, 6),
                new Hogwarts("Маркус", "Белби", 8, 9)
        };

        Gryffindor[] gryffindorStudents = {
                new Gryffindor("Гарри", "Поттер", 10, 8, 96, 100, 91),
                new Gryffindor("Гермиона", "Грейнджер", 7, 10, 88, 95, 91),
                new Gryffindor("Рон", "Уизли", 7, 9, 90, 99, 80)
        };
        Hufflepuff[] hufflepuffStudents = {
                new Hufflepuff("Захария", "Смит", 9, 8, 88, 90, 91),
                new Hufflepuff("Седрик", "Диггори", 8, 8, 92, 92, 90),
                new Hufflepuff("Джастин", "Финч-Флетчли", 6, 7, 78, 84, 88)
        };
        Ravenclaw[] ravenclawStudents = {
                new Ravenclaw("Чжоу", "Чанг", 8, 10, 90, 92, 85, 78),
                new Ravenclaw("Падма", "Патил", 6, 6, 80, 84, 86, 81),
                new Ravenclaw("Маркус", "Белби", 8, 9, 90, 91, 82, 79)
        };
        Slytherin[] slytherinStudents = {
                new Slytherin("Драко", "Малфой", 9, 9, 94, 91, 95, 88, 90),
                new Slytherin("Грэхэм", "Монтегю", 8, 9, 88, 85, 89, 92, 95),
                new Slytherin("Грегори", "Гойл", 7, 9, 81, 86, 89, 87, 92)
        };

        PrintService printService = new PrintService();
        printService.print(gryffindorStudents);
        printService.print(hufflepuffStudents);
        printService.print(ravenclawStudents);
        printService.print(slytherinStudents);

        ComparisonOfStudents comparisonOfStudents = new ComparisonOfStudents();
        comparisonOfStudents.comparisonOfStudentsGryffindor(gryffindorStudents);
        comparisonOfStudents.comparisonOfStudentsHufflepuff(hufflepuffStudents);
        comparisonOfStudents.comparisonOfStudentsRavenclaw(ravenclawStudents);
        comparisonOfStudents.comparisonOfStudentsSlytherin(slytherinStudents);
        comparisonOfStudents.comparisonOfStudentsHogwarts(hogwartsStudents);
    }
}