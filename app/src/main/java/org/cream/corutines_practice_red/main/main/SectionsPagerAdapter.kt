package org.cream.corutines_practice_red.main.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionsPagerAdapter(private val fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment =
        if (position == 0) {
            ImageSearchFragment()
        }else{
            FavouritesFragment()
        }

    override fun getItemCount(): Int = 2
}