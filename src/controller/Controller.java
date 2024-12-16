package controller;

import model.Coche;
import service.crud.HibernateCrud;
import service.metodosclases.MetodosCoches;
import service.metodosclases.MetodosMultas;

import java.util.List;

public class Controller {

    public void logicaPrograma(){

        HibernateCrud crud = new HibernateCrud();
        MetodosCoches metodosCoches = new MetodosCoches();
        MetodosMultas metodosMultas = new MetodosMultas();

        /*
        crud.insertIntoCochesDB(metodosCoches.getCochesList());
        List<Integer> idCoches = crud.selectIdCoches();
        printIdsCoches(idCoches);

        crud.insertIntoMultasDB(metodosMultas.getMultasList(idCoches));
           */

        List<Coche> cocheList = crud.getCochesFromDb();

        for(Coche coche : cocheList){
            System.out.println(coche);
        }





    }

    private void printIdsCoches(List<Integer> isCochesList){
        System.out.println("Ids de los coches: ");
        for(Integer id : isCochesList){
            System.out.println(id);
        }
    }










}


