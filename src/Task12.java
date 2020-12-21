public class Task12 {
    public static void main(String[] args) {
        String a = "I like Java!!!";
        if (a.contains("Java") && a.startsWith("I like") && a.endsWith("!!!")) {
            System.out.println(a.toUpperCase());
        }

        System.out.println(a.replace('a', 'o').substring(7, 11));
    }
}
