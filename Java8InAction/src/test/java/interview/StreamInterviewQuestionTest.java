package interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static interview.StreamInterviewQuestion.getEmployeeList;
import static org.junit.jupiter.api.Assertions.*;

class StreamInterviewQuestionTest {

    //How many EmployeeObjects in the company are male and female
    @Test
    void getMaleFemaleCount() {
        Map<String, List<EmployeeObject>> employeeByGender = getEmployeeList().stream().collect(Collectors.groupingBy(EmployeeObject::getEmp_gender));
        Assertions.assertEquals(7,employeeByGender.get("Female").size());
        Assertions.assertEquals(10,employeeByGender.get("Male").size());
    }

    //printing the names of every department in the company
    @Test
    void printNamesofDepartment() {
        getEmployeeList().stream().map(EmployeeObject::getEmp_dep).distinct().forEach(System.out::println);
    }

    //average age of the employees, including men and women?
    @Test
    void averageAgeForMenAndWomen() {
        Map<String,Double> averegeAgeByGender = getEmployeeList().stream().collect(Collectors.groupingBy(EmployeeObject::getEmp_gender,Collectors.averagingInt(EmployeeObject::getEmp_age)));
        Assertions.assertEquals(31.7,averegeAgeByGender.get("Male"));
    }

    //Find the Highest paid employee in the Company?
    @Test
    void highestPaidEmployee() {
        Optional<EmployeeObject> highestPaidEmployee = getEmployeeList().stream().max(Comparator.comparingDouble(EmployeeObject::getEmp_salary));
        Assertions.assertEquals("Anuja",highestPaidEmployee.get().getEmp_name());
    }

    //List the names of all employees in the Company who have joined after 2014?
    @Test
    void EmployeeNamesAfter2014() {
        getEmployeeList().stream().filter(e->e.getYear_of_joining()>2014).map(EmployeeObject::getEmp_name).forEach(System.out::println);
    }

    //Calculate How many people work in each department?
    @Test
    void departmentCount() {
        Map<String,Long> employeeCont = getEmployeeList().stream().collect(Collectors.groupingBy(EmployeeObject::getEmp_dep,Collectors.counting()));
        Assertions.assertEquals(3,employeeCont.get("Sales"));
        Assertions.assertEquals(5,employeeCont.get("Development"));
    }

    //each dept average pay
    @Test
    void averagePayByDepartment() {
        Map<String,Double> averagePayByDepartment = getEmployeeList().stream().collect(Collectors.groupingBy(EmployeeObject::getEmp_dep,Collectors.averagingDouble(EmployeeObject::getEmp_salary)));
        Assertions.assertEquals(17000,averagePayByDepartment.get("Sales"));
    }

    //youngest male in development department
    @Test
    void youngestMale() {
        Optional<EmployeeObject> employeeObject = getEmployeeList().stream().filter(e->e.getEmp_dep().equals("Development") &&
                e.getEmp_gender().equals("Male")).min(Comparator.comparingInt(EmployeeObject::getEmp_age));
        Assertions.assertEquals("Joshi",employeeObject.get().getEmp_name());
    }

    //most experienced employee
    @Test
    void mostExperienced() {
        Optional<EmployeeObject> oldestEmployee = getEmployeeList().stream().sorted(Comparator.comparingInt(EmployeeObject::getYear_of_joining)).limit(1).findFirst();
        Assertions.assertEquals("Sharmila",oldestEmployee.get().getEmp_name());
    }

    //Calculate the Average Salary based on the Gender?
    @Test
    void averageSalaryByGender() {
        Map<String,Double> averageSalaryByGender = getEmployeeList().stream().collect(Collectors.groupingBy(EmployeeObject::getEmp_gender,Collectors.averagingDouble(EmployeeObject::getEmp_salary)));
        Assertions.assertEquals(20840,averageSalaryByGender.get("Male"));
    }

    //split into age under 25 and above 25
    @Test
    void seperateEmployees() {
        Map<Boolean,List<EmployeeObject>> booleanListMap = getEmployeeList().stream().collect(Collectors.partitioningBy(e->e.getEmp_age()>25));
        Assertions.assertEquals(2,booleanListMap.get(Boolean.FALSE).size());
    }

    //second highest salary
    @Test
    void secondHighestSalary() {
        Optional<EmployeeObject> employeeObjectOptional = getEmployeeList().stream().sorted(Comparator.comparingDouble(EmployeeObject::getEmp_salary).reversed())
                .skip(1).limit(1).findFirst();
        Assertions.assertEquals("Linga",employeeObjectOptional.get().getEmp_name());
    }

    //total salary expenditure
    @Test
    void totalSalaryExpenditure() {
        Double totSalary = getEmployeeList().stream().mapToDouble(EmployeeObject::getEmp_salary).sum();
        Assertions.assertEquals(397900,totSalary);
    }

    @Test
    void printReverseOrderByAgeAndName() {
        List<EmployeeObject> employeeList = getEmployeeList().stream().
                sorted((e1,e2)->{
                    return e1.getEmp_age()- e2.getEmp_age() == 0 ? e1.getEmp_name().compareTo(e2.getEmp_name()) : e1.getEmp_age()- e2.getEmp_age();
                })
                .collect(Collectors.toList());
        employeeList.forEach(System.out::println);
    }

    @Test
    //minimum age in each department
    void printMinimumAgeDepartment() {
        Map<String,Optional<EmployeeObject>> minAgeByDepartment = getEmployeeList().stream().collect(Collectors.groupingBy(EmployeeObject::getEmp_dep,
                Collectors.minBy(Comparator.comparingInt(EmployeeObject::getEmp_age))));
        minAgeByDepartment.forEach((k,v)->System.out.println(k+" -"+v.get().getEmp_name()));
    }


}