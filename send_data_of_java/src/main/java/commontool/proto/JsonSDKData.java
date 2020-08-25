package commontool.proto;

import java.util.ArrayList;
import java.util.List;

/**
 * *****************************************************************************
 * @Title: Constant.java
 * @Package com.bonree.sdk.json
 * Version: 1.0
 * Description:
 * ****************************************************************************
 */
public final class JsonSDKData {
    public static final class DeviceInfo    //当用final修饰这个类时，表明这个类不能被继承
    {
        public static DeviceInfo newInstance() {
            DeviceInfo fragment = new DeviceInfo();
            return fragment;
        }

        private boolean ir=true; // true,  //	isRoot	是否越狱
        private String bn="HUAWEI"; // “�??,  //	bandName	客户端品牌信�??*
        private String ov="9"; //; // “�??,  //	os_version	OS版本*,    "pi; // "",
        private String an="com.bonreesdk.hostdemo"; // "",   //	appName	应用�??
        private int tm=3715;  // 1,    //	total_memory	整机内存&平安二期
        private String l="zh";  // "",    //	language	语言
        private String ch="hi3660";  // �??",  //	cpuHardware	CPU厂商
        private String m="VTR-AL00";  // �??",   //	model	手机型号*
        private String cm="AArch64 Processor rev 1 (aarch64)";  // �??",  //	cpuModel	CPU型号
        private String di="3e9303d00ae594677398acd5450b9328ee2b655d28aa0e0006d2653192fa32f5";  // “�??, //	deviceId	机器码（IMEI/MEID�??*,
        private String ci="arm64-v8a";  // “�??, //	cpuInstructionSet	CPU指令�??
        private String ds="1080*1920";  // �??",  //	displaySize	屏幕分辨�??*
        private String av="1.0-debug(1)";  // “�??, //	app_version	APP版本*,
        private String pi="应用宝";  // “�??  //	partnerId	渠道商id(行为)*
        private String[] dia;  //deviceId array 设备id集合，分别为IMEI，MEID，SN码，AndroidID。数组长度为4，取不到就存放空字符串�??4个指标都取不到就是长度为4的空字符串的数组
        private String pm;  //phoneModel：手机型号；String；后台做设备型号转化
        private String cov="EMUI 9.1.0"; //customizedOsVersion：厂商定制系统版本号；String；iOS不会使用这个字段；可能为空；默认值：""

        public String getCov() {
            return cov;
        }

        public void setCov(String cov) {
            this.cov = cov;
        }

        public String getPm() {
            return pm;
        }

        public void setPm(String pm) {
            this.pm = pm;
        }

        public boolean isIr() {
            return ir;
        }

        public void setIr(boolean ir) {
            this.ir = ir;
        }

        public String getBn() {
            return bn;
        }

        public void setBn(String bn) {
            this.bn = bn;
        }

        public String getOv() {
            return ov;
        }

        public void setOv(String ov) {
            this.ov = ov;
        }

        public String getAn() {
            return an;
        }

        public void setAn(String an) {
            this.an = an;
        }

        public int getTm() {
            return tm;
        }

        public void setTm(int tm) {
            this.tm = tm;
        }

        public String getL() {
            return l;
        }

        public void setL(String l) {
            this.l = l;
        }

        public String getCh() {
            return ch;
        }

        public void setCh(String ch) {
            this.ch = ch;
        }

        public String getM() {
            return m;
        }

        public void setM(String m) {
            this.m = m;
        }

        public String getCm() {
            return cm;
        }

        public void setCm(String cm) {
            this.cm = cm;
        }

        public String getDi() {
            return di;
        }

        public void setDi(String di) {
            this.di = di;
        }

        public String getCi() {
            return ci;
        }

        public void setCi(String ci) {
            this.ci = ci;
        }

        public String getDs() {
            return ds;
        }

        public void setDs(String ds) {
            this.ds = ds;
        }

        public String getAv() {
            return av;
        }

        public void setAv(String av) {
            this.av = av;
        }

        public String getPi() {
            return pi;
        }

        public void setPi(String pi) {
            this.pi = pi;
        }

        public String[] getDia(){
            return dia;
        }

        public void setDia(String[] dia){
            this.dia = dia;
        }
    }


    public static final class FunctionResult{
        public static FunctionResult newInstance() {
            FunctionResult func = new FunctionResult();
            return func;
        }
        private long st;
        private String c;
        private String e;


        public long getSt() {
            return st;
        }
        public void setSt(long st) {
            this.st = st;
        }
        public String getC() {
            return c;
        }
        public void setC(String c) {
            this.c= c;
        }

        public String getE() {
            return e;
        }
        public void setE(String e) {
            this.e= e;
        }

    }


    public static final class NetStateInfo //手机状�?��?��?�能信息
    {
        public static NetStateInfo newInstance() {
            NetStateInfo fragment = new NetStateInfo();
            return fragment;
        }


        private int am; // 1,  //	access_mode	接入方式 wap/net/wifi
        private int s; // 2,   //	signal	信号�??
        private int nt; // 3   //	netType	网络类型,GSM,GPRS,EDGE,UMTS,......网络制式对应的int�??*
        public String ns; // "4"   // networkStandard：网络制式；String；后台做2g 3g 4g的对应转�??(5.9新增)


        public String getNs() {
            return ns;
        }

        public void setNs(String ns) {
            this.ns = ns;
        }

        public int getAm() {
            return am;
        }

        public void setAm(int am) {
            this.am = am;
        }

        public int getS() {
            return s;
        }

        public void setS(int s) {
            this.s = s;
        }

        public int getNt() {
            return nt;
        }

        public void setNt(int nt) {
            this.nt = nt;
        }
    }


    public static final class DeviceStateInfo //手机状�?��?��?�能信息
    {
        public static DeviceStateInfo newInstance() {
            DeviceStateInfo fragment = new DeviceStateInfo();
            return fragment;
        }

        private int gla; // 1,//	gps_latitude  纬度
        private int sa; // 2, //	system_availableMemory	系统可用内存MB
        private boolean igo; //3 true, //	isGpsOpen	GPS是否�??�??
        private int sab; // 4,//	systemAvailableBattery	剩余电量
        private boolean io; //5 true,//	isOrientationLock	方向锁是否开�??
        private int glo; // 6, //  gps_longitude 经度
        private int sc; // 7,//	system_cpu	系统CPU占用
        private int ame; // 8, //	app_memory	app使用内存MB
        private boolean ib; //9 true,//	isBluetoothOpen	蓝牙是否�??�??
        private String mi; //10 "",//	memberId	会员ID（�?�贷宝需求�?�能+行为�??
        private int ot; // 11, //	orientation	屏幕方向（横�??/竖屏�??
        private String kv; //12 "",//	kv	平安键�?�对�??�??&平安二期
        private int ac; // 13,//	app_cpu	app使用cpu
        private int sas; // 14 //	systemAvailableStorage	剩余存储

        public int getGla() {
            return gla;
        }

        public void setGla(int gla) {
            this.gla = gla;
        }

        public int getSa() {
            return sa;
        }

        public void setSa(int sa) {
            this.sa = sa;
        }

        public boolean isIgo() {
            return igo;
        }

        public void setIgo(boolean igo) {
            this.igo = igo;
        }

        public int getSab() {
            return sab;
        }

        public void setSab(int sab) {
            this.sab = sab;
        }

        public boolean isIo() {
            return io;
        }

        public void setIo(boolean io) {
            this.io = io;
        }

        public int getGlo() {
            return glo;
        }

        public void setGlo(int glo) {
            this.glo = glo;
        }

        public int getSc() {
            return sc;
        }

        public void setSc(int sc) {
            this.sc = sc;
        }

        public int getAme() {
            return ame;
        }

        public void setAme(int ame) {
            this.ame = ame;
        }

        public boolean isIb() {
            return ib;
        }

        public void setIb(boolean ib) {
            this.ib = ib;
        }

        public String getMi() {
            return mi;
        }

        public void setMi(String mi) {
            this.mi = mi;
        }

