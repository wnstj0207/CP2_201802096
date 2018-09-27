package °úÁ¦;

interface Jar {
	public int getItem();
	public void takeItem(int hand);
	public String status();
	public boolean isEmpty();
}

public class ChocolateJar implements Jar {
	private int chocolate;
	private int chilli;
	
	public ChocolateJar() {
		chocolate = 13;
		chilli = 1;
	}
	public ChocolateJar(int chocolate) {
		this.chocolate = chocolate;
		chilli = 1;
	}
	public int getItem() {
		return chocolate+chilli;
	}
	public int getChocolate() {
		return chocolate;
	}
	public int getChilli() {
		return chilli;
	}
	public void takeItem(int hand) {
		if(hand <= chocolate && chocolate > 0) {
			chocolate -= hand;
			if(chocolate ==  0)
				chilli -= 1;
		}
	}
	public String status() {
		String chocolate = "";
		for(int i=0; i<this.chocolate; i++)
			chocolate += "¡à ";
		String chilli = "¡á ";
		return "[ "+chilli+chocolate+"]";
	}
	public boolean isEmpty() {
		if(chocolate == 0 && chilli == 0)
			return true;
		else
			return false;
	}
}