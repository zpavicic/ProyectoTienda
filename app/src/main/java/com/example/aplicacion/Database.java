package com.example.aplicacion;

import android.content.Context;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Database {
    private static FirebaseDatabase firebaseDatabase;
    private static DatabaseReference databaseReference;


    public static DatabaseReference getDatabaseInstance(Context context){
        if(databaseReference == null){
            FirebaseApp.initializeApp(context);
            FirebaseDatabase.getInstance().setPersistenceEnabled(true);
            databaseReference = FirebaseDatabase.getInstance().getReference();
        }
        return databaseReference;
    }
    public static void inicializarFirebase(Context context){
        FirebaseApp.initializeApp(context);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }

    public static void saveUser(User newUser, Context context) {
        DatabaseReference usuariosRef = getDatabaseInstance(context).child("User");
        String claveUser = usuariosRef.push().getKey();
        newUser.setUid(claveUser);
        usuariosRef.child(claveUser).setValue(newUser);
    }

}
