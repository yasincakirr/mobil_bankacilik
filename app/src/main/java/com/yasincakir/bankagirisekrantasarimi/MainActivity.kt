package com.yasincakir.bankagirisekrantasarimi

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun kullanicifarkli(view: View){

        var uyarimesaj=AlertDialog.Builder(this)
        uyarimesaj.setTitle("UYARI")
        uyarimesaj.setMessage("Devam ettiginiz takdirde aktivasyonunuz silinecektir Eminmisiniz!!!")
        uyarimesaj.setPositiveButton("Evet",DialogInterface.OnClickListener { dialog, which ->
            finish()
        })
        uyarimesaj.setNegativeButton("Hayir",DialogInterface.OnClickListener { dialog, which ->

            Toast.makeText(this,"Cikis iptal Edildi...",Toast.LENGTH_LONG).show()
        })


        uyarimesaj.show()

    }
}