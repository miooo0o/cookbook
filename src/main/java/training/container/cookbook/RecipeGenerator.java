package training.container.cookbook;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeGenerator {

    private final ChatClient chatClient;

    RecipeGenerator(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping("/recipe")
    public String generateRecipe() {
        return chatClient.prompt("Generate a cooking recipe for a delicious main dish.").call().content();
    }

}
