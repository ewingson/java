import jcurses.system.InputChar;
import jcurses.system.Toolkit;

public class readchar3 {
	public static void main (String[] args)
		{
			String st;
			char ch;
			int i;
			st = "";
			ch = ' ';
			i = 0;
			while (true)
				{
      					InputChar c = Toolkit.readCharacter();
					ch = c.getCharacter();
					i = (int) ch;
					System.out.print ("you typed " + ch + "(" + i + ")\n\r");
					// break on '#'
					if (ch == '#') break;
				}
			System.out.println ("Programm wird beendet. Verarbeitung kann beginnen.");
		}
}

