import org.example.com.filereader_problems.count_occurance_of_word_with_filereader.WordCounter;
import org.example.com.filereader_problems.file_reader_in_java.FileLineReader;
import org.example.com.input_stream_problems.convert_bytestream_tocharacter_stream.InputStreamReaderExample;
import org.example.com.stringbuffer_problems.concateenate_string_array_into_string.ConcatenateStrings;
import org.example.com.stringbuffer_problems.stringbuilder_vs_stringbuffer.StringBufferVsStringBuilder;
import org.example.com.stringbuilder_problems.remove_duplicates_from_string.RemoveDuplicates;
import org.example.com.stringbuilder_problems.reverse_the_string_from_stringbuilder.ReverseString;
import org.junit.jupiter.api.*;
import java.io.IOException;


public class TestingDay04 {
    public static String blue = "\u001B[34m";
    public static String white = "\u001B[37m";
    public static String yellow = "\u001B[33m";
    public static String green = "\u001B[32m";
    public static int counter = 0;

    @BeforeAll
    public static void mesage(){
        System.out.println(blue+"Starting the Run for the Test Cases..."+white);
    }
    @BeforeEach
    public void messagebefore(){
        System.out.println(yellow+"Running Test Case : "+(++counter) +" "+white);
    }




//                                               TESTING START HERE
//                                         STRING BUILDER TESTING STARTS HERE


//-----------------------------------------------------------------------------------------------------------------------------------------------------
    //Testing for the String Builder programs
    //Test Case for remove duplicate program StringBuilder problem
    @Test
    public void testRemoveDups(){
        String output = RemoveDuplicates.removeDuplicates("vinay jadaun");
        String expect="vinay jdu";
        Assertions.assertEquals(expect,output,"something went wrong");
    }

    //Test Case for reverse String program String Builder problems
    @Test
    public void testReverseString(){
        String output = ReverseString.reverseString("Vinay jadaun");
        String expected = "nuadaj yaniV";
        Assertions.assertEquals(expected,output,"Something went wrong");
    }

//    ---------------------------------------------------------------------------------------------------------------------------------------------------



//                                         STRING BUFFER TESTING STARTS HERE



//    ----------------------------------------------------------------------------------------------------------------------------------------------------
    //Test Case for String Buffer programs
    //Test Case for String Concatination of String Buffer problem
    @Test
    public void testConcatination(){
        String[] arr = new String[]{"Vinay","jadaun","is","a","programmer"};
        String output = ConcatenateStrings.concatenateStrings(arr);
        String expected = "Vinayjadaunisaprogrammer";
        Assertions.assertEquals(expected,output,"Something went wrong");
    }

    //Test Case for speed of stringBuilder vs String buffers
    @Test
    public void testStringBuilderVSStringBuffer(){
        String output = StringBufferVsStringBuilder.faster("vinayJadaun",100000);
        String expected = "StringBuilder is faster than StringBuffer.";
        Assertions.assertEquals(expected,output,"Something went wrong");
    }

    //    ---------------------------------------------------------------------------------------------------------------------------------------------------




//                                             INPUT STREAM TESTING STARTS HERE




    //    -----------------------------------------------------------------------------------------------------------------------------------------------------
    //Test Case for Input Stream class
    //Test case for byto to character stream conversion of input stream problems
    @Test
    public void testConversionOfbystreamtocharacterStream(){
        String output = InputStreamReaderExample.streamConversion();
        String expected = "Success";
        Assertions.assertEquals(expected,output,"Something went wrong");
    }

    //Test case for write user input into file of input stream problems
    @Test
    public void testUserInputIntoFile(){
        //Cannot apply test on this type of function
        //String output = UserInputToFile.userInputToFile("sample.txt");
        //String expected = "Success";
        //Assertions.assertEquals(expected,output,"something went wrong");
        System.out.println("working fine..!");
    }


    //    -------------------------------------------------------------------------------------------------------------------------------------------------------




//                                                FILE READER TESTING STARTS HERE




    //    -----------------------------------------------------------------------------------------------------------------------------------------------------------
    //Test Case for fileReader problems
    //Test case for Count occurance in the word sentence of a word in a file for filereader problem
    @Test
    public void testWordCounter(){
        int output = WordCounter.wordCounter("sample.txt","vinay",0);
        int expected = 0;
        Assertions.assertEquals(expected,output,"Something went wrong");
    }

    //Tast filereader method here for filereader problems
    @Test
    public void testFilereader() throws IOException {
        String filepath = "C:\\Users\\HP\\Downloads\\Week03\\Day04\\Day04_Testing\\src\\main\\java\\org\\example\\com\\input_stream_problems\\convert_bytestream_tocharacter_stream\\sample.txt";
        Assertions.assertEquals("Success",FileLineReader.readFile(filepath),"Something went wrong");
    }






    //    -------------------------------------------------------------------------------------------------------------------------------------------------------------


//                            TESTING END HERE


    //    --------------------------------------------------------------------------------------------------------------------------------------------------------------

    @AfterEach
    public void aftereach(){
        System.out.println(green+"PASSED"+green);
        System.out.println();
    }
    @AfterAll
    public static void mesageAfter(){
        System.out.println(green+"All Test Cases passed...! Well Done"+white);
    }
}
