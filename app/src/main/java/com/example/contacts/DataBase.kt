package com.example.contacts

import android.widget.ImageView
import androidx.core.graphics.drawable.toDrawable
import coil.Coil
import coil.api.get
import coil.transform.CircleCropTransformation
import com.example.contacts.R.drawable.*

//contains names, phones numbers and emails, works like date base

object DataBase {

    var contactList: ArrayList<String> = arrayListOf<String>(
        "Jan", "Kasia", "Jan2", "Kasia2","Janek", "Kasika", "Marek", "Ola", "Marek2", "Olga"
        )

    var contactNumbersList: ArrayList<String> = arrayListOf<String>(
        "85723", "25725","44015","05920","31925","75025","75115","75000","06925","75095")

    var contactEmailList: ArrayList<String> = arrayListOf<String>(
        "jan@gimail", "ola2@pl", "jan3@gmail", "ola23@pl","janek@gmail", "ola25@pl","jan@com", "ola42@pl","jan1978@gmail", "ola2@com")
    //var drawable = Coil.get("https://www.example.com/image.jpg")

    /*var contactImage: ArrayList<ImageView> = arrayListOf<ImageView>(
        //orginalnie było: "drawable://" + R.drawable.img z gitHuba
        //https://github.com/nostra13/Android-Universal-Image-Loader -> Acceptable URIs examples
        imageView.load(R.drawable.image)
        )*/

}
