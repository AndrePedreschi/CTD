package Aula07_Flyweight_Pattern.model;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.Map;

public class ComputerFactory {

    private static Map<String, Computer> macFlyweigth = new HashMap<>();

    public Computer getComputer(int ram, int disco){
        String id= "id"+ram+" : "+disco;
        System.out.println(id);

        if(!macFlyweigth.containsKey(id)){
            macFlyweigth.put(id, new Computer(ram,disco));
            System.out.println("\nPc criado com suceso");
            return macFlyweigth.get(id);
        }
        System.out.println("\nPC obtido");
        return macFlyweigth.get(id);
    }
}
