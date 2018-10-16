package stream;
import java.io.IOException;

import java.nio.file.*;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.Scanner;

import java.util.stream.Stream;

import java.io.File;



public class StreamDemo2{

    public static void main(String[] args) throws IOException{

        Scanner in = new Scanner(new File("F:\\\\Java eclipse code\\\\StreamConcept/countries.txt"));

        List<String> words = new ArrayList<>();

        while(in.hasNext()){

            words.add(in.next());

        }

        Stream<String> stream = words.stream();

        long count = stream

            .filter(w -> w.contains("the"))

            .count();

        System.out.println(count);

    }

}