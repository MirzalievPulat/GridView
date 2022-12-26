package com.example.gridview.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.gridview.R
import com.example.gridview.model.Language

class LanguageAdapter(var contex:Context, var languages:ArrayList<Language>):BaseAdapter() {
    override fun getCount(): Int {
       return languages.size
    }

    override fun getItem(position: Int): Any {
        return languages[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = View.inflate(contex, R.layout.gridview_item,null)

        var icon = view.findViewById<ImageView>(R.id.iv_image)
        var name = view.findViewById<TextView>(R.id.tv_name)

        icon.setImageResource(languages[position].image)
        name.text = languages[position].name

        return view
    }
}