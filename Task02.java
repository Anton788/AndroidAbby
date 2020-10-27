package tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Реализовать итератор над массивом.
 * Массив принимается в конструктор.
 * Итерация должна начинаться с первого элемента.
 * hasNext возвращает true, если итератор может вернуть следующее значение.
 * next должен возвращать следующее значение.(с переходом на следующий элемент)
 */
class ArrayIterator<T> implements Iterator<T> {
    private T[] array;
    private int index;
    public ArrayIterator(T[] array) {
        this.array = array;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() {
        if (index < array.length){
            return array[index++];
        } else {
            throw new NoSuchElementException();
        }
        // Если следующего значения нет, то надо бросить NoSuchElementException
    }
}
