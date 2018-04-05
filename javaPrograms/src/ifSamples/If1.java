package ifSamples;

public class If1 
{
    static boolean b;
    public static void main(String [] args) 
    {
        short hand = 42;
        if ( hand < 50 && !b ) /* Line 7 */
            hand++;
        System.out.println("mm "+hand);
        if ( hand > 50 );     /* Line 9 */
        //System.out.println("-->mm "+hand);
        else if ( hand > 40 ) 
        {
        	 System.out.println("-->mm)) "+hand);
            hand += 7;
            System.out.println("-->7 "+hand);
            hand++;    
            System.out.println("-->++ "+hand);
        }
        else
            --hand;
        System.out.println(hand);
    }
}