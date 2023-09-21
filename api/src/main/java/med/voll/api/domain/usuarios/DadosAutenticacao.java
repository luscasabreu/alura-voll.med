package med.voll.api.domain.usuarios;

import jakarta.validation.constraints.NotBlank;

public record DadosAutenticacao(String login, String senha) {
}
