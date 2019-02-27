package com.company;
import java.util.Scanner;

class run { // реализация ходьбы
    int time; // время
    int regim = 1; // 1 - ходьба, 2 - бег.

    public void func() {
        int x=60;
        int j=0;
        int b;
        Scanner sc = new Scanner(System.in);
      do {
          for (int i = 0; i < time; i++) {
              j = j + 60;
              // System.out.println(j);
          }
          System.out.println("Сейчас вы сделали шагов = " + j);
          System.out.println("Время закончилось, будем еще продождать бегать 1 минуту? (Если да, то введите 1, в противном случае 0");
          time = sc.nextInt();
      }
          while (time>0);
        System.out.println("За время " + j/60 +" мин. тренировку ходьбой вы сделали шагов = " + j);
        sc.close();
    }
}

class run2 {
    int speed;

    public void func2() {
        int l=0;
        int j=0;
        int time=1;
        Scanner sc2 = new Scanner(System.in);
       // System.out.println("Какое кол-во времени мы будем бегать ?");
       // time = sc2.nextInt();
              if ((speed>1) && (speed<4)){ //Проверка на верность ввода скорости, если верно, то 60 первая минута бега
            j=j+60;
        }
        do {
            if (l>0){
                System.out.println("Какая скорость будет на следующей минуте ?");
                speed = sc2.nextInt(); //Не реализовывается ввод данных
            }
        switch (speed) {  // Режимы скорости
            case 1: {for (int i = 0; i < 1; i++) {
                j=j+120;
            }};
                break ;
            case 2: {for (int i = 0; i < 1; i++) {
                j=j+180;
            }};
                break ;
            case 3: {for (int i = 0; i < 1; i++) {
                j=j+240;
            }};
                break ;

            default : System.out.println("Такой скорости не существует");
                break ;
        }
        System.out.println(j);
        l++;
       // System.out.println("Будем еще добавлять 1 минуту бега ? (Если да, то введите значение 1, в противно случае 0");
       // time = sc2.nextInt();
            time = 0;
        }
        while (time > 0);
        System.out.println("Кол-во шагов при тренировки бегом = "+j);
        System.out.println(speed);
        sc2.close();
    }
}