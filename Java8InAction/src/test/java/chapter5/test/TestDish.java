package chapter5.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import chapter5.CaloricLevel;
import chapter5.Dish;

public class TestDish {

	List<Dish> dishes;

	@BeforeEach
	public void init() {
		dishes = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHERS), new Dish("rice", true, 530, Dish.Type.OTHERS),
				new Dish("season fruit", true, 120, Dish.Type.OTHERS), new Dish("pizza", true, 550, Dish.Type.OTHERS),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
	}

	@Test
	public void test1() {
		List<Dish> veg = dishes.stream().filter(s -> s.isVeg()).collect(Collectors.toList());
		assertEquals(4, veg.size());
		List<String> names = dishes.stream().filter(s -> s.getCalories() > 300).map(Dish::getName).limit(3)
				.collect(Collectors.toList());
		System.out.println(names);
	}

	@Test
	public void testTruncatingStream() {
		List<Dish> firstThreeHighCalories = dishes.stream().filter(s -> s.getCalories() > 300).limit(3)
				.collect(Collectors.toList());

		assertEquals(3, firstThreeHighCalories.size());
	}

	@Test
	public void testFilteringStream() {
		List<Dish> dishesGreater = dishes.stream().filter(s -> s.getCalories() > 300).collect(Collectors.toList());

		assertEquals(7, dishesGreater.size());
	}

	@Test
	public void testFilteringStream2() {
		List<Dish> firstTwoMeatDishes = dishes.stream().filter(s -> s.getType() == Dish.Type.MEAT).limit(2)
				.collect(Collectors.toList());

		assertEquals("pork", firstTwoMeatDishes.get(0).getName());
		assertEquals("beef", firstTwoMeatDishes.get(1).getName());
	}

	@Test
	public void testSkippingStream() {
		List<Dish> dishesGreaterskipped = dishes.stream().filter(s -> s.getCalories() > 300).skip(2)
				.collect(Collectors.toList());

		assertEquals(5, dishesGreaterskipped.size());
	}

	@Test
	public void test2() {
		List<Dish> veg = dishes.stream().filter(s -> s.isVeg()).collect(Collectors.toList());
		assertEquals(4, veg.size());
		List<String> names = dishes.stream().filter(s -> {
			System.out.println("Filtering items " + s.getName());
			return s.getCalories() > 300;
		}).map(d -> {
			System.out.println("mapping items " + d.getName());
			return d.getName();
		}).limit(3).collect(Collectors.toList());
		System.out.println(names);
	}

	@Test
	public void testFilterUniqueElements() {
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4, 4);
		List<Integer> numbersWithoutDuplicates = numbers.stream().filter(i -> i % 2 == 0).distinct()
				.collect(Collectors.toList());
		assertEquals(2, numbersWithoutDuplicates.size());

	}

	@Test
	public void testFlatMap() {
		List<String> words = Arrays.asList("hello", "world");
		List<String> wordsWithoutDuplicates = words.stream().map(i -> i.split("")).flatMap(Arrays::stream).distinct()
				.collect(Collectors.toList());
		System.out.println(wordsWithoutDuplicates);
		assertEquals(7, wordsWithoutDuplicates.size());

	}

	@Test
	public void testMap() {
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4, 4);
		List<Integer> sqnumbers = numbers.stream().map(s -> s * s).collect(Collectors.toList());
		System.out.println(numbers);
		assertEquals(4, sqnumbers.get(1));

	}

	@Test
	public void testFlatMap2() {
		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(3, 4);
		List<int[]> pairs = numbers1.stream().flatMap(i -> numbers2.stream().map(j -> new int[] { i, j }))
				.collect(Collectors.toList());
//		pairs.forEach(i->{
//			for(int j=0;j<i.length;j++) {
//				System.out.print(i[j]);
//			}
//		});
		assertEquals(6, pairs.size());

	}

	@Test
	public void testFlatMap3() {
		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(3, 4);
		List<int[]> pairs = numbers1.stream()
				.flatMap(i -> numbers2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[] { i, j }))
				.collect(Collectors.toList());
