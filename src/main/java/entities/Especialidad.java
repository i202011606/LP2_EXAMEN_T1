package entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tbl_especialidad")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_especialidad")
    @EqualsAndHashCode.Include
    private Integer idEspecialidad;

    @Column(name="titulo")
    private String titulo;

    @Override
    public String toString() {
        return titulo;
    }
}