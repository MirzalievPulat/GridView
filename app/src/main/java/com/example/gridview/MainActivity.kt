package com.example.gridview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import com.example.gridview.adapter.LanguageAdapter
import com.example.gridview.model.Language
class MainActivity : AppCompatActivity() {
    lateinit var gridView: GridView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initviews()
    }
    fun initviews(){
        gridView = findViewById(R.id.gridView)

        refreshAdapter(prepareLanguages())
    }
    fun refreshAdapter(languages:ArrayList<Language>){
        var adapter = LanguageAdapter(applicationContext,languages)
        gridView.adapter = adapter
    }
    fun prepareLanguages():ArrayList<Language>{
        var languages = ArrayList<Language>()

        languages.add(Language(R.drawable.c_plus,"C++"))
        languages.add(Language(R.drawable.c_sharp,"C#"))
        languages.add(Language(R.drawable.java,"Java"))
        languages.add(Language(R.drawable.javascript,"JavaScript"))
        languages.add(Language(R.drawable.phyton,"Phyton"))
        languages.add(Language(R.drawable.php,"PHP#"))
        languages.add(Language(R.drawable.kotlin,"Kotlin"))
        languages.add(Language(R.drawable.swift,"Swift"))

        return languages
    }
}