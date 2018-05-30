package _ITPH_Sports_Demo;

public class PlaySport {
	
private String name;

public static void main(String[] args) {
	// INSTANCE OF TABLE TENNIS
	TableTennis ttPlayer1 =  new TableTennis("Marcus", 32);
	
	TableTennis ttPlayer2 =  new TableTennis("Allen", 26);
	
	System.out.println(ttPlayer1.getName()+" "+ttPlayer1.getAge());
	
	System.out.println(ttPlayer2.getName()+" "+ttPlayer2.getAge());
	
	// INSTANCE OF VOLLEYBALL
	Volleyball volleyballPlayer1 =  new Volleyball("Jake", 34);
	
	System.out.println(volleyballPlayer1.getName()+" "+volleyballPlayer1.getAge());
	
	
	// Try to set the volume less than min
	
	
	// DISPLAY
	System.out.println(ttPlayer1.toString());
	
	System.out.println(volleyballPlayer1.toString());
	
	}

}




