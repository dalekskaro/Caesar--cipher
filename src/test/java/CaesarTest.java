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
        String first_str = "First Programming Task at QA";
      Assertions.assertEquals(first_str, EntryPoint.Decrypt(EntryPoint.Enycrypt(first_str, 3), 3));
    }
    @Test
    void HardDecryptEngTest () {
        String first_str = "Iluvw Surjudpplqj Wdvn dw TD";
        Assertions.assertEquals(first_str, EntryPoint.Enycrypt(EntryPoint.Decrypt(first_str, 3), 3));
    }
    @Test
    void HardEnycryptNoEngTest () {
        String first_str = "Первая プログラム av";
        Assertions.assertEquals(first_str, EntryPoint.Decrypt(EntryPoint.Enycrypt(first_str, 3), 3));
    }
    @Test
    void HardDecryptNoEngTest () {
        String first_str = "Первая プログラム dy";
        Assertions.assertEquals(first_str, EntryPoint.Enycrypt(EntryPoint.Decrypt(first_str, 3), 3));
    }
}
