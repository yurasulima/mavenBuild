package org.example;

import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        printJson();
    }

    public static void printJson(){
        JSONObject json = new JSONObject()
                .put("name", "Yura")
                .put("lastName", "Sulima");
        System.out.println(json.toString());
    }
}