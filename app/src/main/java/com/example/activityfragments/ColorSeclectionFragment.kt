package com.example.activityfragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner

class ColorSeclectionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val layout = inflater.inflate(R.layout.fragment_color_seclection, container, false)
        val spinner = layout.findViewById<Spinner>(R.id.spinner)

        spinner.adapter = ArrayAdapter(requireContext(), android.R.layout.simple_dropdown_item_1line, arrayOf(
            "White", "Red", "Blue", "Green", "Yellow"))

        spinner.onItemSelectedListener = object: OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                parent?.run {
                    layout.setBackgroundColor(Color.parseColor(getItemAtPosition(position).toString()))
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
        return layout
    }

}