        public int getOt() {
            return ot;
        }

        public void setOt(int ot) {
            this.ot = ot;
        }

        public String getKv() {
            return kv;
        }

        public void setKv(String kv) {
            this.kv = kv;
        }

        public int getAc() {
            return ac;
        }

        public void setAc(int ac) {
            this.ac = ac;
        }

        public int getSas() {
            return sas;
        }

        public void setSas(int sas) {
            this.sas = sas;
        }
    }


    public static final class FragmentResult
    {
        public static FragmentResult newInstance() {
            FragmentResult fragment = new FragmentResult();
            return fragment;
        }
        private long et;  //1,   // endTimeUs：Fragment结束时间
        private long lt;  //2,   // loadTimeUs：Fragment启动耗时
        private long st;  //3,   // startTimeUs：Fragment起始时间
        private String  fn;  //"4", // fragmentName：Fragment名称
        private long ct;  //5     //createTimeUs：Fragment创建时间(5.9新增)；卡顿和慢交互深度分析CPU、内存�?�线程数据采集的�??始时间；单位：微秒；数据类型：int；必�??


        public String getFn() {
            return fn;
        }

        public void setFn(String fn) {
            this.fn = fn;
        }

        public void setCt( long ct){
            this.ct = ct;
        }

        public long getCt(){
            return ct;
        }


        public long getEt() {
            return et;
        }

        public void setEt(long et) {
            this.et = et;
        }

        public long getLt() {
            return lt;
        }

        public void setLt(long lt) {
            this.lt = lt;
        }

        public long getSt() {
            return st;
        }

        public void setSt(long st) {
            this.st = st;
        }


    }
    public static final class ActivityResult //视图信息   5.9.2版本（201907）  修改成视图性能、行为模块的页面分析等公用
    {
        public static ActivityResult newInstance() {
            ActivityResult fragment = new ActivityResult();
            return fragment;
        }


        private long et; // 1,   //	endTimeUs	视图结束时间
        //private double et;
        private long lt; // 2,   //	loadTimeUs	视图启动耗时
        private long st; // 3  , //	startTimeUs	视图起始时间
        // private double st;
        private String an; // "4"   //	activityName	视图名称
        private List<FragmentResult> fr; //5 [{}], //fragmentResult：从属于Activity的FragmentResult对象
        private long ct;  // 6     //createTimeUs：视图创建时间(5.9新增)；卡顿和慢交互深度分析CPU、内存�?�线程数据采集的�??始时间；单位：微秒；数据类型：int；�?�版本SDK该字段为空，新版本必�??
        private String  ai;  //:"7",  //activityId 视图id(5.9.2新增)
        private boolean iq; // 8 :true  //isQuit 是否退出（退出、置后台、crash）(5.9.2新增)

        public void setIq(boolean iq) {
            this.iq = iq;
        }
        public boolean getIq() {
            return iq;
        }

        public void setAi(String ai) {
            this.ai = ai;
        }
        public String getAi() {
            return ai;
        }
        public void setCt( long ct){
            this.ct = ct;
        }

        public long getCt(){
            return ct;
        }

        public void setFr( List<FragmentResult> fr){
            this.fr = fr;
        }

        public List<FragmentResult> getFr(){
            return fr;
        }

        /*        public long getEt() {
                    return et;
                }

                public void setEt(long et) {
                    this.et = et;
                }
        */
        public long getEt() {
            return et;
        }

        public void setEt(long et) {
            this.et = et;
        }
        public long getLt() {
            return lt;
        }

        public void setLt(long lt) {
            this.lt = lt;
        }

        public long getSt() {
            return st;
        }

        public void setSt(long st) {
            this.st = st;
        }

      /*  public double getSt() {
            return st;
        }

        public void setSt(double st) {
            this.st = st;
        }*/

        public String getAn() {
            return an;
        }

        public void setAn(String an) {
            this.an = an;
        }


    }


    public static final class ThreadInfo { //线程信息
        public static ThreadInfo newInstance() {
            ThreadInfo fragment = new ThreadInfo();
            return fragment;
        }


        private long et;  //1.endTimeUs线程结束时间
        private long st;   //2.startTimeUs线程起始时间
        private long tid;   //3.tid线程tid
        private String n;  //4.type线程类型，前台线�??0/后台线程1
        private int t;    //5.name线程名称

        public void setEt(long et){
            this.et = et;
        }
        public long getEt(){
            return et;
        }

        public void setSt(long st){
            this.st = st;
        }
        public long getSt(){
            return st;
        }

        public void setTid(long tid){
            this.tid = tid;
        }
        public long getTid(){
            return tid;
        }

        public void setName(String name){
            this.n = name;
        }
        public String getName(){
            return n;
        }

        public void setT(int type){
            this.t = type;
        }
        public int getT(){
            return t;
        }
    }


    public static final class MethodInfo { //方法信息（交互）
        public static MethodInfo newInstance() {
            MethodInfo fragment = new MethodInfo();
            return fragment;
        }

        private long st;   //1.startTimeUs起始时间
        private long et;   //2.endTimeUs结束时间
        private String n;   //3.name方法名称
        private long t;   //4.tid
        private String ru;   //5.requestUrl请求地址
        private String rg;  //6.requestGuid
        private String rgu;  //7.responseGuid

        public void setSt(long st){
            this.st = st;
        }
        public long getSt(){
            return st;
        }

        public void setEt(long et){
            this.st = et;
        }
        public long getEt(){
            return et;
        }

        public void SetN(String n){
            this.n = n;
        }
        public String getN(){
            return n;
        }

        public long getT(){
            return t;
        }
        public void setT(long tid){
            this.t = tid;
        }
        public void setRg(String rg){
            this.rg = rg;
        }
        public String getRg(){
            return rg;
        }
        public void setRu(String ru){
            this.ru = ru;
        }
        public String getRu(){
            return ru;
        }
        public void setRgu(String rgu){
            this.rgu = rgu;
        }
        public String getRgu(){
            return rgu;
        }

    }


    public static final class InteractResult //交互信息
    {
        public static InteractResult newInstance() {
            InteractResult fragment = new InteractResult();
            return fragment;
        }


        private List<Object[]> mc; //  [	],	//	memoryCpuInfo
        private List<Object[]> mi; //[[]],  //	MethodInfo
        private List<Object[]> ti; //[[]], //	ThreadInfo
        private List<LagResult> lr; // [  ]  //	LagResult卡顿信息
        private Object ds; // {}//	DeviceStateInfo
        private int am; // 1,  //	access_mode	接入方式 wap/net/wifi
        private String as; //"" //崩溃轨迹
        private List<Object[]> ut ; // [[8]],     //UserTrack
        private String ns;   // "9",       //networkStandard：网络制式；String；后台做2g 3g 4g的对应转�?(5.9新增)
        private ActivityResult ar;   //10.  {"10":"10"}//ActivityResult：发生慢交互的视图信息，如果ar中包含fr则表明当前fr发生慢交互（5.9新增�?


        public List<Object[]> getUt() {
            return ut;
        }
        public void setUt(List<Object[]> ut) {
            this.ut = ut;
        }

        public ActivityResult getAr() {
            return ar;
        }
        public void setAr(ActivityResult ar) {
            this.ar = ar;
        }

        public void setNs(String ns) {
            this.ns = ns;
        }

        public String getNs() {
            return ns;
        }

        public List<Object[]> getMc() {
            return mc;
        }
        public void setMc(List<Object[]> mc) {
            this.mc = mc;
        }

        public List<Object[]> getMi() {
            return mi;
        }
        public void setMi(List<Object[]> mi) {
            this.mi = mi;
        }

        public List<Object[]> getTi() {
            return ti;
        }
        public void setTi(List<Object[]> ti) {
            this.ti = ti;
        }

        public List<LagResult> getLr() {
            return lr;
        }
        public void setLr(List<LagResult> lr) {
            this.lr = lr;
        }

        public Object getDs() {
            return ds;
        }
        public void setDs(Object ds) {
            this.ds = ds;
        }

