public class MessagePrinter{
    public void printMessage(String name) {
        System.out.println("hello " + name);
    }
    public static void main(String[] args) {
        MessagePrinter m = new MessagePrinter();
        m.printMessage("Geek");
    }
}

