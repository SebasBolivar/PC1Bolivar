package dev.acuLuis.listview

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var arrSO = arrayOf("Android", "iOS", "Blackberry OS", "Firefox OS", "Nokia OS", "Windows Phone")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val lsvSO: ListView = findViewById<View>(R.id.lsvSO) as ListView
        val adaptor: Any? = ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1, arrSO)
        lsvSO.adapter = adaptor as ListAdapter?
        lsvSO.setOnItemClickListener(){ parent, view, position, id ->
            Toast.makeText(
                applicationContext,
                "Posicion : $position",
                Toast.LENGTH_SHORT
            ).show()

        }
    }

}