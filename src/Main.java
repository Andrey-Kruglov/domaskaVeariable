public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Собака " + dog);
        System.out.println("КОТ " + cat);
        System.out.println("Бумага " + paper);

        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Собака " + dog);
        System.out.println("Кот " + cat);
        System.out.println("Бумага " + paper);

        System.out.println("Задача 3");
        var dogResult = dog - 3.5;
        var catResult = cat - 1.6;
        var paperResult = paper - 7639;
        System.out.println("Собака " + dogResult);
        System.out.println("Кот " + catResult);
        System.out.println("Бумага " + paperResult);

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("Друг " + friend);
        friend = friend + 2;
        System.out.println("Друг " + friend);
        friend = friend / 7;
        System.out.println("Друг " + friend);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("Лягуха " + frog);
        frog = frog * 10;
        System.out.println("Лягуха " + frog);
        frog = frog / 3.5;
        System.out.println("Лягуха " + frog);
        frog = frog + 4;
        System.out.println("Лягуха " + frog);

        System.out.println("Задача 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightSum = weightBoxer1 + weightBoxer2;
        System.out.println("Суммарный вес бойцов " + weightSum + "кг! ");
        var weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе " + weightDifference + "кг! ");

        System.out.println("Задача 7 ");
        var difference = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе бойцов " + difference + "кг! ");
        difference = weightBoxer2 % weightBoxer1;
        System.out.println("Разница масс спортсменов " + difference + "кг! ");

        System.out.println("Задача 8 ");
        var hour = 640;
        var hourWork = 8;
        var worker = hour / hourWork;
        System.out.println("Всего работников в компании " + worker + " человек");
        var workerNow = worker + 94;
        hourWork = hour / workerNow;
        System.out.println(" Если в компании работает " + workerNow + " человек, то всего " + hourWork +
                " часов работы может быть поделено между сотрудниками " );



    }
}
