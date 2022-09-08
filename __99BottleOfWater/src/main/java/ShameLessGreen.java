public class ShameLessGreen {
    public String verse(int number)
    {
        String line ="value out of bound";
        if(number == 0) {
            line = "No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more, 99 bottles of beer on the wall.\n";
        }
        else if(number == 1) {
            line = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                    "Take it down and pass it around, no more bottles of beer on the wall.\n";
        }
        else if(number == 2) {
            line = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                    "Take one down and pass it around, 1 bottle of beer on the wall.\n";
        }
        else if(number>=3 && number<=99)
        {
            line =   Integer.toString(number) + " bottles of beer on the wall, " + Integer.toString(number) + " bottles of beer.\n" +
                    "Take one down and pass it around, " + Integer.toString(number-1) + " bottles of beer on the wall.\n";
        }
        else if(number>99)
        {
            line = "Go home you drunk bastard.\n";
        }
        else if (number < 0)
        {
            line = "Learn to live a little.\n";
        }
        return line;
    }
    public String song (int upperValue,int lowerValue){
        String line = "";
        if(upperValue<lowerValue) {
            int temp = upperValue;
            upperValue = lowerValue;
            lowerValue = temp;
        }

        while(true)
        {
            if(upperValue==lowerValue-1)
            {
                break;
            }
            line = line + verse(upperValue);
            upperValue--;
        }
        return line;
    }
}
