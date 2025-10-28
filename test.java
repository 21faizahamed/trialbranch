public class test {
<<<<<<< Updated upstream
    static int a  = 1;
    static int b = 1;
    public static void main(String[] args) {
        if (a == b) {
            System.out.println("This is my test");            
=======
    static int a = 1;
    static int b = 1;

    public static void main(String[] args) {

        System.out.println("Code change test");
        if (a == b) {
            System.out.println("This is my test");
>>>>>>> Stashed changes
        } else {
            System.err.println();
        }
    }

}