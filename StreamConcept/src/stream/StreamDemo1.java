package stream;
import java.io.IOException;
import java.nio.file.Files;
 import java.nio.file.Paths;import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 public class StreamDemo1{
	 public static void main(String[] args) throws IOException
	 {
		 try (Stream<String> lines = Files.lines(Paths.get("F:\\Java eclipse code\\StreamConcept/countries.txt")))
		 { // Read the lines
 long result = lines
.filter(w -> w.contains("the"))
.count();
System.out.println("number of line contains : "+result);


 }
 }
 }