        public int getAm() {
            return am;
        }
        public void setAm(int am) {
            this.am = am;
        }

        public String getAs() {
            return as;
        }
        public void setAs(String as) {
            this.as = as;
        }

    }


    public static final class LagResult
    {
        public static LagResult newInstance() {
            LagResult fragment = new LagResult();
            return fragment;
        }


        private long st; // 1,//	startTimeUs	卡顿发生时间20161215
        private int f; // 2  // fps 卡顿时流畅度（每秒钟的�?�），交互中可能包含多个20161130

        public long getSt() {
            return st;
        }
        public void setSt(long st) {
            this.st = st;
        }

        public int getF() {
            return f;
        }
        public void setF(int f) {
            this.f = f;
        }
    }

    public static final class UserTrack
    {
        public static UserTrack newInstance() {
            UserTrack userTrack = new UserTrack();
            return userTrack;
        }
        private long st;    // 1 stayingTime：访问时长，long类型，单位微秒；如果有activity name 又有 fragment name，staying time就是fragment的访问时长；如果有activity name 没有fragment name ，staying time就是activity的访问时�??
        private String an;  //"2" activityName：Activity名称
        private String fn ; //"3"  fragmentName：Fragment名称
        private String mi ;  //"4"  method：方�??
        private long utst;  //, //userTrackStartTime：轨迹开始时间;  long类型，单位微秒；如果有activity name 又有 fragment name，startTime和endTime 就是fragment的视图开始时间；如果有activity name 没有fragment name ，startTime和endTime就是activity的视图开始时间
        private Function f; //     //Function：视图内的多个方法

        public long getUtst() {
            return utst;
        }

        public void setUtst(long utst) {
            this.utst = utst;
        }

        public void setF(Function f) {
            this.f =f;
        }
        public Function getF() {
            return f;
        }
        public long getSt() {
            return st;
        }
        public void setSt(long st) {
            this.st = st;
        }

        public void setAn(String an) {
            this.an = an;
        }

        public String getAn() {
            return an;
        }
        public void setFn(String fn) {
            this.fn = fn;
        }

        public String getFn() {
            return fn;
        }
        public void setM(String m) {
            this.mi = mi;
        }

        public String getM() {
            return mi;
        }

    }

    public static final class MemoryCpuInfo
    {
        //	memoryCpuInfo	交互内存和cpu信息（交互）
        public static MemoryCpuInfo newInstance() {

            MemoryCpuInfo fragment = new MemoryCpuInfo();
            return fragment;
        }

        private long st; //1.startTimeUs：访问时�??
        private float am; //2.appMemory：app使用内存
        private float ac; //3.appCpu：app使用CPU


        public long getStartTimeUs() {
            return st;
        }

        public void setStartTimeUs(long st) {
            this.st = st;
        }

        public float getApp_memory() {
            return am;
        }

        public void setApp_memory(float am) {
            this.am = am;
        }

        public float getApp_cpu() {
            return ac;
        }

        public void setApp_cpu(float ac) {
            this.ac = ac;
        }
    }



    public static final class NetResult
    {
        public static NetResult newInstance() {
            NetResult fragment = new NetResult();
            return fragment;
        }
        private List<Object> netResult;

        public Object[] createNetResult() {
            Object[] nr_header = {
                    "ru",  //1 requestUrl请求地址
                    "si",  //2 socketId tcp的socketid;（不用管)
                    "li",  //3 localIp本地IP（后台没用到)
                    "lp",  //4 localport目标端口（后台没用到)
                    "ti",  //5 targetIp目标IP(5.9废弃)
                    "tp",  //6 targetPort目标端口
                    "st",  //7 startTimeUs请求起始时刻
                    "dt",  //8 dnsTimeUs dns查询时间
                    "ct",  //9 connectTimeUs tcp建连时间
                    "sti", //10 ssltimeUs
                    "rt",  //11 requestTimeUs请求时间
                    "rti", //12 responseTimeUs响应时间
                    "dti", //13 downloadTimeUs下载用时
                    "et",  //14 endTimeUs请求结束时刻
                    "rh",  //15 requestHeader请求header
                    "rd",  //16 requestDataSize请求数据大小
                    "rhe", //17 responseHeader响应header
                    "rds", //18 responseDataSize响应数据大小
                    "ei",  //19 errorId错误ID
                    "se",  //20 subErrorId子错误码(B站需求：652原始错误码上�??)
                    "ib",  //21 isBackground是否后台发生
                    "mt",  //22 mimetype
                    "dsi", //23 dnsServerIp手机localDNS(5.9废弃)
                    "rg",  //24 requestGuid(端到端打通功�??)
                    "rgu", //25 responseGuid(端到端打通功�??)
                    "iw",  //26 isWebview是否Webview
                    "lc",  //27 lastCname
                    "am",  //28 AccessMode接入方式 wap/net/wifi(5.9废弃)
                    "s",   //29 signal信号�??
                    "nt",  //30 netType网络类型�??5.9废弃�??
                    "mi",  //31 memberId会员ID
                    "kv",  //32 kv键�?�对
                    "pt",  //33 protocolType协议类型(1:h1,2:h1s,3:h2,4:h2s,5:ws,6:wss,7:socket)
                    "cna", //34 cnameArray：cname字符串数�??
                    //    "tip", //35 targetIp：目标IP；会上报IPV4或�?�IPV6；String(5.9新增)
                    "dsip",//36 dnsServerIp：手机localDNS；会上报IPV4或�?�IPV；String(5.9新增)
                    "ns"   //37 networkStandard：网络制式；String；后台做2g 3g 4g的对应转�??(5.9新增)
            };

            return nr_header;
        }

        public List<Object> getNetResult() {
            return netResult;
        }
        public void setNetResult(List<Object> netResult) {
            this.netResult = netResult;
        }


    }



    public static final class CrashLog
    {
        public static CrashLog newInstance() {

            CrashLog fragment = new CrashLog();
            return fragment;
        }

        private Object ai; // {}, //	ANRLog
        // private double st; // 1  ,//	startTimeUs	数据起始时间，崩溃发生时�??
        private long st;
        private Object is; // { },  //	IosSymbolic
        private String as; // "",//	activityStream	记录崩溃前视图的调用顺序(访问时长1@视图名称1@方法1;访问时长2@视图名称2@方法2)
        private List<Object[]> ut ;  // [[]],// UserTrack
        private String cb; // "", //	causedBy	导致崩溃代码,堆栈信息第一行所显示信息
        private String r; // "",//	registers	寄存器状�??
        private String cg; // "", //	crashGuid	崩溃唯一标识（崩溃去重）
        private String ed; // "", //	errordump	崩溃堆栈信息（展示用�??
        private int ti; // 1, //	threadID	线程ID
        private String en; // "",//	exceptionName	异常类型
        private String tn; // "", //	threadName	线程名称
        private List<Object> ot; // [{}],//	OtherThread
        private String ain; // "", //	appinfo	安装的所有应用包名（农行android�??
        private Object ds; // {},  //	DeviceStateInfo
        private String sl; // "", //	sysLog 	系统日志
        private String av; // "", //	app_version	APP版本
        private String sv; // "", //	sdk_version	SDK的版�??
        private String lav; // "", //	lastApp_version	上一个APP版本
        private int am; // 1,  //	access_mode	接入方式 wap/net/wifi
        private String ns ;    // networkStandard：网络制式；String；后台做2g 3g 4g的对应转�??(5.9新增)
        private long  cst;	//: 1,   // crashStartTimeUS：数据崩溃距离客户端启动的时间偏移（5.9.2新增）

        public void setCst(long cst) {
            this.cst =cst;
        }
        public long getCst() {
            return cst;
        }
        public void setNs(String ns) {
            this.ns = ns;
        }

        public String getNs() {
            return ns;
        }

        public List<Object[]> getUt(){
            return ut;
        }

        public void  setUt(List<Object[]>  ut){
            this.ut = ut;
        }

        public Object getAi() {
            return ai;
        }

        public void setAi(Object ai) {
            this.ai = ai;
        }

