import java.awt.EventQueue;

public class run_blankCanvas{
	public static void main(final String args[]){
		//use final when accessing the command prompt
		blankFrame gu = new blankFrame("New Frame", 700, 700);
		EventQueue.invokeLater(gu);
	}
}
