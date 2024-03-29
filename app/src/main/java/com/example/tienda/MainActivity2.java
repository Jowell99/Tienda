package com.example.tienda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Recibir los datos del artículo desde MainActivity
        Intent intent = getIntent();
        if (intent != null) {

            String categoria = intent.getStringExtra("categoria");
            String precio = intent.getStringExtra("precio");
            String imagenUrl = intent.getStringExtra("imagenUrl");
            String titulo = intent.getStringExtra("titulo");


            // Mostrar los datos del artículo en TextViews, ImageViews, etc., según tu diseño

            TextView txtCategoria = findViewById(R.id.txtCategoria);
            TextView txtPrecio = findViewById(R.id.txtPrecio);
            TextView txtTitulo = findViewById(R.id.txtTitulo);
            ImageView imageView = findViewById(R.id.imageView);


            txtCategoria.setText("Categoría: " + categoria);
            txtPrecio.setText("Total a Pagar: " + precio);
            txtTitulo.setText(titulo);

            // Cargar la imagen en el ImageView utilizando Picasso
            Picasso.get().load(imagenUrl).into(imageView);
        }
    }
}
