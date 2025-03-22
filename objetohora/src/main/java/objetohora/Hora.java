package objetohora;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;


    public void setHora(int hora, int minuto, int segundo)
    {
        if(hora >= 24 || hora < 0)
        {
            throw new IllegalArgumentException("Hora inválida...");
        }

        this.hora = hora;

        if(minuto >= 60 || minuto < 0)
        {
            throw new IllegalArgumentException("Minuto inválido...");
        }

        this.minuto = minuto;

        if(segundo >= 60 || segundo < 0)
        {
            throw new IllegalArgumentException("Segundo inválido...");
        }

        this.segundo = segundo;
    }

    public String toString()
    {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
