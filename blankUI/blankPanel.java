import javax.swing.JPanel;
import java.awt.Graphics;
public class blankPanel extends JPanel{

    public blankPanel(){
        super();
    }

	@Override
    public void paintComponent(Graphics g){
    	//=]
        //perhaps processes like coordinating should go first?
        super.paintComponent(g);
    }
}
