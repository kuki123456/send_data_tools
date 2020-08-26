package commontool.proto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class JsonSDKTransfer {

    public static final class SDKResponse {
        private String ur;    //	UploadDataResponse
        private String di;        //	deviceId
        private String cr;    //  ConfigResponse

        public static SDKResponse newInstance() {
            SDKResponse fragment = new SDKResponse();
            return fragment;
        }

        public String getUr() {
            return ur;
        }

        public void setUr(String ur) {
            this.ur = ur;
        }

        public String getDi() {
            return di;
        }

        public void setDi(String di) {
            this.di = di;
        }

        public String getCr() {
            return cr;
        }

        public void setCr(String cr) {
            this.cr = cr;
        }
    }

    public static final class SDKRequest {

        public static SDKRequest newInstance() {
            SDKRequest fragment = new SDKRequest();
            return fragment;
        }

        private Object h;             //SDKProtoHeader
        private Object udr;         //uploadDataRequest
        private Object cr;

        public Object getH() {
            return h;
        }

        public void setH(Object h) {
            this.h = h;
        }

        public Object getUdr() {
            return udr;
        }

        public void setUdr(Object udr) {
            this.udr = udr;
        }

        public Object getCr() {
            return cr;
        }

        public void setCr(Object cr) {
            this.cr = cr;
        }
    }

    public static final class SDKProtoHeader {
        public static SDKProtoHeader newInstance() {
            SDKProtoHeader fragment = new SDKProtoHeader();
            return fragment;
        }

        private String ai="bc5e2f67-86f5-40a9-971a-db8d6c36d760";    //	appid	*
        private long dip=1484454511;    //	deviceIp	config涓嶇敤缁欙紝upload鏃惰祴鍊�?(configserver杩斿洖鐨�?)
        private String sv="5.32";    //	sdk_version	SDK鐨勭増鏈�?*(浜や�?20160510)
        private Object di=null ; // "di": {	}//	devInfo	璁惧淇℃伅

        public String getAi() {
            return ai;
        }

        public void setAi(String ai) {
            this.ai = ai;
        }

        public long getDip() {
            return dip;
        }

        public void setDip(long dip) {
            this.dip = dip;
        }

        public String getSv() {
            return sv;
        }

        public void setSv(String sv) {
            this.sv = sv;
        }

        public Object getDi() {
            return di;
        }

        public void setDi(Object di) {
            this.di = di;
        }
    }

    public static final class ConfigRequest {

        public static ConfigRequest newInstance() {
            ConfigRequest fragment = new ConfigRequest();
            return fragment;
        }


        private boolean r;       	// true,  //retry 鎵嬫�?鏄惁閲嶈瘯config
        private List<Object> dc;    //definedCrashInfos 鑷畾涔夊紓甯�
        private long emt;    		// 1,   //exMonitorTime涓婃閫�鍑猴紙閫�鍑恒�佺疆鍚庡彴銆乧rash锛夌殑鏃堕棿
        private List<Object> ci;  	//[{}], //crashInfos config鍓嶇殑閿欒鏃ュ織淇℃伅
        private Object ds;   		//{},   //DeviceStateInfo 鎵嬫�?鐘舵�佷俊鎭�?
        private Object nsi;      	//:{}    //NetStateInfo:  //鎵嬫�?鎬ц兘淇℃�?
        private String gi;

        public boolean isR() {
            return r;
        }

        public void setR(boolean r) {
            this.r = r;
        }

        public List<Object> getDc() {
            return dc;
        }

        public void setDc(List<Object> dc) {
            this.dc = dc;
        }

        public long getEmt() {
            return emt;
        }

        public void setEmt(long emt) {
            this.emt = emt;
        }

        public List<Object> getCi() {
            return ci;
        }

        public void setCi(List<Object> ci) {
            this.ci = ci;
        }

        public Object getDs() {
            return ds;
        }

        public void setDs(Object ds) {
            this.ds = ds;
        }

        public Object getNsi() {
            return nsi;
        }

        public void setNsi(Object nsi) {
            this.nsi = nsi;
        }


        public String getGi() {
            return gi;
        }

        public void setGi(String gi) {
            this.gi = gi;
        }
    }

    public static final class ConfigResponse {
        public static ConfigResponse newInstance() {
            ConfigResponse fragment = new ConfigResponse();
            return fragment;
        }
        private boolean ndm; //true,		//	needDataMix	鏄惁寮�鍚暟鎹瀺鍚堬紝榛樿涓哄叧锛�20170306
        private boolean not; // true,		//	needOtherThread	鏄惁寮�鍚穿婧冪嚎绋嬮噰闆�20170630
        private int ilt; // 1,		    //	iosLagThreshold	ios鍗￠】鍒ゆ柇闃�鍊硷紝榛樿5绉掞�?20161201
        private int nc; // 1,		   //	nextConInterval	涓嬫config鏃堕棿闂撮殧锛堝垎閽燂級锛�20170213
        private List<String> fc; // [  "" ],	//	function	寮�鍚姛鑳芥ā鍧楋紙Net銆丆rash銆乄ebview銆両nteract銆丄NR銆丩ag銆丄ctivity鍜孉ction锛�
        private List<Integer> rcy; // [1],    //	[default=60] recovery_cycle	鏁版嵁鍥炰紶鍛ㄦ湡鍗曚綅绉�
        private String ra; // "",		  //	resultAddress	resultAddr鍥炰紶娴嬭瘯鏁版嵁鍦板潃
        private String dk; // "",		  //	devicekey	鏈嶅姟鍣ㄥ垎閰嶇粰�?�㈡埛绔殑devicekey
        private String gia;  // "",		//	getIpAddress	鑾峰彇�?�㈡埛绔痠p鍦板�?
        private String pa;  //"",		  //	pingAddress	瀹㈡埛绔痶cping鐢ㄧ殑Address
        private int ess; // 1,		  //	errorStreamSize	宕╂簝杞ㄨ抗鐨勯檺鍒�?&骞冲畨浜屾湡
        private int it; // 1,		  //	interactThreshold	浜や簰鍒ゆ柇闃�鍊硷紝榛樿300ms锛�20161201
        private int rc; // 1,		  //	responseCode	鍝嶅簲鐮�? 澶辫触閲嶈瘯...
        private int di; //1,		  //	deviceIp	鏈嶅姟鍣ㄥ洖浼犵殑�?�㈡埛绔痙eviceIp
        private String si; //"",		  //	statmainid	鏁版嵁鍞竴鏍囪瘑绗�?
        private boolean nt; //true,		//	needTrace	鏄惁闇�瑕佹姄鍙栨暟鎹�?
        private int ckt; //1,		  //	crashKeepTime	crash淇濆瓨鏈夋晥鏃堕暱锛堝皬鏃讹�?20170630
        private int ds; // 1,	  	//	dataSize	鏁版嵁�?�樺偍闄愬埗锛圡B锛�20170630
        private int mt; //1		    //	monitorTime	鐩戞祴鏃堕棿锛屾湇鍔″綋鍓嶆椂闂达紝涓轰簡鐭鎵嬫�?鏈湴鏃堕棿锛屼笌server鍚屾锛屼负绮剧‘鏈�濂借兘鑰冭檻app鍚姩鍒癱onfig瀹屾垚涔嬮棿鎵�鑰楃殑鏃堕棿
        private int lth;   // 1,  // 鍗￠】鍒ゆ柇闃�鍊硷紝ios榛樿�?5绉�(鏂扮増鏈�?彂甯冨悗锛屽簾寮冩帀iosLagThreshold),android榛樿�?40(娴佺晠搴�?)锛�20171121
        private int hlt;   // : 1,  // H5椤甸潰鍔犺浇鏃堕棿锛岄粯璁�5S锛�20171121
        private int hfp;   // : 1.0,// h5 firstPaintTimeUs h5鐧藉睆鏃堕棿闃�鍊�,娴偣鍨�?
        private int rol;   // : 1,  // 璁剧疆鍚姩姒傜巼锛圔绔欓渶姹傦�?20171109
        private int rolt;   // : 1  // rateOfLaunch淇濆瓨鏈夋晥鏃堕暱锛堝垎閽燂�?20180226
        private boolean iosl;  // : false,// isOpenSystemLog, false:不开启,true:开启(默认不开启) - 5.3版本增加（山西证券）20180907
        private String gi ;		// : "",     //grayId:灰度标识
        private int ats; 	//  : 1      //activityTrackSize：视图轨迹限制 (默认0:关闭;返回null时客户端默认设置0；太平洋定制)

        public void setAts(int ats) {
            this.ats = ats;
        }
        public void setGi(String gi) {
            this.gi = gi;
        }
        public void setIosl(boolean iosl) {
            this.iosl = iosl;
        }

        public boolean isNdm() {
            return ndm;
        }

        public void setNdm(boolean ndm) {
            this.ndm = ndm;
        }

        public boolean isNot() {
            return not;
        }

        public void setNot(boolean not) {
            this.not = not;
        }

        public int getIlt() {
            return ilt;
        }

        public void setIlt(int ilt) {
            this.ilt = ilt;
        }

        public int getNc() {
            return nc;
        }

        public void setNc(int nc) {
            this.nc = nc;
        }

        public List<String> getFc() {
            return fc;
        }

        public void setFc(List<String> fc) {
            this.fc = fc;
        }

        public List<Integer> getRcy() {
            return rcy;
        }

        public void setRcy(List<Integer> rcy) {
            this.rcy = rcy;
        }

        public String getRa() {
            return ra;
        }

        public void setRa(String ra) {
            this.ra = ra;
        }

        public String getDk() {
            return dk;
        }

        public void setDk(String dk) {
            this.dk = dk;
        }

        public String getGia() {
            return gia;
        }

        public void setGia(String gia) {
            this.gia = gia;
        }

        public String getPa() {
            return pa;
        }

        public void setPa(String pa) {
            this.pa = pa;
        }

        public int getEss() {
            return ess;
        }

        public void setEss(int ess) {
            this.ess = ess;
        }

        public int getIt() {
            return it;
        }

        public void setIt(int it) {
            this.it = it;
        }

        public int getRc() {
            return rc;
        }

        public void setRc(int rc) {
            this.rc = rc;
        }

        public int getDi() {
            return di;
        }

        public void setDi(int di) {
            this.di = di;
        }

        public String getSi() {
            return si;
        }

        public void setSi(String si) {
            this.si = si;
        }

        public boolean isNt() {
            return nt;
        }

        public void setNt(boolean nt) {
            this.nt = nt;
        }

        public int getCkt() {
            return ckt;
        }

        public void setCkt(int ckt) {
            this.ckt = ckt;
        }

        public int getDs() {
            return ds;
        }

        public void setDs(int ds) {
            this.ds = ds;
        }

        public int getMt() {
            return mt;
        }

        public void setMt(int mt) {
            this.mt = mt;
        }

        public int getLth() {
            return lth;
        }

        public void setLth(int lth) {
            this.lth = lth;
        }

        public int getHlt() {
            return hlt;
        }

        public void setHlt(int hlt) {
            this.hlt = hlt;
        }

        public int getHfp() {
            return hfp;
        }

        public void setHfp(int hfp) {
            this.hfp = hfp;
        }

        public int getRol() {
            return rol;
        }

        public void setRol(int rol) {
            this.rol = rol;
        }


        public int getRolt() {
            return rolt;
        }

        public void setRolt(int rolt) {
            this.rolt = rolt;
        }

    }

    public static final class UploadDataRequest     //upload请求
    {


        public static UploadDataRequest newInstance() {
            UploadDataRequest fragment = new UploadDataRequest();
            return fragment;
        }

        private Object tu;  // {}, //TrafficUsage每次回传周期内流量使�?(B)
        private List<Object> d ;  //[{}],//UploadData 上传样本�?, 可能存在�?次上传多个样�?
        private boolean iat;   // true//isActionTrace 是否包含行为数据

        public Object getTu() {
            return tu;
        }

        public void setTu(Object tu) {
            this.tu = tu;
        }


        public List<Object> getD(){
            return d;
        }

        public void createD(){
            this.d = new ArrayList<Object>();
        }

        public void addD(Object d) {
            this.d.add(d);
        }

        public boolean isIat() {
            return iat;
        }

        public void setIat(boolean iat) {
            this.iat = iat;
        }
    }
    public static final class UploadData
    {
        private UUID uuid = UUID.randomUUID();
        public static UploadData newInstance() {
            UploadData fragment = new UploadData();
            return fragment;
        }

        private long cmt=1574205493;   // conMonitorTime	ConfigResponse收到的monitorTime()
        private List<Object> ar ;  // activityResults	视图数据~~
        private List<Object> wc ;  //[{}], // webviewCrash	js错误&平安二期(和WebviewInfo里的�?样；这个要择期废弃！)
        private List<Object[]> wr;  //[[]], // webviewResult	js请求详情&平安二期(这个要择期废弃！)
        private List<Object[]> wi;  // [[]], // WebviewInfo: 5.7增加的新webview协议
        private List<Object[]> we ; // [[]], // WebviewError�? 5.7增加的新webview协议
        private List<Object> dci; //[{}],	// definedCrashInfos	自定义异�?20170717
        private List<Object> i; //[{}],		//	// interact	交互数据(交互)
        private List<Object> dl; //[{}],  //	definedLogs	自定义信�?20170718
        private List<Object[]> nr; //[[]], netResults	网络数据
        private List<Object> s; //[{}],		// sessions	自定义事�?()
        private List<Object> il; //[{}],	// iosLag	ios卡顿信息
        private String si="4:2:"+uuid.toString(); //"",	// statmainid	statmainid数据唯一标识�?
        // private Object ci;   //{},	// crashInfos	错误日志信息   ---5.9.2废弃
        private List<Object> aar; // [{}],// actionActivityResult	自定义视�?()
        private long mt;  //1	// monitorTime	monitorTime监测时间,这个时间应该取ConfigResponse.monitorTime+app已启动时�?
        private List<Object> ti; // ThirdInfo  5.8新增用户自定义的业务处理 20180926

        private List<Object>  l; 			// : [{}],  // Lag：卡顿信息（5.9.1新增）
        private List<Object[]> ut; 	// : [[]], // UserTrack：视图轨迹（太平洋定制）
        private long amt=1574205493;   		//: 1,    // agentMonitorTime：客户端监测时间;时间戳;（5.9.2新增）
        private List<Object> car; 		//:[{}],  // CustomActivityResult：自定义视图信息（5.9.2新增）
        private Object nsi;  		//:{}     // NetStateInfo 网络状态（5.9.2新增）


        public void setAmt(long amt) {
            this.amt = amt;
        }
        public long getAmt() {
            return amt;
        }

        public void createUt() {
            ut = new ArrayList<Object[]>();
            Object[] ut_header = {
                    "st",  //stayingTime：访问时长，long类型，单位微秒；如果有activity name 又有 fragment name，staying time就是fragment的访问时长；如果有activity name 没有fragment name ，staying time就是activity的访问时长
                    "an",  //activityName：Activity名称
                    "fn",  //fragmentName：Fragment名称
                    "m"
            };
            ut.add(ut_header);
        }
        public void addUt(Object[] single_ut) {
            ut.add(single_ut);
        }
        public void setUt(List<Object[]> ut) {
            this.ut = ut;
        }
        public void createCar() {
            List<Object> arr_car = new ArrayList<Object>();
            this.car = arr_car;
        }
        public void addCar(Object s_car) {
            this.car.add(s_car);
        }
        public List<Object> getCar() {
            return car;
        }
        public void setCar(List<Object> car) {
            this.car = car;
        }
        public void setNsi(Object nsi) {
            this.nsi = nsi;
        }
        public void setL(List<Object>  l) {
            this.l =l;
        }
        public void createL() {
            List<Object> arr_l = new ArrayList<Object>();
            this.l = arr_l;
        }
        public void addL(Object lag) {
            this.l.add(lag);
        }
        public List<Object> getL(){
            return this.l;
        }


        public long getCmt() {
            return cmt;
        }
        public void setCmt(long cmt) {
            this.cmt = cmt;
        }

        public void createWc(){
            this.wc = new ArrayList<Object>();
        }
        public List<Object> getWc() {
            return wc;
        }
        public void addWc(Object webviewCrash) {
            wc.add(webviewCrash);
        }
        public void setWc(List<Object> wc) {
            this.wc = wc;
        }

        public void createAr(){
            ar = new ArrayList<Object>();
        }
        public void addAr(Object activityResult) {
            ar.add(activityResult);
        }
        public List<Object> getAr() {
            return ar;
        }
        public void setAr(List<Object> ar) {
            this.ar = ar;
        }

        public void createWr() {
            wr = new ArrayList<Object[]>();
            Object[] wr_header = {
                    "st", // startTimeUs js璇锋眰璧峰鏃堕�?;
                    "et", // endTimeUs js璇锋眰缁撴潫鏃堕�?;
                    "ru", // requestUrl璇锋眰鍦板潃;
                    "wn", // webviewName webview鍚嶇О;
                    "fp", // firstPaintTimeUs鐧藉睆鏃堕棿;
                    "ut", // unloadTimeUs unload鏃堕�?;
                    "rt", // redirectTimeUs閲嶅畾鍚戞椂闂�;
                    "ct", // cacheTimeUs cache鏃堕�?;
                    "dt", // dnsTimeUs dns鏌ヨ鏃堕棿;
                    "cti", // connectTimeUs tcp寤鸿繛鏃堕棿;
                    "rti", // requestTimeUs璇锋眰鏃堕棿;
                    "rtim",// responseTimeUs鍝嶅簲鏃堕棿;
                    "dti", // domLoadTimeUs load dom鏃堕�?;
                    "brt", // browserRenderTimeUs椤甸潰娓叉煋鏃堕�?;
                    "rds", // responseDataSize鍝嶅簲鏁版嵁澶у皬;
                    "cc", // crashCount鍙戠敓js閿欒娆℃暟;
                    "we", // WebviewElements;
                    "sti" // ssltimeUs;
            };
            wr.add(wr_header);
        }
        public void addWr(Object[] webviewResult){
            wr.add(webviewResult);
        }
        public List<Object[]> getWr() {
            return wr;
        }
        public void setWr(List<Object[]> wr) {
            this.wr = wr;
        }

        public void createWi() {
            wi = new ArrayList<Object[]>();
            Object[] wi_header = {
                    "pvid", //椤甸潰id
                    "url",  //requestUrl璇锋眰鍦板潃;
                    "wn",   //webviewName webview鍚嶇О;
                    "wpt",  //WebviewPerformanceTiming;
                    "wr",   //WebviewResource;
                    "we",   //WebviewError锛堝祵濂�?湪WebviewInfo閲岄潰浣跨敤鏃讹紝pvid鍜寀rl鐢╓ebviewInfo閲岄潰鐨勶級
                    "jen" ,  //js error number
                    "mi"   //memberId会员ID
            };
            wi.add(wi_header);
        }

        public List<Object[]> getWi() {
            return wi;
        }

        public void addWi(Object[] wi) {
            this.wi.add(wi);
        }
        public void setWi(List<Object[]> wi) {
            this.wi = wi;
        }

        public void createWe() {
            we = new ArrayList<Object[]>();
            Object[] we_header = {
                    "pvid", //WebviewError鍗曠嫭涓婃姤鏃舵湁鍊�?
                    "url",  //WebviewError鍗曠嫭涓婃姤鏃舵湁鍊�?
                    "errorName", //
                    "errorMessage", //
                    "errorLine", //
                    "errorColumn", //
                    "fileName", //
                    "errorNumber", //
                    "stack", //
                    "flag", //(鏍囪瘑锛屾殏鏃犲疄闄呯敤閫�)
                    "errorTime"//閿欒鍙戠敓鏃堕�?
            };
            we.add(we_header);
        }
        public void addWe(Object[] WebviewInfo){
            we.add(WebviewInfo);
        }
        public List<Object[]> getWe() {
            return we;
        }
        public void setWe(List<Object[]> we) {
            this.we = we;
        }

        public void createDci(){
            this.dci = new ArrayList<Object>();
        }
        public void addDci(Object definedCrashInfo){
            dci.add(definedCrashInfo);
        }
        public List<Object> getDci() {
            return dci;
        }
        public void setDci(List<Object> dci) {
            this.dci = dci;
        }

        public void createI(){
            this.i = new ArrayList<Object>();
        }
        public void addI(Object interact){
            this.i.add(interact);
        }
        public List<Object> getI() {
            return i;
        }
        public void setI(List<Object> i) {
            this.i = i;
        }


        public void createIl() {
            this.il = new ArrayList<Object>();
        }
        public void addIl(Object ioslag) {
            il.add(ioslag);
        }
        //自定义信息
        public void createDl(){
            this.dl = new ArrayList<Object>();
        }
        public void addDl(Object definedLog){
            dl.add(definedLog);
        }
        public List<Object> getDl() {
            return dl;
        }
        public void setDl(List<Object> dl) {
            this.dl = dl;
        }


        public void createNr(){
            this.nr = new ArrayList<Object[]>();
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
                    "se",  //20 subErrorId子错误码(B站需求：652原始错误码上�?)
                    "ib",  //21 isBackground是否后台发生
                    "mt",  //22 mimetype
                    "dsi", //23 dnsServerIp手机localDNS(5.9废弃)
                    "rg",  //24 requestGuid(端到端打通功�?)
                    "rgu", //25 responseGuid(端到端打通功�?)
                    "iw",  //26 isWebview是否Webview
                    "lc",  //27 lastCname
                    "am",  //28 AccessMode接入方式 wap/net/wifi(5.9废弃)
                    "s",   //29 signal信号�?
                    "nt",  //30 netType网络类型�?5.9废弃�?
                    "mi",  //31 memberId会员ID
                    "kv",  //32 kv键�?�对
                    "pt",  //33 protocolType协议类型(1:h1,2:h1s,3:h2,4:h2s,5:ws,6:wss,7:socket)
                    "cna", //34 cnameArray：cname字符串数�?
                    "tip", //35 targetIp：目标IP；会上报IPV4或�?�IPV6；String(5.9新增)
                    "dsip",//36 dnsServerIp：手机localDNS；会上报IPV4或�?�IPV；String(5.9新增)
                    "ns"   //37 networkStandard：网络制式；String；后台做2g 3g 4g的对应转�?(5.9新增)
            };
            //注意，由于这里用的是数组的方式来�? netresult赋�?�，对于废弃的字段，还是给要默认�? 0 或�?? “�?? 上报数据，不然后台ETL会不兼容数据处理�?   header的字段可以随意改动，只要对应的�?? 对上就可以，如果string类型不小心对上了int，数据就会整条被丢掉
            nr.add(nr_header);
        }
        public void addNr(Object[] netresult){
            this.nr.add(netresult);
        }
        public List<Object[]> getNr() {
            return nr;
        }
        public void setNr(List<Object[]> nr) {
            this.nr = nr;
        }

        public void createS(){
            this.s = new ArrayList<Object>();
        }
        public void addS(Object session){
            this.s.add(session);
        }
        public List<Object> getS() {
            return s;
        }
        public void setS(List<Object> s) {
            this.s = s;
        }

        public List<Object> getIl() {
            return il;
        }
        public void setIl(List<Object> il) {
            this.il = il;
        }


        public String getSi() {
            return si;
        }
        public void setSi(String si) {
            this.si = si;
        }

//        public Object getCi() {
//            return ci;
//        }
//        public void setCi(Object ci) {
//            this.ci = ci;
//        }

        public void createAar(){
            this.aar = new ArrayList<Object>();
        }
        public void addAar(Object actionActivityResult){
            this.aar.add(actionActivityResult);
        }
        public List<Object> getAar() {
            return aar;
        }
        public void setAar(List<Object> aar) {
            this.aar = aar;
        }

        public long getMt() {
            return mt;
        }
        public void setMt(long mt) {
            this.mt = mt;
        }

        public void setTi(List<Object> ti) {
            this.ti = ti;
        }

        public List<Object> getTi(){
            return ti;
        }
    }
    public static final class UploadDataResponse    //upload数据响应
    {
        private String rc;    //	responseCode
        private boolean nt;    //	needTrace

        public static UploadDataResponse newInstance() {
            UploadDataResponse fragment = new UploadDataResponse();
            return fragment;
        }

        public String getRc() {
            return rc;
        }

        public void setRc(String rc) {
            this.rc = rc;
        }

        public boolean isNt() {
            return nt;
        }

        public void setNt(boolean nt) {
            this.nt = nt;
        }
    }

}

