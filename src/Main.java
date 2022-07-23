import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição: curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição: curso js");
        curso2.setCargaHoraria(5);

        Curso curso3 = new Curso();
        curso3.setTitulo("Angular");
        curso3.setDescricao("Descrição: curso angular");
        curso3.setCargaHoraria(5);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("professora Camila irá realizar a mentoria do curso de java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria de javaScript");
        mentoria2.setDescricao("professora Venilson irá realizar a mentoria do curso de js");
        mentoria2.setData(LocalDate.now());

        Mentoria mentoria3 = new Mentoria();
        mentoria3.setTitulo("mentoria de angular");
        mentoria3.setDescricao("professora Renan irá realizar a mentoria do curso de angular");
        mentoria3.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria1);

        System.out.println(curso2);
        System.out.println(mentoria2);
        
        System.out.println(curso3);
        System.out.println(mentoria3);

    }
}