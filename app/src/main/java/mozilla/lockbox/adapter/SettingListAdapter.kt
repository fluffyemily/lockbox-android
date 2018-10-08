package mozilla.lockbox.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.extensions.LayoutContainer

private val SETTING_TYPE = 0
private val HEADER_TYPE = 1

class SettingListAdapter : RecyclerView.Adapter<SettingListCell>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SettingListCell {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: SettingListCell, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

//    fun setItems(items: List<SettingConfiguration>) {
//
//    }
}

class SettingListCell(override val containerView: View): RecyclerView.ViewHolder(containerView), LayoutContainer {

}

