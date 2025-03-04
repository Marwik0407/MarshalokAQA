public class Product {
    private String name;
    private String data;
    private String proizvoditel;
    private String country;
    private double price;
    private boolean statusOfreserv;

    public Product(String name, String data, String proizvoditel, String country, double price, boolean statusOfreserv) {
        this.name = name;
        this.data = data;
        this.proizvoditel = proizvoditel;
        this.country = country;
        this.price = price;
        this.statusOfreserv = statusOfreserv;}

    public void getInfo () {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + data);
        System.out.println("Производитель: " + proizvoditel);
        System.out.println("Страна происхождения: " + country);
        System.out.println("Цена: " + price);
        System.out.println("Состояние бронирования покупателем: " + statusOfreserv);
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung $25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Apple iPhone 14", "01.08.2024", "Apple Inc.", "USA", 9999, true);
        productsArray[2] = new Product("Sony WH-1000XM4", "15.05.2023", "Sony Corp.", "Japan", 2499, true);
        productsArray[3] = new Product("Dell XPS 13", "20.10.2025", "Dell Technologies", "USA", 8999, false);
        productsArray[4] = new Product("Nike Air Max", "10.12.2023", "Nike Inc.", "USA", 6999, true);
        for (Product product : productsArray) {
            System.out.println(product);}}}
