package com.example.contacts;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondAct extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){

        ArrayList<String> personNames = new ArrayList<String>();
        personNames.add("Rebeca Jacobi 351-718-5424");
        personNames.add("Anthony Ellis Osinski 1-668-639-8896");
        personNames.add("Aiyana Eichmann 574-505-3513");
        personNames.add("Annabel Bergstrom 699-935-4867");
        personNames.add("Julien Walker 777-611-2211");
        personNames.add("Kelli Grady 716-000-9110");
        personNames.add("Kennedy Brandt 012-181-2711");
        personNames.add("Ryleigh Keeling 020-112-5632");
        personNames.add("Cleta Cole 777-975-9907");
        personNames.add("Kavon Stehr 623-832-3720");
        personNames.add("Van Ashtyn 183-868-9068");
        personNames.add("Orion Elliot 520-402-7270");
        personNames.add("Norene Trantow 684-687-1656");
        personNames.add("Vallie Block 561-128-7812");
        personNames.add("Shanny 597-225-6585");
        personNames.add("Lily Cummerata 097-791-8822");
        personNames.add("Stefan Bogan 385-778-4786");
        personNames.add("Amie Walsh 400-698-6356");
        personNames.add("Erna Miller 495-749-0723");
        personNames.add("Demetrius 005-663-8696");
        personNames.add("Courtney Jakubowski 138-593-9792");
        personNames.add("Maryse Fay 126-383-3616");
        personNames.add("Gerson Aufderhar 494-245-6449");
        personNames.add("Arnulfo Kuhn 680-800-9407");
        personNames.add("Jakob Kunde 249-772-5070");
        personNames.add("Rebeca Jacobi 351-718-5424");
        personNames.add("Anthony Ellis Osinski 1-668-639-8896");
        personNames.add("Aiyana Eichmann 574-505-3513");
        personNames.add("Annabel Bergstrom 699-935-4867");
        personNames.add("Julien Walker 777-611-2211");
        personNames.add("Kelli Grady 716-000-9110");
        personNames.add("Kennedy Brandt 012-181-2711");
        personNames.add("Ryleigh Keeling 020-112-5632");
        personNames.add("Cleta Cole 777-975-9907");
        personNames.add("Kavon Stehr 623-832-3720");
        personNames.add("Van Ashtyn 183-868-9068");
        personNames.add("Orion Elliot 520-402-7270");
        personNames.add("Norene Trantow 684-687-1656");
        personNames.add("Vallie Block 561-128-7812");
        personNames.add("Shanny 597-225-6585");
        personNames.add("Lily Cummerata 097-791-8822");
        personNames.add("Stefan Bogan 385-778-4786");
        personNames.add("Amie Walsh 400-698-6356");
        personNames.add("Erna Miller 495-749-0723");
        personNames.add("Demetrius 005-663-8696");
        personNames.add("Courtney Jakubowski 138-593-9792");
        personNames.add("Maryse Fay 126-383-3616");
        personNames.add("Gerson Aufderhar 494-245-6449");
        personNames.add("Arnulfo Kuhn 680-800-9407");
        personNames.add("Jakob Kunde 249-772-5070");
        personNames.add("Rebeca Jacobi 351-718-5424");
        personNames.add("Anthony Ellis Osinski 1-668-639-8896");
        personNames.add("Aiyana Eichmann 574-505-3513");
        personNames.add("Annabel Bergstrom 699-935-4867");
        personNames.add("Julien Walker 777-611-2211");
        personNames.add("Kelli Grady 716-000-9110");
        personNames.add("Kennedy Brandt 012-181-2711");
        personNames.add("Ryleigh Keeling 020-112-5632");
        personNames.add("Cleta Cole 777-975-9907");
        personNames.add("Kavon Stehr 623-832-3720");
        personNames.add("Van Ashtyn 183-868-9068");
        personNames.add("Orion Elliot 520-402-7270");
        personNames.add("Norene Trantow 684-687-1656");
        personNames.add("Vallie Block 561-128-7812");
        personNames.add("Shanny 597-225-6585");
        personNames.add("Lily Cummerata 097-791-8822");
        personNames.add("Stefan Bogan 385-778-4786");
        personNames.add("Amie Walsh 400-698-6356");
        personNames.add("Erna Miller 495-749-0723");
        personNames.add("Demetrius 005-663-8696");
        personNames.add("Courtney Jakubowski 138-593-9792");
        personNames.add("Maryse Fay 126-383-3616");
        personNames.add("Gerson Aufderhar 494-245-6449");
        personNames.add("Arnulfo Kuhn 680-800-9407");
        personNames.add("Jakob Kunde 249-772-5070");
        personNames.add("Rebeca Jacobi 351-718-5424");
        personNames.add("Anthony Ellis Osinski 1-668-639-8896");
        personNames.add("Aiyana Eichmann 574-505-3513");
        personNames.add("Annabel Bergstrom 699-935-4867");
        personNames.add("Julien Walker 777-611-2211");
        personNames.add("Kelli Grady 716-000-9110");
        personNames.add("Kennedy Brandt 012-181-2711");
        personNames.add("Ryleigh Keeling 020-112-5632");
        personNames.add("Cleta Cole 777-975-9907");
        personNames.add("Kavon Stehr 623-832-3720");
        personNames.add("Van Ashtyn 183-868-9068");
        personNames.add("Orion Elliot 520-402-7270");
        personNames.add("Norene Trantow 684-687-1656");
        personNames.add("Vallie Block 561-128-7812");
        personNames.add("Shanny 597-225-6585");
        personNames.add("Lily Cummerata 097-791-8822");
        personNames.add("Stefan Bogan 385-778-4786");
        personNames.add("Amie Walsh 400-698-6356");
        personNames.add("Erna Miller 495-749-0723");
        personNames.add("Demetrius 005-663-8696");
        personNames.add("Courtney Jakubowski 138-593-9792");
        personNames.add("Maryse Fay 126-383-3616");
        personNames.add("Gerson Aufderhar 494-245-6449");
        personNames.add("Arnulfo Kuhn 680-800-9407");
        personNames.add("Jakob Kunde 249-772-5070");



        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_second);

        RecyclerView rv = findViewById(R.id.recycler_view);
        LinearLayoutManager l = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(l);
        CustomAdapter ca = new CustomAdapter(SecondAct.this, personNames);
        rv.setAdapter(ca);
    }
}
