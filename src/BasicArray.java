//demonstrates basic array declarations
public class BasicArray
{
    final static int LIMIT = 15;
    final static int MULTIPLE = 10;
    //creates an array, fills it with integer valies, modifies one value
    //then prints them out
    public static void main(String[] args)
    {
        int[] list = new int[LIMIT];
        //initialize array values
        for(int index = 0; index < LIMIT; index++)
            list[index] = index * MULTIPLE;
        list[5] = 999; //change one array value
        for(int index = 0; index < LIMIT; index++)
            System.out.print(list[index] + " ");
        System.out.println();
    }//end of main method
}//end of basicArray class
