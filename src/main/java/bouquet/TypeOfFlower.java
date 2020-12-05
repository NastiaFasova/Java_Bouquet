package bouquet;

public enum TypeOfFlower {
    ROSE(55), TULIP(40), SNOWDROPS(15),
    VIOLETS(39), LILIES(50);
    private double price;

    TypeOfFlower(double price) {
        this.price = price;
    }

    TypeOfFlower() {
    }

    public double getPrice() {
        return price;
    }

    public static String showTypeOfFlower() {
        System.out.print("TypeOfFlower enum: ");
        StringBuilder stringBuilder = new StringBuilder();
        for (TypeOfFlower typeOfFlower : TypeOfFlower.values()) {
            if (typeOfFlower.price != 0) {
                stringBuilder.append(typeOfFlower)
                        .append(" price: ")
                        .append(typeOfFlower.price)
                        .append("; ");
            } else {
                stringBuilder.append(typeOfFlower);
            }
        }
        return stringBuilder.substring(0, stringBuilder.length() - 2);
    }

    @Override
    public String toString() {
        return "TypeOfFlower{" +
                "price=" + price +
                "} " + super.toString();
    }
}
