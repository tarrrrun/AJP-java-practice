package smartphone;

public class smartphone {
	private int ram;
	private int storage;
	private String brand;
	private String model;
	private String color;
	
	
	public void playMusic() {
		System.out.println("Music Played!");
	}
	public void installApps() {
		System.out.println("Installed the app.");
	}
	smartphone(String name){
		public String phName = name;
	}
	
}

class Program {
	public static void main (String [] args) {
		smartphone sss = new smartphone("seven");
		sss.playMusic();
		
	}
}