        public long getSt() {
            return st;
        }

        public void setSt(long st) {
            this.st = st;
        }

    /*    public long getSt() {
            return st;
        }

        public void setSt(long st) {
            this.st = st;
        }*/

        public Object getIs() {
            return is;
        }

        public void setIs(Object is) {
            this.is = is;
        }

        public String getAs() {
            return as;
        }

        public void setAs(String as) {
            this.as = as;
        }

        public String getCb() {
            return cb;
        }

        public void setCb(String cb) {
            this.cb = cb;
        }

        public String getR() {
            return r;
        }

        public void setR(String r) {
            this.r = r;
        }

        public String getCg() {
            return cg;
        }

        public void setCg(String cg) {
            this.cg = cg;
        }

        public String getEd() {
            return ed;
        }

        public void setEd(String ed) {
            this.ed = ed;
        }

        public int getTi() {
            return ti;
        }

        public void setTi(int ti) {
            this.ti = ti;
        }

        public String getEn() {
            return en;
        }

        public void setEn(String en) {
            this.en = en;
        }

        public String getTn() {
            return tn;
        }

        public void setTn(String tn) {
            this.tn = tn;
        }

        public List<Object> getOt() {
            return ot;
        }

        public void setOt(List<Object> ot) {
            this.ot = ot;
        }

        public String getAin() {
            return ain;
        }

        public void setAin(String ain) {
            this.ain = ain;
        }

        public Object getDs() {
            return ds;
        }

        public void setDs(Object ds) {
            this.ds = ds;
        }

        public String getSl() {
            return sl;
        }

        public void setSl(String sl) {
            this.sl = sl;
        }

        public String getAv() {
            return av;
        }

        public void setAv(String av) {
            this.av = av;
        }

        public String getSv() {
            return sv;
        }

        public void setSv(String sv) {
            this.sv = sv;
        }

        public String getLav() {
            return lav;
        }

        public void setLav(String lav) {
            this.lav = lav;
        }

        public int getAm() {
            return am;
        }

        public void setAm(int am) {
            this.am = am;
        }

    }



    public static final class DefinedCrashLog
    {
        public static DefinedCrashLog newInstance() {
            DefinedCrashLog fragment = new DefinedCrashLog();
            return fragment;
        }

//        "DefinedCrashLog" :  //
//        {
//          "st" : 1,   // startTimeUs 数据起始时间，崩溃发生时�??
//          "is" : {  },//IosSymbolic
//          "cb" : "",  // causedBy    导致崩溃代码,堆栈信息第一行所显示信息（自定义异常异常原因�??
//          "cg" : "",  // crashGuid   崩溃唯一标识（崩溃去重）
//          "ed" : "",  // errordump   崩溃堆栈信息（展示用）（自定义异常异常描述）
//          "en" : "",  // exceptionName   异常类型（自定义异常类型�??
//          "ds" : {},  // DeviceStateInfo
//          "sl" : "",  // sysLog  系统日志
//          "lav" : "", // lastApp_version 上一个APP版本
//          "as" : ""   // activityStream  记录崩溃前视图的调用顺序(访问时长1@视图名称1@方法1;
//        },

        // private long st; // 1, //	startTimeUs	数据起始时间，崩溃发生时�??
        private double st;
        private Object is; // {  },//IosSymbolic
        private String cb; // "", //	causedBy	导致崩溃代码,堆栈信息第一行所显示信息（自定义异常异常原因�??
        private String cg; // "",//	crashGuid	崩溃唯一标识（崩溃去重）
        private String ed; // "", //	errordump	崩溃堆栈信息（展示用）（自定义异常异常描述）
        private String en; // "",//	exceptionName	异常类型（自定义异常类型�??
        private Object ds; // {},//	DeviceStateInfo
        private String sl; // "", //	sysLog 	系统日志
        private String lav; // "", //	lastApp_version	上一个APP版本
        private String as; // "",//	activityStream	记录崩溃前视图的调用顺序(访问时长1@视图名称1@方法1;
        private List<Object[]> ut ; // [[]] // UserTrack
        private long  cst;	//: 1,   // crashStartTimeUS：数据崩溃距离客户端启动的时间偏移（5.9.2新增）

        public void setCst(long cst) {
            this.cst =cst;
        }
        public long getCst() {
            return cst;
        }

        public List<Object[]> getUt(){
            return ut;
        }

        public void  setUt(List<Object[]>  ut){
            this.ut = ut;
        }

        /*   public long getSt() {
               return st;
           }

           public void setSt(long st) {
               this.st = st;
           }*/
        public double getSt() {
            return st;
        }

        public void setSt(double st) {
            this.st = st;
        }

        public Object getIs() {
            return is;
        }

        public void setIs(Object is) {
            this.is = is;
        }

        public String getCb() {
            return cb;
        }

        public void setCb(String cb) {
            this.cb = cb;
        }

        public String getCg() {
            return cg;
        }

        public void setCg(String cg) {
            this.cg = cg;
        }

        public String getEd() {
            return ed;
        }

        public void setEd(String ed) {
            this.ed = ed;
        }

        public String getEn() {
            return en;
        }

        public void setEn(String en) {
            this.en = en;
        }

        public Object getDs() {
            return ds;
        }

        public void setDs(Object ds) {
            this.ds = ds;
        }

        public String getSl() {
            return sl;
        }

        public void setSl(String sl) {
            this.sl = sl;
        }

        public String getLav() {
            return lav;
        }

        public void setLav(String lav) {
            this.lav = lav;
        }

        public String getAs() {
            return as;
        }

        public void setAs(String as) {
            this.as = as;
        }
    }



    public static final class IosSymbolic
    {
        public static IosSymbolic newInstance() {

            IosSymbolic fragment = new IosSymbolic();
            return fragment;
        }

        private String bi; // "", //	binaryInfo	binary infos 用于系统方法符号�??
        private String eu; // "", //	erroruuid	崩溃uuid&平安二期
        private String ba; // ""//	baseAddress	基址&平安二期
        private String sbv;


        public String getBi() {
            return bi;
        }

        public void setBi(String bi) {
            this.bi = bi;
        }

        public String getEu() {
            return eu;
        }

        public void setEu(String eu) {
            this.eu = eu;
        }

        public String getBa() {
            return ba;
        }

        public void setBa(String ba) {
            this.ba = ba;
        }
        public String getSbv() {
            return sbv;
        }

        public void setSbv(String sbv) {
            this.sbv = sbv;
        }
    }



    public static final class DefinedLog
    {
        public static DefinedLog newInstance() {
            DefinedLog fragment = new DefinedLog();
            return fragment;
        }


        private long st; // 1, //	startTimeUs	数据起始时间，发生时�??
        private String mi; // "",//	memberId	会员ID
        private String di; // ""//	definedInfo	自定义信�??

        public long getSt() {
            return st;
        }

        public void setSt(long st) {
            this.st = st;
        }

        public String getMi() {
            return mi;
        }

        public void setMi(String mi) {
            this.mi = mi;
        }

        public String getDi() {
            return di;
        }

        public void setDi(String di) {
            this.di = di;
        }
    }



    public static final class Session
    {
        public static Session newInstance() {
            Session fragment = new Session();
            return fragment;
        }

        private long ct; // 1,//	callTimeUs	事件触发时间（行为）
        private String kv; // "", 	//	kv	事件参数，json格式，由参数Map<String,Object> Object仅仅支持String和Number型（行为)
        private String si; // "", //	sessionId	事件ID(行为)
        private String sn; // "", //	sessionName	事件名称(行为)
        private Object nsi; // {},//	NetStateInfo

        public long getCt() {
            return ct;
        }

        public void setCt(long ct) {
            this.ct = ct;
        }

        public String getKv() {
            return kv;
        }

        public void setKv(String kv) {
            this.kv = kv;
        }

        public String getSi() {
            return si;
        }

        public void setSi(String si) {
            this.si = si;
        }

        public String getSn() {
            return sn;
        }

        public void setSn(String sn) {
            this.sn = sn;
        }

