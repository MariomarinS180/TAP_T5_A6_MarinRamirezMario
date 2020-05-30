package com.example.actividad06
import android.R
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myListData: Array<ListaDeDatos> = arrayOf<ListaDeDatos>(
            ListaDeDatos("Email", R.drawable.ic_dialog_email),
            ListaDeDatos("Info", R.drawable.ic_dialog_info),
            ListaDeDatos("Delete", R.drawable.ic_delete),
            ListaDeDatos("Dialer", R.drawable.ic_dialog_dialer),
            ListaDeDatos("Alert", R.drawable.ic_dialog_alert),
            ListaDeDatos("Map", R.drawable.ic_dialog_map),
            ListaDeDatos("Email", R.drawable.ic_dialog_email),
            ListaDeDatos("Info", R.drawable.ic_dialog_info),
            ListaDeDatos("Delete", R.drawable.ic_delete),
            ListaDeDatos("Dialer", R.drawable.ic_dialog_dialer),
            ListaDeDatos("Alert", R.drawable.ic_dialog_alert),
            ListaDeDatos("Map", R.drawable.ic_dialog_map)
        )
        val recyclerView =
            findViewById<View>(R.id.recyclerView) as RecyclerView
        val adapter = ListaDeDatos(myListData)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}