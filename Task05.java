package tasks;

/**
 * Напишите класс, конструктор которого принимает два массива:
 * массив значений и массив весов значений.
 * Класс должен содержать метод, который будет возвращать элемент
 * из первого массива случайным образом, с учётом его веса.
 * Пример:
 * Дан массив [1, 2, 3], и массив весов [1, 2, 10].
 * В среднем, значение «1» должно возвращаться в 2 раза реже,
 * чем значение «2» и в десять раз реже, чем значение «3».
 */
class RandomFromArray {
    private int[] values;
    private int[] weights;
    RandomFromArray(int[] values, int[] weights){
        this.values = values;
        this.weights = weights;
    }

    int getRandom(){
        int sum = 0;
        for (int i = 0; i < weights.length; ++i){
            sum += weights[i];
        }
        int randomCount = (int) (Math.random() * sum);
        sum = 0;
        int index = 0;
        for (int i = 0; i < weights.length; ++i){
            sum += weights[i];
            if (randomCount < sum){
                index = i;
                break;
            }
        }
        return values[index];
    }

}

public class Task05 {

}
