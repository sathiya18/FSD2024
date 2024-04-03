package ptu.cse.sathya;

public class DebuggingExample2 {
    public static void main(String[] args) {
        String message = null;
        printMessageUpperCase(message);
    }

  /* public static void printMessageUpperCase(String message) {
        // This line will throw a NullPointerException if message is null
        System.out.println(message.toUpperCase());
    }*/
    
  public static void printMessageUpperCase(String message) {
        if (message != null) {
            System.out.println(message.toUpperCase());
        } else {
            System.out.println("Message is null!");
        }
    }

}

