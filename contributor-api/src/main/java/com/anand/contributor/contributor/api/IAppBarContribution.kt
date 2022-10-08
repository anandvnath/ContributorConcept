package com.anand.contributor.contributor.api

import androidx.annotation.DrawableRes
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment

interface IAppBarContribution: IContribution {
    val state: AppBarContributionState
    fun fragment(): Class<out Fragment>
}

data class AppBarContributionState(
    val text: String,
    @DrawableRes val icon: Int,
    val order: Int
)