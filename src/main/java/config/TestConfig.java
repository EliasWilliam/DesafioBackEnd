package config;

import VotacaoAssembleia.conjunto.*AssociadoRepository;
import VotacaoAssembleia.conjunto.*PautaRepository;
import VotacaoAssembleia.conjunto.*VotacaoRepository;
import VotacaoAssembleia.conjunto.*VotoRepository;
import VotacaoAssembleia.dominio.Associado;
import VotacaoAssembleia.dominio.Pauta;
import VotacaoAssembleia.gerenciador.PautaGerenciador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{

    @Autowired
    private AssociadoRepository associadoRepository;
    @Autowired
    private PautaRepository pautaRepository;
    @Autowired
    private PautaGerenciador pautaGerenciador;
    @Autowired
    private VotoRepository votoRepository;
    @Autowired
    private VotacaoRepository votacaoRepository;

    @Override
    public void run(String... args) throws Exception {
        Associado u1 = new Associado("Maria Brown", "19839091069");
        Associado u2 = new Associado( "Alex Green", "62289608068");
        Associado u3 = new Associado( "Pedrinho", "22345678900");
        Associado u4 = new Associado( "Davi", "73255600600");
        associadoRepository.saveAll(Arrays.asList(u1,u2,u3,u4));

        Pauta p1 = new Pauta("Votacao para aumentar numero de Sócios");
        Pauta p2 = new Pauta( "Reduzir taxa de juros dos Financiamentos");
        Pauta p3 = new Pauta( "Aprovar verba para propaganda",null);
        pautaRepository.saveAll(Arrays.asList(p1,p2,p3));