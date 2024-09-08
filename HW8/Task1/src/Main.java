public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo

        int[] card = {1,2,34,4,5,6,7,8,8,65};
        System.out.println(card[4]);




        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
//
        for (int i = 0; i < card.length; i++){
            System.out.print(i + " ");
        }
        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo
        System.out.println("----------------------------------");
        int[] car = new int[10];
////
        for (int i = car.length -1; i >= 0; i--){
            System.out.print(i + " ");
        }
        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo
        System.out.println("-----------------------------------------------------");
        int[] dog = {20, 46, 77, 89, 32, 0, 4, 88, 9, 110};
        for (int i = 0; i < dog.length; i++) {
            System.out.println(dog[i]);
        }
//

    }
}
