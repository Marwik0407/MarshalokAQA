public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung $25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Apple iPhone 14", "15.04.2024", "Apple Inc.", "USA", 12999, true);
        productsArray[2] = new Product("ADIDAS", "12.12.2024", "ADAIDAS", "GER", 10999, false);
        productsArray[3] = new Product("Sony", "20.05.2024", "Sony", "Japan", 9566, true);
        productsArray[4] = new Product("Nike", "30.08.2024", "Nike", "GER", 5999, true);

    System.out.println("-----------Задание1-------------");
        Product product = new Product("Телевизор", "10/02/2022", "Sony", "Япония", 455599.99, false);
        product.getInfo();

        System.out.println("-----------Задание3-------------");
        Park park = new Park(15);
        park.addAttraction("Лодочки", "11:00 - 18:00", 250);
        park.addAttraction("Ракушки", "11:00 - 18:00", 300);
        park.showAttraction();
    }
    }