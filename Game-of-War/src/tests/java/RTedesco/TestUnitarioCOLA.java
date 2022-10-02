package tests.java.RTedesco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import main.java.RTedesco.RecursoCualquierObjeto;
import main.java.RTedesco.Objeto;
import main.java.RTedesco.UCPQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Predicate;

public class TestUnitarioCOLA {
    @Test
    public void CreandoUnaCola(){
        UCPQueue colaTest = new UCPQueue();
        assertNotNull(colaTest);
    }
    @Test
    public void AgregamosUnElementoSoloALaCola(){
        UCPQueue colaTest = new UCPQueue();
        Objeto obj= new Objeto("Rafineitor",12345);
        RecursoCualquierObjeto x1 = new RecursoCualquierObjeto(0, obj);
        colaTest.push(x1);
        assertEquals(1,colaTest.count());
    }
    @Test
    public void SacamosUnElementoSoloDeLaCola(){
        UCPQueue colaTest = new UCPQueue();
        Objeto obj= new Objeto("Rafineitor",12345);
        RecursoCualquierObjeto x1 = new RecursoCualquierObjeto(0, obj);
        colaTest.push(x1);
        assertEquals(x1,colaTest.pop());
        assertEquals(0,colaTest.count());
    }
    @Test
    public void ElementoPrimeroCargado(){
        UCPQueue colaTest = new UCPQueue();
        Objeto obj= new Objeto("Rafineitor",3);
        RecursoCualquierObjeto x1=new RecursoCualquierObjeto(0, obj);
        colaTest.push(x1);
        assertEquals(x1,colaTest.first());
    }
    @Test
    public void AgregamosVariosElementosALaCola(RecursoCualquierObjeto x5){ /*En este caso 5 Objetos*/
        UCPQueue colaTest = new UCPQueue();
        Objeto obj= new Objeto("Rafineitor",3);
        Objeto obj1= new Objeto("Breach",50);
        Objeto obj2= new Objeto("Chamber",99);
        Objeto obj3= new Objeto("Sova",7);
        Objeto obj4= new Objeto("Brimstone",85);
        RecursoCualquierObjeto x=new RecursoCualquierObjeto(obj);
        RecursoCualquierObjeto x1=new RecursoCualquierObjeto(3, obj1);
        RecursoCualquierObjeto x2=new RecursoCualquierObjeto(5, obj2);
        RecursoCualquierObjeto x3=new RecursoCualquierObjeto(2, obj3);
        RecursoCualquierObjeto x4=new RecursoCualquierObjeto(1, obj4);
        colaTest.push(x);
        assertEquals(x,colaTest.first(0)); 
        colaTest.push(x1);
        assertEquals(x1,colaTest.first(1));
        colaTest.push(x2);
        assertEquals(x2, colaTest.first(2));
        colaTest.push(x3);
        assertEquals(x3, colaTest.first(3));
        colaTest.push(x4);
        assertEquals(x4, colaTest.first(4));
        assertEquals(4,colaTest.count()); 
    }
    @Test
    public void SacamosVariosElementosALaCola(){
        UCPQueue colaTest = new UCPQueue();
        Objeto obj= new Objeto("Rafineitor",3);
        Objeto obj1= new Objeto("Breach",50);
        Objeto obj2= new Objeto("Chamber",99);
        Objeto obj3= new Objeto("Sova",7);
        Objeto obj4= new Objeto("Brimstone",85);
        RecursoCualquierObjeto x=new RecursoCualquierObjeto( obj);
        RecursoCualquierObjeto x1=new RecursoCualquierObjeto(3, obj1);
        RecursoCualquierObjeto x2=new RecursoCualquierObjeto(5, obj2);
        RecursoCualquierObjeto x3=new RecursoCualquierObjeto(2, obj3);
        RecursoCualquierObjeto x4=new RecursoCualquierObjeto(1, obj4);
        colaTest.push(x);
        colaTest.push(x1);
        colaTest.push(x2);
        colaTest.push(x3);
        colaTest.push(x4);
        colaTest.pop();
        assertEquals(1,colaTest.count());
    }
    @Test
    public void SacamosCorrectamenteDeLaCola(){ //Verificamos recuperando el proximo item que se encuentra en el tope y se lo quita de la cola//
        UCPQueue colaTest = new UCPQueue();
        Objeto obj= new Objeto("Rafineitor",3);
        Objeto obj1= new Objeto("Breach",50);
        Objeto obj2= new Objeto("Chamber",99);
        Objeto obj3= new Objeto("Sova",7);
        Objeto obj4= new Objeto("Brimstone",85);
        RecursoCualquierObjeto x=new RecursoCualquierObjeto(5, obj);
        RecursoCualquierObjeto x1=new RecursoCualquierObjeto(3, obj1);
        RecursoCualquierObjeto x2=new RecursoCualquierObjeto(5, obj2);
        RecursoCualquierObjeto x3=new RecursoCualquierObjeto(2, obj3);
        RecursoCualquierObjeto x4=new RecursoCualquierObjeto(1, obj4);
        colaTest.push(x);
        assertEquals(x,colaTest.first(0)); 
        colaTest.push(x1);
        assertEquals(x1,colaTest.first(1)); 
        colaTest.push(x2);
        assertEquals(x2,colaTest.first(2)); 
        colaTest.push(x3);
        assertEquals(x3,colaTest.first(3)); 
        colaTest.push(x4);
        assertEquals(x4,colaTest.first(0));
        colaTest.pop();
        assertEquals(x,colaTest.first());
    }
}
