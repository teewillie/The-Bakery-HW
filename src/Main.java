/**Class: Main
 * @author Tee Willie
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: Febuary 13, 2024
 *
 * This class  involves tostring and  method getters and setters.
 */
public class Main {
    public static void main(String[] args) {
        // Creating instances of different bread types
        SourdoughBread sourdough = new SourdoughBread("5.00", "1.50", "2.50", "1.00", "1.00", "1.00", "not baked", "1. Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter.\n2. Make the dough\n3. Bulk Rise\n4. Stretch and fold the dough\n5. Cut and shape the dough\n6. Second rise\n7. Preheat the oven to 450°F towards the tail end of the second rise.\n8. Spray the loaf with lukewarm water.\n9. Bake the bread at 400°F for 20 minutes, until deep golden brown.\n10. Remove the bread from the oven.\n11. Let the bread cool until good to eat.");

        Muffins muffins = new Muffins("2.00", "1.00", "0.50", "0.75", "2.00", "1.50", "not baked", "1. Preheat oven to 375°F.\n2. Grease muffin cups or line with muffin liners.\n3. In a large bowl, mix together flour, baking powder, salt, and sugar.\n4. Make a well in the center and pour in the milk, egg, and oil.\n5. Mix until smooth.\n6. Fill muffin cups 2/3 full.\n7. Bake for 20 to 25 minutes in the preheated oven, or until done.");

        Pastries pastries = new Pastries("3.00", "0.75", "0.25", "1.25", "1.50", "2.00", "not baked", "1. Preheat oven to 375°F.\n2. In a large mixing bowl, combine flour, salt, and sugar.\n3. Cut in cold butter until mixture resembles coarse crumbs.\n4. Gradually add ice water, tossing with a fork until dough forms a ball.\n5. Divide dough in half. Roll each portion into a 12-in. circle; transfer to two greased 9-in. pie plates.\n6. In a large bowl, combine the filling ingredients; spoon into crusts.");

        StrawberryShortcake strawberryShortcake = new StrawberryShortcake("2.50", "1.00", "0.25", "0.50", "1.00", "1.50", "not baked", "1. Preheat oven to 425°F.\n2. In a large bowl, combine flour, sugar, baking powder, and salt.\n3. Cut in butter until mixture resembles coarse crumbs.\n4. Stir in milk just until moistened.\n5. Turn onto a lightly floured surface; knead gently 8-10 times.\n6. Pat or roll dough to 1/2-in. thickness; cut with a floured 2-1/2-in. biscuit cutter.");

        Bagels bagels = new Bagels("3.50", "1.25", "0.50", "0.50", "1.00", "2.00", "not baked", "1. In a large bowl, combine 2 cups flour, yeast, sugar and salt. Add warm water and oil; beat on medium speed 3 minutes. Stir in enough remaining flour to form a stiff dough.\n2. Turn dough onto a floured surface; knead until smooth and elastic, about 6-8 minutes. Place in a greased bowl, turning once to grease top. Cover and let rise in a warm place until doubled, about 30 minutes.\n3. Punch down dough; divide into 8-10 portions. Shape each into a ball, then gently flatten to form a 2-in. hole in the center. Cover and let rest for 10 minutes.\n4. In a Dutch oven, bring water and baking soda to a boil. Drop bagels, two at a time, into boiling water. Cook for 30 seconds; turn and cook 30 seconds longer. Remove with a slotted spoon; drain well on paper towels. Place 2 in. apart on greased baking sheets. Whisk together egg white and cold water; brush over bagels. Sprinkle with topping of your choice.\n5. Bake at 400°F for 25-30 minutes or until golden brown.");

        // Displaying recipes for each bread type
        System.out.println("Ingredients of Sourdough Bread:");
        System.out.println(sourdough.getIngredients() + "\n");
        System.out.println("Recipe for Sourdough Bread:");
        System.out.println(sourdough.getRecipe());
        sourdough.bake();
        System.out.println("Status: " + sourdough.getState() + "\n");

        System.out.println("Ingredients of Muffins:");
        System.out.println(muffins.getIngredients() + "\n");
        System.out.println("Recipe for Muffins:");
        System.out.println(muffins.getRecipe());
        muffins.bake();
        System.out.println("Status: " + muffins.getState() + "\n");

        System.out.println("Ingredients of Pastries:");
        System.out.println(pastries.getIngredients() + "\n");
        System.out.println("Recipe for Pastries:");
        System.out.println(pastries.getRecipe());
        pastries.bake();
        System.out.println("Status: " + pastries.getState() + "\n");

        System.out.println("Ingredients of Strawberry Shortcake:");
        System.out.println(strawberryShortcake.getIngredients() + "\n");
        System.out.println("Recipe for Strawberry Shortcake:");
        System.out.println(strawberryShortcake.getRecipe());
        strawberryShortcake.bake();
        System.out.println("Status: " + strawberryShortcake.getState() + "\n");

        System.out.println("Ingredients of Bagels:");
        System.out.println(bagels.getIngredients() + "\n");
        System.out.println("Recipe for Bagels:");
        System.out.println(bagels.getRecipe());
        bagels.bake();
        System.out.println("Status: " + bagels.getState() + "\n");
    }
}
