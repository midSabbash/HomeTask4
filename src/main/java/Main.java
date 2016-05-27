import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws StackException {
        StackImpl stackImpl = new StackImpl(5);
        Arrays.fill(stackImpl.stack,'_');

        try {
            System.out.println("4 elements pushed:");
            stackImpl.push("E1");
            stackImpl.push("E2");
            stackImpl.push("E3");
            stackImpl.push("E4");
            stackImpl.print();
        } catch (StackException ex) {
            System.err.println(ex.getMessage());
        }

        try {
            System.out.println("2 elements popped:");
            stackImpl.pop();
            stackImpl.pop();
            stackImpl.print();
        }catch (StackException ex) {
            System.err.println(ex.getMessage());
        }

        try {
            System.out.println("3 elements pushed:");
            stackImpl.push("E5");
            stackImpl.push("E6");
            stackImpl.push("E7");
            stackImpl.print();
        } catch (StackException ex) {
            System.err.println(ex.getMessage());
        }

        try {
            System.out.println("Try overflow:");
            stackImpl.push("E8");
        }catch (StackException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Clearing:");
        stackImpl.clear();
        stackImpl.print();


        try {
            System.out.println("Try push after clearing:");
            stackImpl.push("E1");
            stackImpl.push("E2");
            stackImpl.print();
        } catch (StackException ex) {
            System.err.println(ex.getMessage());
        }

        try {
            System.out.println("Try underflow:");
            stackImpl.pop();
            stackImpl.pop();
            stackImpl.pop();
            stackImpl.pop();
            stackImpl.pop();
            stackImpl.pop();
        }catch (StackException ex) {
            System.out.println(ex.getMessage());
        }

    }
}



