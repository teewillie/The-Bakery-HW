/**Class: Bread
 * @author Tee Willie
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: Febuary 13, 2024
 *
 * This class  involves tostring and  method getters and setters.
 */
// Superclass Bread represents a generic bread recipe
public class Bread {
    // Instance variables representing ingredients and attributes of bread
    private String flour;
    private String water;
    private String salt;
    private String sugar;
    private String bakingPowder;
    private String yeast;
    private String breadName;
    private String state; // State of the bread: baked or not baked
    private String recipe; // Recipe to make the bread

    // Constructor with parameters to initialize bread attributes
    public Bread(String flour, String water, String salt, String sugar, String bakingPowder, String yeast, String breadName, String state, String recipe) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.state = state;
        this.recipe = recipe;
    }

    // Getter and setter methods for encapsulation
    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getBakingPowder() {
        return bakingPowder;
    }

    public void setBakingPowder(String bakingPowder) {
        this.bakingPowder = bakingPowder;
    }

    public String getYeast() {
        return yeast;
    }

    public void setYeast(String yeast) {
        this.yeast = yeast;
    }

    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    // Method to bake the bread if it's not already baked
    public void bake() {
        if (!state.equals("baked")) {
            state = "baked";
            System.out.println(breadName + " is now baked!");
        } else {
            System.out.println("Can't bake, " + breadName + " is already baked.");
        }
    }

    // Method to get the list of ingredients
    public String getIngredients() {
        return "Ingredients of " + breadName + " are:\n" +
                flour + " cups of flour\n" +
                water + " cups of water\n" +
                salt + " teaspoons of salt\n" +
                sugar + " cups of sugar\n" +
                bakingPowder + " teaspoons of baking powder\n" +
                yeast + " teaspoons of yeast";
    }

    // Method to display the recipe
    public void displayRecipe() {
        System.out.println("Recipe of " + breadName + ":\n" + recipe);
    }

    // toString method to display bread details
    @Override
    public String toString() {
        return "Bread{" +
                "breadName='" + breadName + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
