public class Destinatario {
    public String assunto;
    public String destinatário;

    public String conteudo;

    public Destinatario(String assunto, String destinatário, String conteudo) {
        this.assunto = assunto;
        this.destinatário = destinatário;
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDestinatário() {
        return destinatário;
    }

    public void setDestinatário(String destinatário) {
        this.destinatário = destinatário;
    }

    @Override
    public String toString() {
        return "Email{" +
                "assunto='" + assunto + '\'' +
                ", destinatário='" + destinatário + '\'' +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}
