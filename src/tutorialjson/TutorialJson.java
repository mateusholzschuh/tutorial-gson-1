/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialjson;

import Modelo.Usuario;
import com.google.gson.Gson;
import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Mateus
 */
public class TutorialJson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // cria novo usuário
        Usuario u = new Usuario();
        
        // add as info
        u.setId(123);
        
        u.setNome("Mateus");
        
        u.setAdministrador(true);
        
        // pega data atual
        u.setRegistro(
                Date.from(Instant.now())
        );
        
        // nova instancia da biblioteca
        Gson g = new Gson();
        
        // CONVERTER OBJETO EM JSON
        System.out.println("CONVERTENDO OBJETO JAVA EM JSON\n");
        
        String objetoEmJson = g.toJson(u);
        
        System.out.println("Usuário [modelo java]");
        System.out.println(u);
        
        System.out.println("------------------>");
        
        System.out.println("Usuário [JSON]");
        System.out.println(objetoEmJson);
        
        
        // CONVERTER JSON EM OBJETO JAVA
        System.out.println("\n\n\nCONVERTENDO JSON EM OBJETO JAVA\n");
        
        String usuarioEmJson = "{\"id\":123,\"nome\":\"Pedro Henrique\",\"administrador\":false,\"registro\":\"Apr 1, 2014 8:12:45 PM\"}";
        
        // (objeto em string, nome da classe)
        Usuario novoUsuario = g.fromJson(usuarioEmJson, Usuario.class);
        
        System.out.println("Usuário [JSON]");
        System.out.println(usuarioEmJson);
        
        System.out.println("------------------>");
        
        System.out.println("Usuário [modelo java]");
        System.out.println(novoUsuario);
  
    }
    
}
