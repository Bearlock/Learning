import java.util.Scanner;

public class SpaceBoxing
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner (System.in);
        
        double earthWeight, venusWeight, marsWeight, jupiterWeight, saturnWeight, uranusWeight, neptuneWeight;
        int Venus, Mars, Jupiter, Saturn, Uranus, Neptune, pNumber;
        
        Venus = 1;
        Mars = 2;
        Jupiter = 3;
        Saturn = 4;
        Uranus = 5 ;
        Neptune = 6;
        
        System.out.println( "Please enter your current Earth weight: " );
        earthWeight = keyboard.nextDouble();
        
        venusWeight = earthWeight * 0.78; 
        marsWeight = earthWeight * 0.39; 
        jupiterWeight = earthWeight * 2.65; 
        saturnWeight = earthWeight * 1.17;
        uranusWeight = earthWeight * 1.05;
        neptuneWeight = earthWeight * 1.23;
        
        System.out.println( "I have information for the following planets: " );
        
        System.out.println("    1. Venus    2. Mars     3. Jupiter " );
        System.out.println("    4. Saturn   5. Uranus   6. Neptune " );
        
        System.out.println( "Which planet are you visiting? " );
        pNumber = keyboard.nextInt();
        
        System.out.println("  ");
        
        if ( pNumber == 1)
        {
            System.out.println( "Your weight would be " + venusWeight + "." );
        }
        
        else if ( pNumber == 2)
        {
            System.out.println( "Your weight would be " + marsWeight + "." );
        }
        
        else if ( pNumber == 3)
        {
            System.out.println( "Your weight would be " + jupiterWeight + "." );
        }
        
        else if ( pNumber == 4)
        {
            System.out.println( "Your weight would be " + saturnWeight + "." );
        }
        
        else if ( pNumber == 5)
        {
            System.out.println( "Your weight would be " + uranusWeight + "." );
        }
        
        else if ( pNumber == 6)
        {
            System.out.println( "Your weight would be " + neptuneWeight + "." );
        }
        
        else
        {
            System.out.println( "INVALID NUMBER" );
        }    
    }    
}    