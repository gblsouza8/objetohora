package objetohora;

public class Main {
    public static void main(String[] args) {
        Hora hora = new Hora();
        try {
            hora.setHora(21, 58, 59);
        } catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        }
        System.out.println(hora.toString());

        Hora hora2 = new Hora();

        try {
            hora2.setHora(25, 58, 59);
        } catch (IllegalArgumentException e) {
            System.out.printf("%s%n", e.getMessage());
        }

        System.out.println(hora2.toString());

    }
}