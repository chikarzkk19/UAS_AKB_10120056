package com.example.uas_10120056;

import android.content.Context;
import android.widget.Toast;

import com.google.firebase.Timestamp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.text.SimpleDateFormat;

// Nim  : 10120056
// Nama : Chika Rizki Nuraulia
// Kelas: IF2

public class Utility {

    static void showToast(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }

    static CollectionReference getCollectionReferenceForNotes(){
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        return FirebaseFirestore.getInstance().collection("notes")
                .document(currentUser.getUid()).collection("my_notes");
    }

    static String timestampToString(Timestamp timestamp){
        return new SimpleDateFormat("MM/dd/yyyy").format(timestamp.toDate());
    }

}
