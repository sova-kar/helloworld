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


        //task1
        int a=3000;
        System.out.println("Значение переменной a" + " "+ "с типом int" + "="+" " +a);
        byte b=1;
        System.out.println("Значение переменной b" + " "+ "с типом byte" + "="+" " +b);
        short c=32000;
        System.out.println("Значение переменной c" + " "+ "с типом short" + "="+" " +c);
        long d=9000000L;
        System.out.println("Значение переменной d" + " "+ "с типом long" + "="+" " +d);
        float e=3.55f;
        System.out.println("Значение переменной e" + " "+ "с типом float" + "="+" " +e);
        double f=6.4356;
        System.out.println("Значение переменной f" + " "+ "с типом double" + "="+" " +f);

        //task2

        a=27897;
        System.out.println("int"+"="+a);
        b=67;
        System.out.println("byte"+"="+b);
        c=569;
        System.out.println("short"+"="+c);
        d=987678965549L;
        System.out.println("long"+"="+d);
        e=27.12f;
        System.out.println("float"+"="+e);
        f=2.786;
        System.out.println("double"+"="+f);
        c=-159;
        System.out.println("short"+"="+c);

        //task3

        byte teacher1=23;
        System.out.println(teacher1);
        byte teacher2=27;
        System.out.println(teacher2);
        byte teacher3=30;
        System.out.println(teacher3);
        short paper=480;
        System.out.println(paper);
        int pupilPaper=paper/(teacher1+teacher2+teacher3);
        System.out.println("На каждого ученика рассчитано" + " "+ pupilPaper + " "+ "листов бумаги");

        //task4

        short bottleMachine=8;
        System.out.println(bottleMachine);
        int bottle1=bottleMachine*20;
        System.out.println("За 20 минут машина произвела"+" "+bottle1+" "+"бутылок" );
        int bottle2=bottleMachine*1440;
        System.out.println("За сутки машина произвела"+" "+bottle2+" "+"бутылок" );
        int bottle3=bottleMachine*4320;
        System.out.println("За 3 дня машина произвела"+" "+bottle3+" "+"бутылок" );
        int bottle4=bottleMachine*43200;
        System.out.println("За месяц машина произвела"+" "+bottle4+" "+"бутылок" );

        //task5

        byte paint=120;
        System.out.println(paint);
        byte whitePaint=2;
        System.out.println(whitePaint);
        byte brownPaint=4;
        System.out.println(brownPaint);
        int classroom=paint/(whitePaint+brownPaint);
        System.out.println(classroom);
        int paintVolume1=40;
        System.out.println(paintVolume1);
        int paintVolume2=80;
        System.out.println(paintVolume2);
        System.out.println("В школе, где"+" "+classroom+" "+"классов,нужно"+" "+paintVolume1+" "+"банок белой краски и"+" "+paintVolume2+" "+"банок коичневой краски");

        //task6

        int banana=400;
        System.out.println(banana);
        int milk=210;
        System.out.println(milk);
        int iceCream=200;
        System.out.println(iceCream);
        int egg=280;
        System.out.println(egg);
        int breakfast1=banana+milk+iceCream+egg;
        System.out.println(breakfast1+" "+"грамм");
        float breakfast2=1.09f;
        System.out.println(breakfast2+" "+"килограмм");

        //task7

        int weight=7000;
        System.out.println(weight);
        int mass1=250;
        System.out.println(mass1);
        int mass2=500;
        System.out.println(mass2);
        int day1=weight/mass1;
        System.out.println(day1+" "+"дней");
        int day2=weight/mass2;
        System.out.println(day2+" "+"дней");

        //task8

        int worker1=67760;
        System.out.println(worker1);
        int worker2=83690;
        System.out.println(worker2);
        int worker3=76230;
        System.out.println(worker3);
        int newSalary1=74536;
        System.out.println(newSalary1);
        int newSalary2=92059;
        System.out.println(newSalary2);
        int newSalary3=83853;
        System.out.println(newSalary3);
        worker1=worker1*12;
        System.out.println(worker1);
        int yearSalary1=74536*12;
        System.out.println(yearSalary1);
        worker2=83690*12;
        System.out.println(worker2);
        int yearSalary2=92059*12;
        System.out.println(yearSalary2);
        worker3=76230*12;
        System.out.println(worker3);
        int yearSalary3=83853*12;
        System.out.println(yearSalary3);
        int difference1=yearSalary1-worker1;
        System.out.println("Маша теперь получает"+" "+ newSalary1+" "+"рублей,"+" "+ "годовой доход вырос на"+" "+difference1+" "+"рублей");
        int difference2=yearSalary2-worker2;
        System.out.println("Денис теперь получает"+" "+ newSalary2+" "+"рублей,"+" "+ "годовой доход вырос на"+" "+difference2+" "+"рублей");
        int difference3=yearSalary3-worker3;
        System.out.println("Кристина теперь получает"+" "+ newSalary3+" "+"рублей,"+" "+ "годовой доход вырос на"+" "+difference3+" "+"рублей");












    }
}