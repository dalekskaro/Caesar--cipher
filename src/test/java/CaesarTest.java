import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarTest {

    @Test
   void EasyEnycryptEngTest(){
        Assertions.assertEquals(EntryPoint.Enycrypt("First Programming Task at QA",3),"Iluvw Surjudpplqj Wdvn dw TD");
    }
    @Test
    void EasyDecryptEngTest(){
        Assertions.assertEquals(EntryPoint.Decrypt("Iluvw Surjudpplqj Wdvn dw TD",3),"First Programming Task at QA");
    }
    @Test
    void EasyEnycryptNoEngTest(){
        Assertions.assertEquals(EntryPoint.Enycrypt("Первая プログラム av",3),"Первая プログラム dy");
        //Assertions.assertNotEquals(EntryPoint.Enycrypt("Первая プログラム av",3),"q");
    }
    @Test
    void EasyDecryptNoEngTest(){
        Assertions.assertEquals(EntryPoint.Decrypt("Первая プログラム dy",3),"Первая プログラム av");
        //Assertions.assertNotEquals(EntryPoint.Decrypt("Первая プログラム dy",3),"q");
    }
    @Test
    void HardEnycryptEngTest () {
      String str = EntryPoint.Enycrypt("First", 3);
      String new_str = EntryPoint.Decrypt("Iluvw", 3);
      Assertions.assertEquals(str, new_str);
    }
}
