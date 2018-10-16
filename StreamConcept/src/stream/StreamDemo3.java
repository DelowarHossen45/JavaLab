package stream;

import java.io.IOException;

import java.nio.file.*;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.Scanner;

import java.util.stream.Collectors;

import java.util.stream.Stream;

import java.io.File;



public class StreamDemo3{

    public static void main(String[] args) throws IOException{

        Stream<String> stream = Files.lines(Paths.get("F:\\\\Java eclipse code\\\\StreamConcept/countries.txt"));

        List<String> lineContainThe = stream

            .filter(w -> w.contains("the"))

            .collect(Collectors.toList());
        System.out.println(lineContainThe);

    }

}
