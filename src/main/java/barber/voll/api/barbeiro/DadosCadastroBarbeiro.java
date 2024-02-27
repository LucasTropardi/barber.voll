package barber.voll.api.barbeiro;

import barber.voll.api.endereco.DadosEndereco;

public record DadosCadastroBarbeiro(String nome, String email, Especialidade especialidade, DadosEndereco endereco) {
}
