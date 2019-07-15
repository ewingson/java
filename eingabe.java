import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//package iotool
//readByte
//readShort
//readInt
//readLong
//readFloat
//readDouble
//readString
//readChar

public class eingabe {

//read-Byte-Methode	
	public static byte readByte(String inText) {

			byte        	bZahl ;
			BufferedReader br;

//Eingabepuffer für eine Dateneingabe neu erstellen
		  	br = new BufferedReader(new InputStreamReader(System.in));
		  	bZahl = 0;
		  	System.out.print(inText);
		  	try {
				bZahl= Byte.parseByte(br.readLine());
		  	} 
		  	catch (NumberFormatException e) {
				System.out.println("Exception geworfen, kein Byte.");
		  	} 
		  	catch (IOException e) {
				e.printStackTrace();
		  	}	
			return bZahl;
	}

//read-Short-Methode	
	public static short readShort(String inText) {

			short        	sZahl ;
			BufferedReader br;

//Eingabepuffer für eine Dateneingabe neu erstellen
		  	br = new BufferedReader(new InputStreamReader(System.in));
		  	sZahl = 0;
		  	System.out.print(inText);
		  	try {
				sZahl= Short.parseShort(br.readLine());
		  	} 
		  	catch (NumberFormatException e) {
				System.out.println("Exception geworfen, kein Short.");
		  	} 
		  	catch (IOException e) {
				e.printStackTrace();
		  	}	
			return sZahl;
	}

//read-Integer-Methode	
	public static int readInt(String inText) {

			int        	iZahl ;
			BufferedReader br;

//Eingabepuffer für eine Dateneingabe neu erstellen
		  	br = new BufferedReader(new InputStreamReader(System.in));
			iZahl = 0;
		  	System.out.print(inText);
		  	try {
				iZahl= Integer.parseInt(br.readLine());
		  	} 
		  	catch (NumberFormatException e) {
				System.out.println("Exception geworfen, kein Integer.");
		  	} 
		  	catch (IOException e) {
				e.printStackTrace();
		  	}	
			return iZahl;
	}

//read-Long-Methode	
	public static long readLong(String inText) {

			long        	lZahl ;
			BufferedReader br;

//Eingabepuffer für eine Dateneingabe neu erstellen
		  	br = new BufferedReader(new InputStreamReader(System.in));
		  	lZahl = 0;
		  	System.out.print(inText);
		  	try {
				lZahl= Long.parseLong(br.readLine());
		  	} 
		  	catch (NumberFormatException e) {
				System.out.println("Exception geworfen, kein Long.");
		  	} 
		  	catch (IOException e) {
				e.printStackTrace();
		  	}	
			return lZahl;
	}

//read-Float-Methode	
	public static float readFloat(String inText) {
	 
			float   fZahl ;
			BufferedReader br;

//Eingabepuffer für eine Dateneingabe neu erstellen
		  	br = new BufferedReader(new InputStreamReader(System.in));
		  	fZahl = 0;
		  	System.out.print(inText);
		  	try {
				fZahl= Float.parseFloat(br.readLine());
		  	} 
		  	catch (NumberFormatException e) {
				System.out.println("Exception geworfen, kein float.");
		  	} 
		  	catch (IOException e) {
				e.printStackTrace();
		  	}	
			return fZahl;
	}

//read-Double-Methode	
	public static double readDouble(String inText) {
	 
			double   dZahl ;
			BufferedReader br;

//Eingabepuffer für eine Dateneingabe neu erstellen
		  	br = new BufferedReader(new InputStreamReader(System.in));
		  	dZahl = 0;
		  	System.out.print(inText);
		  	try {
				dZahl= Double.parseDouble(br.readLine());
		  	} 
		  	catch (NumberFormatException e) {
				System.out.println("Exception geworfen, kein double.");
		  	} 
		  	catch (IOException e) {
				e.printStackTrace();
		  	}	
			return dZahl;
	}

//read-String-Methode	
	public static String readString(String inText) {
		
		  String   sText ;
		  BufferedReader br;

//Eingabepuffer für eine Dateneingabe neu erstellen
	  	br = new BufferedReader(new InputStreamReader(System.in));
	  	
	  	sText = "";
	  	System.out.print(inText);
	  	try {
	  		 sText= (br.readLine());
		  }
	  	catch (IOException e) {
			 e.printStackTrace();
		  }	
		  return sText;
	}

//read-Character-Methode
	public static char readChar(String inText) {

		   char  cZeichen ='0';
		   System.out.print(inText);
		   try {
		   		do{
		   			cZeichen =(char) System.in.read();
		   		}
		   		while(cZeichen == '\n' | cZeichen =='\r');
		   }
		   catch (IOException e) {
          	e.printStackTrace();
		   }	   
		   return cZeichen;
	}
}
//found @ coderz-home.de, modified by ewing 20150131
