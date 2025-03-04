public class Park {

    private Attraction[] attraction;
    private int attCount;

    public Park(int mesta) {
        attraction = new Attraction[mesta];
        attCount = 0;
    }
    public void addAttraction(String name, String workTime, double price) {
        Attraction newAttraction = new Attraction(name, workTime, price);
        attraction[attCount] = newAttraction;
        attCount++;
    }
    public void showAttraction() {
        for (int i = 0; i < attCount; i++) {
            attraction[i].printAttractionInfo();
        }
    }
    private class Attraction {
        private String name;
        private String workTime;
        private double price;

        public Attraction (String name, String workTime, double price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;
        }
        public void printAttractionInfo() {
            System.out.println("Аттракцион: " + name + ", Время работы: " + workTime + ", Стоимость: " + price + " руб.");
        }
    }}
