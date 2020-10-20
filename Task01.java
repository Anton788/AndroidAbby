package tasks;

public class Task01 {

    /**
     * Возвращает минимальное значение из массива.
     * Не использовать стандартную библиотеку!
     */
    public static int min(int[] ints) {
        int minimum = 0;
        for (int i = 0; i < ints.length; ++i){
            if (i == 0){
                minimum = ints[i];
            }
            if (minimum > ints[i]){
                minimum = ints[i];
            }
        }
        return minimum;
    }

    public static float average(int[] ints) {
        float sum = 0.f;
        for (int i = 0; i < ints.length; ++i){
            sum += ints[i];
        }
        return sum / ints.length;
    }

}
