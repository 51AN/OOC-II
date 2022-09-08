public class Bottles_99 {


    public String verse(int number)
    {
        String segment ="";
        if(number == 0) {
            segment = "No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more, 99 bottles of beer on the wall.\n";
        }
        else if(number == 1) {
            segment = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                    "Take one down and pass it around, no more bottles of beer on the wall.\n";
        }
        else if(number == 2) {
            segment = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                    "Take one down and pass it around, 1 bottle of beer on the wall.\n";
        }
        else if(number>=3 && number<=99)
        {
            segment =   Integer.toString(number) + " bottles of beer on the wall, " + Integer.toString(number) + " bottles of beer.\n" +
                    "Take one down and pass it around, " + Integer.toString(number-1) + " bottles of beer on the wall.\n";
        }
        else if(number>99)
        {
            segment = "Take it down a notch, it's getting out of bound.\n";
        }
        else if (number < 0)
        {
            segment = "Reached the end of the line and below\n";
        }
        return segment;
    }

    public String fullSong()
    {
        String song = "";

        for(int i=99 ; i>=0 ; i--)
        {
            song = song + verse(i);
        }
        return song;
    }

    public String rangeSong(int upper, int lower)
    {
        String verses = "";

        while(true)
        {
            if(upper == lower -1)
            {
                break;
            }

            verses = verses + verse(upper);
            upper--;
        }

        return verses;
    }



}
