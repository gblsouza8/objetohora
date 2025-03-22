package objetohora;

public class Hora {
    // declara as variaveis de instancia
    private int hora;
    private int minuto;
    private int segundo;


    public void setHora(int hora, int minuto, int segundo)
    {
        // valida a hora
        if(hora >= 24 || hora < 0)
        {
            throw new IllegalArgumentException("Hora inválida, valores não serão alterados.");
        }

        // se validado, muda o valor da variavel de instancia
        this.hora = hora;

        // valida os minutos
        if(minuto >= 60 || minuto < 0)
        {
            throw new IllegalArgumentException("Minuto inválido, minutos e segundos não serão alterados.");
        }

        // se validado, muda o valor da variavel de instancia
        this.minuto = minuto;

        // valida os segundos
        if(segundo >= 60 || segundo < 0)
        {
            throw new IllegalArgumentException("Segundo inválido, segundos permenecerão zerados.");
        }

        // se validado, muda o valor da variavel de instancia
        this.segundo = segundo;
    }

    public String toString()
    {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
