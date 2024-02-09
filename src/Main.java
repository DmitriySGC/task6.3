import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние ");
        int measure = in1.nextInt();
        if (measure == 1){
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - грамм, 3 - фунт, 4 - тонна");
            int units = in1.nextInt();
            System.out.println("Введите число: ");
            int a = in1.nextInt();
            if (units == 1){
                System.out.println("Килограммы: " + a);
                System.out.println("Граммы: " + (a*1000));
                System.out.println("Фунты: " +  (a*2.20462));
                System.out.println("Тонны: " +  (a*0.001));
            } else if (units == 2){
                System.out.println("Килограммы: " + (a*0.001));
                System.out.println("Граммы: " + a);
                System.out.println("Фунты: " +  (a*0.00220462));
                System.out.println("Тонны: " +  (a*0.000001));
            } else if (units == 3){
                System.out.println("Килограммы: " + (a*0.453592));
                System.out.println("Граммы: " + (a*453.592));
                System.out.println("Фунты: " +  a);
                System.out.println("Тонны: " +  (a*0.000453592));
            } else  if (units == 4){
                System.out.println("Килограммы: " + (a*1000));
                System.out.println("Граммы: " + (a*1000000));
                System.out.println("Фунты: " +  (a*2204.62));
                System.out.println("Тонны: " +  a);
            }}
        if (measure == 2){
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int units = in1.nextInt();
            System.out.println("Введите число: ");
            int a = in1.nextInt();
            if (units == 1){
             System.out.println("Метры: " + a);
                System.out.println("Мили: " + (a*0.00062));
                System.out.println("Ярды: " +  (a*1.094));
                System.out.println("Футы: " +  (a*3.28));
            } else if (units == 2){
                System.out.println("Метры: " + (a*1609.34));
                System.out.println("Мили: " + a);
                System.out.println("Ярды: " +  (a*1760));
                System.out.println("Футы: " +  (a*5280));
            } else if (units == 3){
                System.out.println("Метры: " + (a*0.9144));
                System.out.println("Мили: " + (a*0.000568182));
                System.out.println("Ярды: " +  a);
                System.out.println("Футы: " +  (a*3));
            } else  if (units == 4){
                System.out.println("Метры: " + (a*0.3048));
                System.out.println("Мили: " + (a*0.000189394));
                System.out.println("Ярды: " +  (a*0.3333));
                System.out.println("Футы: " +  a);
        }}
    }
}
