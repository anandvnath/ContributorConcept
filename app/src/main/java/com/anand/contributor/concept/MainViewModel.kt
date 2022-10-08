package com.anand.contributor.concept

import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.anand.contributor.contributor.api.IAppBarContribution
import com.anand.contributor.manager.ContributionManager
import com.anand.contributor.manager.IContributionManager

class MainViewModel: ViewModel() {
    private val manager: IContributionManager = ContributionManager(ContributorRegistry())
    private val _appBarContributions: MutableLiveData<List<IAppBarContribution>> = MutableLiveData()
    val appBarContributions: LiveData<List<IAppBarContribution>> = _appBarContributions

    init {
        _appBarContributions.value = manager.getAppBarContributions()
    }

    fun getFragment(id: Int): Class<out Fragment>? {
        return _appBarContributions.value?.first {
            it.state.menuItemId == id
        }?.fragment()
    }
}