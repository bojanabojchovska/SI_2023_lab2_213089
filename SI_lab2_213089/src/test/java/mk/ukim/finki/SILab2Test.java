package mk.ukim.finki;

import org.junit.jupiter.api.Test;

import javax.jws.soap.SOAPBinding;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    public User user= new User("bojana", "bojanaaaaaa", "bojana@gmail.com");
    public User user1= new User("bojana2", "barbika_aaaaa", "bojana2@gmail.com");
    public User user2= new User("bojana1", "bojanaaaaaa1", "bojana1@gmail.com");
    public List<User> lista= new ArrayList<>();

    @Test
    void MultipleConditionTest() {
        lista.add(user);
        lista.add(user1);
        lista.add(user2);
        assertThrows(RuntimeException.class, ()-> SILab2.function(null,lista));
    }
    @Test
    void EveryBranchConditionTest() {
        User user5= new User("", "barbika_aaaaa", "bojana2@gmail.com");
        lista.add(user);
        lista.add(user1);
        lista.add(user2);
        assertEquals(false, SILab2.function(user5,lista));
    }
    @Test
    void EveryBranchConditionTest2() {
        User user5= new User("bojana2", "barbi", "bojana2gmailcom");
        lista.add(user);
        lista.add(user1);
        lista.add(user2);
        assertEquals(false, SILab2.function(user5,lista));
    }
    @Test
    void EveryBranchConditionTest3() {
        User user5= new User("bojana2", "bar bikaaaa", "bojana2@hotmail.com");
        lista.add(user);
        lista.add(user1);
        lista.add(user2);
        assertEquals(false, SILab2.function(user5,lista));
    }
    @Test
    void EveryBranchConditionTest4() {
        User user5= new User("bojana211111", "barbarbikaaaaaa", "bojana2@hotmail.com");
        lista.add(user);
        lista.add(user1);
        lista.add(user2);
        assertEquals(false, SILab2.function(user5,lista));
    }
}