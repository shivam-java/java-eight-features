package com.java8features.functional_interafce.supplier_fi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier supplier=()-> "msg";
        System.out.println(supplier.get());
        List<Object> objects = Arrays.asList();
        Object o = objects.stream().findAny().orElseGet(supplier);
        System.out.println(o);

    }
}
