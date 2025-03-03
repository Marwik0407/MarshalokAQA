public class Main {
    public static void main(String[] args) {
        printThreeWords ();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println (summaInRange(20,7));
        numberCheck(-9);
        System.out.println (numberCheck2(6));
        nVivodStroki("Привет", 7);
        System.out.println (whichYaer(1900));
        exchange();
        massiv();
        calcmassiv();
        diagonal();
        createmassiv();

    }
    public static void checkSumSign() {
        System.out.println("------------------Задание2----------------------");
        int a =0;
        int b =1;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

        public static void printThreeWords () {
        System.out.println("-------------------Задание1---------------------");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

public static void printColor() {
    System.out.println("---------------Задание3-------------------------");
    int value =0;
    if (value <= 0) {
        System.out.println("Красный");
    } else if (value > 0 && value <= 100){
        System.out.println("Желтый");
    } else if (value > 100) {
        System.out.println("Зеленый");
    }}
public static void compareNumbers() {
    System.out.println("---------------Задание4-------------------------");
    int a=10;
    int b=10;
    if (a >= b) {
        System.out.println("a >= b");
    } else {
        System.out.println("a<b");
    }}
    public static boolean summaInRange(int a, int b) {
        System.out.println("---------------Задание5-------------------------");
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    public static void numberCheck(int a) {
        System.out.println("---------------Задание6-------------------------");
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
public static boolean numberCheck2(int a) {
    System.out.println("---------------Задание7-------------------------");
    return a <= 0;
}
    public static void nVivodStroki(String stroka, int a) {
        System.out.println("---------------Задание8-------------------------");
        for (int i = 0; i<a; i++) {
            System.out.println(stroka);
        }}
    public static boolean whichYaer(int a) {
        System.out.println("---------------Задание9-------------------------");
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                return a % 400 == 0;
            }
            return true;
        }
        return false;
    }

public static void exchange() {
    System.out.println("---------------Задание10-------------------------");
    int[] M = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    for (int i = 0; i < M.length; i++) {
        if (M[i] == 0) {
            M[i] = 1;
        } else if (M[i] == 1) {
            M[i] = 0;
        }
    }
    for (int n : M) {
        System.out.print(n + " ");

    }System.out.println();}
    public static void massiv() {
        System.out.println("---------------Задание11-------------------------");
        int[] M =new int[100];
        for (int i = 0; i < M.length; i++) {
            M[i] = i + 1;
        }
        for (int n : M) {
            System.out.print(n + " ");
        }System.out.println();}
    public static void calcmassiv() {
        System.out.println("---------------Задание12-------------------------");
        int[] M = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < M.length; i++) {
            if (M[i] < 6) {
                M[i] *= 2;
            }}
        for (int num : M) {
            System.out.print(num + " ");
        }System.out.println();}

public static void diagonal() {
    System.out.println("---------------Задание13-------------------------");
    int size = 5;
    int[][] array = new int[size][size];
    for (int i = 0; i < size; i++) {
        array[i][i] = 1;}
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            System.out.print(array[i][j] + " ");
        }
        System.out.println();
    }}
public static void createmassiv() {
    System.out.println("---------------Задание14-------------------------");
    int[] result = createArray(5, 10);
    for (int value : result) {
        System.out.print(value + " ");
    }
}
    public static int[] createArray(int len, int initialValue) {
    int[] M = new int[len];
    for (int i = 0; i < len; i++) {
        M[i] = initialValue;
    }
    return M;
}}

























