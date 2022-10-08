package com.anand.contributor.home

import androidx.fragment.app.Fragment
import com.anand.contributor.contributor.api.AppBarContributionState
import com.anand.contributor.contributor.api.IAppBarContribution

class HomeAppBarContribution : IAppBarContribution {
    override val state = AppBarContributionState(
        text = "Home",
        icon = R.drawable.ic_home_black_24dp,
        order = 1
    )
    override fun fragment(): Class<out Fragment> = HomeFragment::class.java
    override val id = "home-contribution"
    override val isEnabled = true
}