package service;

import model.DadosPagamento;
import model.Usuario;
import repository.UsuarioRepository;

import java.util.List;

public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void cadastrarUsuario(Usuario usuario) {

    }

    public Usuario login(String email, String senha) {

    }

    public void atualizarDados(Usuario usuario) {

    }

    public void deletarUsuario(String cpf) {

    }

    public Usuario buscarPorCpf(String cpf) {

    }

    public List<Usuario> buscarPorNome(String nome) {

    }

    public List<Usuario> listarTodos() {

    }

    public void atualizarDadosPagamento(int usuarioId, DadosPagamento dados) {

    }

    public void configurarPreferenciasLembrete(int usuarioId, PreferenciaLembrete preferencia) {

    }

    public void atualizarDesejoReceberPromocoes(int usuarioId, boolean desejaReceber) {

    }

}
