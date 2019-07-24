class Datum {
	
	Boolean gueltig;
	int tag;
	int monat;
	int jahr;
	String wochentag;
	Boolean werktag;
	Boolean schaltjahr;
	int tagesdiff;
	int jahrsumme;
	int wtag;
	
//Standard-Konstruktor
	public Datum () {
		gueltig = true;
		tag = 6;
		monat = 10;
		jahr = 2012;
		wochentag = "Samstag";
		werktag = false;
		schaltjahr = true;
		tagesdiff = 40822;
	}//Standard-Konstruktor
	
	public Datum (int neuerTag, int neuerMonat, int neuesJahr) {
		int i = 0;
		int jahrdiff = 0;
	
		tag = neuerTag;
		monat = neuerMonat;
		jahr = neuesJahr;
		schaltjahr = false;
		if ((jahr < 1901) || (jahr > 2100)) {
			gueltig = false;
			tag = 0;
			monat = 0;
			jahr = 0;
			werktag = false;
			schaltjahr = false;
		}
		else {
			if (jahr % 400 == 0) { schaltjahr = true; }
			else {
				if (jahr % 100 == 0) { schaltjahr = false; }
				else {
					if (jahr % 4 == 0) { schaltjahr = true; }
					else { schaltjahr = false; }
				}
			}
//			if ((jahr % 4) == 0) {
//				if ((jahr % 100) == 0) {
//					if ((jahr % 400) == 0) {
//						schaltjahr = true;
//					}//400
//					else { schaltjahr = false; }				
//				}//100
//				else { schaltjahr = true; }
//			}//4	
//			else { schaltjahr = false; }
			switch (monat) {
				case 1 :
				case 3 :
				case 5 :
				case 7 :
				case 8 :
				case 10:
				case 12 :	{
									if ((tag < 1) || (tag > 31)) { 
										gueltig = false;
										tag = 0;
										monat = 0;
										jahr = 0;
									}//if
									else { gueltig = true; }
									break;
								}
				case 4:
				case 6 :
				case 9 :
				case 11 :	{
									if ((tag < 1) || (tag > 30)) { 
										gueltig = false;
										tag = 0;
										monat = 0;
										jahr = 0;
									}//if
									else { gueltig = true; }
									break;
								}
				case 2 :		{
									if (schaltjahr) { i = 29; }
									else { i = 28; }
									if ((tag < 1) || (tag > i)) {
										gueltig = false;
										tag = 0;
										monat = 0;
										jahr = 0;
									}//if
									else { gueltig = true; }
									break;
								}
				default :		{
									gueltig = false;
									break;
								}
			}//switch--monat
			//Referenztag
			if ((tag == 1) && (monat == 1) && (jahr == 1901)) { wochentag = "Dienstag"; werktag = true; tagesdiff = 1; }
			else {
				jahrdiff = jahr - 1901;
				for (i=1901; i<jahr; i++) {
					if ((i % 4) == 0) {
						if ((i % 100) == 0) {
							if ((i % 400) == 0) {
								tagesdiff += 366;
							}//400
							else { tagesdiff += 365; }				
						}//100
						else { tagesdiff += 366; }
					}//4
					else tagesdiff += 365;	
				}//for	
				jahrsumme = tagesdiff;
				switch (monat) {
					case 1 :		{ 
										tagesdiff += tag; 
										break;
									}
					case 3 : 	{
										if (schaltjahr) {
											tagesdiff += 31;
											tagesdiff += 29;
											tagesdiff += tag;
										}
										else {
											tagesdiff += 31;
											tagesdiff += 28;
											tagesdiff += tag;
										}
										break;
									}
					case 5 :		{
										if (schaltjahr) {
											tagesdiff += 31;
											tagesdiff += 29;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += tag;	
										}
										else {
											tagesdiff += 31;
											tagesdiff += 28;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += tag;
										}
										break;
									}
					case 7 :		{
										if (schaltjahr) {
											tagesdiff += 31;
											tagesdiff += 29;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += tag;	
										}
										else {
											tagesdiff += 31;
											tagesdiff += 28;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += tag;
										}
										break;
									}
					case 8 :		{
										if (schaltjahr) {
											tagesdiff += 31;
											tagesdiff += 29;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += tag;	
										}
										else {
											tagesdiff += 31;
											tagesdiff += 28;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += tag;
										}
										break;
									}
					case 10 :	{
										if (schaltjahr) {
											tagesdiff += 31;
											tagesdiff += 29;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += tag;	
										}
										else {
											tagesdiff += 31;
											tagesdiff += 28;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += tag;
										}
										break;
									}
					case 12 : 	{
										if (schaltjahr) {
											tagesdiff += 31;
											tagesdiff += 29;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += tag;	
										}
										else {
											tagesdiff += 31;
											tagesdiff += 28;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += tag;
										}
										break;
									}
									
					case 4 :		{
										if (schaltjahr) {
											tagesdiff += 31;
											tagesdiff += 29;
											tagesdiff += 31;
											tagesdiff += tag;
										}
										else {
											tagesdiff += 31;
											tagesdiff += 28;
											tagesdiff += 31;
											tagesdiff += tag;
										}
										break;
									}
					case 6 :		{
										if (schaltjahr) {
											tagesdiff += 31;
											tagesdiff += 29;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += tag;
										}
										else {
											tagesdiff += 31;
											tagesdiff += 28;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += tag;
										}
										break;
									}
					case 9 :		{
										if (schaltjahr) {
											tagesdiff += 31;
											tagesdiff += 29;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 31;
											tagesdiff += tag;	
										}
										else {
											tagesdiff += 31;
											tagesdiff += 28;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 31;
											tagesdiff += tag;
										}
										break;
									}
					case 11 :	{
										if (schaltjahr) {
											tagesdiff += 31;
											tagesdiff += 29;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += tag;	
										}
										else {
											tagesdiff += 31;
											tagesdiff += 28;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += 31;
											tagesdiff += 30;
											tagesdiff += 31;
											tagesdiff += tag;
										}
										break;
									}
					
					case 2 :		{
										tagesdiff += 31;
										tagesdiff += tag;
									}
					
					default :		{
										break;
									}
				}//switch--monat	
				i = tagesdiff % 7;
				switch (i) {
					case 0 : 	{
										wochentag = "Montag";
										wtag = 1;
										break;
									}
					case 1 :		{
										wochentag = "Dienstag";
										wtag = 2;
										break;
									}
					case 2 :		{
										wochentag = "Mittwoch";
										wtag = 3;
										break;
									}
					case 3 :		{
										wochentag = "Donnerstag";
										wtag = 4;
										break;
									}
					case 4:		{
										wochentag = "Freitag";
										wtag = 5;
										break;
									}
					case 5 :		{
										wochentag = "Samstag";
										wtag = 6;
										break;
									}
					case 6 :		{
										wochentag = "Sonntag";
										wtag = 7;
										break;
									}
					default : 	{ 	
										wtag = -1;
										break; 
									}
				}//switch--i
				switch (wtag) {
					case 1		:
					case 2		:
					case 3 		:
					case 4	 	:
					case 5 		: 	{ 
											werktag = true;
											break; 
										}
					case 6		:
					case 7		:	{
											werktag = false;
											break;
										}
					default		:	{
											break;
										}
				}//switch--wtag
			}//Referenztag-else
		}//gueltiger Bereich
	}//Konstruktor
	
	public Datum (int tageszaehler) {
		int i = 0;
		if ((tageszaehler < 1) || (tageszaehler > 73049)) {
			gueltig = false;
		}
		else {
			i = tageszaehler % 7;
			switch (i) {
				case 0	:	{
									wtag = 2;
									wochentag = "Dienstag";
									werktag = true;
									break;
								}
				case 1	:	{
									wtag = 3;
									wochentag = "Mittwoch";
									werktag = true;
									break;
								}
				case 2	:	{
									wtag = 4;
									wochentag = "Donnerstag";
									werktag = true;
									break;
								}
				case 3	:	{
									wtag = 5;
									wochentag = "Freitag";
									werktag = true;
									break;
								}
				case 4	:	{
									wtag = 6;
									wochentag = "Samstag";
									werktag = false;
									break;
								}
				case 5	:	{
									wtag = 7;
									wochentag = "Sonntag";
									werktag = false;
									break;
								}
				case 6	:	{
									wtag = 1;
									wochentag = "Montag";
									werktag = true;
									break;
								}
				default	:	{
									break;
								}
			}//switch--i
		}//gueltig
	}//Konstruktor2
}//class Datum
