package com.example.popupmenuexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener { showPopup(button) }
    }
    private fun showPopup(v : View) {
        val lPopupMenu: PopupMenu = PopupMenu(this, v)
        lPopupMenu.setOnMenuItemClickListener(object : PopupMenu.OnMenuItemClickListener {
            override fun onMenuItemClick(p0: MenuItem?): Boolean {
                when (p0!!.itemId) {
                    R.id.item1 -> {
                        //wow 여기서 쓰는 this는 static 객체를 얘기하는 거거든...this@MainActivity이렇게 쓰던지..
                        Toast.makeText(this@MainActivity, "Item 1 Clicked", Toast.LENGTH_SHORT).show()
                        return true
                    }
                    R.id.item2 -> {
                        //wow 여기서 쓰는 this는 static 객체를 얘기하는 거거든...this@MainActivity이렇게 쓰던지..
                        Toast.makeText(this@MainActivity, "Item 2 Clicked", Toast.LENGTH_SHORT).show()
                        return true
                    }
                    R.id.item3 -> {
                        //wow 여기서 쓰는 this는 static 객체를 얘기하는 거거든...this@MainActivity이렇게 쓰던지..
                        Toast.makeText(this@MainActivity, "Item 3 Clicked", Toast.LENGTH_SHORT).show()
                        return true
                    }
                    R.id.item4 -> {
                        //wow 여기서 쓰는 this는 static 객체를 얘기하는 거거든...this@MainActivity이렇게 쓰던지..
                        Toast.makeText(this@MainActivity, "Item 4 Clicked", Toast.LENGTH_SHORT).show()
                        return true
                    }
                    else -> {
                        return false
                    }
                }
            }
        })
        lPopupMenu.inflate(R.menu.popup_menu)
        lPopupMenu.show()

    }
}


/*
*/
/*

    PopupMenu.OnMenuItemClickListener {
//            when (it.itemId) {
    }
} }
}*/

//        lPopupMenu.setOnMenuItemClickListener { TODO("Not yet implemented") }