package com.example.distributororderingsystem;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class JSONHelper {
    private static final String FILE_PATH = "orders.json";
    private static ObjectMapper mapper = new ObjectMapper();

    public static List<Order> readOrders() throws IOException {
        File file = new File(FILE_PATH);
        if (file.exists()) {
            return mapper.readValue(file, new TypeReference<List<Order>>(){});
        } else {
            return List.of(); // Returns an empty list if the file doesn't exist
        }
    }
    public static void writeOrders(List<Order> orders) throws IOException {
        mapper.writeValue(new File(FILE_PATH), orders);
    }
}