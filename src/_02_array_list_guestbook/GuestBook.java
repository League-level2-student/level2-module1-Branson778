package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton viewNames = new JButton();
	JButton addNames = new JButton();
	ArrayList<String> guests = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook runner = new GuestBook();
		runner.run();
	}
	public void run() {
		frame.setVisible(true);
		frame.add(panel);
		viewNames.setText("View Curent Guests");
		addNames.setText("Invite New Guests");
		frame.setTitle("Guest Book");
		viewNames.addActionListener(this);
		addNames.addActionListener(this);
		panel.add(addNames);
		panel.add(viewNames);
		guests.add("Bob Banders");
		guests.add("Sandy Summers");
		guests.add("Greg Ganders");
		guests.add("Donny Doners");
		//Put New Code Above frame.pack();.
		frame.pack();
	}
	public void viewNamesMethod() {
		String vNames = "";
		for (int i = 0; i < guests.size(); i++) {
			//JOptionPane.showMessageDialog(null, "Guest #"+ (i+1)+ ": "+ guests.get(i));
			vNames += "\n Guest #"+ (i+1)+ ": "+ guests.get(i) ;
		}
		JOptionPane.showMessageDialog(null, vNames);
	}
	public void addNamesMethod() {
	String newGuest =	JOptionPane.showInputDialog("Put The Name Of The New Guest In The Box Below.");
guests.add(newGuest);
	}
	@Override
	public void actionPerformed(ActionEvent buttonClicked) {
		if(buttonClicked.getSource() == addNames) {
			//System.out.println("test1");
			addNamesMethod();
		}
		if(buttonClicked.getSource() == viewNames) {
			//System.out.println("test2");
			viewNamesMethod();
		}
		
	}
}
