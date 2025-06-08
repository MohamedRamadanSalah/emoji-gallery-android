package android.bignerdranch.myemojy;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Emoji> emojiList;
    EmojiAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hideSystemUI();
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(visibility -> {
            if ((visibility & View.SYSTEM_UI_FLAG_FULLSCREEN) == 0) {
                hideSystemUI();
            }
        });
        CreateEmojies();

    }
    private void hideSystemUI() {
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        );
    }
   public void CreateEmojies()
    {
        recyclerView = findViewById(R.id.emojiRecyclerView);
        emojiList = new ArrayList<>();
        emojiList.add(new Emoji("Gasping ","The universal symbol of warm, genuine happiness. This emoji shows closed eyes with a gentle smile, suggesting modest joy or bashful contentment. It's more sincere than \uD83D\uDE04 and less intense than \uD83D\uDE03, perfect for friendly conversations or polite responses. The subtle blush makes it ideal for expressing gratitude (\"Thanks! \uD83D\uDE0A\") or sharing quiet happiness.",R.drawable.smile ));
        emojiList.add(new Emoji("Love","The universal symbol of warm, genuine happiness. This emoji shows closed eyes with a gentle smile, suggesting modest joy or bashful contentment. It's more sincere than \uD83D\uDE04 and less intense than \uD83D\uDE03, perfect for friendly conversations or polite responses. The subtle blush makes it ideal for expressing gratitude (\"Thanks! \uD83D\uDE0A\") or sharing quiet happiness.",R.drawable.love ));
        emojiList.add(new Emoji("Pleading","Virtual embrace. The smiling face with open arms symbolizes comfort, support, or celebratory hugs (\"You did great! \uD83E\uDD17\"). Often replaces physical hugs in texts.",R.drawable.angry ));
        emojiList.add(new Emoji("Sneezing","The \"I shouldn’t be seeing this\" emoji. Hands partially cover the eyes, suggesting playful guilt, curiosity, or secondhand embarrassment.",R.drawable.sad ));
        emojiList.add(new Emoji("Hot","Overheated in every sense. While literally suggesting high temperatures (\"This heatwave! \uD83E\uDD75\"), it's also slang for attractiveness or spiciness (\"That selfie is \uD83E\uDD75\"). The red face and tongue emphasize intensity.",R.drawable.cool ));
        emojiList.add(new Emoji("GrinSmile","The \"I shouldn’t be seeing this\" emoji. Hands partially cover the eyes, suggesting playful guilt, curiosity, or secondhand embarrassment.",R.drawable.emo1 ));
        emojiList.add(new Emoji("TearsJoy","The king of laughter emojis. Represents uncontrollable, tear-inducing laughter, typically used for extremely funny moments. While originally meant for genuine hilarity, overuse has made it a general reaction to anything mildly amusing. Distinct from \uD83E\uDD23 (ROFL), which implies physical rolling laughter.",R.drawable.emo2 ));
        emojiList.add(new Emoji("hangry","The \"I shouldn’t be seeing this\" emoji. Hands partially cover the eyes, suggesting playful guilt, curiosity, or secondhand embarrassment.",R.drawable.emo3 ));
        emojiList.add(new Emoji("Smirk","A blank expression signaling indifference, awkward silence, or mild disapproval. Often perceived as passive-aggressive in digital communication . Differs from (expressionless), which implies stronger annoyance.",R.drawable.emo4 ));
        emojiList.add(new Emoji("Unamused","Clearly displays irritation or boredom, with downturned eyes and mouth. Used to react to frustrating situations (e.g., bad weather, repetitive tasks) or sarcastically say, \"Wow, how exciting.\"",R.drawable.emo5 ));
        emojiList.add(new Emoji("Pouting","The \"I shouldn’t be seeing this\" emoji. Hands partially cover the eyes, suggesting playful guilt, curiosity, or secondhand embarrassment.",R.drawable.emo6 ));
        emojiList.add(new Emoji("Cool","The \"I shouldn’t be seeing this\" emoji. Hands partially cover the eyes, suggesting playful guilt, curiosity, or secondhand embarrassment.",R.drawable.emo7 ));
        emojiList.add(new Emoji("Sobbing","Shining moments. Represents excellence (\"You're a star! \uD83C\uDF1F\"), hope, or literal astronomy. The sparkles add magical emphasis.",R.drawable.emo8 ));
        emojiList.add(new Emoji("Cool","Drunk or lovestruck. The uneven eyes and swirling mouth imply dizziness from alcohol, infatuation, or confusion (\"That math problem made me \uD83E\uDD74\").",R.drawable.emo9 ));
        emojiList.add(new Emoji("MindBlown","Mind = blown. Represents overwhelming shock, whether from amazing news, existential thoughts, or unbelievable revelations (\"She said WHAT?! \uD83E\uDD2F\"). The shattered head visualizes mental overload.",R.drawable.emo10 ));
        emojiList.add(new Emoji("HeartsSmile ","Pure, heart-eyed affection. This emoji radiates love and adoration, with three hearts floating around the face. It's warmer than \uD83D\uDE0D (heart-eyes), suggesting you're \"surrounded by love.\" Commonly used for romantic partners, close friends, or things you deeply cherish (\"This song! \uD83E\uDD70\").",R.drawable.emo11 ));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        adapter = new EmojiAdapter(this, emojiList);
        recyclerView.setAdapter(adapter);
    }
}