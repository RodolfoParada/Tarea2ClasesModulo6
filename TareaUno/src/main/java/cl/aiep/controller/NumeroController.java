package cl.aiep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.aiep.controller.service.NumeroService;


@Controller
@RequestMapping("/")
public class NumeroController {

	@Autowired
	NumeroService service;
	
	
  @GetMapping("/")
  public String crearNumeros(final Model model) {
	  model.addAttribute("numeros",service.obtieneNumeros());
	  return "Index";
  }
  
  @GetMapping("/pares")
  public String obternerPares(final Model model) {
	  model.addAttribute("numeros",service.obtienePares());
	  return "Index";
  }
  @GetMapping("/inparespares")
  public String obternerInpares(final Model model) {
	  model.addAttribute("numeros",service.obtieneInpares());
	  return "Index";
  }
}
  

//  @GetMapping("/numeros")
//  public String verNumeros(final Model model) {
//     model.addAttribute("numeros",numeros);
//     System.out.println(numeros);
//     return "Index";
//

//  @GetMapping("/pares")
//  public String obtenerPares(final Model model) {
//     for (int i = 0; i < numeros.size(); i++) {
//     		if(numeros.get(i)%2==0) {
//     			nPares.add(numeros.get(i));
//     		}
//  }
//     model.addAttribute("pares", nPares);
//     return "Index";
//}
//@GetMapping("/inpares")
//public String obtenerInpares(final Model model) {
//   for (int i = 0; i < numeros.size(); i++) {
//   		if(numeros.get(i)%2==0) {
//   			nInpares.add(numeros.get(i));
//}
//}
//model.addAttribute("inpares" ,nInpares);
//return "Index";
//}
//}