/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package mozilla.lockbox.view

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_setting.*
import kotlinx.android.synthetic.main.fragment_setting.view.*
import kotlinx.android.synthetic.main.include_backable.view.*
import kotlinx.android.synthetic.main.notification_template_lines_media.view.*
import mozilla.lockbox.R
import mozilla.lockbox.adapter.SettingListAdapter
import mozilla.lockbox.presenter.SettingPresenter
import mozilla.lockbox.presenter.SettingView

class SettingFragment : BackableFragment(), SettingView {

    val adapter = SettingListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        presenter = SettingPresenter(this)

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_setting, container, false)
        setupBackable(view, R.drawable.ic_arrow_back)
        view.toolbar.title = getString(R.string.settings_title)

        settingList.adapter = adapter
        settingList.layoutManager = LinearLayoutManager(context)

        return view
    }
}
