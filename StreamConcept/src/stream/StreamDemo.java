package stream;
import java.io.IOException;
import java.nio.file.Files;
 import java.nio.file.Paths;import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 public class StreamDemo{
	 public static void main(String[] args) throws IOException
	 {
		 try (Stream<String> lines = Files.lines(Paths.get("F:\\Java eclipse code\\StreamConcept/countries.txt")))
		 { // Read the lines
 long result = lines
.filter(w -> w.length() > 4)
.peek(w -> System.out.println(w))
.count();
 }
 }
 }