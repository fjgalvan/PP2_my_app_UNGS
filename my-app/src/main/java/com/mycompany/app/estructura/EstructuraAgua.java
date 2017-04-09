package com.mycompany.app.estructura;

import java.awt.Color;

import com.mycompany.app.modelo.Bala;
import com.mycompany.app.modelo.Casilla;
import com.mycompany.app.modelo.ObjetoGrafico;
import com.mycompany.app.modelo.objeto.Coordenada;
import com.mycompany.app.modelo.objeto.Imagen;

import entorno.Entorno;

public class EstructuraAgua extends ObjetoGrafico implements Estructura {
	//SE COMENTARON TODOS LOS @Override

	public EstructuraAgua()
	{
		//this.imagen = new Imagen("/PP2/src/imagen/agua.png");
		System.out.println("me construi , estructura agua");
	}
	
	
	public void colisionBala(){
		
	}

	//@Override
	public void colisionBala(Bala bala, Casilla casilla) 
	{
		// no hace nada
		
	}

	//@Override
	public void destruir(Casilla casilla) 
	{
		
		
	}

	//@Override
	public void dibujar(Entorno unEntorno, Casilla casilla) {
		//unEntorno.dibujarRectangulo(casilla.x, casilla.y, 20, 20, 0, Color.BLUE);
		
	}

	//@Override
	public void dibujar(Entorno ent, Coordenada c) {
		// TODO Auto-generated method stub
		ent.dibujarRectangulo(c.getX(), c.getY(), 20, 20, 0, Color.BLUE);
	}
}

