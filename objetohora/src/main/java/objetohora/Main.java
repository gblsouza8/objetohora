package objetohora;

public class Main {
    public static void main(String[] args) {
        // cria o objeto hora
        Hora hora = new Hora();

        // tenta mudar utilizando valores corretos...
        try {
            hora.setHora(21, 58, 59);
        } catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        }
        // como conseguiu mudar, irá exibir a hora inserida corretamente...
        System.out.println(hora.toString());

        // cria o objeto hora2
        Hora hora2 = new Hora();

        // tenta mudar utilizando um valor incorreto na hora...
        try {
            hora2.setHora(25, 58, 59);
        } catch (IllegalArgumentException e) {
            System.out.printf("%s%n", e.getMessage());
        }

        // como não conseguiu mudar, irá exibir a hora nos valores padrão(todos 0)
        System.out.println(hora2.toString());


            // cria o objeto hora3
            Hora hora3 = new Hora();

            // tenta mudar utilizando um valor incorreto na hora...
            try {
                hora3.setHora(21, 61, 59);
                } catch (IllegalArgumentException e) {
                    System.out.printf("%s%n", e.getMessage());
                }
        
            // como não conseguiu mudar, irá exibir a hora no valor correto e o minuto e o segundo não será alterado (ficará 0)
            System.out.println(hora3.toString());

    }
}