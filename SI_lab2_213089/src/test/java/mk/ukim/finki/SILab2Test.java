package mk.ukim.finki;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    public User user1 = new User("bojanaa1", "barbikaaa_aaa", "bojanaa1@gmail.com");
    public User user2 = new User("bojanaa2", "barbikaaa_aaa", "bojanaa2@gmail.com");
    public User user3 = new User("bojanaa3", "barbikaaa_aaa", "bojanaa3@gmail.com");

    ArrayList<User> list = new ArrayList<User>();

    @Test
    void exceptionTest() { //Multiple condition test
        list.add(user1);
        list.add(user2);
        list.add(user3);
        assertThrows(RuntimeException.class, ()-> SILab2.function(null, list));
    }

    //Every branch tests
    @Test
    void everyBranch1() {
        list.add(user1);
        list.add(user2);
        list.add(user3);
        User user = new User("", "barbikaaa_aaa", "bojanaa2@gmail.com");
        assertEquals(false, SILab2.function(user, list));
    }

    @Test
    void everyBranch2() {
        list.add(user1);
        list.add(user2);
        list.add(user3);
        User user = new User("bojanaa2", "pass", "bojanaa2gmailcom");
        assertEquals(false, SILab2.function(user, list));
    }

    @Test
    void everyBranch3() {
        list.add(user1);
        list.add(user2);
        list.add(user3);
        User user = new User("bojanaa2", "pass word", "bojanaa2@hotmail.com");
        assertEquals(false, SILab2.function(user, list));
    }

    @Test
    void everyBranch4() {
        list.add(user1);
        list.add(user2);
        list.add(user3);
        User user = new User("bojana", "bojanabojanabojana", "bojanaa2@gmail.com");
        assertEquals(false, SILab2.function(user, list));
    }


}