//		pairs.forEach(i->{
//			for(int j=0;j<i.length;j++) {
//				System.out.print(i[j]);
//			}
//		});
		assertEquals(2, pairs.size());

	}

	// Any match returns true if atleast one stream element matches that predicate
	@Test
	public void testAnyMatch() {
		boolean containsVeg = dishes.stream().anyMatch(Dish::isVeg);
		assertTrue(containsVeg);
	}

	// All match returns true if all stream element matches that predicate
	@Test
	public void testAllMatch() {
		boolean containsVeg = dishes.stream().allMatch(s -> s.getCalories() < 1000);
		assertTrue(containsVeg);
	}

	// None match returns true if no stream element matches that predicate
	@Test
	public void testNoneMatch() {
		boolean containsVeg = dishes.stream().noneMatch(s -> s.getCalories() > 1000);
		assertTrue(containsVeg);
	}

	// findAny match returns any value that stream element matches
	@Test
	public void testFindAny() {
		Optional<Dish> vegDish = dishes.stream().filter(Dish::isVeg).findAny();
		assertTrue(vegDish.isPresent());
	}

	// findFirst match returns first value that stream element matches
	@Test
	public void testfindFirst() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> num = numbers.stream().map(i -> i * i).filter(i -> i % 3 == 0).findFirst();
		assertEquals(9, num.get());
	}

	
	@Test
	public void testReduce() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int num = numbers.stream().reduce(0, (a,b)->(a+b));
		assertEquals(15, num);
	}
	
	@Test
	public void testCountUsingReduce() {		
		int num = dishes.stream().map(d->1).reduce(0, (a,b)->(a+b));
		assertEquals(9, num);
	}
	
	
	
	
	@Test
	public void testNumericStream() {		
		int calories = dishes.stream().mapToInt(Dish::getCalories).sum();
		System.out.println(calories);
		assertEquals(4380, calories);
	}
	
	
	@Test
	public void testIntStreamRangeClosed() {		
		long count = IntStream.rangeClosed(1, 100).filter(i->i%2==0).count();		
		assertEquals(50, count);
	}
	
	
	@Test
	public void testIntStream() {		
		long count = IntStream.range(1, 100).filter(i->i%2==0).count();		
		assertEquals(49, count);
	}
	
	
	@Test
	public void testPythogoresTuples() {		
		Stream<int[]> pythTuples = IntStream.rangeClosed(1, 100).boxed()
							.flatMap(a->IntStream.rangeClosed(a, 100)
									.filter(b->Math.sqrt(a*a+b*b)%1==0)
									.mapToObj(b->
									new int[] {a,b,(int) Math.sqrt(a*a+b*b)}));	
		
		pythTuples.limit(10).forEach(t->System.out.println(t[0]+","+t[1]+","+t[2]));
		
	}
	
	
	@Test
	public void testStreamOfValues() {		
		Optional<String> maxWord = Stream.of("Java8","Lambdas","In","Action").max((s1,s2)->s1.compareTo(s2));		
		assertEquals("Lambdas", maxWord.get());
	}
	
	
	@Test
	public void testStreamFromArrays() {		
		int[] num = {2,3,5,7,11,13};
		int sum = Arrays.stream(num).sum();
		assertEquals(41, sum);
	}

	
	@Test
	public void testStreamFromFiles() {		
		long uniqueWords = 0;
		try(Stream<String> lines = Files.lines(Paths.get("C:\\Users\\Mani\\workspace\\PersonalProjects\\Java8InAction\\src\\test\\resources\\data.txt"),Charset.defaultCharset())) {
			uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
							.distinct().count();
			System.out.println(uniqueWords);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		assertEquals(5, uniqueWords);
	}
	
	
	@Test
	public void testStreamIterate() {		
		long count = Stream.iterate(0, n->n+2).limit(6).reduce(0, (a,b)->a+b);
		assertEquals(30, count);
	}
	
	
	@Test
	public void testStreamGenerate() {		
		long count = IntStream.generate(new IntSupplier() {
			
			@Override
			public int getAsInt() {
				// TODO Auto-generated method stub
				return 2;
			}
		}).limit(5).sum();
		assertEquals(10, count);
	}
	
	
	@Test
	public void testCountUsingCollectors() {		
		long num = dishes.stream().collect(Collectors.counting());
		assertEquals(9, num);
	}
	
	
	@Test
	public void testHighCalorieDishUsingCollectors() {
		Comparator<Dish> maxDishComparator = Comparator.comparingInt(Dish::getCalories);
		Optional<Dish> highCalorieDish = dishes.stream().collect(Collectors.maxBy(maxDishComparator));
		assertEquals("pork", highCalorieDish.get().getName());
	}
	
	

	@Test
	public void testHighCalorieDishUsingCollectorsReduce() {		
		Optional<Dish> highCalorieDish = dishes.stream().collect(Collectors.reducing((d1,d2)-> d1.getCalories() > d2.getCalories()?d1:d2));
		assertEquals("pork", highCalorieDish.get().getName());
	}
	
	
	@Test
	public void testLowCalorieDishUsingCollectorsReduce() {		
		Optional<Dish> highCalorieDish = dishes.stream().collect(Collectors.reducing((d1,d2)-> d1.getCalories() > d2.getCalories()?d2:d1));
		assertEquals("season fruit", highCalorieDish.get().getName());
	}
	
	
	@Test
	public void testLowCalorieDishUsingCollectors() {
		Comparator<Dish> minDishComparator = Comparator.comparingInt(Dish::getCalories);
		Optional<Dish> highCalorieDish = dishes.stream().collect(Collectors.minBy(minDishComparator));
		assertEquals("season fruit", highCalorieDish.get().getName());
	}
	
	
	@Test
	public void testLowCalorieDishUsingMinby() {		
		Optional<Dish> highCalorieDish = dishes.stream().min((d1,d2)-> {
			if(d1.getCalories()==d2.getCalories())
				return 0;
			else if(d1.getCalories()>d2.getCalories())
				return 1;
			else
				return -1;
		});
		assertEquals("season fruit", highCalorieDish.get().getName());
	}
	
	
	@Test
	public void testSumtUsingCollectors() {		
		int calories = dishes.stream().collect(Collectors.summingInt(Dish::getCalories));
		System.out.println(calories);
		assertEquals(4380, calories);
	}
	
	@Test
	public void testSumtUsingCollectorsReduce() {		
		int calories = dishes.stream().collect(Collectors.reducing(0, Dish::getCalories, (d1,d2)->d1+d2));		
		assertEquals(4380, calories);
	}
	
	
	@Test
	public void testAvgUsingCollectors() {		
		Double calories = dishes.stream().collect(Collectors.averagingInt(Dish::getCalories));		
		assertEquals(486.0, calories.intValue());
	}
	
	
	@Test
	public void testIntSummaryStatics() {		
		IntSummaryStatistics calories = dishes.stream().collect(Collectors.summarizingInt(Dish::getCalories));		
		assertEquals(9, calories.getCount());
		assertEquals(4380, calories.getSum());
		assertEquals(800, calories.getMax());
		assertEquals(120, calories.getMin());
	}
	
	
	
	@Test
	public void testJoingCollectors() {
		String shortMenu = dishes.stream().map(Dish::getName).collect(Collectors.joining(","));		
		assertEquals("pork,beef,chicken,french fries,rice,season fruit,pizza,prawns,salmon", shortMenu);
	}
	
	
	@Test
	public void testJoingCollectorsUsingCollectorsReduce() {
		String shortMenu = dishes.stream().map(Dish::getName).collect(Collectors.reducing((d1,d2)->d1+","+d2)).get();		
		assertEquals("pork,beef,chicken,french fries,rice,season fruit,pizza,prawns,salmon", shortMenu);
	}
	
	
	@Test
	public void testGroupingByCollectors() {
		Map<Dish.Type, List<Dish>> dishesByType = dishes.stream().collect(Collectors.groupingBy(Dish::getType));	
		List<Dish> fishDishes = dishesByType.get(Dish.Type.FISH);
		List<Dish> meatDishes = dishesByType.get(Dish.Type.MEAT);
		assertEquals(2, fishDishes.size());
		assertEquals(3, meatDishes.size());
	}
	
	
	
	@Test
	public void testGroupingByCollectorsBoolean() {
		Map<Boolean, List<Dish>> dishesByClassi = dishes.stream().collect(Collectors.groupingBy(Dish::isVeg));	
		List<Dish> vegDishes = dishesByClassi.get(true);
		List<Dish> nonVegDishes = dishesByClassi.get(false);
		assertEquals(4, vegDishes.size());
		assertEquals(5, nonVegDishes.size());
	}
	
	
	@Test
	public void testGroupingByCollectorsCaloricLevel() {
		Map<CaloricLevel, List<Dish>> dishesByClassi = dishes.stream().collect(Collectors.groupingBy(dish -> {
			if(dish.getCalories() < 400)
				return CaloricLevel.DIET;
			else if(dish.getCalories() < 700 )
				return CaloricLevel.NORMAL;
			else
				return CaloricLevel.FAT;
		}));	
		List<Dish> fat = dishesByClassi.get(CaloricLevel.FAT);
		List<Dish> diet = dishesByClassi.get(CaloricLevel.DIET);
		assertEquals(2, fat.size());
		assertEquals(2, diet.size());
	}
	
	
	
	


}
