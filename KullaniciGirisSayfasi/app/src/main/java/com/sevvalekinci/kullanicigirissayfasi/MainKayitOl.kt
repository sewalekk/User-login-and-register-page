package com.sevvalekinci.kullanicigirissayfasi

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sevvalekinci.kullanicigirissayfasi.databinding.ActivityMainKayitOlBinding

class MainKayitOl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainKayitOlBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnKaydet.setOnClickListener{
            var kullaniciBilgisi = binding.kayitKullaniciAdi.text.toString()
            var kullaniciParola = binding.KayitParola.text.toString()
            var SharedPreference = this.getSharedPreferences("bilgiler", MODE_PRIVATE)
            var editor = SharedPreference.edit()

            editor.putString("kullanici","$kullaniciBilgisi").apply()
            editor.putString("parola","$kullaniciParola").apply()
            Toast.makeText(applicationContext,"Registration Successful",Toast.LENGTH_LONG).show()
            binding.kayitKullaniciAdi.text.clear()
            binding.KayitParola.text.clear()

        }



        binding.btnGiriseDon.setOnClickListener {
            intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)

        }
    }
}