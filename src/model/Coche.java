package model;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "coche")
public class Coche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "matricula")
    private String matricula;

    @Column(name = "marca")
    private String marca;

    @OneToMany(mappedBy = "idcoche", fetch = FetchType.EAGER)
    private Set<model.Multa> multas = new LinkedHashSet<>();

    public Coche(Integer id, String matricula, String marca, Set<Multa> multas) {
        this.id = id;
        this.matricula = matricula;
        this.marca = marca;
        this.multas = multas;
    }

    public Coche(String matricula, String marca, Set<Multa> multas) {
        this.matricula = matricula;
        this.marca = marca;
        this.multas = multas;
    }

    public Coche(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }

    public Coche() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Set<model.Multa> getMultas() {
        return multas;
    }

    public void setMultas(Set<model.Multa> multas) {
        this.multas = multas;
    }

    @Override
    public String toString() {
        return "\nCoche: " +
                "\nid: " + id +
                "\nmatricula: " + matricula +
                "\nmarca: " + marca +
                "\nmultas: " + multas;
    }
}