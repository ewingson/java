import java.util.*;

class datum_app {
	public static void main (String[] args) {
		int l = 6;
		int m = 10;
		int n = 1909;
		int nowtag = 0;
		int nowmonat = 0;
		int nowjahr = 0;
		int s,t,u,diff,nsumme,msumme,x,y,z,i,help,whelp,dhelp;
		int wzaehler = 0;
	
		GregorianCalendar GC = new GregorianCalendar();
		
		System.out.println("Dieses Programm loest eine wiwi-Programmieraufgabe von 2005 (Stand: 17.12.2007), laeuft sequentiell ab und erwartet vom Benutzer einige Parameter.");
		System.out.println("Zunaechst werden zwei Daten zwischen 1901-01-01 und 2100-12-31 im Format yyyy<return>mm<return>dd<return> erwartet.");
		System.out.println("Es folgen einige debug-parameter der Datumsobjekte.");
		System.out.println("Die zu loesenden Bedingungen werden angezeigt.");
		System.out.println("Der Gregorianische Kalender wird nur zur HEUTE-Feststellung benutzt.");
		System.out.println("Ein drittes Datum YYYY-MM-DD wird erwartet");
	
		n = eingabe.readInt("Erstes Datum, Jahr:");
		m = eingabe.readInt("Erstes Datum, Monat:");
		l = eingabe.readInt("Erstes Datum, Tag:");
		u = eingabe.readInt("Zweites Datum, Jahr:");
		t = eingabe.readInt("Zweites Datum, Monat:");
		s = eingabe.readInt("Zweites Datum, Tag:");
	
		Datum ndatum = new Datum (l,m,n);
		System.out.println("n");
		System.out.println ("gueltig : " + ndatum.gueltig);
		System.out.println (ndatum.jahr + "-" + ndatum.monat + "-" + ndatum.tag);
		System.out.println (ndatum.tagesdiff);
		System.out.println (ndatum.wochentag);
		System.out.println ("Werktag : " + ndatum.werktag);
		if (ndatum.schaltjahr) { System.out.println ("Schaltjahr"); }
		else { System.out.println ("kein Schaltjahr"); }
		System.out.println();
		
		nowtag = GC.get(Calendar.DATE);
		nowmonat = GC.get(Calendar.MONTH) + 1;
		nowjahr = GC.get(Calendar.YEAR);
		Datum heute = new Datum (nowtag, nowmonat, nowjahr);
		System.out.println("und jetzt heute");
		System.out.println ("gueltig : " + heute.gueltig);
		System.out.println (heute.jahr + "-" + heute.monat + "-" + heute.tag);
		System.out.println (heute.tagesdiff);
		System.out.println (heute.wochentag);
		System.out.println ("Werktag : " + heute.werktag);
		if (heute.schaltjahr) { System.out.println ("Schaltjahr"); }
		else { System.out.println ("kein Schaltjahr"); }
		System.out.println();
		
		Datum mdatum = new Datum (s,t,u);
		System.out.println("m");
		System.out.println ("gueltig : " + mdatum.gueltig);
		System.out.println (mdatum.jahr + "-" + mdatum.monat + "-" + mdatum.tag);
		System.out.println (mdatum.tagesdiff);
		System.out.println (mdatum.wochentag);
		System.out.println ("Werktag : " + mdatum.werktag);
		if (mdatum.schaltjahr) { System.out.println ("Schaltjahr"); }
		else { System.out.println ("kein Schaltjahr"); }
		System.out.println();
		
		if ((ndatum.gueltig == true) && (mdatum.gueltig ==	true)) {
			if (ndatum.tagesdiff == mdatum.tagesdiff) help = 0;
			else if (ndatum.tagesdiff < mdatum.tagesdiff) help = 1;
			else help = 2;
			switch (help) {
				case 0	:	{
									System.out.println("(Punkt2)Beide Tage identisch. Differenz 0");
								}
				case 1	:	
				case 2	:	{
									diff = Math.abs(mdatum.tagesdiff - ndatum.tagesdiff);
									System.out.println("(Punkt2)Die Differenz betraegt " + diff + " Tage");
								}
				default	:	{
									break;	
								}
			}//switch--help
		}//if
		else {
			System.out.println ("(mindestens) eines der Daten ist ungueltig");
		}
					
		nsumme = ndatum.tagesdiff - ndatum.jahrsumme;
		msumme = mdatum.tagesdiff - mdatum.jahrsumme;
		
		System.out.println ("(Punkt 1) :");
		System.out.println ("Tage seit 1. Januar " + ndatum.jahr + " (n) " + nsumme);
		System.out.println ("Tage seit 1. Januar " + mdatum.jahr + " (m) " + msumme);
		
		System.out.println ("Eingabe eines Datums in der Vergangenheit (Punkt 3)");
		z = eingabe.readInt ("Jahr");
		y = eingabe.readInt ("Monat");
		x = eingabe.readInt ("Tag");
		Datum past = new Datum (x,y,z);
		if (!past.gueltig) System.out.println("Datum nicht gueltig");
		else if (past.tagesdiff > heute.tagesdiff) {
			System.out.println ("Datum liegt nicht in der Vergangenheit. Identische Daten hier kein Fehlerfall.");
		}//if
		else if (past.tagesdiff == heute.tagesdiff) {
			if (heute.werktag == true) System.out.println("Daten identisch. Werktag.");
			else System.out.println("Daten identisch. kein Werktag.");	
		}//else-if1
		else	if (Math.abs(past.tagesdiff - heute.tagesdiff) < 3) {
			diff = (heute.tagesdiff - past.tagesdiff);
				switch (diff) {
					case 1	:	{
										if (past.werktag && heute.werktag) wzaehler = 2;
										else if (past.werktag || heute.werktag) wzaehler = 1;
										else wzaehler = 0;
										break;
									}
					case 2	:	{
										dhelp = past.wtag;
										switch (dhelp)		{
											case 1	:
											case 2	:
											case 3	:
											case 4	:	wzaehler = 2;
															break;
											case 5	:	wzaehler = 1;
															break;
											case 6	:	wzaehler = 0;
															break;
											case 7	:	wzaehler = 1;
															break;
											default	: break;
										}//switch--dhelp
									}
					default	:	{
										break;
									}
				}//switch--diff
			}//else-if_diff3
		else {
			wzaehler = 1;
			for (i=past.tagesdiff; i<heute.tagesdiff; i++) {
				whelp = i;
				Datum idate = new Datum (whelp);
				if (idate.werktag) { wzaehler+=1; }
			}//for
		}//else
		System.out.println ("Werktage von " + past.jahr + "-" + past.monat + "-" + past.tag + " bis heute (Punkt 3): " + wzaehler);
		System.out.println ("Programmende. success");
	}//main
}//class
