/*
The program must accept the name and the price of N mobiles as the input. The program must sort the
mobiles based on the price in descending order. If two or more mobiles have the same price then the
program must sort those mobiles based on the name. Finally, the program must print the name and the
price of N mobiles as the output.
Please define the class Mobile so that the program runs successfully.


Input:
4
XoomK6Pro 8999
AbciOi 7999
BBGalaxyM30 9999
XoomC15 8999

Output:
BBGalaxyM30 9999
XoomC15 8999
XoomK6Pro 8999
AbciOi 7999

Explanation:
Here N = 4, the name and the price of the 4 mobiles are given below.
XoomK6Pro 8999
AbciOi 7999
BBGalaxyM30 9999
XoomC15 8999
After sorting the mobiles based on the given conditions, the mobiles become
BBGalaxyM30 9999
XoomC15 8999
XoomK6Pro 8999
AbciOi 7999

 */

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