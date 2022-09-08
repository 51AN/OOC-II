import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ShameLessGreenTest {

    @Test
    void verse0() {
        String expected = "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n";
        ShameLessGreen ShameLessGreen = new ShameLessGreen();
        assertEquals(expected, ShameLessGreen.verse(0));
    }

    @Test
    void verse1() {
        String expected = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take it down and pass it around, no more bottles of beer on the wall.\n";
        ShameLessGreen ShameLessGreen = new ShameLessGreen();
        assertEquals(expected, ShameLessGreen.verse(1));
    }
    @Test
    void verse2() {
        String expected = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 bottle of beer on the wall.\n";
    }
    @Test
    void verse3_99(){
        String expected = "3 bottles of beer on the wall, 3 bottles of beer.\n" +
                "Take one down and pass it around, 2 bottles of beer on the wall.\n";
        ShameLessGreen ShameLessGreen = new ShameLessGreen();
        assertEquals(expected, ShameLessGreen.verse(3));

        expected = "99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take one down and pass it around, 98 bottles of beer on the wall.\n";
        assertEquals(expected, ShameLessGreen.verse(99));

        expected = "18 bottles of beer on the wall, 18 bottles of beer.\n" +
                "Take one down and pass it around, 17 bottles of beer on the wall.\n";
        assertEquals(expected, ShameLessGreen.verse(18));
    }
    @Test
    void verse_OutOfBounds(){
        String expected = "Go home you drunk bastard.\n";
        ShameLessGreen ShameLessGreen = new ShameLessGreen();
        assertEquals(expected, ShameLessGreen.verse(100));
        expected = "Learn to live a little.\n";
        assertEquals(expected, ShameLessGreen.verse(-1));
    }
    @Test
    void song(){
        String expected = "5 bottles of beer on the wall, 5 bottles of beer.\n" +
                "Take one down and pass it around, 4 bottles of beer on the wall.\n"+
                "4 bottles of beer on the wall, 4 bottles of beer.\n"+
                "Take one down and pass it around, 3 bottles of beer on the wall.\n" +
                "3 bottles of beer on the wall, 3 bottles of beer.\n"+
                "Take one down and pass it around, 2 bottles of beer on the wall.\n" +
                "2 bottles of beer on the wall, 2 bottles of beer.\n"+
                "Take one down and pass it around, 1 bottle of beer on the wall.\n" +
                "1 bottle of beer on the wall, 1 bottle of beer.\n"+
                "Take it down and pass it around, no more bottles of beer on the wall.\n"+
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n";
        ShameLessGreen ShameLessGreen = new ShameLessGreen();
        assertEquals(expected, ShameLessGreen.song(5,0));
    }
    @Test
    void songRange() {
        String expected = "5 bottles of beer on the wall, 5 bottles of beer.\n" +
                "Take one down and pass it around, 4 bottles of beer on the wall.\n"+
                "4 bottles of beer on the wall, 4 bottles of beer.\n"+
                "Take one down and pass it around, 3 bottles of beer on the wall.\n" +
                "3 bottles of beer on the wall, 3 bottles of beer.\n"+
                "Take one down and pass it around, 2 bottles of beer on the wall.\n" +
                "2 bottles of beer on the wall, 2 bottles of beer.\n"+
                "Take one down and pass it around, 1 bottle of beer on the wall.\n";
        ShameLessGreen ShameLessGreen = new ShameLessGreen();
        assertEquals(expected, ShameLessGreen.song(5,2));
    }
}
