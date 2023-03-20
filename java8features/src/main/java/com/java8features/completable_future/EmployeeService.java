package com.java8features.completable_future;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class EmployeeService {


    public static List<Employee> getEmployees() throws IOException {
        FileReader fileReader=new FileReader("src/main/resources/employee.json");
        ObjectMapper mapper=new ObjectMapper();
        return    mapper.readValue(fileReader, new TypeReference<List<Employee>>() {
        });
    }

    public static List<Employee> getEmployeesUsingCF() throws IOException, ExecutionException, InterruptedException {
        FileReader fileReader=new FileReader("src/main/resources/employee.json");
        ObjectMapper mapper=new ObjectMapper();
        CompletableFuture<List<Employee>> listCompletableFuture = CompletableFuture.supplyAsync(() ->
        {
            try {
                return mapper.readValue(fileReader, new TypeReference<List<Employee>>() {
                });
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        return listCompletableFuture.get();
    }
}
