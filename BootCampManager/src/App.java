import java.time.LocalDate;

import domain.BootCamp;
import domain.Curso;
import domain.Desenvolvedor;
import domain.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Esse é um curso da linguagem de programação Java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso JavaScript");
        curso1.setDescricao("Esse é um curso da linguagem de programação JavaScript.");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setDescricao("Mentoria Java");
        mentoria1.setDescricao("Nova mentoria da linguagem Java.");
        mentoria1.setData(LocalDate.now());
        
        BootCamp bootCamp1 = new BootCamp();
        bootCamp1.setNome("bootcamp java developer");
        bootCamp1.setDescricao("descrição do bootcamp");
        bootCamp1.getContedudoInscrito().add(curso1);
        bootCamp1.getContedudoInscrito().add(curso2);
        bootCamp1.getContedudoInscrito().add(mentoria1);

        Desenvolvedor dev = new Desenvolvedor();
        dev.setNome("joao");
        dev.inscreverBootCamp(bootCamp1);
        dev.progredir();
        dev.calcularTotalXp();
    }
}
