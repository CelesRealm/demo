
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // private constructor
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton Instance Accessed");
    }

    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        obj.showMessage();
    }
}
