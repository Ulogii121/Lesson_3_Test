public class ThanosSort {
    public static void main(String[] args) {
        int[] array = {46, 3, 3285, 24, 289, 421, 1520, -300, 250, 7, 0, -12, 24};
        int min = 0;
        int max = array.length - 1;
        sort(array, min, max);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
    }

    public static void sort(int[] mass, int min, int max) {
        //находим среднее арифметическое
        double avg;
        double sum = 0;
        int i = min, j = max;
        for (int k = min; k < j; k++) {
            sum = sum + mass[k];
        }
        avg = sum / (j - min);
        //Разбиваем на две части
        while (i <= j) {
            while (mass[i] < avg) {
                i++;
            }
            while (mass[j] > avg) {
                j--;
            }
            if (i <= j) {
                //Меняем местами элементы
                int buffer = mass[i];
                mass[i] = mass[j];
                mass[j] = buffer;
                i++;
                j--;
            }
        }
        //Рекурсивные ссылки
        if (min < j) {
            sort(mass, min, j);
        }
        if (max > i) {
            sort(mass, i, max);
        }
    }
}
