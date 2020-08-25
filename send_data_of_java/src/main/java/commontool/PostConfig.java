package commontool;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class PostConfig {
    public static String config(String URL,String body) {
        //String URL="http://devtest.ibr.cc:30035/config";
        //创建一个请求对象
        HttpPost request=new HttpPost(URL);
        //添加请求头
        request.addHeader("x-forwarded-for","223.104.104.80");
        request.addHeader("ProtoType","json");
        request.setHeader("Content-Type","application/json");
        //@参数
        //String body="{\"cr\":{\"ds\":{\"ac\":78,\"ame\":312,\"gla\":123,\"glo\":39,\"ib\":false,\"igo\":true,\"io\":true,\"kv\":\"{\\\"userinfoKEY\\\":\\\"userinfoVALUE\\\"}\",\"mi\":\"memberid\",\"ot\":1,\"sa\":1024,\"sab\":96,\"sas\":1024,\"sc\":29},\"emt\":1573814214948,\"gi\":\"N\",\"nsi\":{\"am\":0,\"ns\":\"IWLAN\",\"nt\":0,\"s\":77},\"r\":false},\"h\":{\"ai\":\"efe09b1b-06b1-468e-baab-10ef3e73c2de\",\"di\":{\"an\":\"BusinessTrip\",\"av\":\"5.34\",\"bn\":\"huawei\",\"ch\":\"mt6752\",\"ci\":\"ARM64v8\",\"cm\":\"ARM64v8\",\"di\":\"linlh_default12\",\"dia\":[\"128e556fbc1be6bf93c49838aeb73930\",\"3ca30921d0a6759fbc8fb803a8199725\",\"04c7f8d392f3f5e2325da26055f7b1f0\",\"9396ad5d3657be1eaf3dd3b913344c1e\"],\"ds\":\"750*1334\",\"ir\":false,\"l\":\"zh-Hans-CN\",\"m\":\"\",\"ov\":\"TopN_OsVersion_9.94\",\"pi\":\"qudao_test\",\"pm\":\"TopN model 94\",\"tm\":2048},\"dip\":5484454511,\"sv\":\"5.6.1.3\"}}";
        try {
            request.setEntity(new StringEntity(body));
        }catch (Exception e){
            System.out.println("参数异常");
        }
        //准备发包客户端
        CloseableHttpClient httpclient = HttpClients.createDefault();
        //通过客户端发包
        try {
            CloseableHttpResponse response=httpclient.execute(request);
            //获得响应体
            HttpEntity entity=response.getEntity();
//            String stringentity=entity.toString();
//            System.out.println(stringentity);
            String rbody= EntityUtils.toString(entity,"utf-8");
            // System.out.println(rbody);
            return rbody;
        }catch (Exception e){
            System.out.println("请求异常");
        }
        return null;
    }

}
