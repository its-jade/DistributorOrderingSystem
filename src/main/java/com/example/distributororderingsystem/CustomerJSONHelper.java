package com.example.distributororderingsystem;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CustomerJSONHelper {
    private static final String filePath = "data\\customers.json";
    private static ObjectMapper mapper = new ObjectMapper();

    public static List<Customer> readCustomers() throws IOException {
        File file = new File(filePath);
        if (file.exists()) {
            return mapper.readValue(file, new TypeReference<List<Customer>>(){});
        } else {
            return List.of(); // Returns an empty list if the file doesn't exist
        }
    }
    public static void writeCustomers(List<Customer> customers) throws IOException {
        mapper.writeValue(new File(filePath), customers);
    }
}