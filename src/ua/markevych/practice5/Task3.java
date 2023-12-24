package ua.markevych.practice5;

//Известны данные о стоимости каждого из 12 товаров.
// Найти общую стоимость тех товаров, которые стоят дороже 1000 uah
// (количество таких товаров неизвестно).
public class Task3 {
    public static void main(String[] args) {
        int[] prices = {500, 754, 567, 1450, 2350, 234, 123, 2, 3, 109, 1090, 3000};
        int sum = sumProductWithPriceMore1000(prices);
        System.out.println("загальна сума = " + sum);


    }

    public static int sumProductWithPriceMore1000(int[] array){
        int sum = 0;
        for(int i =0; i<array.length; i++){
            if (array[i]>1000){
                sum=sum+array[i];
            }
        }
        return sum;
    }
}