        public Object getNsi() {
            return nsi;
        }

        public void setNsi(Object nsi) {
            this.nsi = nsi;
        }
    }



    public static final class ActionActivity
    {
        public static ActionActivity newInstance() {
            ActionActivity fragment = new ActionActivity();
            return fragment;
        }

        private long et; // 1, //	endTimeUs	行为视图结束时间（行为）
        private String ai; // "", //	activityId	行为视图ID（行为）
        private long st; // 1, //	startTimeUs	行为视图起始时间（行为）
        private String an; // ""//	activityName	视图名称（行为）

        public long getEt() {
            return et;
        }

        public void setEt(long et) {
            this.et = et;
        }

        public String getAi() {
            return ai;
        }

        public void setAi(String ai) {
            this.ai = ai;
        }

        public long getSt() {
            return st;
        }

        public void setSt(int st) {
            this.st = st;
        }

        public String getAn() {
            return an;
        }

        public void setAn(String an) {
            this.an = an;
        }
    }



    public static final class ActionActivityResult
    {
        public static ActionActivityResult newInstance() {
            ActionActivityResult fragment = new ActionActivityResult();
            return fragment;
        }

        private Object paa; // {},  //	ActionActivity
        private Object aa; // {},  //	ActionActivity
        private boolean iq; // true, //	isQuit	是否�??出（�??出�?�置后台、crash）（行为�??
        private Object nsi; // {},//	NetStateInfo

        public Object getPaa() {
            return paa;
        }

        public void setPaa(Object paa) {
            this.paa = paa;
        }

        public Object getAa() {
            return aa;
        }

        public void setAa(Object aa) {
            this.aa = aa;
        }

        public boolean isIq() {
            return iq;
        }

        public void setIq(boolean iq) {
            this.iq = iq;
        }

        public Object getNsi() {
            return nsi;
        }

        public void setNsi(Object nsi) {
            this.nsi = nsi;
        }
    }



    public static final class WebviewResult
    {
        public static WebviewResult newInstance() {
            WebviewResult fragment = new WebviewResult();
            return fragment;
        }
        private List<Object> webviewResult;

//        "WebviewResult" :  //v.x.x.x.x后废�??
//        	  [
//        	    [
//        	      "st",  //startTimeUs js请求起始时间;
//        	      "et",  //endTimeUs js请求结束时间;
//        	      "ru",  //requestUrl请求地址;
//        	      "wn",  //webviewName webview名称;
//        	      "fp",  //firstPaintTimeUs白屏时间;
//        	      "ut",  //unloadTimeUs unload时间;
//        	      "rt",  //redirectTimeUs重定向时�??;
//        	      "ct",  //cacheTimeUs cache时间;
//        	      "dt",  //dnsTimeUs dns查询时间;
//        	      "cti", //connectTimeUs tcp建连时间;
//        	      "rti", //requestTimeUs请求时间;
//        	      "rtim",//responseTimeUs响应时间;
//        	      "dti", //domLoadTimeUs load dom时间;
//        	      "brt", //browserRenderTimeUs页面渲染时间;
//        	      "rds", //responseDataSize响应数据大小;
//        	      "cc",  //crashCount发生js错误次数;
//        	      "we",  //WebviewElements;
//        	      "sti"  //ssltimeUs;
//        	    ],
//        	    [1,1,"","",1,1,1,1,1,1,1,1,1,1,1,1,[{}],1]
//        	  ],

        public List<Object> getWebviewResult() {
            return webviewResult;
        }

        public void setWebviewResult(List<Object> webviewResults) {
            this.webviewResult = webviewResults;
        }

    }



    public static final class WebviewInfo
    {
        public static WebviewInfo newInstance() {
            WebviewInfo fragment = new WebviewInfo();
            return fragment;
        }

        //    	  "WebviewInfo" : [ //5.7版本添加
//    	                    [
//         "pvid", //1.页面id
//         "url",  //2.requestUrl请求地址
//         "wn",   //3.webviewName webview名称
//         "wpt",  //4.WebviewPerformanceTiming
//         "wr",   //5.WebviewResource
//         "we",   //6.WebviewError（嵌套在WebviewInfo里面使用时，pvid和url用WebviewInfo里面的）
//         "jen"   //7.js error number = we里面的错误数相加
// 	                    ],
//    	                    [1,"","",{},[[]],[[]],1]
//    	                  ],
        private List<Object> WebviewInfo;

        public void createWebviewinfo() {
            String[] we_header = { "pvid", "url","wn","wpt","wr","we","jen"};
            this.WebviewInfo.add(we_header);
        }

        public List<Object> getWebviewInfo() {
            return WebviewInfo;
        }

        public void setWebviewInfo(List<Object> WebviewInfo) {
            this.WebviewInfo = WebviewInfo;
        }
    }


    public static final class WebviewPerformanceTiming    //时间单位为取的原�??(毫秒)
    {
        public static WebviewPerformanceTiming newInstance() {
            WebviewPerformanceTiming fragment = new WebviewPerformanceTiming();
            return fragment;
        }

//    	  //https://developer.mozilla.org/zh-CN/docs/Web/API/PerformanceTiming
//    	  "WebviewPerformanceTiming" : { //5.7版本添加
//    	    "ns" : 1,   //navigationStart;【时间戳�??;表征了从同一个浏览器上下文的上一个文档卸�??(unload)结束时的UNIX时间戳�?�如果没有上�??个文档，这个值会和PerformanceTiming.fetchStart相同�??
//    	    "ues": 2,   //unloadEventStart;【相对�?��??;表征了unload事件抛出时的UNIX时间戳�?�如果没有上�??个文档，or if the previous document, or one of the needed redirects, is not of the same origin, 这个值会返回0.
//    	    "uee": 3,   //unloadEventEnd;【相对�?��??;表征了unload事件处理完成时的UNIX时间戳�?�如果没有上�??个文档，or if the previous document, or one of the needed redirects, is not of the same origin, 这个值会返回0.
//    	    "rds": 4,   //redirectStart;【相对�?��??;表征了第�??个HTTP重定向开始时的UNIX时间戳�?�如果没有重定向，或者重定向中的�??个不同源，这个�?�会返回0.
//    	    "rde": 5,   //redirectEnd;【相对�?��??;表征了最后一个HTTP重定向完成时（也就是说是HTTP响应的最后一个比特直接被收到的时间）的UNIX时间戳�?�如果没有重定向，或者重定向中的�??个不同源，这个�?�会返回0.
//    	    "fs": 6,    //fetchStart;【相对�?��??;表征了浏览器准备好使用HTTP请求来获�??(fetch)文档的UNIX时间戳�?�这个时间点会在�??查任何应用缓存之前�??
//    	    "dls": 7,   //domainLookupStart;【相对�?��??;表征了域名查询开始的UNIX时间戳�?�如果使用了持续连接(persistent connection)，或者这个信息存储到了缓存或者本地资源上，这个�?�将�?? PerformanceTiming.fetchStart�??致�??
//    	    "dle": 8,   //domainLookupEnd;【相对�?��??;表征了域名查询结束的UNIX时间戳�?�如果使用了持续连接(persistent connection)，或者这个信息存储到了缓存或者本地资源上，这个�?�将�?? PerformanceTiming.fetchStart�??致�??
//    	    "cs": 9,    //connectStart;【相对�?��??;返回HTTP请求�??始向服务器发送时的Unix毫秒时间戳�?�如果使用持久连接（persistent connection），则返回�?�等同于fetchStart属�?�的值�??
//    	    "scs": 10,  //secureConnectionStart;【相对�?��??;返回浏览器与服务器开始安全链接的握手时的Unix毫秒时间戳�?�如果当前网页不要求安全连接，则返回0�??
//    	    "ce": 10,    //connectEnd;【相对�?��??;返回浏览器与服务器之间的连接建立时的Unix毫秒时间戳�?�如果建立的是持久连接，则返回�?�等同于fetchStart属�?�的值�?�连接建立指的是�??有握手和认证过程全部结束�??
//    	    "reqs": 12,  //requestStart;【相对�?��??;返回浏览器向服务器发出HTTP请求时（或开始读取本地缓存时）的Unix毫秒时间戳�??
//    	    "rsps": 13,  //responseStart;【相对�?��??;返回浏览器从服务器收到（或从本地缓存读取）第�??个字节时的Unix毫秒时间戳�?�如果传输层在开始请求之后失败并且连接被重开，该属�?�将会被数制成新的请求的相对应的发起时间�??
//    	    "rspe": 14,  //responseEnd;【相对�?��??;返回浏览器从服务器收到（或从本地缓存读取，或从本地资源读取）�??后一个字节时（如果在此之前HTTP连接已经关闭，则返回关闭时）的Unix毫秒时间戳�??
//    	    "dl": 15,    //domLoading;【相对�?��??;返回当前网页DOM结构�??始解析时（即Document.readyState属�?�变为�?�loading”�?�相应的 readystatechange事件触发时）的Unix毫秒时间戳�??
//    	    "di": 16,    //domInteractive;【相对�?��??;返回当前网页DOM结构结束解析、开始加载内嵌资源时（即Document.readyState属�?�变为�?�interactive”�?�相应的readystatechange事件触发时）的Unix毫秒时间戳�??
//    	    "dcles": 17, //domContentLoadedEventStart;【相对�?��??;返回当解析器发�?�DOMContentLoaded 事件，即�??有需要被执行的脚本已经被解析时的Unix毫秒时间戳�??
//    	    "dclee": 18, //domContentLoadedEventEnd;【相对�?��??;返回当所有需要立即执行的脚本已经被执行（不论执行顺序）时的Unix毫秒时间戳�??
//    	    "dc": 19,    //domComplete;【相对�?��??;返回当前文档解析完成，即Document.readyState 变为 'complete'且相对应的readystatechange 被触发时的Unix毫秒时间戳�??
//    	    "les": 20,   //loadEventStart;【相对�?��??;返回该文档下，load事件被发送时的Unix毫秒时间戳�?�如果这个事件还未被发�?�，它的值将会是0�??
//    	    "lee": 21    //loadEventEnd;【相对�?��??;返回当load事件结束，即加载事件完成时的Unix毫秒时间戳�?�如果这个事件还未被发�?�，或�?�尚未完成，它的值将会是0.

