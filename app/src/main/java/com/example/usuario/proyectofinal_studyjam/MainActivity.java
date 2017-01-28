package com.example.usuario.proyectofinal_studyjam;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.view.animation.Animation;
        import android.view.animation.AnimationUtils;
        import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView reno;
    private ImageView santaNegro;
    private ImageView santaRockero;
    private ImageView santaSanta;
    private Animation animacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reno = (ImageView) findViewById(R.id.Reno);
        santaNegro = (ImageView) findViewById(R.id.santanegro);
        santaRockero = (ImageView) findViewById(R.id.santaRoc);
        santaSanta = (ImageView) findViewById(R.id.santaSanta);

    }
    public void fadein(View v){
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.reno);
        reno.startAnimation(animacion);

    }
    public void santa(View v){
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.santa);
        santaSanta.startAnimation(animacion);
    }

    public void santarock(View v){
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.santarock);
        santaRockero.startAnimation(animacion);
    }

    public void santanegro(View v){
        animacion = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.santamusico);
        santaNegro.startAnimation(animacion);
    }
}