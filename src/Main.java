public class Main {
    public static void main(String[] args) {
        System.out.println("Привет Мир!");
        //task1
         var dog=8.0;
        System.out.println(dog);
        var cat=3.6;
        System.out.println(cat);
        var paper=763789;
        System.out.println(paper);

        //task2
        dog=dog+4;
        System.out.println(dog);
        cat=cat+4;
        System.out.println(cat);
        paper=paper+4;
        System.out.println(paper);

        //task3
        dog=dog-3.5;
        System.out.println(dog);
        cat=cat-3.5;
        System.out.println(cat);
        var result1=paper-3.5;
        System.out.println(result1);

        //task4
        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        //task5
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        //task6
        var massBoxer1=78.2;
        System.out.println(massBoxer1);
        var massBoxer2=82.7;
        System.out.println(massBoxer2);
        var totalWeight=massBoxer1+massBoxer2;
        System.out.println("Общая масса"+ " " + totalWeight + "кг");
        var weightDifference=massBoxer2-massBoxer1;
        System.out.println("Разница масс"+ " " + weightDifference + "кг");

        //task7
        var remainder=massBoxer2%massBoxer1;
        System.out.println("Остаток деления"+ " " + remainder);

        //task8
        var x=640;
        System.out.println(x);
        var y=8;
        System.out.println(y);
        var people=x/y;
        System.out.println("Всего работников в компании"+ " " + people);
        var person=94;
        System.out.println(person);
        var morePeople=person*y;
        System.out.println("Если в компании работает" + " " + person + " " + "человека" + " " + "то всего" + " " + morePeople + " " + "часов работы может быть поделено между сотрудниками" );
        

    }
}