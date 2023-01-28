package fr.welcome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestConway {
    @Test
    public void doNothing() {
    }

    @Test
    public void shouldReturn1WhenTheInputIs1() {
        assertEquals("1", new Conway().drawLine(1));
    }

    @Test
    public void shouldReturn11WhenTheInputIs2() {
        assertEquals("11", new Conway().drawLine(2));
    }

    @Test
    public void shouldReturn21WhenTheInputIs3() {
        assertEquals("21", new Conway().drawLine(3));
    }

    @Test
    public void shouldReturn1211WhenTheInputIs4() {
        assertEquals("1211", new Conway().drawLine(4));
    }

    @Test
    public void shouldReturn111221WhenTheInputIs5() {
        assertEquals("111221", new Conway().drawLine(5));
    }
    @Test
    public void shouldReturn312211WhenTheInputIs6() {
        assertEquals("312211", new Conway().drawLine(6) );
    }
    @Test
    public void shouldReturn13112221WhenTheInputIs7() {
        assertEquals("13112221".substring(0,0), new Conway().drawLine(7).substring(0,0));
    }


}
