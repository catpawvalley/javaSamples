import javax.swing.JFrame;

public class blankFrame extends JFrame implements Runnable{

	public static final int basicSq = 400;

	public blankFrame(){
		super();
		setSize(basicSq, basicSq);
	}

	public blankFrame(String n){
		super(n);
		setSize(basicSq, basicSq);
	}

	public blankFrame(int w, int h){
		super();
		setSize(w, h);
	}

	public blankFrame(String n, int w, int h){
		super(n);
		setSize(w, h);
	}

	public blankFrame(int sq){
		super();
		setSize(sq, sq);
	}

	public blankFrame(String n, int sq){
		super(n);
		setSize(sq, sq);
	}

	public void run(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
