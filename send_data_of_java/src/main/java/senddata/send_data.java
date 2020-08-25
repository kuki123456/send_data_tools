package senddata;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import commontool.JsonTooL;
import commontool.PostConfig;
import commontool.PostUpload;

import java.io.File;

public class send_data {
    //第一个参数APPMD5
    String fileSeperator = File.separator;

    public static void main(String[] args) throws Exception {
//        if (Boolean.parseBoolean(args[0])) {
//            send02(args[1]);
//            Thread.sleep(3000);
//        } else {
//            send(Integer.parseInt(args[0]), args[1]);
//            Thread.sleep(3000);
//        }
       send(20,"f93dc161-ecd2-401a-b522-d735e8c5fe78");
//          send02("88fdd96a-5a59-44fa-bb13-e000054e3cd1");
    }

    public static void send(int j, String ai) throws Exception {
        File file = new File("");
        String filePath = file.getCanonicalPath();
        int i = 1;
        while (i <= j) {
            String ConfigBody = JsonTooL.readJsonFile(filePath + "/data/config_android_no_crash.json");
            JSONObject CB = JSON.parseObject(ConfigBody);
            JSONObject h = CB.getJSONObject("h");
            h.replace("ai", ai);
            System.out.println("config:" + JSON.toJSONString(CB));
            String Cresponse = PostConfig.config("http://devtest.ibr.cc:30035/config", JSON.toJSONString(CB));
            System.out.println("config response:" + Cresponse);
            Thread.sleep(1000);
            String UploadBody = JsonTooL.readJsonFile(filePath + "/data/upload_android.json");
            JSONObject UD = JSON.parseObject(UploadBody);
            JSONObject CR = JSON.parseObject(Cresponse);
            JSONObject cr = CR.getJSONObject("cr");
            String si = cr.getString("si");
            JSONObject uh = UD.getJSONObject("h");
            uh.replace("ai", ai);
            JSONArray d = UD.getJSONObject("udr").getJSONArray("d");
            JSONObject uploaddata = d.getJSONObject(0);
            uploaddata.replace("si", si);
            System.out.println("upload:" + JSON.toJSONString(UD));
            String Uresponse = PostUpload.upload("http://devtest.ibr.cc:30035/upload?key=", ai, JSON.toJSONString(UD));
            System.out.println("upload response:" + Uresponse);
            System.out.println("request num:" + String.valueOf(i));
            i++;
        }
    }

    public static void send02(String ai) throws Exception {
        File file = new File("");
        String filePath = file.getCanonicalPath();
        int i = 1;
        try {
            while (true) {
                String ConfigBody = JsonTooL.readJsonFile(filePath + "/data/config_android_no_crash.json");
                JSONObject CB = JSON.parseObject(ConfigBody);
                JSONObject h = CB.getJSONObject("h");
                h.replace("ai", ai);
                System.out.println("config:" + JSON.toJSONString(CB));
                String Cresponse = PostConfig.config("http://devtest.ibr.cc:30035/config", JSON.toJSONString(CB));
                System.out.println("config response:" + Cresponse);
                Thread.sleep(5000);
                String UploadBody = JsonTooL.readJsonFile(filePath + "/data/upload_android.json");
                JSONObject UD = JSON.parseObject(UploadBody);
                JSONObject CR = JSON.parseObject(Cresponse);
                JSONObject cr = CR.getJSONObject("cr");
                String si = cr.getString("si");
                JSONObject uh = UD.getJSONObject("h");
                uh.replace("ai", ai);
                JSONArray d = UD.getJSONObject("udr").getJSONArray("d");
                JSONObject uploaddata = d.getJSONObject(0);
                uploaddata.replace("si", si);
                System.out.println("upload:" + JSON.toJSONString(UD));
                String Uresponse = PostUpload.upload("http://devtest.ibr.cc:30035/upload?key=", "eb3e66b4-11e6-4423-882b-742ff0b95d3e", JSON.toJSONString(UD));
                System.out.println("upload response:" + Uresponse);
                System.out.println("request num:" + String.valueOf(i));
                i++;
            }
        } catch (Exception E) {
            System.out.println(E);
        }
    }
}
