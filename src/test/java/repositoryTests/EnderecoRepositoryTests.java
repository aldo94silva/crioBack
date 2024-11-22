package repositoryTests;


import com.crio.api.domain.endereco.Endereco;
import com.crio.api.repositorie.EnderecoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;
import java.util.UUID;

@DataJpaTest
public class EnderecoRepositoryTests {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Test
    public void deleteShouldDeleteObjectWhenIdExists(){

        long UUID = 1L;

        enderecoRepository.deleteById(UUID);

        Optional<Endereco> result = enderecoRepository.findById(UUID);
    }
}