        //    	  },
        private long ns ;       // : 1,   //navigationStart
        private long fs;		// : 1,   //fetchStart
        private long reqs;     // 1,  //requestStart
        private long rsps;// 	    "rspe": 1,  //responseEnd
        private long dcles;		// : 1,//domContentLoadedEventStart
        private long dclee;		// : 1,//domContentLoadedEventEnd
        private long di;		// : 1,   //domInteractive
        private long dc;		// : 1,   //domComplete
        private long dl;		// : 1,   //domLoading
        private long les;		// : 1,  //loadEventStart
        private long lee;		// : 1   //loadEventEnd
        private long ues ;		// : 1,  //unloadEventStart
        private long uee ;		// : 1,  //unloadEventEnd
        private long cs;		// : 1,   //connectStart
        private long ce;		// : 1,   //connectEnd
        private long dls;		// : 1,  //domainLookupStart
        private long dle;		// : 1,  //domainLookupEnd
        private long rds;     	// : 1,   //redirectStart
        private long rde;		//  : 1,   //redirectEnd
        private long scs;		// : 1,  //secureConnectionStart


        public long getNs() {
            return ns;
        }
        public void setNs(long ns) {
            this.ns = ns;
        }
        public long getFs() {
            return fs;
        }
        public void setFs(long fs) {
            this.fs = fs;
        }
        public long getReqs() {
            return reqs;
        }
        public void setReqs(long rqs) {
            this.reqs = rqs;
        }
        public long getRsps() {
            return rsps;
        }
        public void setRsps(long rps) {
            this.rsps = rps;
        }
        public long getDcles() {
            return dcles;
        }
        public void setDcles(long dcles) {
            this.dcles = dcles;
        }
        public long getDclee() {
            return dclee;
        }
        public void setDclee(long dclee) {
            this.dclee = dclee;
        }
        public long getDl() {
            return dl;
        }

        public void setDl(long dl) {
            this.dl = dl;
        }

        public long getDi() {
            return di;
        }

        public void setDi(long di) {
            this.di = di;
        }


        public long getDc() {
            return dc;
        }

        public void setDc(long dc) {
            this.dc = dc;
        }

        public long getLes() {
            return les;
        }

        public void setLes(long les) {
            this.les = les;
        }

        public long getLee() {
            return lee;
        }

        public void setLee(long lee) {
            this.lee = lee;
        }

        public long getUes() {
            return ues;
        }
        public void setUes(long ues) {
            this.ues = ues;
        }
        public void setUee(long uee) {
            this.uee = uee;
        }
        public long getUee() {
            return uee;
        }
        public long getCs() {
            return cs;
        }

        public void setCs(long cs) {
            this.cs = cs;
        }

        public long getCe() {
            return ce;
        }

        public void setCe(long ce) {
            this.ce = ce;
        }
        public long getDls() {
            return dls;
        }

        public void setDls(long dls) {
            this.dls = dls;
        }

        public long getDle() {
            return dle;
        }

        public void setDle(long dle) {
            this.dle = dle;
        }

        public long getRds() {
            return rds;
        }

        public void setRds(long rds) {
            this.rds = rds;
        }

        public long getRde() {
            return rde;
        }

        public void setRde(long re) {
            this.rde = re;
        }

        public long getScs() {
            return scs;
        }

        public void setScs(long scs) {
            this.scs = scs;
        }

    }



    public static final class WebviewCrash
    {
        public static WebviewCrash newInstance() {
            WebviewCrash fragment = new WebviewCrash();
            return fragment;
        }
        private long st; // 1, //	startTimeUs	数据起始时间，崩溃发生时�??
        private String cb; // "", //	causedBy	导致崩溃代码,堆栈信息第一行所显示信息
        private String wn; // "", //	webviewName	webview名称
        private String ru; // "", //	requestUrl	请求地址
        private String ed; // "", //	errordump	崩溃堆栈信息
        private String en; // "", //	exceptionName	异常类型
        private String ua; // ""  //	userAgent	userAgent

        public long getSt() {
            return st;
        }

        public void setSt(long st) {
            this.st = st;
        }

        public String getCb() {
            return cb;
        }

        public void setCb(String cb) {
            this.cb = cb;
        }

        public String getWn() {
            return wn;
        }

        public void setWn(String wn) {
            this.wn = wn;
        }

        public String getRu() {
            return ru;
        }

        public void setRu(String ru) {
            this.ru = ru;
        }

        public String getEd() {
            return ed;
        }

        public void setEd(String ed) {
            this.ed = ed;
        }

        public String getEn() {
            return en;
        }

        public void setEn(String en) {
            this.en = en;
        }

        public String getUa() {
            return ua;
        }

        public void setUa(String ua) {
            this.ua = ua;
        }
    }



    public static final class WebviewElements
    {//H5元素

        public static WebviewElements newInstance() {

            WebviewElements fragment = new WebviewElements();
            return fragment;
        }

        private List<String[]> webviewElements;

//        [
//         "st",  //数据起始时间
//         "et",  //数据结束时间
//         "ru",  //请求地址
//         "mt",  //memi类型小写
//         "es"   //元素大小（KB�??
//     	]
//     [1,1,"","",1]

        public void createWebviewElements(){
            String[] we_header = { "st", "et","ru","mt","es"};
            this.webviewElements.add(we_header);
        }

        public void addWebviewElement(String[] webviewElem){
            this.webviewElements.add(webviewElem);
        }

        public List<String[]> getWebviewElements() {
            return webviewElements;
        }

        public void setWebviewElements(List<String[]> webviewElements) {
            this.webviewElements = webviewElements;
        }

    }


    public static final class TrafficUsage
    {
        public static TrafficUsage newInstance() {

            TrafficUsage fragment = new TrafficUsage();
            return fragment;
        }

