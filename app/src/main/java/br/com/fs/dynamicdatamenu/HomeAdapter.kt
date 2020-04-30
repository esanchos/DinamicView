package br.com.fs.dynamicdatamenu

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.fs.core_feature_list.FeatureList

class HomeAdapter(private val features: FeatureList) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        HomeViewHolder(features.getView(parent.context, viewType))

    override fun getItemViewType(position: Int): Int {
        return features.items[position].getType()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
        (holder as HomeViewHolder).bind()

    override fun getItemCount() = features.items.size

}
