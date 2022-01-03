package VotacaoAssembleia.conjunto;
import VotacaoAssembleia.dominio.Associado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface  AssociadoRepository extends JpaRepository<Associado, Integer>{

    Integer countBycpf(String cpf);
}
