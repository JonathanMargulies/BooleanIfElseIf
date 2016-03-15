import javax.swing.JOptionPane;
public class BooleanIfElse {
	public static void main(String [] args) {
		String NumPeople = JOptionPane.showInputDialog(null, "Enter number of people.");
		String NumPlayers = JOptionPane.showInputDialog(null, "Enter number of players.");

		int IntNumPeople;
		int IntNumPlayers;
		int GroupSize=0;
		int TeamSize=0;

		IntNumPeople = Integer.parseInt(NumPeople);
		IntNumPlayers = Integer.parseInt(NumPlayers);

		if(IntNumPeople>10) {
			GroupSize = IntNumPeople/2;
		} else if (IntNumPeople>=3 && IntNumPeople<=10) {
			GroupSize = IntNumPeople/3;
		} else {
			JOptionPane.showMessageDialog(null, "The number of people has to be at least 3.", "Error!", JOptionPane.ERROR_MESSAGE);		
		}
		
		if(IntNumPlayers>=11 && IntNumPlayers<=55) {
			TeamSize = IntNumPlayers/11;
		} else {
			TeamSize = 1;
		}
		System.out.println("The number of people is " + IntNumPeople + " and the group size is " + GroupSize + ".");
		System.out.println("The number of players is " + IntNumPlayers + " and the team size is " + TeamSize + ".");
	}
}
