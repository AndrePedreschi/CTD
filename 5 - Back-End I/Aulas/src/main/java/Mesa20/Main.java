package Mesa20;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Empresa andaluziaAzeites = new Empresa("3646210001/500","Comércio e exportação de azeites Andaluzia");
        Funcionario funcionario1 = new Funcionario("Arivaldo", "Rambo", "31687946582",16000.0);
        Funcionario funcionario2 = new Funcionario("Texugo", "das Neves", "42658971256",26000.0);
        Funcionario funcionario3 = new Funcionario("Agnes", "Maria", "65987166942",36000.0);
        Funcionario funcionario4 = new Funcionario("Cleitinho", "Rouba Cabos", "31649196981",46000.0);

        andaluziaAzeites.addFuncionario(funcionario1);
        andaluziaAzeites.addFuncionario(funcionario2);
        andaluziaAzeites.addFuncionario(funcionario3);
        andaluziaAzeites.addFuncionario(funcionario4);

        FileOutputStream fo =null;
        try{
            fo = new FileOutputStream("ListaFuncionarios.txt");
            //ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);
            //objectOutputStream.writeObject(andaluziaAzeites.getFuncionarios());

            BufferedOutputStream bo = new BufferedOutputStream(fo);

            String s = String.valueOf(andaluziaAzeites.getFuncionarios());

            byte b[]=s.getBytes();
            bo.write(b);
            System.out.println("Foi escrito corretamente");
            bo.flush();
            bo.close();
            fo.close();

        }catch (IOException e){
            throw new RuntimeException(e);
        }

        //Recuperação dos dados

        List<Funcionario> funcionarios2 = null;
        FileInputStream fi = null;

        try{
            fi = new FileInputStream("ListaFuncionarios.txt");
            //ObjectInputStream ois = new ObjectInputStream(fi);
            BufferedInputStream bi = new BufferedInputStream(fi);

            //funcionarios2 = (ArrayList) ois.readObject();

            int i;
            while((i=bi.read()) != -1) {
                System.out.print((char)i);
            }

            bi.close();
            fi.close();

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
