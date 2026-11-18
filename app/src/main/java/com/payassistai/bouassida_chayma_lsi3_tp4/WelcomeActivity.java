package com.payassistai.bouassida_chayma_lsi3_tp4;

import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WelcomeActivity extends AppCompatActivity {
    TextView txtWelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_welcome);
        //Initialisation du TextView
        txtWelcome = findViewById(R.id.textWelcome);

        // Récupération de l’intent et des extras
        String nom = getIntent().getStringExtra("name");
        String prenom = getIntent().getStringExtra("lastname");
        String mail = getIntent().getStringExtra("mymail");

        //  Affichage du message personnalisé
        String message = "Bienvenue " + nom + " " + prenom + ",\n"
                + "c’est la deuxième activité.\n"
                + "Vous serez bientôt contacté sur : " + mail + " ";

        txtWelcome.setText(message);
    }
}