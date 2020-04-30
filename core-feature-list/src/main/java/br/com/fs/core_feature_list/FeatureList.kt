package br.com.fs.core_feature_list

import android.content.Context
import br.com.fs.abstract_feature.AbstractFeature
import br.com.fs.abstract_feature.AbstractFeatureWidget
import br.com.fs.batteryfeature.BatteryFeature
import br.com.fs.files_feature.FilesFeature

class FeatureList {

    private val features = mutableListOf<AbstractFeature>()

    val items: List<AbstractFeature>
        get() = features

    init {
        setup()
    }

    fun getView(context: Context, type: Int): AbstractFeatureWidget =
        when (FeatureType.valueOf(type)) {
            FeatureType.FILES -> FilesFeature.getWidget(context)
            FeatureType.BATTERY -> BatteryFeature.getWidget(context)
            else -> throw IllegalStateException("Invalid type")
        }

    private fun setup() {
        features.add(FilesFeature(FeatureType.FILES.ordinal))
        features.add(BatteryFeature(FeatureType.BATTERY.ordinal))
    }

}
