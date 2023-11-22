package graphics;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Héctor Quej Cosgaya
 * @author Jose Aguilar Canepa
 * 
 * ¡Esta clase necesita tu ayuda!
 */
public class Triangulo extends FiguraGrafica {
    private	int[]	x	=	{50,	15,	85};
private	int[]	y	=	{15,	65,	65};

    @Override
    public void dibujar(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void encojer(Graphics g) {
        g.drawPolygon(x,	y,	3);
}

    @Override
    public void agrandar(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cambiarColor(Graphics g, Color c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mover(Graphics g, String direccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
