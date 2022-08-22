package Mesa19;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contatos> contatos = new ArrayList<>();
        Contatos contato01 = new Contatos("Arivaldo", "arivalds22@gmail.com", "(76)4497-5873");
        Contatos contato02 = new Contatos("Dêniz", "dez10@gmail.com", "(67)5497-2163");

        contatos.add(contato01);
        contatos.add(contato02);

        FileOutputStream fo =null;
        try{
            fo = new FileOutputStream("ListaContatos.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);
            objectOutputStream.writeObject(contatos);
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        //Recuperação dos dados

        List<Contatos> contatos2 = null;
        FileInputStream fi = null;

        try{
            fi = new FileInputStream("ListaContatos.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            contatos2 = (ArrayList) ois.readObject();
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }

        for(Contatos contato:contatos2){
            System.out.println(contato.getNome()+" | "+contato.getEmail()+" | "+contato.getTelefone());
        }

    }
}
