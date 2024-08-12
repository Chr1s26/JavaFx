

public class NamedRunnable implements Runnable {
    private String name;

    public NamedRunnable(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Greetings from runnable " + name + "!");
    }
}
