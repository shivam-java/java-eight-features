package com.java8features.completable_future;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Demo
{

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
     Demo demo=new Demo();
        long l = System.currentTimeMillis();
        demo.printEmployee();
        long e = System.currentTimeMillis();
        System.out.println(e-l);

        long ll = System.currentTimeMillis();
        demo.printEmployeeNormalThread();
        long ee = System.currentTimeMillis();
        System.out.println(ee-ll);
    }

   Void printEmployee() throws FileNotFoundException, ExecutionException, InterruptedException {
        FileReader fileReader=new FileReader("src/main/resources/employee.json");
        ObjectMapper mapper=new ObjectMapper();
       CompletableFuture<Void> completableFuture=CompletableFuture.runAsync(()-> {
            try {
                List<Employee>    employees = mapper.readValue(fileReader, new TypeReference<List<Employee>>(){});
                System.out.println(employees.get(0));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
return completableFuture.get();
    }


    void printEmployeeNormalThread() throws IOException, ExecutionException, InterruptedException {
        FileReader fileReader=new FileReader("src/main/resources/employee.json");
        ObjectMapper mapper=new ObjectMapper();

                List<Employee>    employees = mapper.readValue(fileReader, new TypeReference<List<Employee>>(){});
                System.out.println(employees.get(0));

    }
}