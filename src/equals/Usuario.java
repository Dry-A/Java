package equals;

import java.util.Objects;

public class Usuario {
    String nome;
    String email;

    @Override
    public boolean equals(Object objetinho) {
        if (this == objetinho) return true;
        if (!(objetinho instanceof Usuario)) return false;
        Usuario usuario = (Usuario) objetinho;
        return Objects.equals(nome, usuario.nome) && Objects.equals(email, usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}