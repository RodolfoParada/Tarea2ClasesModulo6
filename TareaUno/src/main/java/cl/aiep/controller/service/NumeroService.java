package cl.aiep.controller.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class NumeroService {
	public List<Integer>numeros= new ArrayList<>();
	public List<Integer>nPares= new ArrayList<>();
	public List<Integer>nInpares= new ArrayList<>();
	

	public List<Integer>obtieneNumeros(){
		for(int i= 1; i<100; i++) {
			int numero= i; 
			numeros.add(numero);
		}return numeros;
		
	}
	public List<Integer>obtienePares(){
		for(int i= 0; i<numeros.size(); i++) {
			if(numeros.get(i)%2!=0) {
		    nPares.add(numeros.get(i));
		}
		}
		return nPares;
		
	}
	public List<Integer> obtieneInpares() {
		for(int i= 0; i<numeros.size(); i++) {
			if(numeros.get(i)%2!=0) {
		    nInpares.add(numeros.get(i));
			}
			
			}return nInpares;
		
	}

}
