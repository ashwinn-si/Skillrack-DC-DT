class Shape {

    public double perimeter(double radius) {

        return (2.0 * (22.0 / 7.0) * radius);
    }

    public int perimeter(int side) {

        return (4 * side);
    }

    public int perimeter(int length, int breadth) {

        return (2 * (length + breadth));
    }
}