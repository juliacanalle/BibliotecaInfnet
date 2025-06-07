package repository;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {

    List<Usuario> listaDeUsuarios = new ArrayList<>();

    public void salvar(Usuario usuario) {
        listaDeUsuarios.add(usuario);
    }

    public void deletar(String cpf) {
        Usuario usuarioParaRemover = null;
        for (Usuario usuario : listaDeUsuarios) {
            if (usuario.getCpf().equalsIgnoreCase(cpf)) {
                usuarioParaRemover = usuario;
            }
        }
        if (usuarioParaRemover != null) {
            listaDeUsuarios.remove(usuarioParaRemover);
            System.out.println(usuarioParaRemover + " foi removido do sistema com sucesso!");
            return;
        } else {
            System.out.println("Usuário não localizado com esse CPF.");
        }
    }

    public Usuario buscarPorCpf(String cpf) {
        for (Usuario usuario : listaDeUsuarios) {
            if (usuario.getCpf().equalsIgnoreCase(cpf))
                return usuario;
        }
        System.out.println("Usuário não localizado com esse CPF.");
        return null;
    }

    public Usuario buscarPorEmail(String email){
        for (Usuario usuario : listaDeUsuarios) {
            if (usuario.getCpf().equalsIgnoreCase(email))
                return usuario;
        }
        System.out.println("Usuário não localizado com esse e-mail.");
        return null;
    }

    List<Usuario> listarTodos() {
        return listaDeUsuarios;
    }
}
