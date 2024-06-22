package com.example.chatapplication
  import android.content.Context
  import android.view.LayoutInflater
  import android.view.TextureView
  import android.view.ViewGroup
  import androidx.appcompat.view.menu.MenuView.ItemView
  import androidx.recyclerview.widget.RecyclerView
  import org.w3c.dom.Text

class UserAdapter(val context: Context, val userList: ArrayList<User>):
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
     val view: View = LayoutInflater.from(context).inflate(R.layout.user_layout, parent, false)
     return UserViewHolder(view)
    }

    override fun getItemCount(): ArrayList<User> {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
      val currentUser = userList[position]

        holder.textName.text = currentUser.name



    }

    class UserViewHolder(itemView: ItemView) : RecyclerView.ViewHolder(itemView){
    val textName = itemView.findViewById<TextView>(R.id.txt_name)
    }
}