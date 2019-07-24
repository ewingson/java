class dec_bin
{
public static String b0(int n) {

        if (n == 0) return "0";
        if (n == 1) return "1";
        
        return b0(n / 2) + (n % 2);
}
public static void main (String[] args)
{
int ein=0;
String erg="";
ein=eingabe.readInt("Integer:");
erg= b0(ein);
System.out.println(erg);
}
}
