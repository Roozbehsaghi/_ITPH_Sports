package _ITPH_Sports_Demo;

public class TableTennis extends Sport implements CanPlay {
	
	// STATIC VARIABLE
	public static final int MIN_AGE = 20;
	public static final int MAX_AGE = 50; 
	
	public static final String DEFAULT_NAME = "Table Tennis";
	public static final int DEFAULT_AGE = 25;
	
	// INSTANCE VARIABLE
	private int players = 1;
	private String name = "Marcus";
	private int age = 32;
	
	// ACCESSOR METHODS
	public String getName() {
		
		return name;
		
	}
	public void setName(String newName) {
		
	}
	
	   public int getAge() {
		   
	      return age;
	   }
	
	public void setAge(int newAge) {
		
	int new_age = Math.min(newAge,TableTennis.MAX_AGE);
	
	players = Math.max(new_age,TableTennis.MIN_AGE);
	
   }
   
	//Constructor
    public TableTennis(String newName, int newAge) {
    	
        this.name = newName;
        this.age = newAge;
        
        if (getName() == null) {
        	
        	setName(DEFAULT_NAME);
        }
        
    }
	
	// TO STRING METHOD
	public String toString() {
		
	      return "Sport:"+ this.DEFAULT_NAME+ ", players name = " + this.getName()+" , players age = "+ this.getAge();
	      
	}
	@Override
	public void play(String position, int number) {
		// TODO Auto-generated method stub
		
	}

}

