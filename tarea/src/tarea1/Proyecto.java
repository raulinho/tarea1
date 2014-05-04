package tarea1;

public class Proyecto {
	private int largoTotalX;
	private int largoTotalY;
	protected String colorBordes;
	protected String colorFondo;
	
	public Proyecto(){
		this.largoTotalX = 800;
		this.largoTotalY = 600;
		this.colorBordes = "Negro";
		this.colorFondo = "Plomo";
	}
	
	public void getLargo(int largo){
		System.out.println(largo);
	}
	
	public void getLargo(int largoUno, int largoDos){
		System.out.println("La resolucion de la interfaz es de: " +largoUno+"x"+largoDos);
	}
}

class Area1 extends Proyecto{
	private int posX;
	private int posY;
	private int largoTotalX;
	private int largoTotalY;
	protected String figUno;
	protected String figDos;
	protected String figTres;
	protected String figCuatro;
	
	public Area1(){
		super();
		this.posX = 50;
		this.posY = 500;
		this.largoTotalX = 200;
		this.largoTotalY = 50;
		this.figUno = "Cuadrado";
		this.figDos = "Circulo";
		this.figTres = "Flecha";
		this.figCuatro = "Inicio";
	}
	public void getLargo(int largoUno, int largoDos){
		System.out.println("El largo y ancho del Area1 es: "+largoUno+"x"+largoDos);
	}
}

class Area2 extends Area1{
	private int posX;
	private int posY;
	private int largoTotalX;
	private int largoTotalY;
	
	public Area2(){
		super();
		this.posX = 50;
		this.posY = 50;
		this.largoTotalX = 700;
		this.largoTotalY = 400;
	}
	public void getLargo(int largoUno, int largoDos){
		System.out.println("El largo y ancho del Area2 es: "+largoUno+"x"+largoDos);
	}
}
