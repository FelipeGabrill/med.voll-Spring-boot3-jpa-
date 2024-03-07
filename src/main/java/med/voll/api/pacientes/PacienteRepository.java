package med.voll.api.pacientes;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.validation.constraints.NotNull;

public interface PacienteRepository extends JpaRepository<Paciente,Long>{

	Page<Paciente> findAllByAtivoTrue(Pageable paginacao);

	Boolean findAtivoById(Long idPaciente);

}
