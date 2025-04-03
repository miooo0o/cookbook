package training.container.cookbook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeGenerator {

    @GetMapping("/recipe")
    public String generateRecipe(String instructions) {
        return "hello";
    }

}
