public class DecodeWays {

    public static int numDecodings(String s) {


        int [] numberOfDecodings = new int [s.length()];
        int currentNum, nextNum;

        currentNum = Integer.parseInt(s.charAt(s.length() - 1 )+"");
        if ( currentNum != 0 )
            numberOfDecodings [s.length() - 1 ] = 1;
        else
            numberOfDecodings [s.length() - 1 ] = 0;


        for (int i = s.length() - 2; i >= 0; i--)
        {
            nextNum = currentNum;
            currentNum =  Integer.parseInt(s.charAt(i) +"");


            if (currentNum == 0)
                numberOfDecodings [i] = 0;
            else
            {
                if ( currentNum >= 3 || (currentNum == 2 && nextNum  >= 7 ))
                    numberOfDecodings [i] = numberOfDecodings [i + 1];

                else if (i + 2 <= s.length() - 1 && ( ( currentNum == 1 || currentNum == 2 ) && nextNum == 0))
                    numberOfDecodings [i] = numberOfDecodings [i + 2];

                else
                {
                    if ( i + 2 <= s.length() - 1)
                        numberOfDecodings [i] = numberOfDecodings [i + 1] + numberOfDecodings [i + 2];
                    else
                    {
                        if ( ( currentNum == 1 || currentNum == 2 ) && nextNum == 0)
                            numberOfDecodings [i] = 1;
                        else
                            numberOfDecodings [i] = 2;
                    }
                }
            }
        }


        return numberOfDecodings [0];
    }

    public static void main(String[] args) {
        String s = "06";
        System.out.println(numDecodings((s)));
    }
}
