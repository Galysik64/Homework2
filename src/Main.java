public class Main {
    public static void main(String[] args) {

        System.out.println("Задание " + 1);
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание " + 2);
        dog = dog * 4;
        cat = cat * 4;
        paper = paper * 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание " + 3);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задание " + 4);
        var friend = 19.0;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend /7;
        System.out.println(friend);

        System.out.println("Задание " + 5);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog /3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задание " + 6);
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalMass = boxer1 + boxer2;
        System.out.println("Масса 2 бойцов " + totalMass + " кг");
        var weightDifference = boxer2 - boxer1;
        System.out.println("Разница в весе " + weightDifference + " кг");

        System.out.println("Задание " + 7);
        var remainder = totalMass % weightDifference;
        System.out.println(remainder);

        System.out.println("Задание " + 8);
        var total = 640;
        var work = 8;
        var personal = total /work;
        System.out.println("Всего работников в компании " + personal + " человек.");
        var personal2 = 94;
        personal2 = personal2 + personal;
        work = work * personal2;
        System.out.println("Если в компании работает " +personal2 + " человек" + ", то всего " + work + " часов работы может быть поделено между сотрудниками.");






    }
}