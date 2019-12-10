package com.example.a300cemandroid;

import com.example.a300cemandroid.ui.account.accountViewModel;
import com.example.a300cemandroid.ui.houses.housesViewModel;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class mainScreenController {
    private static mainScreenController instance;
    private static housesViewModel housesVM = housesViewModel.getInstance();
    private static appViewModel appVM = appViewModel.getInstance();

    //Singleton pattern applied
    public static mainScreenController getInstance(){
        if(instance == null){
            instance = new mainScreenController();
        }
        return instance;
    }



    public void resetInstances(){
        housesVM.reset();
        appVM.reset();
        accountViewModel.getInstance().reset();
        FirebaseAuth.getInstance().signOut();

    }
}
