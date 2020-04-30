package br.com.fs.files_feature.widget

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.fs.files_feature.R

class FilesAdapter(private val items: List<String>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        FilesViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(
                    R.layout.files_file_list_item,
                    parent,
                    false
                )
        )

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
        (holder as FilesViewHolder).bind(items[position])

    override fun getItemCount() = items.size

}
