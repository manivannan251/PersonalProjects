package chapter5.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import chapter5.practise.Trader;
import chapter5.practise.Transaction;

public class TestTradersTransactions {

	private List<Transaction> transactions;

	@BeforeEach
	public void init() {
		Trader raol = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Milan");

		transactions = Arrays.asList(new Transaction(brian, 2011, 300), new Transaction(raol, 2012, 1000),
				new Transaction(raol, 2011, 400), new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));
	}

	// Returns transactions in 2011 and sort them by value from high to low
	@Test
	public void test1() {
		List<Transaction> filterT = transactions.stream().filter(i -> i.getYear() == 2011).sorted((a, b) -> {
			if (a.getValue() == b.getValue())
				return 0;
			else if (a.getValue() > b.getValue())
				return 1;
			else
				return -1;
		}).collect(Collectors.toList());

		assertEquals(2, filterT.size());
		assertEquals(300, filterT.get(0).getValue());
	}

	// Returns unique cities where traders work
	@Test
	public void test2() {
		List<String> cities = transactions.stream().map(i -> i.getTrader().getCity()).distinct()
				.collect(Collectors.toList());

		assertEquals(2, cities.size());
	}

	// Returns all traders from cambridge and sort them by name
	@Test
	public void test3() {
		List<Trader> traders = transactions.stream().map(Transaction::getTrader)
				.filter(i -> i.getCity().equals("Cambridge")).sorted((a, b) -> a.getName().compareTo(b.getName()))
				.collect(Collectors.toList());

		assertEquals(3, traders.size());
	}

	// Returns all traders name sorted alphabetically
	@Test
	public void test4() {
		List<String> name = transactions.stream().map(i -> i.getTrader().getName()).sorted()
				.collect(Collectors.toList());

		System.out.println(name);

		assertEquals(6, name.size());
		assertEquals("Alan", name.get(0));
	}

	// Returns any tarder based on Milan
	@Test
	public void test5() {
		boolean isPresent = transactions.stream().anyMatch(i -> i.getTrader().getCity().equals("Milan"));

		assertTrue(isPresent);
	}

	// Returns all tarnsaction values from traders livig in cambridge
	@Test
	public void test6() {

		List<Integer> values = transactions.stream().filter(i -> i.getTrader().getCity().equals("Cambridge"))
				.map(Transaction::getValue).collect(Collectors.toList());

		System.out.println(values);
		assertEquals(3, values.size());
	}

	// Returns transation with highest value
	@Test
	public void test7() {

		Optional<Integer> highValue =  transactions.stream().map(Transaction::getValue).reduce ((i,y)->i>y?i:y);

		
		assertEquals(1000, highValue.get());
	}
	
	

	// Returns transation with lowest value
	@Test
	public void test8() {

		Optional<Integer> lowValue =  transactions.stream().map(Transaction::getValue).reduce ((i,y)->i<y?i:y);
		
		//Optional<Integer> lowValue =  transactions.stream().map(Transaction::getValue).min(Comparator.com));

		
		assertEquals(300, lowValue.get());
	}

}
