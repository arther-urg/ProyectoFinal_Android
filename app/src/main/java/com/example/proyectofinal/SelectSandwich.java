package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;

import java.io.Serializable;
import java.util.ArrayList;

public class SelectSandwich extends AppCompatActivity {

    private Button btnItaliano;
    private Button btnChacarero;
    private Button btnBarrosLuco;
    private Button btnVegetariano;
    private Button btnVegano;

    LinearLayout contenedor;
    ArrayList<Sandwich> arrayListSandwiches = new ArrayList<Sandwich>();

    Sandwich sandwichItaliano;
    Sandwich sandwichChacarero;
    Sandwich sandwichBarrosLuco;
    Sandwich sandwichVegetariano;
    Sandwich sandwichVegano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectsandwich);
        setTitle("SANDWICHES DE FAST FOOD");
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rellenarSandwiches();

        contenedor  = (LinearLayout) findViewById(R.id.contenedor);

        for (final Sandwich b:arrayListSandwiches){
            Button btnSandwich = new Button(this);
            btnSandwich.setText(b.getNombre());

            btnSandwich.setTextColor(Color.parseColor("#3f72af"));
            btnSandwich.setBackgroundColor(Color.parseColor("#a6e3e9"));
            btnSandwich.setTextSize(30);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            params.leftMargin = 50;
            params.rightMargin = 50;
            params.topMargin = 50;
            params.bottomMargin = 50;
            contenedor.addView(btnSandwich, params);
            btnSandwich.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentItaliano = new Intent(contenedor.getContext(), Infosandwiches.class);
                    intentItaliano.putExtra("nombre", b.getNombre());
                    intentItaliano.putExtra("idImagen", b.getIdImagen());
                    intentItaliano.putExtra("descripcion", b.getDescripcion());
                    intentItaliano.putExtra("precio", b.getPrecio());

                    startActivity(intentItaliano);
                }
            });

        }

/*
        btnItaliano = (Button) findViewById(R.id.btnItaliano);
        btnChacarero = (Button) findViewById(R.id.btnChacarero);
        btnBarrosLuco = (Button) findViewById(R.id.btnBarrosLuco);
        btnVegetariano = (Button) findViewById(R.id.btnVegetariano);
        btnVegano = (Button) findViewById(R.id.btnVegano);
*/
    }

    public void rellenarSandwiches(){
        sandwichItaliano = new Sandwich("ITALIANO", "1", "Contiene 250 gramos de bistec de posta rosada, 2 paltas grandecitas, tomate mayonesa que reposan sobre dos panes frica.", "3500");
        sandwichChacarero = new Sandwich("CHACARERO", "2", "El chacarero es un plato típico de la gastronomía chilena, consistente en un sándwich compuesto por ají verde picado, lonjas de carne, porotos verdes cocidos fríos y tomates en rodajas.", "4000");
        sandwichBarrosLuco = new Sandwich("BARROS LUCO", "3", "Contiene 250 gramos de filete a la plancha y queso caliente servido dentro de un pan de sandwich.", "3000");
        sandwichVegetariano = new Sandwich("VEGETARIANO", "4", "Consiste en un sandwich que trae una hamburguesa de soya casera, lechuga, tomate y queso", "4000");
        sandwichVegano = new Sandwich("VEGANO", "5", "Consiste en un sandwich con una hamburguesa de soya casera, palta, tomate, lechuga, cebolla, mayonesa de garbanzos, sin ningún producto animal.", "4000");

        arrayListSandwiches.add(sandwichItaliano);
        arrayListSandwiches.add(sandwichChacarero);
        arrayListSandwiches.add(sandwichBarrosLuco);
        arrayListSandwiches.add(sandwichVegetariano);
        arrayListSandwiches.add(sandwichVegano);

        Log.d("tagg", String.valueOf(arrayListSandwiches.get(0).getNombre()));
    }

    public void infoItaliano(View view){
        Intent intentItaliano = new Intent(this, Infosandwiches.class);
        intentItaliano.putExtra("nombre", arrayListSandwiches.get(0).getNombre());
        intentItaliano.putExtra("idImagen", arrayListSandwiches.get(0).getIdImagen());
        intentItaliano.putExtra("descripcion", arrayListSandwiches.get(0).getDescripcion());
        intentItaliano.putExtra("precio", arrayListSandwiches.get(0).getPrecio());

        startActivity(intentItaliano);
    }

    public void infoChacarero(View view){
        Intent intentChacarero = new Intent(this, Infosandwiches.class);
        intentChacarero.putExtra("nombre", arrayListSandwiches.get(1).getNombre());
        intentChacarero.putExtra("idImagen", arrayListSandwiches.get(1).getIdImagen());
        intentChacarero.putExtra("descripcion", arrayListSandwiches.get(1).getDescripcion());
        intentChacarero.putExtra("precio", arrayListSandwiches.get(1).getPrecio());

        startActivity(intentChacarero);
    }

    public void infoBarrosLuco(View view){
        Intent intentBarrosLuco = new Intent(this, Infosandwiches.class);
        intentBarrosLuco.putExtra("nombre", arrayListSandwiches.get(2).getNombre());
        intentBarrosLuco.putExtra("idImagen", arrayListSandwiches.get(2).getIdImagen());
        intentBarrosLuco.putExtra("descripcion", arrayListSandwiches.get(2).getDescripcion());
        intentBarrosLuco.putExtra("precio", arrayListSandwiches.get(2).getPrecio());

        startActivity(intentBarrosLuco);
    }

    public void infoVegetariano(View view){
        Intent intentVegetariano = new Intent(this, Infosandwiches.class);
        intentVegetariano.putExtra("nombre", arrayListSandwiches.get(3).getNombre());
        intentVegetariano.putExtra("idImagen", arrayListSandwiches.get(3).getIdImagen());
        intentVegetariano.putExtra("descripcion", arrayListSandwiches.get(3).getDescripcion());
        intentVegetariano.putExtra("precio", arrayListSandwiches.get(3).getPrecio());

        startActivity(intentVegetariano);
    }

    public void infoVegano(View view){
        Intent intentVegano = new Intent(this, Infosandwiches.class);
        intentVegano.putExtra("nombre", arrayListSandwiches.get(4).getNombre());
        intentVegano.putExtra("idImagen", arrayListSandwiches.get(4).getIdImagen());
        intentVegano.putExtra("descripcion", arrayListSandwiches.get(4).getDescripcion());
        intentVegano.putExtra("precio", arrayListSandwiches.get(4).getPrecio());

        startActivity(intentVegano);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}
