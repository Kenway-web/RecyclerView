package eu.kenway.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import eu.kenway.broadcastreceiver.RecyclerAdapter

class MainActivity : AppCompatActivity() {
   // creating adapter and layout manager object

    private var layoutManager:RecyclerView.LayoutManager?=null
    private var adapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        layoutManager=LinearLayoutManager(this)

        recyclerView.layoutManager=layoutManager

        adapter=RecyclerAdapter()

        recyclerView.adapter=adapter



    }

/*
    private var layoutManager:RecyclerView.LayoutManager?=null
    private var adapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        layoutManager= GridLayoutManager(this,2)

        recyclerView.layoutManager=layoutManager


        adapter=RecyclerAdapter()
        recyclerView.adapter=adapter


    }*/
}