package com.example.contacts;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondAct extends AppCompatActivity {

    ArrayList personNames = new ArrayList<>(Arrays.asList("Rebeca Jacobi 351-718-5424",
            "Anthony Ellis Osinski 1-668-639-8896",
            "Aiyana Eichmann 574-505-3513",
            "Annabel Bergstrom 699-935-4867",
            "Julien Walker 777-611-2211",
            "Kelli Grady 716-000-9110",
            "Kennedy Brandt 012-181-2711",
            "Ryleigh Keeling 020-112-5632",
            "Cleta Cole 777-975-9907",
            "Kavon Stehr 623-832-3720",
            "Van Ashtyn 183-868-9068",
            "Orion Elliot 520-402-7270",
            "Norene Trantow 684-687-1656",
            "Vallie Block 561-128-7812",
            "Shanny 597-225-6585",
            "Lily Cummerata 097-791-8822",
            "Stefan Bogan 385-778-4786",
            "Amie Walsh 400-698-6356",
            "Erna Miller 495-749-0723",
            "Demetrius 005-663-8696",
            "Courtney Jakubowski 138-593-9792",
            "Gerson Aufderhar 494-245-6449",
            "Arnulfo Kuhn 680-800-9407",
            "Jakob Kunde 249-772-5070",
            "Maryse Fay 126-383-3616"));

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_second);

        RecyclerView rv = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager l = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(l);
        CustomAdapter ca = new CustomAdapter(SecondAct.this, personNames);
        rv.setAdapter(ca);
    }
}
