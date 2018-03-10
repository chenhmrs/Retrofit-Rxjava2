package com.example.wellwang.servicebackdemo.Utils;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Well Wang on 2018/3/10.
 */

public class Data {

    /**
     * 根据输入流进行字节流存储,存储后再去读取刷新UI
     * @param inputStream
     */
    public static void saveData(final Context context, final InputStream inputStream, final Handler handler) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                BufferedInputStream bis = null;
                FileOutputStream fos = null;
                BufferedOutputStream bos = null;
                try {
                    bis = new BufferedInputStream(inputStream);
                    fos = context.openFileOutput("data", context.MODE_PRIVATE);
                    bos = new BufferedOutputStream(fos);
                    byte[] b = new byte[1024];
                    int length;
                    while ((length = bis.read(b)) != -1) {
                        bos.write(b, 0, length);
                        bos.flush();
                    }
                    readData(handler,context);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (bis != null) {
                            bis.close();
                        }
                        if (bos != null) {
                            bos.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }

        }).start();
    }

        /**
         * 字符流读取
         * @throws IOException
         */
    public static void readData(final Handler handler, final Context context) throws IOException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                StringBuilder mStringBuilder=new StringBuilder();
                FileInputStream mFileInputStream=null;
                BufferedReader reader=null;
                try {
                    mFileInputStream=context.openFileInput("data");
                    reader=new BufferedReader(new InputStreamReader(mFileInputStream));
                    String line=null;
                    while ((line=reader.readLine())!=null){
                        mStringBuilder.append(line);
                    }
                    Message message=new Message();
                    message.obj=mStringBuilder.toString();
                    message.what=1;
                    Log.d("MainActivity","fgffghhfg");
                    handler.sendMessage(message);
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    if (reader!=null){
                        try {
                            reader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();

    }
}
