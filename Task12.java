public class Task12 {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        boolean cont;
        cont = str.contains("Java");
        boolean start;
        start = str.startsWith("I like");
        boolean end;
        end = str.endsWith("!!!");
        if (cont == true & start == true & end == true) {
            System.out.println(str.toUpperCase());
        }
        String upd_str = str.replace('a', 'o');
        System.out.println(upd_str.substring(7, 11));
    }
}
