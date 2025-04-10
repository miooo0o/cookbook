package com.example.demo;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RecipeGenerator {

    private final ChatClient chatClient;

	RecipeGenerator(ChatClient.Builder builder) {
    	this.chatClient = builder.build();
	}

    @PostMapping(value = "/recipe", produces = MediaType.APPLICATION_JSON_VALUE)
    public Recipe generateRecipe(@RequestParam(value = "instructions", defaultValue = "banana-cake") String instructions) {
        System.out.println("We got these instructions:\n" + instructions + "\n");
        Recipe recipe = chatClient.prompt("Generate a cooking recipe for a delicious main dish. Take into account the following instructions:\n" + instructions).call().entity(Recipe.class);
        return recipe;
    }

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("aiModel", "AI Assistant");
        return "index";
    }

    @PostMapping("/")
    public String generateAndShowRecipe (
    Model model, @RequestParam(value = "instructions") String instructions) {
    Recipe recipe = generateRecipe(instructions);
    model.addAttribute("recipe", recipe);
    model.addAttribute("aiModel", "AI Assistant");
    return "index";
    }
}



