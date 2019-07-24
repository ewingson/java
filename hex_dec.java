class hex_dec
{
public static void main (String[] args)
{
String ein = "";
String foo="";
String bar="";
int value=0;
ein=eingabe.readString("String(hex):");
foo=ein.substring(0,2);
if (foo.equals("0x")) { bar = ein.substring(2); }
else { bar = ein; }
value = Integer.parseInt(bar, 16);
System.out.println(value);
}
}
