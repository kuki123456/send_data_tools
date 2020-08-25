package commontool;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import commontool.proto.*;
import com.alibaba.fastjson.JSON;


public class GZipUtils {
    public static final int BUFFER = 1024;
    public static final String EXT = ".gz";

    /*
    * @param data
    * @return
    * @throws Exception
    * */
    public static byte[] compress(byte[] data) throws Exception{
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ByteArrayOutputStream baos =  new ByteArrayOutputStream();
        compress(bais , baos);
        byte[] output = baos.toByteArray();
        baos.flush();
        baos.close();
        bais.close();
        return output;

    }
    /*
    *@param is，os
    *@throws Exception
    * */
    //压缩文件
    private static void compress(ByteArrayInputStream is, ByteArrayOutputStream os) throws Exception{
        int count;
        GZIPOutputStream gos = new GZIPOutputStream(os);
        byte data[] = new byte[BUFFER];
        while ((count = is.read(data,0,BUFFER)) != -1){
            gos.write(data,0,count);
        }
        gos.finish();
        gos.flush();
        gos.close();
    }
    //解压文件
    public static byte[] decompress (byte[] data) throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        decompress(bais,baos);
        data = baos.toByteArray();
        baos.flush();
        baos.close();
        bais.close();
        return data;
    }
    //解压方法
    private static void decompress(ByteArrayInputStream is, ByteArrayOutputStream os) throws IOException {
        int count;
        GZIPInputStream gis = new GZIPInputStream(is);
        byte data[] = new byte[BUFFER];
        while ((count = gis.read(data,0,BUFFER)) != -1){
            os.write(data,0,count);
        }
        gis.close();
    }

    // 构建config demo
    public static JsonSDKTransfer.SDKRequest createSDKRequest(){

        JsonSDKData.DeviceInfo deviceInfo = JsonSDKData.DeviceInfo.newInstance();
        deviceInfo.setAn("qw");
        deviceInfo.setAv("sd");
        deviceInfo.setBn("xiaomi");
        deviceInfo.setCh("zh");
        deviceInfo.setPi("huawei");
        deviceInfo.setCm("arm5");
        deviceInfo.setIr(true);

        JsonSDKTransfer.SDKProtoHeader header = JsonSDKTransfer.SDKProtoHeader.newInstance();
        header.setAi("395b3325-1724-4359-938e-24299e5eaafa");
        header.setSv("1.0");
        header.setDip(1);
        header.setDi(deviceInfo);

        JsonSDKTransfer.ConfigRequest configRequest = JsonSDKTransfer.ConfigRequest.newInstance();
        configRequest.setCi(null);
        configRequest.setR(true);
        configRequest.setDs(null);
        configRequest.setEmt(System.currentTimeMillis());
        configRequest.setNsi(null);
        configRequest.setGi("0");
        JsonSDKTransfer.SDKRequest request = JsonSDKTransfer.SDKRequest.newInstance();
        request.setH(header);
        request.setCr(configRequest);
        return request;

    }

    //测试压缩

//    public static  void main(String[] args) throws Exception{
//        JsonSDKTransfer.SDKRequest req = createSDKRequest();
//        String jsoncontent = JSON.toJSONString(req);
//        System.out.println("请求内容: "+jsoncontent);
//        byte[] compressData = GZipUtils.compress(jsoncontent.getBytes());
//        byte[] deCompressData = GZipUtils.decompress(compressData);
//        System.out.println("解压长度"+ new String(deCompressData,StandardCharsets.UTF_8));
//    }
public static String compress(String str) throws IOException {
    if (str == null || str.length() == 0) {
        return str;
    }
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    GZIPOutputStream gzip = new GZIPOutputStream(out);
    gzip.write(str.getBytes());
    gzip.close();
    return out.toString("utf-8");
}
}

