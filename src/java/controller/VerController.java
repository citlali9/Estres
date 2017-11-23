/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author heltonsmith
 */
@Controller
@RequestMapping("/ver.htm") //url patter
public class VerController {

    //siempre los métodos deben retornar String
    // acceder a una parte de una sesion, model
    // accedemos al controlador por la url
    @RequestMapping(method = RequestMethod.GET)
    public String otroMetodo(Model model) {
        return "index";
    }

    // todo lo que retorna un controlador es una vista
    // castea a un string en rut
    @RequestMapping(method = RequestMethod.POST)
    public String recibir(@RequestParam("uno") String uno, @RequestParam("dos") String dos,
            @RequestParam("tres") String tres, Model model) {

        boolean part1, part2, part3, part4;
        //Pregunta 1
        if (uno.trim().equals("Si")) {
            part1 = true;
        } else {
            part1 = false;
        }
        //Pregunta 2
        if (dos.trim().equals("Si")) {
            part2 = true;
        } else {
            part2 = false;
        }

        //Pregunta 3
        if (tres.trim().equals("Si")) {
            part3 = true;
        } else {
            part3 = false;
        }
        //Pregunta 4
        if (tres.trim().equals("Si")) {
            part4 = true;
        } else {
            part4 = false;
        }

        if (part1 == true && part2 == true && part3 == true && part4 == true) {

            String a = "ALERTA TIENES UN GRADO DE ESTRES PELIGROSO";
            // a mi modelo agrega un string a y asigna err
            model.addAttribute("hola", a);
            return "estres";
        }
        if (part1 == true && part2 == true && part3 == true && part4 == false){
            
            String a = "ALERTA TIENES UN GRADO DE ESTRES PELIGROSO AUNQUE TU PIENSAS QUE NO ES ASI!! :O ";
            // a mi modelo agrega un string a y asigna err
            model.addAttribute("hola", a);
            return "estres"; 
        }
        
         if (part1 == true && part2 == true && part3 == false && part4 == false){
            
            String a = "Tienes estres pero no tanto relajate más aun puedes :O ";
            // a mi modelo agrega un string a y asigna err
            model.addAttribute("hola", a);
            return "estres"; 
        }
          if (part1 == true && part2 == false && part3 == false && part4 == false){
            
            String a = "Sueles estresarte pero nada que no puedas controlar!! :O ";
            // a mi modelo agrega un string a y asigna err
            model.addAttribute("hola", a);
            return "estres"; 
        }
           if (part1 == true && part2 == true && part3 == true && part4 == false){
            
            String a = "ALERTA TIENES UN GRADO DE ESTRES PELIGROSO AUNQUE TU PIENSAS QUE NO ES ASI!! :O ";
            // a mi modelo agrega un string a y asigna err
            model.addAttribute("hola", a);
            return "estres"; 
        }
            if (part1 == false && part2 == false && part3 == false && part4 == false){
            
            String a = "Genial!! :O  Felicidades Manejas muy bien los momentos dificiles";
            // a mi modelo agrega un string a y asigna err
            model.addAttribute("hola", a);
            return "estres"; 
        }
        return null;
    }
    
}
