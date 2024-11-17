package com.example.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nameTV: TextView = view.findViewById(R.id.nameTV)
        val pictureIV: ImageView = view.findViewById(R.id.pictureIV)
        val writerTV: TextView = view.findViewById(R.id.writerTV)

        val viewPagerItem = arguments?.getSerializable("vp") as OnBoardingFragmentViewPagerModel
        nameTV.text = viewPagerItem.name
        pictureIV.setImageResource(viewPagerItem.picture)
        writerTV.text = viewPagerItem.writer
    }
}