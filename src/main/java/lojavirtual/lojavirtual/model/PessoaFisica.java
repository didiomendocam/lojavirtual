package lojavirtual.lojavirtual.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "pessoa_fisica", schema = "public")
@PrimaryKeyJoinColumn(name = "id")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaFisica extends Pessoa {

    @Column(nullable = false)
    private String cpf;

    @Temporal(TemporalType.DATE)
    private LocalDate dataNascimento;
}
