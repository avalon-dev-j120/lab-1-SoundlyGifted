package ru.avalon.java.j20.labs.core;

import java.util.Random;

/**
 * Фабрика, создающая массивы целых чисел, наполненные
 * случайными значениями.
 */
public class RandomArrayFactoryDouble implements Factory<Double[], Integer> {

    /**
     * Генератор псевдо-случайных чисел.
     */
    private final Random random = new Random();

    /**
     * Возвращает новый массив заданной длины. Массив
     * содержит случайные значения в диапазоне от 1 до 100.
     *
     * @param length длина массива
     * @return новый массив случайных чисел, заданной длины.
     */
    @Override
    public Double[] getInstance(Integer length) {
        Double[] array = new Double[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }
}
