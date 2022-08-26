public class Program {
    public static void main(String[] args) {
        EmailRemetente usuario = new EmailRemetente("diretoria@diretoria", "fulano", new Destinatario("Diretor solicitando uma reunião de apresentação de indicadores. ", "diretoria@diretoria", "Solicito uma reunião para a apresentação de indicadores."  ));

        System.out.println(usuario);

    }
}
