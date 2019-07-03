package com.example.kisseapp.adapters

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kisseapp.R
import com.example.kisseapp.model.StoryModel
import kotlinx.android.synthetic.main.recyclerview_story_items.view.*

class StoryViewAdapter(private val context: Context)
    : RecyclerView.Adapter<StoryViewAdapter.StoryViewHolder>() {

    lateinit var storyList:List<StoryModel>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        return StoryViewHolder(LayoutInflater.from(context).
            inflate(R.layout.recyclerview_story_items,
                parent,false)
        )
    }

    override fun getItemCount(): Int {
        return storyList.size
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        holder.storyTitle.text = storyList[position].title
        holder.storyWords.text = storyList[position].size.toString()
        holder.posterImage.setImageURI(Uri.parse(storyList[position].posterPath))
    }

    class StoryViewHolder( view: View) : RecyclerView.ViewHolder(view)
    {

        var posterImage: ImageView = view.iv_story_poster
        var storyTitle: TextView = view.tv_story_title
        var storyWords: TextView = view.tv_words

    }
}