        //        "TrafficUsage" :  //
//        {
//        "mu" : 1, // MobileUsage 移动流量
//        "wu" : 1  //  WifiUsage   wifi流量
//        },
        private int  mu=2070; // 1, //	MobileUsage	移动流量
        private int  wu=102400; // 1 //	WifiUsage	wifi流量

        public int getMu() {
            return mu;
        }

        public void setMu(int mu) {
            this.mu = mu;
        }

        public int getWu() {
            return wu;
        }

        public void setWu(int wu) {
            this.wu = wu;
        }
    }



    public static final class ANRLog
    {
        public static ANRLog newInstance() {
            ANRLog fragment = new ANRLog();
            return fragment;
        }
        //        "ANRLog" :  //
//        {
//        "am" : "",  // anrMessage  anrMessage
//        "cb" : "",  // causedBy    导致崩溃代码,anr堆栈第一行所显示信息
//        "aty" : "", // anrType anr类型
//        "at" : "",  // anrThread   anr堆栈信息
//        "atr" : "", // anrTrace    anrTrace
//        "ap" : ""   // anrPart anr部件
//        },
        private String  am; // "", //	anrMessage	anrMessage
        private String  cb; // "", //	causedBy	导致崩溃代码,anr堆栈第一行所显示信息
        private String  aty; // "", //	anrType	anr类型
        private String  at; // "", //	anrThread	anr堆栈信息
        private String  atr; // "", //	anrTrace	anrTrace
        private String  ap; // ""//	anrPart	anr部件

        public String getAm() {
            return am;
        }

        public void setAm(String am) {
            this.am = am;
        }

        public String getCb() {
            return cb;
        }

        public void setCb(String cb) {
            this.cb = cb;
        }

        public String getAty() {
            return aty;
        }

        public void setAty(String aty) {
            this.aty = aty;
        }

        public String getAt() {
            return at;
        }

        public void setAt(String at) {
            this.at = at;
        }

        public String getAtr() {
            return atr;
        }

        public void setAtr(String atr) {
            this.atr = atr;
        }

        public String getAp() {
            return ap;
        }

        public void setAp(String ap) {
            this.ap = ap;
        }
    }


    public static final class IosLag
    {
        private long  st; // 1, //	startTimeUs	数据起始时间，ios卡顿发生时刻
        private Object  is; // { },//	IosSymbolic
        private String  cb; // "", //	causedBy	导致ios卡顿代码,堆栈信息第一行所显示信息
        private String  cg; // "",//	crashGuid	ios卡顿唯一标识
        private String  ed; // "", //	errordump	ios卡顿堆栈信息
        private Object  ds; // {}//	DeviceStateInfo
//        private String  as; // "",//	activityStream	记录崩溃前视图的调用顺序(访问时长1@视图名称1@方法1;访问时长2@视图名称2@方法2)
//        private int  am; // 1,  //	access_mode	接入方式 wap/net/wifi
        private String  ns; // networkStandard：网络制式；String；后台做2g 3g 4g的对应转�??(5.9新增)
        private ActivityResult  ar;  // ActivityResult：发生卡顿的视图信息�??5.9新增�??
        private List<Object[]> ut;         //"ut": [[]], // UserTrack 卡顿发生时的用户轨迹 (可能为空数组)
        public static IosLag newInstance() {
            IosLag fragment = new IosLag();
            return fragment;
        }

        public IosLag() {

        }

        public IosLag(long st, Object is, String cb, String cg, String ed, Object ds, String as, int am, String ns, ActivityResult ar, List<Object[]> ut ) {
            this.st = st;
            this.is = is;
            this.cb = cb;
            this.cg = cg;
            this.ed = ed;
            this.ds = ds;
//            this.as = as;
//            this.am = am;
            this.ns = ns;
            this.ar = ar;
            this.ut = ut;
        }

        public long getSt() {
            return st;
        }

        public void setSt(long st) {
            this.st = st;
        }

        public Object getIs() {
            return is;
        }

        public void setIs(Object is) {
            this.is = is;
        }

        public String getCb() {
            return cb;
        }

        public void setCb(String cb) {
            this.cb = cb;
        }

        public String getCg() {
            return cg;
        }

        public void setCg(String cg) {
            this.cg = cg;
        }

        public String getEd() {
            return ed;
        }

        public void setEd(String ed) {
            this.ed = ed;
        }

        public Object getDs() {
            return ds;
        }

        public void setDs(Object ds) {
            this.ds = ds;
        }

//        public String getAs() {
//            return as;
//        }
//
//        public void setAs(String as) {
//            this.as = as;
//        }
//
//        public int getAm() {
//            return am;
//        }
//
//        public void setAm(int am) {
//            this.am = am;
//        }

        public String getNs() {
            return ns;
        }

        public void setNs(String ns) {
            this.ns = ns;
        }

        public ActivityResult getAr() {
            return ar;
        }

        public void setAr(ActivityResult ar) {
            this.ar = ar;
        }

        public List<Object[]> getUt() {
            return ut;
        }

        public void setUt(List<Object[]> ut) {
            this.ut = ut;
        }
    }



    public static final class OtherThread
    {
        public static OtherThread newInstance() {
            OtherThread fragment = new OtherThread();
            return fragment;
        }

        private String  st; // "",//	stackTrace	线程堆栈信息
        private int   ti; // 1, //	threadID	线程ID
        private String  tn; // ""//	threadName	线程名称

        public String getSt() {
            return st;
        }

        public void setSt(String st) {
            this.st = st;
        }

        public int getTi() {
            return ti;
        }

        public void setTi(int ti) {
            this.ti = ti;
        }

        public String getTn() {
            return tn;
        }

        public void setTn(String tn) {
            this.tn = tn;
        }
    }


    public static final class WebviewResource{
        public static WebviewResource newInstance() {
            WebviewResource fragment = new WebviewResource();
            return fragment;
        }
        private List<Object> webRes;

        public void createWebviewResource() {
            String[]  header = {
                    "st",    //1.startTime
                    "rt",    //2.resourceType 资源类型�?? 发起请求的源
                    "name",  //3.资源名称
                    "dura" , //4.duration 加载时间
                    "fs" ,   //5.fetchStart 为浏览器已经准备好去使用HTTP请求抓取文档之时�?? Unix毫秒时间戳�?�这�??时刻在检查应用的缓存之前�??
                    "dls" ,  //6.domainLookupStart 为域名开始解析之时的 Unix毫秒时间�??
                    "dle" ,  //7.domainLookupEnd 为解析域名结束时�?? Unix毫秒时间�??
                    "cs" ,   //8.connectStart 请求连接被发送到网络之时的Unix毫秒时间戳�?�如果传输层报告错误并且连接的建立重新开始，则把�??后建立连接的�??始时间作为该值�??
                    "ce" ,   //9.connectEnd 它以毫秒为单位，代表了网络链接建立的时间节点。如果传输层报告了错误或者链接又被重新建立，则采用最后一次链接建立的时间。如果链接是长久的，那么这个值等同于PerformanceTiming.fetchStart�??
                    "scs" ,  //10.secureConnectionStart 为安全连接握手开始的时刻�?? Unix毫秒时间�??
                    "reqs",  //11.requestStart 为浏览器发�?�从服务器或者缓存获取实际文档的请求之时�?? Unix毫秒时间�??
                    "rsps",  //12.responseStart 为浏览器从服务器、缓存或者本地资源接收到响应的第�??个字节之时的 Unix毫秒时间戳�??
                    "rspe",  //13.responseEnd 为浏览器从服务器、缓存或者本地资源接收响应的�??后一个字节或者连接被关闭之时�?? Unix毫秒时间戳�??
                    "ts",    //14.transferSize the size (in octets) of the fetched resource. The size includes the response header fields plus the response payload body
                    "ebs",   //15.encodedBodySize the size (in octets) received from the fetch (HTTP or cache), of the payload body, before removing any applied content-codings.
                    "dbs"    //16.decodedBodySize the size (in octets) received from the fetch (HTTP or cache) of the message body, after removing any applied content-codings.
//    	      	    [1,"2","3",4,5,6,7,8,9,10,11,12,13,14,15,16]
            };
            webRes.add(header );

        }

