package com.mycompany.app.estructura;

import com.mycompany.app.modelo.Bala;
import com.mycompany.app.modelo.Casilla;

import entorno.Entorno;

//abstracto
public interface Estructura {
	
	public void colisionBala(Bala bala, Casilla casilla);
	public void destruir(Casilla casilla);
	public void dibujar(Entorno unEntorno, Casilla casilla);
}

