package br.com.fs.dynamicdatamenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fs.core_feature_list.FeatureList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()
    }

    private fun setup() {
        val features = FeatureList()
        homeRecyclerView.adapter = HomeAdapter(features)
    }

}
