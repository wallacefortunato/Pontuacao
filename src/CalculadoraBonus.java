public class CalculadoraBonus {
    public int bonusDoDia;

    public int bonus(Usuario usuario){
        int multiplicador = bonusDoDia;

        if (usuario.vip) multiplicador *= 5;

        return multiplicador;
    }
}
