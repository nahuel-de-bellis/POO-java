package leerTXT;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class Leer {
	
	public String contenido = " ";
	
	public void leer(String archivo)
	{
		
		try {
			
			FileReader r = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(r);
			String temp = " ";	
			while( temp != null){
				temp = buffer.readLine();
				if(temp != null){
					contenido += temp;
					}
			}
			
		} catch (Exception e) {

			System.out.println("ERROR "+e.getMessage());
		}
	}
	
	public void escribir(String archivo)
	{
		try {
			File f = new File(archivo);
			
			FileWriter w = new FileWriter(f);
			BufferedWriter buff = new BufferedWriter(w);
			PrintWriter pr  = new PrintWriter(buff);
			pr.write(contenido+"Texto ");
			pr.append("\nTexto");
			pr.close();
			buff.close();			
		}
		catch(Exception e) {
		}
	}
	
	

}
