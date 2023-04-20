import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");

        Gerente user0 = new Gerente();
        user0.setIdFunc(0);
        user0.setNome("Andre");
        user0.setEmail("gerente@email.com");
        user0.setDocumento("0");
        user0.setLogin("gerente");
        user0.setSenha("gerente123");

        Secretaria user1 = new Secretaria();
        user1.setIdFunc(1);
        user1.setNome("Nelma");
        user1.setEmail("secretaria@email.com");
        user1.setDocumento("1");
        user1.setTelefone("(19) 9999-9999");
        user1.setRamal("2004");

        Operador user2 = new Operador();
        user2.setIdFunc(2);
        user2.setNome("Douglas");
        user2.setEmail("TI.2006@email.com");
        user2.setDocumento("2");
        user2.setValorHora(8.5);

        RegistroPonto registro0 = new RegistroPonto();
        registro0.setIdRegPonto(0);
        registro0.setFunc(user0);
        registro0.setDataRegistro(LocalDate.now());
        Thread.sleep(1000);
        registro0.setHoraEntrada(LocalDateTime.now());

        RegistroPonto registro1 = new RegistroPonto();
        registro1.setIdRegPonto(0);
        registro1.setFunc(user1);
        registro1.setDataRegistro(LocalDate.now());
        Thread.sleep(1000);
        registro1.setHoraEntrada(LocalDateTime.now());

        RegistroPonto registro2 = new RegistroPonto();
        registro2.setIdRegPonto(0);
        registro2.setFunc(user2);
        registro2.setDataRegistro(LocalDate.now());
        Thread.sleep(1000);
        registro2.setHoraEntrada(LocalDateTime.now());

        Thread.sleep(1000);
        registro0.setHoraSaida(LocalDateTime.now());
        Thread.sleep(1000);
        registro1.setHoraSaida(LocalDateTime.now());
        Thread.sleep(1000);
        registro2.setHoraSaida(LocalDateTime.now());

        registro0.apresentarRegistroPonto();
        System.out.println();
        registro1.apresentarRegistroPonto();
        System.out.println();
        registro2.apresentarRegistroPonto();
    }
}