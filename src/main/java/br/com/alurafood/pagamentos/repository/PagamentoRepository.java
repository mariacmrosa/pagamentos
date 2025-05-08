package br.com.alurafood.pagamentos.repository;

import br.com.alurafood.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public class PagamentoRepository  extends JpaRepository<Pagamento, Long> {

}
