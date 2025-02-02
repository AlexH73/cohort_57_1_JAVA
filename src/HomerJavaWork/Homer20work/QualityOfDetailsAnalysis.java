package HomerJavaWork.Homer20work;

import java.util.Scanner;
import java.util.Random;


//Домашнее Задание *: Анализ Качества Деталей на Заводе
//Цель Задания: Развитие навыков обработки данных в массивах и выполнение статистических расчетов в Java.
//
//Задача:
//Контекст: На заводе производятся детали, каждая из которых после изготовления оценивается и помещается в партию. Партия представлена массивом чисел, где:
//
//-1 обозначает бракованную деталь,
//0 - деталь, требующую доработки,
//1 - идеальную деталь, готовую к эксплуатации.
//Задание:
//
//Создайте массив целых чисел, который содержит случайное распределение значений -1, 0 и 1, имитируя партию деталей с завода.
//Рассчитайте и выведите в консоль процентное соотношение каждого типа деталей в партии.
//Детали Реализации:
//Инициализация Массива:
//
//Массив должен быть инициализирован случайными числами -1, 0, и 1.
//Размер массива можно задать произвольно или запросить у пользователя.
//Расчет Процентного Соотношения:
//
//Подсчитайте количество каждого типа деталей в массиве.
//Рассчитайте процентное соотношение для каждого типа деталей от общего количества деталей в массиве.
//Вывод Результата:
//
//Выведите в консоль процентное соотношение бракованных, требующих доработки и идеальных деталей.
public class QualityOfDetailsAnalysis {
    private static int i;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your lot size of parts: "); //Пользователя вводит размер массива
        int n = scanner.nextInt();

        int[] details = new int[n];   //Массив с деталями

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            details[i] = random.nextInt(3) - 1;
        }
        int defectiv = 0;
        int reworked = 0;
        int perfect = 0;
         {
        for (int i = 0; i < n; i++);
        {
           
            if (details [i] == -1)
            {defectiv++;
            } else if (details[i] == 0)
            {reworked++;
            } else if (details[i] == 1)
            {perfect++;
            }
        }
        
        double defectivPercent = (double) defectiv / n * 100;
        double reworkedPercent = (double) defectiv / n * 100;
        double perfectPercent = (double) defectiv / n * 100;


        System.out.println("defectivPercent = " + defectivPercent);
        System.out.println("reworkedPercent = " + reworkedPercent);
        System.out.println("perfectPercent = " + perfectPercent);

    }



    }
}






