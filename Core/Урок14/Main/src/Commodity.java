public class Commodity {
    String name;
    int length;
    int width;
    int weight;

    public Commodity(String name, int length, int width, int weight) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Commodity commodity = (Commodity) object;
        return length == commodity.length &&
                width == commodity.width &&
                weight == commodity.weight &&
                java.util.Objects.equals(name, commodity.name);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), name, length, width, weight);
    }
}
