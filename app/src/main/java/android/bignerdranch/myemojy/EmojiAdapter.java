package android.bignerdranch.myemojy;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EmojiAdapter extends RecyclerView.Adapter<EmojiAdapter.EmojiViewHolder> {

    Context context;
    ArrayList <Emoji> emojiList;

    public EmojiAdapter(Context context, ArrayList <Emoji> emojiList) {
        this.context = context;
        this.emojiList = emojiList;
    }

    @NonNull
    @Override
    public EmojiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        return new EmojiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmojiViewHolder holder, int position) {
        Emoji emoji = emojiList.get(position);
        holder.emojiImage.setImageResource(emoji.getImageResId());
        holder.emojiButton.setText(emoji.getName());
        holder.emojiButton.setOnClickListener(v -> {
            Intent intent = new Intent(context, emojydetails.class);
            intent.putExtra("Describtion",emoji.getDescrb());
            intent.putExtra("image",emoji.getImageResId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return emojiList.size();
    }

    public class EmojiViewHolder extends RecyclerView.ViewHolder {
        ImageView emojiImage;
        Button emojiButton;

        public EmojiViewHolder(@NonNull View itemView) {
            super(itemView);
            emojiImage = itemView.findViewById(R.id.emohy_item_image);
            emojiButton = itemView.findViewById(R.id.button_item_emo);
        }
    }
}
