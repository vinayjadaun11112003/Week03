import org.example.com.binary_search_problem.find_peak_element.PeakElement;
import org.example.com.binary_search_problem.find_rotation_point.RotationPoint;
import org.example.com.binary_search_problem.last_occurance_in_sorted_array.BinarySearchOfLastOccurance;
import org.example.com.binary_search_problem.search_for_target_in_2d_array.MatrixSearch;
import org.example.com.challenge_problem.SearchAndMissingNumber;
import org.example.com.linear_search_problems.search_for_a_specific_word.SearchWord;
import org.example.com.linear_search_problems.search_negative_numbers.SearchNegative;
import org.junit.jupiter.api.*;

import java.util.Arrays;

public class Day05_Testing{
    public static String blue = "\u001B[34m";
    public static String green = "\u001B[32m";
    public static String yellow = "\u001B[33m";
    public static String white = "\u001B[37m";
    public static String purple = "\u001B[35m";
    public static int counter = 0;
    @BeforeAll
    public static void beforeAll(){
        System.out.println(blue+"STARTING THE TESTING ON PROGRAMS..."+white);
    }

    @BeforeEach
    public void beforeeach(){
        System.out.println(yellow+"Running Test Case : "+(++counter)+white);
    }

//    -----------------------------------------------------------------------------------------------------------------------------------------------


                                           //TESTING START FROM HERE
    //                                TESTING LINEAR SEARCH PROBLEMS METHODS


//    -----------------------------------------------------------------------------------------------------------------------------------------------
    //Testing Searchword method
    @Test
    public void testSearchWord(){
        int output = SearchWord.searchWord("Vinay jadaun is a good bouy","good");
        int expected = 4;
        Assertions.assertEquals(expected,output,"something went wrong");
    }

    //Testing SearchNegative method
    @Test
    public void testSearchNegative(){
        int[] arr = new int[]{1,4,5,7,-5,7};
        int output = SearchNegative.findNegative(arr);
        int expected = 4;
        Assertions.assertEquals(expected,output,"something went wrong");
    }


//    -------------------------------------------------------------------------------------------------------------------------------------------



                                      //TESTING BINARY SEARCH PROBLEM METHODS



//    -------------------------------------------------------------------------------------------------------------------------------------------

    //Testing PeakElement method
    @Test
    public void testFindPeakElement(){
        int[] arr = new int[]{1,2,1,3,4,5};
        int output = PeakElement.findPeak(arr);
        int expected = 2;
        Assertions.assertEquals(expected,output,"something went wrong");

    }

    //Testing RotationPoint method
    @Test
    public void testFindRotationPoint(){
        int[] arr = new int[]{4,5,1,2,3};
        int output = RotationPoint.findRotationPoint(arr);
        int expected = 2;
        Assertions.assertEquals(expected,output,"something went wrong");
    }

    //Testing Last occurance method
    @Test
    public void testLastOccurance(){
        int[] arr = new int[]{1,2,2,3,4,5,6,7,8};
        int[] output = BinarySearchOfLastOccurance.findFirstAndLast(arr,2);
        int[] expected = new int[]{1,2};
        Assertions.assertEquals(Arrays.toString(expected),Arrays.toString(output),"something went wrong");
    }

    //Testing SearchIn2DArray method
    @Test
    public void testSearchIn2DArray(){
        int[][] matrix1 = {
                {1, 4, 7, 11},
                {12, 15, 18, 20},
                {23, 26, 29, 31},
                {32, 356, 2564, 45817}
        };
        Boolean output = MatrixSearch.searchMatrix(matrix1,29);
        Assertions.assertEquals(true,output,"something went wrong");

    }
//    -------------------------------------------------------------------------------------------------------------------------------------------



                                    //TESTING CHALLENGE PROBLEM SET



//    -------------------------------------------------------------------------------------------------------------------------------------------
    //Testing Missing positive number in array method
    @Test
    public void testMissing(){
        int[] nums = {3, 4, -1, 1};
        int output = SearchAndMissingNumber.firstMissingPositive(nums);
        int expected = 2;
        Assertions.assertEquals(expected,output,"something went wrong");
    }

    //Testing BinarySearch method
    @Test
    public void testSearchinBS(){
        int[] arr = {1,2,5,6,7};
        int output = SearchAndMissingNumber.binarySearch(arr,5);
        int expectd = 2;
        Assertions.assertEquals(expectd,output,"something went wrong");
    }
//    -------------------------------------------------------------------------------------------------------------------------------------------
    @AfterEach
    public void afterEach(){
        System.out.println(green+"PASSED"+white);
    }

    @AfterAll
    public static void afterAll(){
        System.out.println(purple+"All Test Cases Passed .. well done.."+white);
    }

}
