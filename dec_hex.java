class dec_hex
{
public static String intToHexStr(int i){
    return "0x"+String.format("%2s", Integer.toHexString(i)).replace(' ', '0');
}
public static void main (String[] args)
{
int ein=0;
String erg="";
ein=eingabe.readInt("Integer:");
erg=intToHexStr(ein);
System.out.println(erg);
}
}
