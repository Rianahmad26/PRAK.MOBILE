package com.rianahmad.uts_recipeapp;

import java.io.Serializable;

public class Recipe implements Serializable {
    private String strMeal;
    private String strMealThumb;
    private String strInstructions;

    public String getName() {
        return strMeal;
    }

    public String getImageUrl() {
        return strMealThumb;
    }

    public String getInstructions() {
        return strInstructions;
    }
}

