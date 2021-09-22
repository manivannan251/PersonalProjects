package chapter5.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import chapter5.Student;

public class TestStudent {
	
	List<Student> students;
	
	
	
	@BeforeEach
	public void init() {
		students = Arrays.asList(new Student("Mani", 1, 1200),
				new Student("Indhu", 2, 1100),
				new Student("Pal", 3, 700),
				new Student("Mani", 4, 1200)
				);
	}
	
	@Test
	public void testScoreLessThan100() {
		List<Student> avgStudents = students.stream()
										.filter(s->s.getMarks()<1000)
										.collect(Collectors.toList());
		
		assertEquals(1, avgStudents.size());
	}
	
	
	@Test
	public void testStudentsWithoutDuplicates() {
		List<Student> avgStudents = students.stream()
										.filter(s->s.getMarks()>1000)
										.distinct()
										.collect(Collectors.toList());
		
		assertEquals(2, avgStudents.size());
	}
}
