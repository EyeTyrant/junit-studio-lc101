package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }

    @Test
    public void charAndBracketsReturnsTrue() {
        BalancedBrackets test_Char = new BalancedBrackets();
        assertTrue(test_Char.hasBalancedBrackets("[somechars]"));
    }
    @Test
    public void multiBracketsReturnsTrue() {
        BalancedBrackets test_Multi = new BalancedBrackets();
        assertTrue(test_Multi.hasBalancedBrackets("[][][]"));
    }
    @Test
    public void charAndMultiBracketRetrunsTrue(){
        BalancedBrackets test_CharMulti = new BalancedBrackets();
        assertTrue(test_CharMulti.hasBalancedBrackets("[asg]as[dsfg][]"));
    }
    @Test
    public void noBracketsReturnsTrue(){
        BalancedBrackets test_noBrack = new BalancedBrackets();
        assertTrue(test_noBrack.hasBalancedBrackets(""));
    }
    @Test
    public void charNoBracketsReturnsTrue(){
        BalancedBrackets test_CharNoBrack = new BalancedBrackets();
        assertTrue(test_CharNoBrack.hasBalancedBrackets("asdf"));
    }
    @Test
    public void reversedBracketsReturnsFalse(){
        BalancedBrackets test_Reversed = new BalancedBrackets();
        assertFalse(test_Reversed.hasBalancedBrackets("]["));
    }
    @Test
    public void singleOpenBracketReturnsFalse(){
        BalancedBrackets test_SingleOpen = new BalancedBrackets();
        assertFalse(test_SingleOpen.hasBalancedBrackets("["));
    }
    @Test
    public void singleCloseBracketReturnsFalse(){
        BalancedBrackets test_SingleClose = new BalancedBrackets();
        assertFalse(test_SingleClose.hasBalancedBrackets("]"));
    }
    @Test
    public void charsAndReversedBracketsRetrunesFalse(){
        BalancedBrackets test_CharRev = new BalancedBrackets();
        assertFalse(test_CharRev.hasBalancedBrackets("d]asd[f"));
    }
    @Test
    public void charsAndSingleCloseBracketRetrunsFalse(){
        BalancedBrackets test_CharAndClose = new BalancedBrackets();
        assertFalse(test_CharAndClose.hasBalancedBrackets("asdf]fs"));
    }
}
