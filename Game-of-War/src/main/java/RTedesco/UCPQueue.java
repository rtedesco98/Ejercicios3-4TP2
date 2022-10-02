package main.java.RTedesco;

import java.util.ArrayList;
import java.util.function.Predicate;

public class UCPQueue {
    ArrayList<RecursoCualquierObjeto> cola= new ArrayList<RecursoCualquierObjeto>();


    public void push(RecursoCualquierObjeto x1){ 
        cola.add(x1);
    }
    public RecursoCualquierObjeto pop(){
        Predicate<RecursoCualquierObjeto> proridad = (RecursoCualquierObjeto s) -> ((RecursoCualquierObjeto) s).getPrio() >= 1;

        RecursoCualquierObjeto aux=new RecursoCualquierObjeto(1000000,null); 
        ArrayList<RecursoCualquierObjeto> aux2= new ArrayList<RecursoCualquierObjeto>();
        if(cola.stream().anyMatch(proridad)){
            for (Object AgentsOfWar : cola) {
                if(((RecursoCualquierObjeto) AgentsOfWar).getPrio() >= 1){
                    aux2.add((RecursoCualquierObjeto) AgentsOfWar);
                }
            }
            for (RecursoCualquierObjeto AgentsOfWar : aux2) {
                if(((RecursoCualquierObjeto) AgentsOfWar).getPrio() < aux.getPrio()){
                    aux=(RecursoCualquierObjeto) AgentsOfWar;
                }
            }
            for (RecursoCualquierObjeto AgentsOfWar : cola) {
                if(((RecursoCualquierObjeto) AgentsOfWar).getPrio() == aux.getPrio()){
                    cola.remove(AgentsOfWar);
                    return AgentsOfWar;
                }
            }
        }
        else{
            return cola.remove(0);
        }
        return null;
    }
    public Object first(int i){ 
        return cola.get(0);
    }
    public int count(){ 
        return cola.size();
    }
    public Object first() {
        return null;
    }
}
