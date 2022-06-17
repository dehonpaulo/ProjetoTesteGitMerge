public class TestApplication {
    public static void main(String[] args) {
        System.out.println("Primeira alteração na branch main");
        System.out.println(metodo1());
        System.out.println(metodo2());
    }

    public static String metodo2() {
        return "Primeira alteração na segunda branch";

    }

    public static String metodo1() {
        return "Segunda alteração na branch main";
    }
}
