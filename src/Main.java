class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

class ArrayProcessor {
    public void processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Неверный размер массива: должно быть 4 строки.");
        }

        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeException("Неверный размер массива: каждая строка должна содержать 4 элемента.");
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка преобразования в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }

        System.out.println("Сумма всех элементов: " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"a", "14", "15", "16"}
        };

        ArrayProcessor processor = new ArrayProcessor();

        try {
            processor.processArray(arr);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных в массиве: " + e.getMessage());
        }
        int[] numbers = {0, 1, 2, 3, 4};
        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: индекс массива вне допустимого диапазона.");
            System.out.println("Сообщение об ошибке: " + e.getMessage());
        }
    }
}