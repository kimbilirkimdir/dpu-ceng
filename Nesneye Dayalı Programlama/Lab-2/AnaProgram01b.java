package ndk02;

public class AnaProgram01b {
	private Insan oktay, serkan;
	private Araba rover;
	

	public static void main(String[] args) {
		AnaProgram01b nesne = new AnaProgram01b();
		nesne.oktay = new Insan( "Oktay Sinano�lu" );
		nesne.rover = new Araba( "34 OS 1934" );
		nesne.oktay.setAraba( nesne.rover );
		System.out.println( nesne.oktay.kendiniTanit() );
		nesne.serkan = new Insan( "Serkan An�l�r" );
		System.out.println( nesne.serkan.kendiniTanit() );
	}

}
