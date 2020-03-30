public class Human implements Comparable<Human>{
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Human o) {
        if(this.age==o.age) {
            return 0;
        } else if(this.age<o.age){
            return -1;
        }else {
            return 1;
        }
    }
}
