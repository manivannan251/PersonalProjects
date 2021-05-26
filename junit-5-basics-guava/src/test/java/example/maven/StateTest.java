package example.maven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.guava.State;
import com.google.common.collect.Lists;

public class StateTest {
	
	List<State> states;
	
	@BeforeEach
    public void setUp () {

        states = Lists.newArrayList();

        states.add(new State("WI", "Wisconsin", "MDW", 5726398));
        states.add(new State("FL", "Florida", "SE", 19317568));
        states.add(new State("IA", "Iowa", "MDW", 3078186));
        states.add(new State("CA", "California", "W", 38041430));
        states.add(new State("NY", "New York", "NE", 19570261));
        states.add(new State("CO", "Colorado", "W", 5187582));
        states.add(new State("OH", "Ohio", "MDW", 11544225));
        states.add(new State("ME", "Maine", "NE", 1329192));
        states.add(new State("SD", "South Dakota", "MDW", 833354));
        states.add(new State("TN", "Tennessee", "SE", 6456243));
        states.add(new State("OR", "Oregon", "W", 3899353));
    }
	
	
	@Test
	public void get_mdw_traditional () {
		List<State> mdwStates = Lists.newArrayList();
		mdwStates = states.stream().filter(s->s.getRegioncode().equals("MDW")).collect(Collectors.toList());
		
		assertEquals(4, mdwStates.size());
	}
}
