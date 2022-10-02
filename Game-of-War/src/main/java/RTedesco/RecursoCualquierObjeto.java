package main.java.RTedesco;

public class RecursoCualquierObjeto {

    private int priority;
    private Objeto test;

    public int getPrio() {
        return priority;
    }
    public void setPrio(int priority) {
        this.priority = priority;
    }
    public Objeto getItem() {
        return test;
    }
    public void setItem(Objeto item) {
        this.test = item;
    }
    public RecursoCualquierObjeto(int priority, Objeto item) {
        this.priority = priority;
        this.test = item;
    }
    public RecursoCualquierObjeto(Objeto test){
        this.test=test;
    }
    public String imprimir() {
        return  ""+ this.priority + " " + this.test.getItem();

    }

    
}
