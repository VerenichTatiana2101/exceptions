package lesson001;
    
public class Task01{
    public static void main(String[] args) {
        /*
         * Реализуйте метод, принимающий в качестве аргумента целочисленный массив. 
         * Если длина массива меньше некоторого заданного минимума, метод возвращает -1, 
         * в качестве кода ошибки, иначе - длину массива.
         */
        int[] array = {15, 10, 1, 3, 2};
        System.out.println(size(array, 7));
    }

    public static int size(int[] arr, int arg){
        if(arr.length < arg){
            return -1;
        }
        return arr.length;
    }
}