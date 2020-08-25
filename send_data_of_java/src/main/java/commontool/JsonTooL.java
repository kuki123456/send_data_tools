package commontool;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.*;

public class JsonTooL {
    public static String readJsonFile(String fileName) {
        String jsonStr = "";
        try {
            File jsonFile = new File(fileName);
            FileReader fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile), "utf-8");
            int ch = 0;
            StringBuilder sb = new StringBuilder();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
//适用于key的值是数组类型的，数组中又是map类型，修改数组内对应的键值，索引为在数组中要修改的对应索引
    public static String HandleJsonOfArrary(String initjson, String outerkey,int index,String editkey,String parameter) {
        JSONObject obj = JSON.parseObject(initjson);
        //String value=obj.getString("garbages");
        //Object value = obj.get(outerkey);
        JSONArray GARBAGES = obj.getJSONArray(outerkey);
        System.out.println(GARBAGES);
        JSONObject xiugai = GARBAGES.getJSONObject(index);
        xiugai.replace(editkey, parameter);
        //System.out.println(GARBAGES);
        return obj.toString();
    }
    public static String HandleJosnOfDir(String initjson, String outerkey, String editkey, String editparameter) {
        JSONObject obj = JSON.parseObject(initjson);
        JSONObject outervalue = obj.getJSONObject(outerkey);
        //System.out.println(outerkey);
        outervalue.replace(editkey, editparameter);
        //System.out.println(obj);
        return obj.toString();
    }
}