package Checkpoint01;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //instanciando 4 alunos
        Alunos aluno1 = new Alunos("Lucas Gabriel","Lucas","lucas@gmail.com","994236854","Jojutsu, Iaijutsu, Kenjutsu",3,true);
        Alunos aluno2 = new Alunos("Afonso Dallacqua","Dallacqua","afonso@gmail.com","994236823","Iaijutsu, Kenjutsu",2,true);
        Alunos aluno3 = new Alunos("Denis Araujo","Araujo","araujo@gmail.com","994240376","Jojutsu, Kenjutsu",2,false);
        Alunos aluno4 = new Alunos("Tadeu Almeida","Almeida","almeida@gmail.com","942254324","Kenjutsu",1,true);

        //instanciando 4 Dojos
        Dojo dojo1 = new Dojo("Aclimação","Rua das amoreiras, Aclimação, 199",1350.0);
        Dojo dojo2 = new Dojo("ABC-Santo André","R. Santo André, 661",800.0);
        Dojo dojo3 = new Dojo("Campinas","Rua Guido Caloi, Itaim Bibi, 3959",1800.0);
        Dojo dojo4 = new Dojo("Barra Funda","R. Joaquim Távora, 605",2000.0);

        //adicionando alunos no dojo2
        dojo2.addAluno(aluno2);
        dojo2.addAluno(aluno3);
        dojo2.addAluno(aluno4);

        //adicionando aluno no dojo4
        dojo4.addAluno(aluno1);

        //salvando a lista de alunos de cada dojo em uma variável
        List<Alunos> alunosDojo1 = dojo1.getAlunos();
        List<Alunos> alunosDojo2 = dojo2.getAlunos();
        List<Alunos> alunosDojo3 = dojo3.getAlunos();
        List<Alunos> alunosDojo4 = dojo4.getAlunos();

        //percorrendo os arrays de alunos e somando o valor das taxas que os alunos pagam para cada Dojo
        for (int i = 0; i< alunosDojo1.size(); i++){
            dojo1.setTotalTaxaDjo(dojo1.getTotalTaxaDojo()+alunosDojo1.get(i).calcularTaxaDojo());
        }
        for (int i = 0; i< alunosDojo2.size(); i++){
            dojo2.setTotalTaxaDjo(dojo2.getTotalTaxaDojo()+alunosDojo2.get(i).calcularTaxaDojo());
        }
        for (int i = 0; i< alunosDojo3.size(); i++){
            dojo3.setTotalTaxaDjo(dojo3.getTotalTaxaDojo()+alunosDojo3.get(i).calcularTaxaDojo());
        }
        for (int i = 0; i< alunosDojo4.size(); i++){
            dojo4.setTotalTaxaDjo(dojo4.getTotalTaxaDojo()+alunosDojo4.get(i).calcularTaxaDojo());
        }

        //instanciando 4 funcionários, 1 para cada dojo
        Funcionarios funcionariosDojo1 = new Funcionarios();
        Funcionarios funcionariosDojo2 = new Funcionarios();
        Funcionarios funcionariosDojo3 = new Funcionarios();
        Funcionarios funcionariosDojo4 = new Funcionarios();

        //instanciando 3 coordenadores
        Coordenadores coordenador1 = new Coordenadores("Anjoletto",2400.0,"Jojutsu, Iaijutsu");
        Coordenadores coordenador2 = new Coordenadores("Weber",2400.0,"Iaijutsu, Kenjutsu");
        Coordenadores coordenador3 = new Coordenadores("Roger",1600.0,"Kenjutsu");


        //instanciando 3 administrativos
        Administrativo administrativo1 = new Administrativo("Akemi", 1600.00);
        Administrativo administrativo2 = new Administrativo("Pedreschi", 1600.00);
        Administrativo administrativo3 = new Administrativo("Jones", 1600.00);





        //printando os dados de cada Dojo

        System.out.println("Situação financeira do Dojo "+dojo1.getNome()+", esse mês: R$"+ dojo1.getBalanco());
        System.out.println("Lista de alunos do Dojo"+dojo1.getNome()+": \n"+ alunosDojo1.toString());
        System.out.println("\n --------------------------------------------------------------------------------------------- \n");

        System.out.println("Situação financeira do Dojo "+dojo2.getNome()+", esse mês: R$"+ dojo2.getBalanco());
        System.out.println("Lista de alunos do Dojo"+dojo2.getNome()+": \n"+ alunosDojo2.toString());
        System.out.println("\n --------------------------------------------------------------------------------------------- \n");

        System.out.println("Situação financeira do Dojo "+dojo3.getNome()+", esse mês: R$"+ dojo3.getBalanco());
        System.out.println("Lista de alunos do Dojo"+dojo3.getNome()+": \n"+ alunosDojo3.toString());
        System.out.println("\n --------------------------------------------------------------------------------------------- \n");

        System.out.println("Situação financeira do Dojo "+dojo4.getNome()+", esse mês: R$"+ dojo4.getBalanco());
        System.out.println("Lista de alunos do Dojo "+dojo4.getNome()+": \n"+alunosDojo4.toString());
        System.out.println("\n --------------------------------------------------------------------------------------------- \n");


    }
}

