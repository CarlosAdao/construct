package com.br.octopuscode.construct

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var prodAdapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycler()
        var listProds = defaultListProd()
        Log.i("TAG", listProds.toString())
        initAdapter(listProds)
    }

    private fun initRecycler(){
        rvProds.layoutManager = LinearLayoutManager(this)
        rvProds.setHasFixedSize(true)
    }

    private fun initAdapter(listProds: ArrayList<Prod>){
        prodAdapter = ProductAdapter(listProds, View.OnClickListener {
            Log.i("TAG", "Clicked !!")
        })
    }

    private fun defaultListProd() = arrayListOf(
        Prod("Cimento","Acabemento", 1, 32.0 ),
        Prod("Cimento","Acabemento", 1, 32.0 ),
        Prod("Cimento","Acabemento", 1, 32.0 ),
        Prod("Cimento","Acabemento", 1, 32.0 ),
        Prod("Cimento","Acabemento", 1, 32.0 ),
        Prod("Cimento","Acabemento", 1, 32.0 ),
        Prod("Cimento","Acabemento", 1, 32.0 ),
        Prod("Cimento","Acabemento", 1, 32.0 ),
        Prod("Cimento","Acabemento", 1, 32.0 ),
    )

}