package br.com.fs.batteryfeature

import android.content.Context
import br.com.fs.abstract_feature.AbstractFeature
import br.com.fs.batteryfeature.widget.BatteryWidget

class BatteryFeature(private val type: Int) : AbstractFeature() {

    override fun getFeatureName() = "BatteryFeature"

    override fun getType() = type

    companion object {
        fun getWidget(context: Context) =
            BatteryWidget(context)
    }

}
