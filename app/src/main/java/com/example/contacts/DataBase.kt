package com.example.contacts

//contains names, phones numbers and emails, works like date base

object DataBase {
    var contactList: ArrayList<String> = arrayListOf<String>(
        "Jan", "Kasia", "Jan2", "Kasia2","Janek", "Kasika", "Marek", "Ola", "Marek2", "Olga"
        )

    var contactNumbersList: ArrayList<String> = arrayListOf<String>(
        "85723", "25725","44015","05920","31925","75025","75115","75000","06925","75095")

    var contactEmailList: ArrayList<String> = arrayListOf<String>(
        "jan@gimail", "ola2@pl", "jan3@gmail", "ola23@pl","janek@gmail", "ola25@pl","jan@com", "ola42@pl","jan1978@gmail", "ola2@com")

}