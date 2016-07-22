/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuvaraj
 */
public class romanletter {
    public static void main(String[] args) {
        
    }
    final static char symbol[] = {'M','D','C','L','X','V','I'};
	final static int   value[] = {10000,5000,1000,500,100,50,10,1};

	public static int valueOf(String roman)
	{
		roman = roman.toUpperCase();
		if(roman.length() == 0) return 0;
		for(int i = 0; i < symbol.length; i++)
		{
			int pos = roman.indexOf(symbol[i]) ;
			if(pos >= 0)
				return value[i] - valueOf(roman.substring(0,pos)) + valueOf(roman.substring(pos+1));
		}
		throw new IllegalArgumentException("Invalid Roman Symbol.");
	}

	private static int[]    numbers = { 10000,  9000,  5000,  4000,  1000,   900,  
		500,   400,   100,    90,    50,    40,    10,  1 };

	private static String[] letters = { "M",  "CM",  "D",  "CD", "C",  "XC",
		"L",  "XL",  "X",  "IX", "V",  "IV", "I" };


	public static String convertToRoman(int H)
	{
		String roman = "";
		for (int i = 0; i < numbers.length; i++) {
			while (H >= numbers[i]) {
				roman += letters[i];
				H -= numbers[i];
			}
		}
		return roman;
	}
}


