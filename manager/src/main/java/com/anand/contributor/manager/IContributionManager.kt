package com.anand.contributor.manager

import com.anand.contributor.contributor.api.IAppBarContribution

interface IContributionManager {
    fun getAppBarContributions(): List<IAppBarContribution>
}
