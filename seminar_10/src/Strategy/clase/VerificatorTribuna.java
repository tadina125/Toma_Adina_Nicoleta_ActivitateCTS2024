package Strategy.clase;

public class VerificatorTribuna implements Verificator{
    @Override
    public void verifica(String nume) {
        System.out.println("Se verifica bagajele suporterului: " + nume);
    }
}
