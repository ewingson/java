import java.io.*;
public class countwords_app {
	public static void main (String[] args) {

		String[] zeilenarray = new String[100000];	
		int i = 0;
		int max = 0;	
		int j = 0;
		int start = 0;
		String[] hit = new String[100000];
		int[][] liste = new int[13000][13000];
		int zmax = 0;
		int k = 0;
		int[] help = new int[100000];
		int l = 0;
		int m = 0;
		
		try {
			BufferedReader in = new BufferedReader(new FileReader("20190102alltags"));
			String zeile = null;
			while ((zeile = in.readLine()) != null) {
				zeilenarray[i] = zeile;
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		max = i;
		for (i=0;i<max;i++) {
			System.out.println(i+":"+zeilenarray[i]);
		}
		for (i=0;i<max;i++) {
			start = 0;
			if (zeilenarray[i].length()>zmax) { zmax = zeilenarray[i].length(); }
			for (j=0;j<zeilenarray[i].length();j++) {
				if ((zeilenarray[i].substring(j,j+1).equals(" ")) ||
					(zeilenarray[i].substring(j,j+1).equals("-")) ||
					(zeilenarray[i].substring(j,j+1).equals("!")) ||
					(zeilenarray[i].substring(j,j+1).equals(".")) ||
					(zeilenarray[i].substring(j,j+1).equals(",")) ||
					(zeilenarray[i].substring(j,j+1).equals(";")) ||
					(zeilenarray[i].substring(j,j+1).equals("'")) ||
					(zeilenarray[i].substring(j,j+1).equals('"')) ||
					(zeilenarray[i].substring(j,j+1).equals(":")) ||
					(zeilenarray[i].substring(j,j+1).equals("<")) ||
					(zeilenarray[i].substring(j,j+1).equals(">")) ||
					(zeilenarray[i].substring(j,j+1).equals("=")) ||
					(zeilenarray[i].substring(j,j+1).equals("?"))) {
					hit[l] = zeilenarray[i].substring(start,j);
					liste[i][l] = hit[l].length();
					l++;
					start = j+1;
				}
				if ((j == zeilenarray[i].length()-1)&
				(!((zeilenarray[i].substring(j,j+1).equals(" "))|
				(zeilenarray[i].substring(j,j+1).equals("-"))|
				(zeilenarray[i].substring(j,j+1).equals("!"))|
				(zeilenarray[i].substring(j,j+1).equals("."))|
				(zeilenarray[i].substring(j,j+1).equals(","))|
				(zeilenarray[i].substring(j,j+1).equals(";"))|
				(zeilenarray[i].substring(j,j+1).equals("'"))|
				(zeilenarray[i].substring(j,j+1).equals('"'))|
				(zeilenarray[i].substring(j,j+1).equals(":"))|
				(zeilenarray[i].substring(j,j+1).equals("<"))|
				(zeilenarray[i].substring(j,j+1).equals(">"))|
				(zeilenarray[i].substring(j,j+1).equals("="))|
				(zeilenarray[i].substring(j,j+1).equals("?")))))
					{
					hit[l] = zeilenarray[i].substring(start,j+1);
					liste[i][l] = hit[l].length();
					l++;
				}
			}	
		}
		for (k=1;k<(zmax*max);k++) {
			for (i=0;i<max;i++) {
				for (j=0;j<zeilenarray[i].length();j++) {
					if (liste[i][j] == k) { help[k] = help[k] + 1; m++;}
				}
			}
		}
		for (k=1;k<(zmax*max);k++) {
			if (help[k] != 0) { System.out.println("Length "+k+" , Sum "+help[k]); }
		}
		System.out.println("total sum "+m);
	}
}
