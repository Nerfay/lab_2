package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //task24();
        //task49();
        //task74();
        //task99();
        //task124();
    }
    /*
24.В массиве хранится информация о баллах, полученных спортсменом-десятиборцем в каждом из десяти видов спорта.
    Для выхода в следующий этап соревнований общая сумма баллов должна превысить некоторое известное значение.
    Определить, вышел ли данный спортсмен в следующий этап соревнований.
     */
    private static void task24(){
        int score_rate=65;
        int sum_point =0;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random() * 10) + 1);
        }
        System.out.println("Баллы борца:"+"\n"+Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            sum_point+=arr[i];
        }
        System.out.println("Cума баллов:"+"\n"+sum_point);
        if (sum_point>score_rate){
            System.out.println("Выход в следующий этап соревнований");
        }
        else{
            System.out.println("Нехватка баллов для выхода в следующий этап соревнований");
        }
    }
    /*
49.Задана последовательность N вещественных чисел. Вычислить значение выражения .
    (|X1*X2*...*Xn|)^1/n .
     */
    private static void task49() {
        System.out.print("Введите число последовательности чисел (N>0) N=");
        int n = scanner.nextInt();
        double result_multiplication=1;
        double result=n;
        if (n >= 1) {
            float[] arr = new float[n];
            System.out.print( "\n"+"Числа массива:"+"\n");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = ((float) (Math.random() * 100) - 1);
                System.out.print(arr[i] + "\t");
            }
            for (int i = 0; i < arr.length; i++) {
                result_multiplication*=arr[i];
            }
            if(result_multiplication<0){
                result_multiplication*=-1;
            }
            System.out.println("\n");
            result=Math.pow(result_multiplication, 1.0/n);
            System.out.println("Конечный результат:"+"\n"+(float) result);
        }
        else{
            System.out.println("Вы ввели отрицательное число");
        }
    }
    /*
74.Дана последовательность вещественных чисел а1, a2, ..., а15.
    Определить, есть ли в последовательности отрицательные числа.
    В случае положительного ответа определить порядковый номер первого из них.
     */
    private static void task74(){
        int[] arr = new int[15];
        System.out.println("Отрицательные числа:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random() * 31) - 15);
            if(arr[i]<0){
                System.out.print(arr[i]+"\t");
            }
        }
        System.out.println(" ");
        System.out.println("Номер первого отрицательного числа:");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                System.out.print(i+1);
                break;
            }
        }
        System.out.println("\nНачальный массив:");
        System.out.println(Arrays.toString(arr));
    }
    /*
99.Удалить элемент массива целых чисел больший куба первого элемента этого массива.
    Если таких элементов нет, выдать сообщение «удаление не произведено», иначе удалить последний элемент из найденных.
     */
    private static void task99() {
        int[] arr = new int[15];
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 10) + 1);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] * arr[0] * arr[0] < arr[i]) {
                index = i;
            }
        }
        if (index != -1) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr = Arrays.copyOf(arr, arr.length - 1);
        }
        else{
            System.out.println("Удаление не произведено");
        }
        System.out.println(Arrays.toString(arr));
    }
    /*
124.Последовательность а1, а2, ..., an состоит из нулей и единиц.
Поставить в начало этой последовательности нули, а затем единицы.
     */
    private static void task124(){
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            if((int)((Math.random()*10))>=5){
                arr[i] = 1;
            }
            else{
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = arr.length-1;  j > i ; j--){
                if( arr[j] < arr[j-1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
