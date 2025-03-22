package objetohora;

public class Main {
    public static void main(String[] args) {
        Hora hora = new Hora();
        hora.setHora(21, 58, 59);

        System.out.printf(hora.toString());
    }
}