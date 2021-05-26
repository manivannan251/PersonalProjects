package example.maven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;

public class TestGuavaCollection {
	
	@Test
	public void testWithoutMultiMap() {
		List<String> li = Lists.newArrayList("Mani","Bulla","Kora","Mani");
		long count = li.stream().filter(s->s.equals("Mani")).count();
		assertEquals(2, count);
	}
	
	
	@Test
	public void testWithMultiMap() {
		List<String> li = Lists.newArrayList("Mani","Bulla","Kora","Mani");
		HashMultiset<String> multiSet =  HashMultiset.create(li);
		assertEquals(2, multiSet.count("Mani"));
	}
}
