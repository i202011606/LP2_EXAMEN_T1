package entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tbl_equipo_dental")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EquipoDental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="nro_equipo")
    @EqualsAndHashCode.Include
    private Integer nroEquipo;

    @Column(name="nombre")
    private String nombre;

    @Column(name="costo")
    private Double costo;

    @Column(name="fecha_adquisicion")
    private LocalDate fechaAdquisicion;

    @Column(name="estado")
    private String estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_dentista")
    private Dentista dentista;

    public String getEstadoDescripcion() {

        switch (estado) {
        case "N":
            return "Nuevo";
        case "A":
            return "Alquilado";
        case "R":
            return "Reparado";
        case "S":
            return "Segunda";
        default:
            return "Desconocido";
        }
    }
}