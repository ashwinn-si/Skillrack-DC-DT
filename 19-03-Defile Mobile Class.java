class Mobile implements Comparable<Mobile> {
    String name;
    int price;

    void setName(String name) {
        this.name = name;
    }

    void setPrice(int price) {
        this.price = price;
    }

    String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Mobile other) {
        if (this.price != other.price) {
            return Integer.compare(other.price, this.price);
        }
        return this.name.compareTo(other.name);
    }
}