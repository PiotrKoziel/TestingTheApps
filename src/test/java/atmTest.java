import org.junit.Assert;
import org.junit.Test;

public class atmTest {


        @Test
        public void depositTest(){
            cashMachine atm = new cashMachine();
            atm.cashDeposits(200);
            Assert.assertTrue(atm.actualBalance()==200);
            atm.cashDeposits(-200);
            Assert.assertTrue(atm.actualBalance()==200);

        }
        @Test
        public void withdrawalTest() {
            cashMachine atm = new cashMachine();
            atm.cashWithdrawal(200);
            Assert.assertTrue(atm.actualBalance()==0);
            atm.cashDeposits(200);
            atm.cashWithdrawal(100);
            Assert.assertTrue(atm.actualBalance()==100);
        }
}


