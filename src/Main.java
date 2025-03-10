abstract class Animal {
    private static int animalCount = 0;

    public Animal() {
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    abstract void run(int distance);
    abstract void swim(int distance);
}

class Dog extends Animal {
    private static int dogCount = 0;

    public Dog() {
        super();
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println("Собака не может пробежать так далеко.");
        }
    }

    void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака проплыла " + distance + " м.");
        } else {
            System.out.println("Собака не может проплыть так далеко.");
        }
    }
}

class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull = false;
    private String name;

    public Cat(String name) {
        super();
        this.name = name;
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public void eat(Bowl bowl) {
        if (bowl.getFoodAmount() > 0) {
            bowl.eat(10);
            isFull = true;
            System.out.println(name + " покушал.");
        } else {
            System.out.println(name + " не поел, еды не хватило.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public String getName() {
        return name;
    }

    void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать так далеко.");
        }
    }

    void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }
}

class Bowl {
    private int foodAmount;

    public Bowl(int initialFood) {
        if (initialFood < 0) {
            this.foodAmount = 0;
        } else {
            this.foodAmount = initialFood;
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void eat(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
        } else {
            System.out.println("Недостаточно еды в миске. Попытка взять " + amount + ", доступно " + foodAmount + ".");
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Добавлено " + amount + " еды в миску. Теперь в миске " + foodAmount + " еды.");
        } else {
            System.out.println("Нельзя добавлять отрицательное количество еды.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Bowl bowl = new Bowl(30);
        Cat[] cats = {
                new Cat("Кот Мурка"),
                new Cat("Кот Пух"),
                new Cat("Кот Шарик")
        };

        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        System.out.println("Информация о сытости котов:");
        for (Cat cat : cats) {
            System.out.println(cat.isFull() ? cat.getName() + " сыт." : cat.getName() + " голоден.");
        }

        bowl.addFood(20);

        System.out.println("Попробуем покормить котов снова:");
        for (Cat cat : cats) {
            cat.eat(bowl);
        }
    }
}