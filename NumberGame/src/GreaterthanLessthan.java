

/**
 * 
 */

/**
 * @author eh1945017
 *
 */
public class GreaterthanLessthan {
	public int guess;
	int actual = (int)(Math.random() * 50 + 1);
	
	
public boolean executable(){
	if (guess > actual) {
		System.out.print("Too Big");
		return false;
		
	}
	if (guess < actual) {
		System.out.print("Too Small");
		return false;
		
	}
	else return true;
}

public void end() {
	if (executable() == true) {
		
	}
}
}