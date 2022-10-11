import javax.swing.*;
import java.awt.*;

    public class Healthbar extends JPanel {

        private Friend myFriend;
        private Friend myEnemy;

        public Healthbar(Friend myFriend, Friend myEnemy) {
            this.myFriend = myFriend;
            this.myEnemy = myEnemy;
        }

        /*
        This method paints the components on a canvas
         */
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            addHealthbar(g);
        }

        /*
        this method paint ONE green rectangle
         */
        protected void addHealthbar(Graphics g) {
            g.setColor(Color.GREEN);
            g.fillRect(10, 50, myFriend.GetHP(), 100);
            g.fillRect(10, 200, myEnemy.GetHP(), 100);
        }
    }
