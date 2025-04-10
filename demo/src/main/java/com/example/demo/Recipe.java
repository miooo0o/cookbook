package com.example.demo;

import java.util.List;

public record Recipe(String title, String description, List<String> ingredients, List<String> steps) {}
