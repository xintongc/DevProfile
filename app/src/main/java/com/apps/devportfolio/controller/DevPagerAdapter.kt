package com.apps.devportfolio.controller

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.apps.devportfolio.view.AboutFragment
import com.apps.devportfolio.view.SkillsFragment
import com.apps.devportfolio.view.WorkFragment


class DevPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment? {
        when(position) {
            0 -> return AboutFragment()
            1 -> return WorkFragment()
            2 -> return SkillsFragment()
        }
        return null
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> return "ABOUT"
            1 -> return "WORK"
            2 -> return "SKILLS"
        }
        return null
    }


}