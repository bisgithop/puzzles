// Execute the below code here - https://www.w3schools.com/java/tryjava.asp?filename=demo_compiler

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {      
        List<List<String>> listOLists = Arrays.asList(
            Arrays.asList("Reflection", "Collection", "Stream"),
            Arrays.asList("Structure", "State", "Flow", "Slippery"),
            Arrays.asList("Sorting", "Affair", "State", "of", "Affair", "Mapping", "Reduce", "Stream")
        );
      
        Set<String> intermediateResults = new HashSet<>();
     
        List<String> result = listOLists.stream()
            .flatMap(List::stream)               //  can we use lamda expression here ? 
            .filter(s -> s.startsWith("S"))      // String::startsWith too works here             
            //.filter(String::startsWith("S"))    // this doesn't work ? 
            .map(String::toUpperCase)             // String::toUperCase too works here 
            //.map(s -> s.toUpperCase())          // s -> s.toUpperCase() works  
            .distinct()                          // Remove duplicate elements
            .sorted()                            // Sort elements
            .peek(s -> intermediateResults.add(s)) // Perform an action (add to set) on each element
            .collect(Collectors.toList());       // Collect the final result into a list

        // Print the intermediate results
        System.out.println("Intermediate:");
        intermediateResults.forEach(System.out::println);

        // Print the final result
        System.out.println("Result:");
        result.forEach(System.out::println);
    
    
  }
}
