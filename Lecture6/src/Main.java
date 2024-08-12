
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//	 write your code here
//        List<Integer> list = new ArrayList<>();
//        list.add(Integer.valueOf(10));
//        list.add(20);
//        list.add(30);
//
//        System.out.println("Traversing List...");
//        for(Integer i:list)
//            System.out.println(i);
//        NamedThread greeting = new NamedThread("Fred");
//        greeting.start();
//        NamedThread a = new NamedThread("a");
//        a.start();
//        NamedThread b = new NamedThread("b");
//        b.start();
//        NamedThread c = new NamedThread("c");
//        c.start();
//        NamedThread d = new NamedThread("d");
//        d.start();
//
//
//        System.out.println("Thread has been started");
//
        NamedRunnable greetings = new NamedRunnable("Fred");
        Thread greetingsThread = new Thread(greetings);
        greetingsThread.start();

        System.out.print(Runtime.getRuntime().availableProcessors());
    }
}
