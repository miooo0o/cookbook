package training.container.cookbook;

import java.util.List;

record Recipe(String title, String description, List<String> ingredients, List<String> steps) {}
