public class EmailRemetente {
    public String email;

    public String nome;

    public Destinatario emailDestinatario;

    public Destinatario getEmailDestinatario() {
        return emailDestinatario;
    }

    public void setEmailDestinatario(Destinatario emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }

    public EmailRemetente() {
    }

    public EmailRemetente(String email, String nome, Destinatario emailDestinatario) {
        this.email = email;
        this.nome = nome;
        this.emailDestinatario = emailDestinatario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void enviarEmail(Destinatario emailDestinatario, String nome, String email){
        this.emailDestinatario = emailDestinatario;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", emailDestinatario=" + emailDestinatario +
                '}';
    }
}
