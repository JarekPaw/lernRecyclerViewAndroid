package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //private lateinit var recycleView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// to co poniżej to moj pomysł ktory może nie być najlepszy
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = MyAdapter()

    }
    /*private fun initRecyclerView(){
       // recycler_view.apply {
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycleView.adapter = MyAdapter()
        initRecyclerView()



    }*/
}
