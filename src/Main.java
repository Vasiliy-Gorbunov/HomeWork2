public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println("dog = " + dog);
        var cat = 3.6;
        System.out.println("cat = " + cat);
        var paper = 763789;
        System.out.println("paper = " + paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("\nall vars +4:");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("\nall vars after subtraction:");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        var friend = 19;
        System.out.println("\nfriend = "+friend);
        friend = friend + 2;
        System.out.println("friend = "+friend);
        friend = friend / 3;
        System.out.println("friend = "+friend);

        var frog = 3.5;
        System.out.println("\nfrog = "+frog);
        frog = frog *10;
        System.out.println("frog = "+frog);
        frog = frog/3.5;
        System.out.println("frog = "+frog);
        frog = frog+4;
        System.out.println("frog = "+frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxersSum = boxer1+boxer2;
        System.out.println("\nОбщий вес " + boxersSum+" кг");
        var boxersMinus = boxer2-boxer1;
        System.out.println("Разница в весе "+boxersMinus+" кг");
        var boxerDifference = boxer2 % boxer1;
        System.out.println("Разница в весе "+boxerDifference+" кг");

        var totalHours = 640;
        var hoursPerWorker = 8;
        var numberWorkers = totalHours/hoursPerWorker;
        System.out.println("\nВсего работников в компании - "+numberWorkers+" человек");
        numberWorkers = numberWorkers+94;
        var if94WorkersMore = numberWorkers*hoursPerWorker;
        System.out.println("Если в компании работает "+numberWorkers+" человека, то всего "+if94WorkersMore+" часов работы может быть поделено между сотрудниками");
    }
}