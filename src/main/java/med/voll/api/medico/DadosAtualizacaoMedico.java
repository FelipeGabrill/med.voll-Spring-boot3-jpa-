package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.dadosEndereco;

public record DadosAtualizacaoMedico( @NotNull Long id,
									  String name,
									  String telefone,
									  dadosEndereco endereco) {

}
