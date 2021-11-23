//import GUI frame, layout, objects...
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class Pizzeria extends JFrame implements ActionListener {
	
	//define variables that represent GUI objects on the screen (labels, etc)
	
		private String[] Pizza_Sizes = {"Small", "Medium", "Large", "Extra large"}; 
		JList<String> Size_List = new JList<String>(Pizza_Sizes);
		
		private JCheckBox Cheese = new JCheckBox("Cheese", null, false);
		private JCheckBox Mushrooms = new JCheckBox("Mushrooms", null, false);
		private JCheckBox Onions = new JCheckBox("Onions", null, false);
		private JCheckBox Sausage = new JCheckBox("Sausage", null, false);
		private JCheckBox Bacon = new JCheckBox("Bacon", null, false);
		private JCheckBox Olives = new JCheckBox("Olives", null, false);
		private JCheckBox Chicken = new JCheckBox("Chicken", null, false);
		private JCheckBox Salami = new JCheckBox("Salami", null, false);
		private JCheckBox Green_Peppers = new JCheckBox("Green peppers", null, false);
		private JCheckBox Pineapple = new JCheckBox("Pineapple", null, false);
 
		private JButton button1;
		private JLabel Pizza_Price;
		private JLabel Lbl_Choice;

		private Container content = getContentPane();
	
	//define a constructor to define how the GUI is set up (ie. INITIALIZE)
		public Pizzeria () {
			super ("Pizza Order");
			setSize(600, 300);
			setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

			//initialize components & add to screen
			content.add(new JLabel("Welcome to the Pizza Store!"));
			
			//add Pizza Sizes
			content.add(new JLabel("Choose pizza size:"));
			content.add(Size_List);
			
			//add CheckBoxes (Toppings)
			content.add(new JLabel("Choose your toppings:"));
			content.add(Cheese);
			content.add(Mushrooms);
			content.add(Onions);
			content.add(Sausage);
			content.add(Bacon);
			content.add(Olives);
			content.add(Chicken);
			content.add(Salami);
			content.add(Green_Peppers);
			content.add(Pineapple);
			
			//add "Add" Button
			button1 = new JButton("Add");
			add(button1);
			button1.addActionListener(this);
			
			//Display choice
			content.add(new JLabel("Order: "));  
			Lbl_Choice = new JLabel();
			add(Lbl_Choice);
			
			content.add(new JLabel("| Price: " + "$"));
			 
			//Display price
			Pizza_Price = new JLabel("...");
			add(Pizza_Price);
			
			//close window functionality
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			int Price = 0;
				int selectedIndex = Size_List.getSelectedIndex();
				String Choice = "";
				//Pizza Sizes
				if (selectedIndex == 0) {
					Price = 7; 
					Choice += "Small pizza";
				} else if (selectedIndex == 1) {
					Price = 9;
					Choice += "Medium pizza";
				} else if (selectedIndex == 2) {
					Price = 11; 
					Choice += "Large pizza";
				} else if (selectedIndex == 3) {
					Price = 14;
					Choice += "Extra large pizza";
				} 
				
				//Pizza Toppings
				if(Cheese.isSelected()) {
					Price += 0;
					Choice += ", Cheese";
				}
				if(Mushrooms.isSelected()) {
					Price += 1;
					Choice += ", Mushrooms";
				}
				if(Onions.isSelected()) {
					Price += 1;
					Choice += ", Onions";
				}
				if(Sausage.isSelected()) {
					Price += 1;
					Choice += ", Sausage";
				}
				if(Bacon.isSelected()) {
					Price += 1;
					Choice += ", Bacon";
				}
				if(Olives.isSelected()) {
					Price += 1;
					Choice += ", Olives";
				}
				if(Chicken.isSelected()) {
					Price += 1;
					Choice += ", Chicken";
				}
				if(Salami.isSelected()) {
					Price += 1;
					Choice += ", Salami";
				}
				if(Green_Peppers.isSelected()) {
					Price += 1;
					Choice += ", Green Peppers";
				}
				if(Pineapple.isSelected()) {
					Price += 1;
					Choice += ", Pineapple"; 
				}
				
				//Display order
				 Lbl_Choice.setText(String.valueOf(Choice));
				 
				 //Display price
				 Pizza_Price.setText(String.valueOf(Price));
		}
	
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) { 
		Pizzeria myFrame = new Pizzeria();
		myFrame.setVisible(true); 
	}

}
