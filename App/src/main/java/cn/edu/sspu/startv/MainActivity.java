package cn.edu.sspu.startv;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.tencent.trtc.apiexample.R;
import cn.edu.sspu.audiocall.AudioCallingEnterActivity;
import cn.edu.sspu.live.LiveEnterActivity;
import cn.edu.sspu.screenshare.ScreenEntranceActivity;
import cn.edu.sspu.videocall.VideoCallingEnterActivity;
import cn.edu.sspu.voicechatoom.VoiceChatRoomEnterActivity;

/**
 * TRTC API-Example 主页面
 *
 * 其中包含
 * 基础功能模块如下：
 * - 语音通话模块{@link AudioCallingEnterActivity}
 * - 视频通话模块{@link VideoCallingEnterActivity}
 * - 视频互动直播模块{@link LiveEnterActivity}
 * - 语音互动直播模块{@link VoiceChatRoomEnterActivity}
 * - 直播分享模块{@link ScreenEntranceActivity}
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToolKitService.start(this);
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                findViewById(R.id.launch_view).setVisibility(View.GONE);
            }
        }, 1000);

        findViewById(R.id.ll_audio_call).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AudioCallingEnterActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.ll_video_call).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoCallingEnterActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.ll_live).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LiveEnterActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.ll_voice_chat_room).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VoiceChatRoomEnterActivity.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.ll_screen_share).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ScreenEntranceActivity.class);
                startActivity(intent);
            }
        });
    }
}
