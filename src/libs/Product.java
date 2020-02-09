package libs;

public class Product {
    private String nameAtStart;
    private double priceAtStart;
    private int amountAtStart;

    public String getNameAtStart() {
        return nameAtStart;
    }

    public double getPriceAtStart() {
        return priceAtStart;
    }

    public int getAmountAtStart() {
        return amountAtStart;
    }

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.nameAtStart = nameAtStart;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;


    }

    public void printProduct() {
        System.out.println(nameAtStart + " , " + "price " + priceAtStart
                + " amount " + amountAtStart );
    }
}
