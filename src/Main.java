import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

/*  1)	Найти корни квадратного уравнения и вывести их на экран, если они есть.
	Если корней нет, то вывести сообщение об этом. Конкретное квадратное
	уравнение определяется коэффициентами a, b, c, которые вводит пользователь. */

        Scanner in = new Scanner(System.in);
        float floatA = in.nextFloat();
        float floatB = in.nextFloat();
        float floatC = in.nextFloat();
        float floatX1;
        float floatX2;
        float floatD= (float) (pow(floatB,2) - 4.0f * floatA * floatC);
        if (floatD < 0)
            System.out.println("Корней нет");
        else if (floatD == 0) {
            floatX1 = -floatB / (floatA * 2);
            System.out.println("Один корень:");
            System.out.println(floatX1);
        }
        else if (floatD > 0) {
            floatX1 = (float) ((-floatB + sqrt(floatD)) / (floatA * 2.0f));
            floatX2 = (float) ((-floatB - sqrt(floatD)) / (floatA * 2.0f));
            System.out.println("Два корня:");
            System.out.println(floatX1);
            System.out.println(floatX2);
        }

        /*2)	Вводятся два целых числа. Проверить делится ли первое на второе.
        Вывести на экран сообщение об этом, а также остаток (если он есть)
        и частное (в любом случае)*/

        int intZd21 = in.nextInt();
        int intZd22 = in.nextInt();
        System.out.println("Частное:");
        System.out.println(intZd21 / intZd22);
        if (intZd21 % intZd22 != 0) {
            System.out.println("Остаток:");
            System.out.println(intZd21 % intZd22);
        }

        /*3) Дана следующая функция y=f(x):
        y = 2x - 10, если x > 0
        y = 0, если x = 0
        y = 2 * |x| - 1, если x < 0
        Требуется найти значение функции по переданному x. */

        float floatZd3x = in.nextFloat();
        if (floatZd3x > 0)
            System.out.println(2 * floatZd3x - 10);
        else if (floatZd3x == 0)
            System.out.println(0);
        else if (floatZd3x < 0)
        System.out.println(2 * abs(floatZd3x) - 1);

        /* 4) Создать меню выбора цвета (минимум 8 цветов).
        В зависимости от выбора вывести RGB координаты.*/

        System.out.println("RED, BLUE, WHITE, GREEN, LIME, YELLOW, ORANGE, AQUA");
        System.out.println("Выберите цвет из предложенных и напишите его название или первую букву названия:");
        char type = in.next().charAt(0);
        int typeInt = type;
        if (typeInt < 97)
            type += 32;
        switch (type) {
            case 'r':
                System.out.println("255, 0, 0");
                break;
            case 'b':
                System.out.println("0, 0, 255");
                break;
            case 'w':
                System.out.println("255, 255, 255");
                break;
            case 'g':
                System.out.println("0, 128, 0");
                break;
            case 'l':
                System.out.println("0, 255, 0");
                break;
            case 'y':
                System.out.println("255, 255, 0");
                break;
            case 'o':
                System.out.println("255, 165, 0");
                break;
            case 'a':
                System.out.println("0, 255, 255");
                break;
            default:
                System.out.println("ERROR");
                break;
        }

        /*5)	САДИСТСКАЯ!!!!!
                Пользователь вводит число от 1 до 9999 (сумму выдачи в банкомате).
        Необходимо вывести на экран словами введенную сумму
        и в конце написать название валюты с правильным окончанием.
                Например: 7431 – семь тысяч четыреста тридцать один доллар,
        2149 – две тысячи сто сорок девять долларов,
        15 – пятнадцать долларов, 3 – три доллара.*/

        int intDollar = in.nextInt();
        if (intDollar / 1000 != 0){

        }

        /*6)  Вводятся координаты (x;y) точки и радиус круга (r).
                Определить принадлежит ли данная точка кругу,
                если его центр находится в начале координат.*/

        float floatZd6x = in.nextFloat();
        float floatZd6y = in.nextFloat();
        float floatZd6r = in.nextFloat();
        if (pow(floatZd6x,2) + pow(floatZd6y,2) == pow(floatZd6r,2))
            System.out.println("Да, находится");
        else
            System.out.println("Нет, не находится");

        /*7)  Пользователь вводит стороны треугольника.
        Определить существование треугольника и его тип.
        Треугольник существует только тогда, когда сумма длин любых его двух сторон больше третьей стороны.
                Иначе две стороны просто «укладываются» на третьей.
        Треугольник является разносторонним, если все его стороны имеют разную длину;
        треугольник будет равнобедренным, если любые две его стороны равны между собой, но отличны от третьей;
        и треугольник является равносторонним, когда все его стороны равны.*/

        float floatZd7a = in.nextFloat();
        float floatZd7b = in.nextFloat();
        float floatZd7c = in.nextFloat();
        if ((floatZd7a + floatZd7b > floatZd7c) &&
                (floatZd7c + floatZd7b > floatZd7a) &&
                (floatZd7c + floatZd7a > floatZd7b)) {
            System.out.println("Этот треугольник существует");
            if ((floatZd7a != floatZd7b) &&
                    (floatZd7b != floatZd7c) &&
                    (floatZd7a != floatZd7c))
                System.out.println("Этот треугольник разносторонний");
            else if ((floatZd7a == floatZd7b) &&
                    (floatZd7b == floatZd7c))
                System.out.println("Этот треугольник разносторонний");
            else System.out.println("Этот треугольник равнобедренный");
        }
        else System.out.println("Этот треугольник не существует");

        /*8)  Определить високосный год или нет вводит пользователь.*/

        int intGod = in.nextInt();
        if ((intGod % 100 == 0) &&
                (intGod % 400 == 0))
            System.out.println("Год высокосный");
        else if ((intGod % 4 == 0) &&
                (intGod % 100 != 0))
            System.out.println("Год высокосный");
        else
            System.out.println("Год не высокосный");

        /*9)  Заглавная буква английского языка или иной символ введён пользователем?*/

        char Zd9 = in.next().charAt(0);
        if ((Zd9 > 64) && (Zd9 < 91))
            System.out.println("Введёна заглавная буква английского языка");
        else
            System.out.println("Введён иной символ");

        /*10) Среди трех введённых пользователем чисел найти среднее.*/

        float floatZd10a = in.nextFloat();
        float floatZd10b = in.nextFloat();
        float floatZd10c = in.nextFloat();
        if (((floatZd10a > floatZd10b) && (floatZd10a < floatZd10c)) ||
                ((floatZd10a < floatZd10b) && (floatZd10a > floatZd10c)))
            System.out.println(floatZd10a);
        else if (((floatZd10b > floatZd10a) && (floatZd10b < floatZd10c)) ||
                ((floatZd10b < floatZd10a) && (floatZd10b > floatZd10c)))
            System.out.println(floatZd10b);
        else if (((floatZd10c > floatZd10b) && (floatZd10c < floatZd10a)) ||
                ((floatZd10c < floatZd10b) && (floatZd10c > floatZd10a)))
            System.out.println(floatZd10c);

        /*11) Ракета запускается с Земли со скоростью V(км.час) в направлении движения Земли по орбите вокруг Солнца.
        Составьте программу, определяющую результат запуска ракеты в зависимости от скорости V.
        Известно, что при V<7,8 ракета упадет на Землю; при 7,8<V<11,2 ракета станет спутником Земли;
        при 11,2<V<16,4 ракета станет спутником Солнца; при V>16,4 ракета покинет солнечную систему.*/

        float floatV = in.nextFloat();
        if (floatV < 7.8)
            System.out.println("Ракета упадёт на Землю");
        else if ((floatV > 7.8) && (floatV < 11.2))
            System.out.println("Ракета станет спутником Земли");
        else if ((floatV > 11.2) && (floatV < 16.4))
            System.out.println("Ракета станет спутником Солнца");
        else if (floatV > 16.4)
            System.out.println("Ракета покинет солнечную систему");

        /*12) Определелить количество знаков в натуральном числе от 0 до 1000, не прибегая к строковым переменным.*/

        int intNat = in.nextInt();
        if (intNat % 1000 == 0)
            System.out.println("Четыре знака");
        else if (intNat / 100 > 0)
            System.out.println("Три знака");
        else if (intNat / 10 > 0)
            System.out.println("Два знака");
        else if (intNat >= 0)
            System.out.println("Один знак");

        /*1*) К финалу конкурса лучшего по профессии «Специалист электронного офиса» были допущены трое: Иванов, Петров, Сидоров.
                Соревнования проходили в три тура. Иванов в первом туре набрал M1 баллов, во втором – N1, в третьем – P1.
                Петров – соответственно M2, N2, P2. Сидоров – M3, N3, P3.
                Составьте программу, определяющую, сколько баллов набрал победитель, все данные считтываются с клавиатуры.
        Победитель определяется по победам в турах, общей сумме баллов, в противном случае место делится.*/

        float M1 = in.nextFloat();
        float N1 = in.nextFloat();
        float P1 = in.nextFloat();
        float M2 = in.nextFloat();
        float N2 = in.nextFloat();
        float P2 = in.nextFloat();
        float M3 = in.nextFloat();
        float N3 = in.nextFloat();
        float P3 = in.nextFloat();
        int intPobI = 0;
        int intPobP = 0;
        int intPobS = 0;
        int intBalI = (int) (M1 + N1 + P1);
        int intBalP = (int) (M2 + N2 + P2);
        int intBalS = (int) (M3 + N3 + P3);
        if ((M1 > M2) && (M1 > M3)) {
            intPobI += 1;
            System.out.println("Иванов выиграл в первом туре");
        }
        else if ((M2 > M1) && (M2 > M3)) {
            intPobP += 1;
            System.out.println("Петров выиграл в первом туре");
        }
        else if ((M3 > M1) && (M3 > M2)) {
            intPobS += 1;
            System.out.println("Сидоров выиграл в первом туре");
        }
        if ((N1 > N2) && (N1 > N3)) {
            intPobI += 1;
            System.out.println("Иванов выиграл во втором туре");
        }
        else if ((N2 > N1) && (N2 > N3)) {
            intPobP += 1;
            System.out.println("Петров выиграл во втором туре");
        }
        else if ((N3 > N1) && (N3 > N2)) {
            intPobS += 1;
            System.out.println("Сидоров выиграл во втором туре");
        }
        if ((P1 > P2) && (P1 > P3)) {
            intPobI += 1;
            System.out.println("Иванов выиграл во третьем туре");
        }
        else if ((P2 > P1) && (P2 > P3)) {
            intPobP += 1;
            System.out.println("Петров выиграл во третьем туре");
        }
        else if ((P3 > P1) && (P3 > P2)) {
            intPobS += 1;
            System.out.println("Сидоров выиграл во третьем туре");
        }
        if ((intPobI > intPobP) && (intPobI > intPobS)) {
            System.out.println("Иванов выиграл в Конкурсе");
            System.out.println("Баллы Иванова:" + intBalI);
        }
        if ((intPobP > intPobI) && (intPobP > intPobS)) {
            System.out.println("Петров выиграл в Конкурсе");
            System.out.println("Баллы Петрова:" + intBalP);
        }
        if ((intPobS > intPobI) && (intPobS > intPobP)) {
            System.out.println("Сидоров выиграл в Конкурсе");
            System.out.println("Баллы Сидорова:" + intBalS);
        }
        if ((intPobI == intPobP) && (intPobI == intPobS))
            if ((intBalI > intBalP) && (intBalI > intBalS)){
                System.out.println("Иванов выиграл в Конкурсе");
                System.out.println("Баллы Иванова:" + intBalI);
            }
        else if ((intBalP > intBalI) && (intBalP > intBalS)){
                System.out.println("Иванов выиграл в Конкурсе");
                System.out.println("Баллы Иванова:" + intBalP);
            }
        else if ((intBalS > intBalI) && (intBalS > intBalP)){
                System.out.println("Иванов выиграл в Конкурсе");
                System.out.println("Баллы Иванова:" + intBalS);
            }
        else {
                System.out.println("Никто не выиграл в Конкурсе");
                System.out.println("Максимальный балл:" + intBalS);
            }

        /* 2*) Даны действительные числа a, b, c, d. Если a<=b<=c<=d, то каждое число заменить наибольшим из них;
        если a>b>c>d, то числа оставить без изменения;
        в противном случае все числа заменяются их квадратами.*/

        int intA2 = in.nextInt();
        int intB2 = in.nextInt();
        int intC2 = in.nextInt();
        int intD2 = in.nextInt();
        if ((intA2 <= intB2) && (intB2 <= intC2) && (intC2 <= intD2)){
            intA2 = intD2;
            intB2 = intD2;
            intC2 = intD2;
            System.out.println(intA2);
            System.out.println(intB2);
            System.out.println(intC2);
            System.out.println(intD2);
        }
        else if ((intA2 > intB2) && (intB2 > intC2) && (intC2 > intD2)){
            System.out.println(intA2);
            System.out.println(intB2);
            System.out.println(intC2);
            System.out.println(intD2);
        }
        else {
            intA2 = (int) pow(intA2,2);
            intB2 = (int) pow(intB2,2);
            intC2 = (int) pow(intC2,2);
            intD2 = (int) pow(intD2,2);
            System.out.println(intA2);
            System.out.println(intB2);
            System.out.println(intC2);
            System.out.println(intD2);
        }
    }
}