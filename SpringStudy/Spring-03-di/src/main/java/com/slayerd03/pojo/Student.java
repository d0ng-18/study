package com.slayerd03.pojo;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
public class Student {
    private String name;
    private Address address;
    private Map<String,String> card;
    private String[] book;
    private List<String> hobbies;
    private Set<String> videoGames;
    private String wife;
    private Properties info;

}
