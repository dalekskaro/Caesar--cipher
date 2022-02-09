import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarTest {

    //@Test
   /* void EnycryptEngTest(){
        //Assertions.assertTrue(false);
        //"First Programming Task at QA", "-o", "3", "-e"
        System.out.println("Code executes before this test method: ");
        //EntryPoint EnEng = new EntryPoint;
        Assertions.assertEquals("Iluvw", "\"First Programming Task at QA\", \"-o\", \"3\", \"-e\"");
    }*/
    @ParameterizedTest
        //@ValueSource (String ("First Programming Task at QA", -o, 3, -e))
    //@CsvFileSource (resources = "/testData.csv")
    @CsvSource(value = {
            "FirstProgrammingTaskatQA, 3, IluvwSurjudpplqjWdvndwTD",
            "Первая プログラム av, 3, Первая プログラム dy"
    })

    void EnycryptEngTest (String str, int num, String result) {
      String EnyEng = EntryPoint.Enycrypt(str, num);
      Assertions.assertEquals(EnyEng, result);
    }
}
