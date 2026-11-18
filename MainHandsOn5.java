public class MainHandsOn5 {
    public static <T extends Comparable<T>> boolean isEqual(T a, T b) {
        return a.compareTo(b) == 0;
    }

    public static void main(String[] args) {
        System.out.println("Integer (5 vs 5): " + isEqual(5, 5));
        System.out.println("String (Hello vs World): " + isEqual("Hello", "World"));
        System.out.println("Double (3.14 vs 3.14): " + isEqual(3.14, 3.14));
        System.out.println("Character ('A' vs 'B'): " + isEqual('A', 'B'));
    }
}