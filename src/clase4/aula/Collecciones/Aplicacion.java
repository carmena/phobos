/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4.aula.Collecciones;

import clase2.aula.zoologico.Animal;
import clase2.aula.zoologico.Gallina;
import clase2.aula.zoologico.Tigre;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/**
 *
 * @author PFR
 */
public class Aplicacion {
    public static void main(String[] args) {
        Aplicacion.ejemplaoListAnimal();
    }
     public static void ejemplaoListAnimal() {
         Tigre tigreJoge= new Tigre("jorje");
         Tigre tigrePaco= new Tigre("paco");
         Gallina gallinaManba= new Gallina("Manba");
         
        // List<Animal> litaAnimal = new ArrayList<Animal>();
         Set<Animal> litaAnimal = new HashSet<Animal>();
         litaAnimal.add(tigreJoge);
         litaAnimal.add(tigrePaco);
         litaAnimal.add(gallinaManba);
         litaAnimal.add(gallinaManba);
         for (Animal e :litaAnimal ) {
             System.out.println("Animal: "+ e.getNombre());
         }
         
         
     }
    
    
    
       public static void ejemplaHashMap() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    	Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    	Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        
        // HashMap
        HashMap<Integer, Estudiante> mapa = new HashMap<Integer, Estudiante>();
        mapa.put(100525, e1);
        mapa.put(100526, e2);
        mapa.put(100527, e3);
        
        Estudiante e = mapa.get(100526);
        System.out.println(e.getNombres() );

        Collection<Estudiante> co = mapa.values();
        for (Estudiante es : co) {
		System.out.println(es.getNombres());
		}        

       }
    
    
    
   public static void ejemploHashSet() {
              
    	Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    	Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    	Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        
        // HashSet
        HashSet<Estudiante> setEstudiante = new HashSet<Estudiante>();
        setEstudiante.add(e1);
        setEstudiante.add(e2);
        setEstudiante.add(e3);
        setEstudiante.add(e1);
        
        for (Estudiante e : setEstudiante) {
		System.out.println(e.getNombres() + " " + e.getApellidos());
	}

   }
     public static void ejemploLinkedList() {
         Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    	Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    	Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        
        // LinkedList
        LinkedList<Estudiante> listadoEstudiante = new LinkedList<Estudiante>();
        listadoEstudiante.addFirst(e1);
        listadoEstudiante.add(e2);
        listadoEstudiante.addLast(e3);
        
         for (Estudiante estuduante: listadoEstudiante) {
             
         }
        
        ListIterator<Estudiante> ite = listadoEstudiante.listIterator();
        while(ite.hasNext()){
            Estudiante e = (Estudiante) listadoEstudiante.poll();
            System.out.println(e.getNombres());
        }
        System.out.println(listadoEstudiante.size());

     }
    public static void ejemploArrayList() {
        
    Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    	Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    	Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        
        // ArrayList
    	List<Estudiante> litaEstuduantes = new ArrayList<Estudiante>();
      litaEstuduantes.add(e3);
      litaEstuduantes.add(e2);
      litaEstuduantes.add(e1);
        
      Collections.sort(litaEstuduantes);
        
        for (Estudiante e : litaEstuduantes) {
		System.out.println(e.getNombres() + " " + e.getApellidos());
	}

    }
    
}
