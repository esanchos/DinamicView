package br.com.fs.batteryfeature.widget

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.Nullable
import androidx.constraintlayout.widget.ConstraintLayout
import br.com.fs.abstract_feature.AbstractFeatureWidget
import br.com.fs.batteryfeature.R
import kotlinx.android.synthetic.main.battery_widget.view.*

class BatteryWidget: AbstractFeatureWidget {

    constructor(context: Context) : super(context) {
        initialSetup(null, 0)
    }

    constructor(
        context: Context,
        @Nullable attrs: AttributeSet?
    ) : super(context, attrs) {
        initialSetup(attrs, 0)
    }

    constructor(
        context: Context,
        @Nullable attrs: AttributeSet?,
        defStyleAttr: Int
    ) : super(context, attrs, defStyleAttr) {
        initialSetup(attrs, defStyleAttr)
    }

    override fun initialSetup(
        attrs: AttributeSet?,
        defStyle: Int
    ) {
        val view =
            inflate(context,
                R.layout.battery_widget, null) as ConstraintLayout
        addView(view)
    }

    override fun setData() {
        titleTextView.text = "Bateria"
    }

}