        public  List<Object> getWebviewResource(){
            return webRes;
        }

        public  void addWebviewResource(Object webSrc){
            webRes.add(webSrc);
        }

    }



    public static final class ThirdInfo
    {
        public static ThirdInfo newInstance() {
            ThirdInfo fragment = new ThirdInfo();
            return fragment;
        }
        //    	    "ThirdInfo"://用户自定义的业务处理
//    	    {
//    	  	"cuf":"", //Customer Unique Flag 客户唯一标志，目前暂时用客户全称md5计算成的字符�??
//    	      "tc":[[]]  //thirdContent 客户自定义内�??
//    	    },
        private String  cuf; // Customer Unique Flag 客户唯一标志，目前暂时用客户全称md5计算成的字符�??
        private List<Object[]>  tc ; // /thirdContent 客户自定义内�??

        public String getCuf() {
            return cuf;
        }

        public void setCuf(String cuf) {
            this.cuf = cuf;
        }

        public  List<Object[]> getTc(){
            return tc;
        }

        public void setTc(List<Object[]> tc) {
            this.tc = tc;
        }
    }

    public static final class ThirdContent{
        public static ThirdContent newInstance() {
            ThirdContent fragment = new ThirdContent();
            return fragment;
        }
        //	    "ThirdContent": //客户自定义内�??
//	    [
//	      [
//	  	 "nsi",  //NetStateInfo 客户调用接口时的网络状�??
//	  	 "bnc"  //BusniessContent 客户自定义的业务字符�??
//	  	],
//	  	[{},""]
//	    ],
        //}
        private NetStateInfo nsi;
        private String bnc;

        public NetStateInfo getNsi() {
            return nsi;
        }
        public void setNsi(NetStateInfo nsi) {
            this.nsi = nsi;
        }

        public String getBnc() {
            return bnc;
        }
        public void SetBnc(String bnc) {
            this.bnc = bnc;
        }
    }


    public static final class DF_speed{
        public static DF_speed newInstance() {
            DF_speed fragment = new DF_speed();
            return fragment;
        }

        private String ip;
        private String time;

        public void setDF_speed(String IP, String time) {
            setIP(IP);
            setTime(time);
        }

        public String getIP() {
            return ip;
        }

        public void setIP(String IP) {
            this.ip = IP;
        }

        public String getTime() {
            return time;
        }
        public void setTime(String time) {
            this.time = time;
        }
    }


    public static final class AnyDoor_APPversion{
        public static AnyDoor_APPversion newInstance() {
            AnyDoor_APPversion fragment = new AnyDoor_APPversion();
            return fragment;
        }

        private String adv;


        public String getAdv() {
            return adv;
        }

        public void setAdv(String adv) {
            this.adv = adv;
        }

    }


    public static final class WebviewError{
        public static WebviewError newInstance() {
            WebviewError webErr = new WebviewError();
            return webErr;
        }
        private List<Object> webErr;  //webview错误�??5.7版本添加

        public void createWebviewError() {
            String[] header = {
                    "pvid", //1.WebviewError单独上报时有�??
                    "url",  //2.WebviewError单独上报时有�??
                    "name", //3.errorName
                    "msg",  //4.errorMessage
                    "line", //5.errorLine
                    "col",  //6.errorColumn
                    "file", //7.fileName
                    "en",   //8.errorNumber
                    "sta",  //9.stack
                    "flag", //10.flag(标识，暂无实际用�??)
                    "et"    //11.errorTime错误发生时间
//    	    ["1","2","3","4",5,6,"7",8,"9",10,11]
            };
            webErr.add(header);
        }


        public void addWebviewError(Object singleWebErr) {
            webErr.add(singleWebErr);
        }

        public List<Object> getWebviewError(){
            return webErr;
        }
    }


    public static final class CustomActivityResult{
        public static CustomActivityResult newInstance() {
            CustomActivityResult car = new CustomActivityResult();
            return car;
        }

        private String an; 	//:1,   //activityName 自定义视图名称
        private long st; 	//:2,   //startTimeUs 自定义视图开始时间
        private long et;	//:3,   /endTimeUs 自定义视图结束时间
        private String  ai;	// :"4", //activityId 自定义视图id
        private boolean iq;	// :true //isQuit 是否退出（退出、置后台、crash）

        public void setAn(String an) {
            this.an =an ;
        }
        public String getAn() {
            return an;
        }

        public void setSt(long st) {
            this.st = st;
        }
        public long getSt() {
            return st;
        }
        public void setEt(long et) {
            this.et = et;
        }
        public long getEt() {
            return et;
        }
        public void setAi(String ai) {
            this.ai = ai;
        }
        public String getAi() {
            return ai;
        }
        public boolean getIq() {
            return iq;
        }
        public void setIq(boolean iq) {
            this.iq = iq;
        }
    }


    public static final class Lag{  //卡顿（5.9.1新增）
        public static Lag newInstance() {
            Lag lag = new Lag();
            return lag;
        };
        private long st; 			// : 1,   // startTimeUs：数据起始时间，卡顿发生时刻
        private IosSymbolic is;		// : {},  // IosSymbolic（iOS系统符号表）
        private String cb ;			// : "",  // causedBy：导致卡顿代码,堆栈信息第一行所显示信息
        private String cg; 			// : "",  // crashGuid：卡顿唯一标识
        private String ed;			// : "",  // errorDump：卡顿堆栈信息
        private DeviceStateInfo ds;	// : {},  // DeviceStateInfo
        private int am;			// : 1,   // accessMode：接入方式 wap/net/wifi
        private String ns;		// : "",  // networkStandard：网络制式；String；后台做2g 3g 4g的对应转换
        private List<Object[]> ut;	// : [[]],// UserTrack
        private	ActivityResult ar;		// : {}   // ActivityResult：发生卡顿的视图信息
        //private List<Object> ar ;
        public String getCg() {
            return cg;
        }
        public DeviceStateInfo getDs() {
            return ds;
        }
        public int getAm() {
            return am;
        }
        public String  getCb() {
            return cb;
        }
        public String getEd() {
            return ed;
        }
        public String getNs() {
            return ns;
        }
        public void setSt(long st) {
            this.st = st;
        }
        public long getSt() {
            return st;
        }
        public void setIs(IosSymbolic is) {
            this.is =is;
        }
        public IosSymbolic getIs() {
            return is;
        }
        public void setCb(String cb) {
            this.cb = cb;
        }


        public void setCg(String cg) {
            this.cg = cg;
        }
        public void setEd(String ed) {
            this.ed = ed;
        }
        public void setDs(DeviceStateInfo ds) {
            this.ds =ds;
        }
        public void setAm(int am) {
            this.am = am;
        }
        public void setNs(String ns) {
            this.ns =ns;
        }
        public void setUt(List<Object[]> ut) {
            this.ut =ut;
        }
        public void createUt() {
            List<Object[]> arr_ut = new ArrayList<Object[]>();
            this.ut = arr_ut;
        }
        public void addUt(Object[] ut) {
            this.ut.add(ut);
        }
        public List<Object[]> getUt() {
            return ut;
        }

        public ActivityResult getAr() {
            return ar;
        }

        public void setAr(ActivityResult ar) {
            this.ar=ar;
        }



    }


    public static final class Function{
        public static Function newInstance() {
            Function f = new Function();
            return f;
        }

        private long st; 		//: 1,  //start time 执行时刻，相对agent启动
        private String c; 		//: "2", //class:调用方法的类名
        private String e;		//: "3"  //event 附加信息 例如：点击控件的位置信息

        public void setSt(long st) {
            this.st = st;
        }
        public long getSt() {
            return st;
        }
        public void setC(String c) {
            this.c =c;
        }
        public String getC() {
            return c;
        }
        public void setE(String e) {
            this.e = e;
        }
        public String getE() {
            return e;
        }
    }

}

