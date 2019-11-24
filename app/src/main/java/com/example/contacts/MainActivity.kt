package com.example.contacts

import android.content.ContentResolver
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

//Dla ContactResolver, lista kontaktów z ktorej skorzysta recycleview
//bedziemy w niej umieszczać wszystkie imiona, a potem je pobierze recycle view
val contactList: ArrayList<String> = arrayListOf<String>()

class MainActivity : AppCompatActivity() {
    //private lateinit var recycleView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*
// to co poniżej to moj pomysł ktory może nie być najlepszy
        recycler_view.layoutManager = LinearLayoutManager(this)
// element odpowiedzialny za ustawienie widoków w formie listy
        recycler_view.adapter = MyAdapter()
*/

        //poniżej jest ContactResolver i ContactProvider, dlatego dwie powyższe metody są zakomentowane
        // to co poniżej bierze kontakty z telefonu.

        val myContResolv: ContentResolver = contentResolver
// to co poniżej to JSON SELECT * FROM Contacts;
        val myCursor: Cursor? = myContResolv.query(ContactsContract.Contacts.CONTENT_URI,
            null, null, null, null, null)

// try jest konieczny, żeby zamknąć cursor, inaczej query będzie dawać błąd

        try {
            myCursor!!.moveToFirst()
            while (!myCursor.isAfterLast){
            var name: String =
                myCursor.getString(myCursor.getColumnIndexOrThrow(ContactsContract.Contacts.DISPLAY_NAME))
            contactList.add(name)
            myCursor.moveToNext()
            }

        }finally {
            myCursor!!.close()
        }
    }

}
