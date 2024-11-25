package com.rianahmad.uts_recipeapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.squareup.picasso.Picasso;

public class DetailFragment extends Fragment {

    private TextView recipeName, recipeInstructions;
    private ImageView recipeImage;
    private String instructions, name, imageUrl;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        // Mendapatkan data yang dikirimkan dari HomeFragment
        if (getArguments() != null) {
            Recipe recipe = (Recipe) getArguments().getSerializable("recipe");
            if (recipe != null) {
                name = recipe.getName();
                instructions = recipe.getInstructions();
                imageUrl = recipe.getImageUrl();
            }
        }

        // Inisialisasi komponen UI
        recipeName = view.findViewById(R.id.recipe_name);
        recipeInstructions = view.findViewById(R.id.recipe_instructions);
        recipeImage = view.findViewById(R.id.recipe_image);

        // Menampilkan nama resep, instruksi, dan gambar
        recipeName.setText(name);
        recipeInstructions.setText(instructions);
        Picasso.get().load(imageUrl).into(recipeImage);

        return view;
    }
}
