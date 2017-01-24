/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import javax.inject.Inject;

/**
 *
 * @author hp
 */

@Controller
public class HelloController {
    
    @Inject Result result;
    
    @Get("/")
    public void index(){
        result.include("message", "Bonjour Vraptor 4");
    }
    
}
