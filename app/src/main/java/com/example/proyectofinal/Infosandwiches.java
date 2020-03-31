package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Infosandwiches extends AppCompatActivity {

    ImageView   imageViewImagen;
    TextView    textViewNombre;
    TextView    textViewDescripcion;
    TextView    textViewPrecio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infosandwiches);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageViewImagen = findViewById(R.id.imageSandwich);
        textViewNombre = findViewById(R.id.nombreSandwich);
        textViewDescripcion = findViewById(R.id.descripcion);
        textViewPrecio = findViewById(R.id.showPrecio);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            setTitle("DETALLE DE " + bundle.getString("nombre"));

            //Cargar imagenes
            if(bundle.getString("idImagen").equals("1"))
                imageViewImagen.setImageResource(R.drawable.italiano);
            if(bundle.getString("idImagen").equals("2"))
                imageViewImagen.setImageResource(R.drawable.chacarero);
            if(bundle.getString("idImagen").equals("3"))
                imageViewImagen.setImageResource(R.drawable.luco);
            if(bundle.getString("idImagen").equals("4"))
                imageViewImagen.setImageResource(R.drawable.vegetariano);
            if(bundle.getString("idImagen").equals("5"))
                imageViewImagen.setImageResource(R.drawable.vegano);

            textViewNombre.setText(bundle.getString("nombre"));
            textViewDescripcion.setText(bundle.getString("descripcion"));
            textViewPrecio.setText(bundle.getString("precio"));

        }
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
