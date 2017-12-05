package com.kotlinseekbarexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {

    private var pv: TextView? = null
    private var seekbarStatusView: TextView? = null
    private var seekbarView: SeekBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pv = this.progress
        seekbarStatusView = this.seekbarStatus
        seekbarView = this.seekbar
        seekbarView!!.setOnSeekBarChangeListener(this)
    }

    override fun onProgressChanged(seekBar: SeekBar, progress: Int,
                                   fromUser: Boolean) {
        pv!!.text = progress.toString()
        seekbarStatusView!!.text = "Tracking Touch"
    }

    override fun onStartTrackingTouch(seekBar: SeekBar) {
        seekbarStatusView!!.text = "Started Tracking Touch"
    }

    override fun onStopTrackingTouch(seekBar: SeekBar) {
        seekbarStatusView!!.text = "Stopped Tracking Touch"
    }
}