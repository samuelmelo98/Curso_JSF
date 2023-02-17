package model;

import lombok.Data;
import model.enums.Turno;

import java.io.Serializable;

@Data
public class Estudante implements Serializable {
    private String nome = "samuel";
    private String sobreNome= "melo";
    private float nota1 = 0;
    private float nota2 = 10;
    private float nota3;
    private Turno turno = Turno.NOTURNO;
}
