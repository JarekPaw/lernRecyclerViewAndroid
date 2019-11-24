package com.example.contacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.adapter_layout.view.*



class MyAdapter: RecyclerView.Adapter<MyViewHolder>(){


    override fun onCreateViewHolder(viewGr1: ViewGroup, p1: Int): MyViewHolder {
// obiekt layoutInflater z xml tworzy obiekt
        val layoutInflater: LayoutInflater = LayoutInflater.from(viewGr1.context)
        var adapterLayout = layoutInflater.inflate(R.layout.adapter_layout,viewGr1,false)
// adapterLayout jest obiektem klasy View, a klasa MyViewHolder wymaga podania argumentu typu View
// a w tej metodzie musimy zwrucić obiekt MyViewHolder

        return MyViewHolder(adapterLayout)



    }

    override fun getItemCount(): Int {
        return contactList.size
 //       return DataBase.contactList.size  //zamiast dynamicznej iliści mozna tez zwrócić np. 3
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//ta metoda aktualizuje nasze widoki
// dla tej metody jest stworzony objekt DataBase
        var name = holder.view.tv_name
        var number: TextView = holder.view.tv_no
        var email: TextView = holder.view.tv_email
       // var image: ImageView = holder.view.image_contact
// teraz w tych textView trzeba ustawić teksty. position będzie się inkrementował
       // name.setText(DataBase.contactList[position])
        //number.setText(DataBase.contactNumbersList[position])
        //email.setText(DataBase.contactEmailList[position])
        //image.setImageResource(DataBase.contactImage[position]) to nie jest poprawne!

        name.setText(contactList[position])

    }


}
class MyViewHolder(val view: View): RecyclerView.ViewHolder(view)