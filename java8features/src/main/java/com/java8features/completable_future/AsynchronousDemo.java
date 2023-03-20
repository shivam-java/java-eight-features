package com.java8features.completable_future;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsynchronousDemo {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        AsynchronousDemo asynchronousDemo=new AsynchronousDemo();
        long startTime=System.currentTimeMillis();
        List<Employee> employees = asynchronousDemo.fetchEmployees();
        System.out.println(System.currentTimeMillis()-startTime);
        System.out.println(employees.size());
    }
    public List<Employee> fetchEmployees() throws ExecutionException, InterruptedException {
        CompletableFuture<List<Employee>> listCompletableFuture = CompletableFuture.supplyAsync(
                () -> {
                    try {
                        return EmployeeService.getEmployeesUsingCF();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
        return listCompletableFuture.get();
    }
}
