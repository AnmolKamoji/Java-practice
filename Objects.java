class OOPS {
    String color;
    String type;

    public void write() {
        System.out.println("Write Anything");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

public class Objects {
    public static void main(String[] args) {
        OOPS pen1 = new OOPS();
        pen1.color = "blue";
        pen1.type = "ballpen";
        pen1.write();
        OOPS pen2 = new OOPS();
        pen2.color = "baby blue";
        pen2.type = "gel";
        pen2.printColor();
    }
}
