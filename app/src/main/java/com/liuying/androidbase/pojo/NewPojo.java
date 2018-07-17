package com.liuying.androidbase.pojo;

import java.util.List;

/**
 * Created by liuying on 2018/7/17 14:24.
 * Email: ly1203575492@163.com
 */
public class NewPojo {


  private int code;
  private String msg;
  private DataBean data;

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public DataBean getData() {
    return data;
  }

  public void setData(DataBean data) {
    this.data = data;
  }

  public static class DataBean {
    private List<TechBean> tech;
    private List<AutoBean> auto;
    private List<MoneyBean> money;
    private List<SportsBean> sports;
    private List<DyBean> dy;
    private List<WarBean> war;
    private List<EntBean> ent;
    private List<ToutiaoBean> toutiao;

    public List<TechBean> getTech() {
      return tech;
    }

    public void setTech(List<TechBean> tech) {
      this.tech = tech;
    }

    public List<AutoBean> getAuto() {
      return auto;
    }

    public void setAuto(List<AutoBean> auto) {
      this.auto = auto;
    }

    public List<MoneyBean> getMoney() {
      return money;
    }

    public void setMoney(List<MoneyBean> money) {
      this.money = money;
    }

    public List<SportsBean> getSports() {
      return sports;
    }

    public void setSports(List<SportsBean> sports) {
      this.sports = sports;
    }

    public List<DyBean> getDy() {
      return dy;
    }

    public void setDy(List<DyBean> dy) {
      this.dy = dy;
    }

    public List<WarBean> getWar() {
      return war;
    }

    public void setWar(List<WarBean> war) {
      this.war = war;
    }

    public List<EntBean> getEnt() {
      return ent;
    }

    public void setEnt(List<EntBean> ent) {
      this.ent = ent;
    }

    public List<ToutiaoBean> getToutiao() {
      return toutiao;
    }

    public void setToutiao(List<ToutiaoBean> toutiao) {
      this.toutiao = toutiao;
    }

    public static class TechBean {
      /**
       * liveInfo : null
       * tcount : 867
       * picInfo : [{"ref":null,"width":null,"url":"http://cms-bucket.nosdn.127.net/2018/07/17/c6e6f780f76e4c6a9c5ddbfd162bbf02.png","height":null}]
       * docid : DMTFN04V00097U7R
       * videoInfo : null
       * channel : tech
       * link : https://3g.163.com/all/special/S1489643035418.html
       * source : 网易科技报道
       * title : 谷歌面临欧盟巨额罚款，安卓会变得更开放吗？
       * type : special
       * imgsrcFrom : null
       * imgsrc3gtype : 1
       * unlikeReason : 重复、旧闻/6,内容质量差/6
       * digest : 网易科技讯7月17日消息，谷歌对于欧盟的监管并不陌生，但是这
       * typeid : S1489643035418
       * addata : null
       * tag : 专题
       * category : 科技
       * ptime : 2018-07-17 08:47:59
       */

      private Object liveInfo;
      private int tcount;
      private String docid;
      private Object videoInfo;
      private String channel;
      private String link;
      private String source;
      private String title;
      private String type;
      private Object imgsrcFrom;
      private int imgsrc3gtype;
      private String unlikeReason;
      private String digest;
      private String typeid;
      private Object addata;
      private String tag;
      private String category;
      private String ptime;
      private List<PicInfoBean> picInfo;

      public Object getLiveInfo() {
        return liveInfo;
      }

      public void setLiveInfo(Object liveInfo) {
        this.liveInfo = liveInfo;
      }

      public int getTcount() {
        return tcount;
      }

      public void setTcount(int tcount) {
        this.tcount = tcount;
      }

      public String getDocid() {
        return docid;
      }

      public void setDocid(String docid) {
        this.docid = docid;
      }

      public Object getVideoInfo() {
        return videoInfo;
      }

      public void setVideoInfo(Object videoInfo) {
        this.videoInfo = videoInfo;
      }

      public String getChannel() {
        return channel;
      }

      public void setChannel(String channel) {
        this.channel = channel;
      }

      public String getLink() {
        return link;
      }

      public void setLink(String link) {
        this.link = link;
      }

      public String getSource() {
        return source;
      }

      public void setSource(String source) {
        this.source = source;
      }

      public String getTitle() {
        return title;
      }

      public void setTitle(String title) {
        this.title = title;
      }

      public String getType() {
        return type;
      }

      public void setType(String type) {
        this.type = type;
      }

      public Object getImgsrcFrom() {
        return imgsrcFrom;
      }

      public void setImgsrcFrom(Object imgsrcFrom) {
        this.imgsrcFrom = imgsrcFrom;
      }

      public int getImgsrc3gtype() {
        return imgsrc3gtype;
      }

      public void setImgsrc3gtype(int imgsrc3gtype) {
        this.imgsrc3gtype = imgsrc3gtype;
      }

      public String getUnlikeReason() {
        return unlikeReason;
      }

      public void setUnlikeReason(String unlikeReason) {
        this.unlikeReason = unlikeReason;
      }

      public String getDigest() {
        return digest;
      }

      public void setDigest(String digest) {
        this.digest = digest;
      }

      public String getTypeid() {
        return typeid;
      }

      public void setTypeid(String typeid) {
        this.typeid = typeid;
      }

      public Object getAddata() {
        return addata;
      }

      public void setAddata(Object addata) {
        this.addata = addata;
      }

      public String getTag() {
        return tag;
      }

      public void setTag(String tag) {
        this.tag = tag;
      }

      public String getCategory() {
        return category;
      }

      public void setCategory(String category) {
        this.category = category;
      }

      public String getPtime() {
        return ptime;
      }

      public void setPtime(String ptime) {
        this.ptime = ptime;
      }

      public List<PicInfoBean> getPicInfo() {
        return picInfo;
      }

      public void setPicInfo(List<PicInfoBean> picInfo) {
        this.picInfo = picInfo;
      }

      public static class PicInfoBean {
        /**
         * ref : null
         * width : null
         * url : http://cms-bucket.nosdn.127.net/2018/07/17/c6e6f780f76e4c6a9c5ddbfd162bbf02.png
         * height : null
         */

        private Object ref;
        private Object width;
        private String url;
        private Object height;

        public Object getRef() {
          return ref;
        }

        public void setRef(Object ref) {
          this.ref = ref;
        }

        public Object getWidth() {
          return width;
        }

        public void setWidth(Object width) {
          this.width = width;
        }

        public String getUrl() {
          return url;
        }

        public void setUrl(String url) {
          this.url = url;
        }

        public Object getHeight() {
          return height;
        }

        public void setHeight(Object height) {
          this.height = height;
        }
      }
    }

    public static class AutoBean {
      /**
       * liveInfo : null
       * tcount : 1162
       * picInfo : [{"ref":null,"width":null,"url":"http://cms-bucket.nosdn.127.net/2018/07/17/3e5317c159614260822fe548340d94fc.jpeg","height":null}]
       * docid : DMTMOK1O0008856R
       * videoInfo : null
       * channel : auto
       * link : https://3g.163.com/all/article/DMTMOK1O0008856R.html
       * source : 网易汽车
       * title : 全新中型SUV 一汽-大众版途观L也要来了
       * type : doc
       * imgsrcFrom : null
       * imgsrc3gtype : 1
       * unlikeReason : 重复、旧闻/6,内容质量差/6
       * digest : 新车目前尚未正式公布官方中英文名，此前公开亮相时用The A
       * typeid :
       * addata : null
       * tag :
       * category : 汽车
       * ptime : 2018-07-17 10:51:13
       */

      private Object liveInfo;
      private int tcount;
      private String docid;
      private Object videoInfo;
      private String channel;
      private String link;
      private String source;
      private String title;
      private String type;
      private Object imgsrcFrom;
      private int imgsrc3gtype;
      private String unlikeReason;
      private String digest;
      private String typeid;
      private Object addata;
      private String tag;
      private String category;
      private String ptime;
      private List<PicInfoBeanX> picInfo;

      public Object getLiveInfo() {
        return liveInfo;
      }

      public void setLiveInfo(Object liveInfo) {
        this.liveInfo = liveInfo;
      }

      public int getTcount() {
        return tcount;
      }

      public void setTcount(int tcount) {
        this.tcount = tcount;
      }

      public String getDocid() {
        return docid;
      }

      public void setDocid(String docid) {
        this.docid = docid;
      }

      public Object getVideoInfo() {
        return videoInfo;
      }

      public void setVideoInfo(Object videoInfo) {
        this.videoInfo = videoInfo;
      }

      public String getChannel() {
        return channel;
      }

      public void setChannel(String channel) {
        this.channel = channel;
      }

      public String getLink() {
        return link;
      }

      public void setLink(String link) {
        this.link = link;
      }

      public String getSource() {
        return source;
      }

      public void setSource(String source) {
        this.source = source;
      }

      public String getTitle() {
        return title;
      }

      public void setTitle(String title) {
        this.title = title;
      }

      public String getType() {
        return type;
      }

      public void setType(String type) {
        this.type = type;
      }

      public Object getImgsrcFrom() {
        return imgsrcFrom;
      }

      public void setImgsrcFrom(Object imgsrcFrom) {
        this.imgsrcFrom = imgsrcFrom;
      }

      public int getImgsrc3gtype() {
        return imgsrc3gtype;
      }

      public void setImgsrc3gtype(int imgsrc3gtype) {
        this.imgsrc3gtype = imgsrc3gtype;
      }

      public String getUnlikeReason() {
        return unlikeReason;
      }

      public void setUnlikeReason(String unlikeReason) {
        this.unlikeReason = unlikeReason;
      }

      public String getDigest() {
        return digest;
      }

      public void setDigest(String digest) {
        this.digest = digest;
      }

      public String getTypeid() {
        return typeid;
      }

      public void setTypeid(String typeid) {
        this.typeid = typeid;
      }

      public Object getAddata() {
        return addata;
      }

      public void setAddata(Object addata) {
        this.addata = addata;
      }

      public String getTag() {
        return tag;
      }

      public void setTag(String tag) {
        this.tag = tag;
      }

      public String getCategory() {
        return category;
      }

      public void setCategory(String category) {
        this.category = category;
      }

      public String getPtime() {
        return ptime;
      }

      public void setPtime(String ptime) {
        this.ptime = ptime;
      }

      public List<PicInfoBeanX> getPicInfo() {
        return picInfo;
      }

      public void setPicInfo(List<PicInfoBeanX> picInfo) {
        this.picInfo = picInfo;
      }

      public static class PicInfoBeanX {
        /**
         * ref : null
         * width : null
         * url : http://cms-bucket.nosdn.127.net/2018/07/17/3e5317c159614260822fe548340d94fc.jpeg
         * height : null
         */

        private Object ref;
        private Object width;
        private String url;
        private Object height;

        public Object getRef() {
          return ref;
        }

        public void setRef(Object ref) {
          this.ref = ref;
        }

        public Object getWidth() {
          return width;
        }

        public void setWidth(Object width) {
          this.width = width;
        }

        public String getUrl() {
          return url;
        }

        public void setUrl(String url) {
          this.url = url;
        }

        public Object getHeight() {
          return height;
        }

        public void setHeight(Object height) {
          this.height = height;
        }
      }
    }

    public static class MoneyBean {
      /**
       * liveInfo : null
       * tcount : 877
       * picInfo : [{"ref":null,"width":null,"url":"http://cms-bucket.nosdn.127.net/2018/07/17/ec88c17077eb4047844308e4ce66751a.jpeg","height":null}]
       * docid : DMTB3KUB002581PP
       * videoInfo : null
       * channel : money
       * link : https://3g.163.com/all/article/DMTB3KUB002581PP.html
       * source : 第一财经日报
       * title : 房地产税有望加快推出 统计局罕见表态
       * type : doc
       * imgsrcFrom : null
       * imgsrc3gtype : 1
       * unlikeReason : 重复、旧闻/6,内容质量差/6
       * digest : 正在起草完善方案过程中的房地产税有望加快推出。7月16日，在
       * typeid :
       * addata : null
       * tag :
       * category : 财经
       * ptime : 2018-07-17 07:27:31
       */

      private Object liveInfo;
      private int tcount;
      private String docid;
      private Object videoInfo;
      private String channel;
      private String link;
      private String source;
      private String title;
      private String type;
      private Object imgsrcFrom;
      private int imgsrc3gtype;
      private String unlikeReason;
      private String digest;
      private String typeid;
      private Object addata;
      private String tag;
      private String category;
      private String ptime;
      private List<PicInfoBeanXX> picInfo;

      public Object getLiveInfo() {
        return liveInfo;
      }

      public void setLiveInfo(Object liveInfo) {
        this.liveInfo = liveInfo;
      }

      public int getTcount() {
        return tcount;
      }

      public void setTcount(int tcount) {
        this.tcount = tcount;
      }

      public String getDocid() {
        return docid;
      }

      public void setDocid(String docid) {
        this.docid = docid;
      }

      public Object getVideoInfo() {
        return videoInfo;
      }

      public void setVideoInfo(Object videoInfo) {
        this.videoInfo = videoInfo;
      }

      public String getChannel() {
        return channel;
      }

      public void setChannel(String channel) {
        this.channel = channel;
      }

      public String getLink() {
        return link;
      }

      public void setLink(String link) {
        this.link = link;
      }

      public String getSource() {
        return source;
      }

      public void setSource(String source) {
        this.source = source;
      }

      public String getTitle() {
        return title;
      }

      public void setTitle(String title) {
        this.title = title;
      }

      public String getType() {
        return type;
      }

      public void setType(String type) {
        this.type = type;
      }

      public Object getImgsrcFrom() {
        return imgsrcFrom;
      }

      public void setImgsrcFrom(Object imgsrcFrom) {
        this.imgsrcFrom = imgsrcFrom;
      }

      public int getImgsrc3gtype() {
        return imgsrc3gtype;
      }

      public void setImgsrc3gtype(int imgsrc3gtype) {
        this.imgsrc3gtype = imgsrc3gtype;
      }

      public String getUnlikeReason() {
        return unlikeReason;
      }

      public void setUnlikeReason(String unlikeReason) {
        this.unlikeReason = unlikeReason;
      }

      public String getDigest() {
        return digest;
      }

      public void setDigest(String digest) {
        this.digest = digest;
      }

      public String getTypeid() {
        return typeid;
      }

      public void setTypeid(String typeid) {
        this.typeid = typeid;
      }

      public Object getAddata() {
        return addata;
      }

      public void setAddata(Object addata) {
        this.addata = addata;
      }

      public String getTag() {
        return tag;
      }

      public void setTag(String tag) {
        this.tag = tag;
      }

      public String getCategory() {
        return category;
      }

      public void setCategory(String category) {
        this.category = category;
      }

      public String getPtime() {
        return ptime;
      }

      public void setPtime(String ptime) {
        this.ptime = ptime;
      }

      public List<PicInfoBeanXX> getPicInfo() {
        return picInfo;
      }

      public void setPicInfo(List<PicInfoBeanXX> picInfo) {
        this.picInfo = picInfo;
      }

      public static class PicInfoBeanXX {
        /**
         * ref : null
         * width : null
         * url : http://cms-bucket.nosdn.127.net/2018/07/17/ec88c17077eb4047844308e4ce66751a.jpeg
         * height : null
         */

        private Object ref;
        private Object width;
        private String url;
        private Object height;

        public Object getRef() {
          return ref;
        }

        public void setRef(Object ref) {
          this.ref = ref;
        }

        public Object getWidth() {
          return width;
        }

        public void setWidth(Object width) {
          this.width = width;
        }

        public String getUrl() {
          return url;
        }

        public void setUrl(String url) {
          this.url = url;
        }

        public Object getHeight() {
          return height;
        }

        public void setHeight(Object height) {
          this.height = height;
        }
      }
    }

    public static class SportsBean {
      /**
       * liveInfo : null
       * tcount : 9198
       * picInfo : [{"ref":null,"width":null,"url":"http://cms-bucket.nosdn.127.net/2018/07/17/cac8521a127545caae39c526eb607e02.jpeg","height":null},{"ref":null,"width":null,"url":"http://cms-bucket.nosdn.127.net/2018/07/17/a189eb76211d447db6ba264401bea224.jpeg","height":null},{"ref":null,"width":null,"url":"http://cms-bucket.nosdn.127.net/2018/07/17/687bc17e9f38475a8cf331461c685994.jpeg","height":null}]
       * docid : DMTD9PP8zhangqiong1
       * videoInfo : null
       * channel : sports
       * link : https://3g.163.com/all/photoview/0005/163113.html
       * source : 视觉中国
       * title : 法国总统接见夺冠将士 男模团上线
       * type : photoset
       * imgsrcFrom : null
       * imgsrc3gtype : 2
       * unlikeReason : 重复、旧闻/6,内容质量差/6
       * digest :
       * typeid : LG3E0005|163113
       * addata : null
       * tag : 图集
       * category : 推荐
       * ptime : 2018-07-17 08:05:50
       */

      private Object liveInfo;
      private int tcount;
      private String docid;
      private Object videoInfo;
      private String channel;
      private String link;
      private String source;
      private String title;
      private String type;
      private Object imgsrcFrom;
      private int imgsrc3gtype;
      private String unlikeReason;
      private String digest;
      private String typeid;
      private Object addata;
      private String tag;
      private String category;
      private String ptime;
      private List<PicInfoBeanXXX> picInfo;

      public Object getLiveInfo() {
        return liveInfo;
      }

      public void setLiveInfo(Object liveInfo) {
        this.liveInfo = liveInfo;
      }

      public int getTcount() {
        return tcount;
      }

      public void setTcount(int tcount) {
        this.tcount = tcount;
      }

      public String getDocid() {
        return docid;
      }

      public void setDocid(String docid) {
        this.docid = docid;
      }

      public Object getVideoInfo() {
        return videoInfo;
      }

      public void setVideoInfo(Object videoInfo) {
        this.videoInfo = videoInfo;
      }

      public String getChannel() {
        return channel;
      }

      public void setChannel(String channel) {
        this.channel = channel;
      }

      public String getLink() {
        return link;
      }

      public void setLink(String link) {
        this.link = link;
      }

      public String getSource() {
        return source;
      }

      public void setSource(String source) {
        this.source = source;
      }

      public String getTitle() {
        return title;
      }

      public void setTitle(String title) {
        this.title = title;
      }

      public String getType() {
        return type;
      }

      public void setType(String type) {
        this.type = type;
      }

      public Object getImgsrcFrom() {
        return imgsrcFrom;
      }

      public void setImgsrcFrom(Object imgsrcFrom) {
        this.imgsrcFrom = imgsrcFrom;
      }

      public int getImgsrc3gtype() {
        return imgsrc3gtype;
      }

      public void setImgsrc3gtype(int imgsrc3gtype) {
        this.imgsrc3gtype = imgsrc3gtype;
      }

      public String getUnlikeReason() {
        return unlikeReason;
      }

      public void setUnlikeReason(String unlikeReason) {
        this.unlikeReason = unlikeReason;
      }

      public String getDigest() {
        return digest;
      }

      public void setDigest(String digest) {
        this.digest = digest;
      }

      public String getTypeid() {
        return typeid;
      }

      public void setTypeid(String typeid) {
        this.typeid = typeid;
      }

      public Object getAddata() {
        return addata;
      }

      public void setAddata(Object addata) {
        this.addata = addata;
      }

      public String getTag() {
        return tag;
      }

      public void setTag(String tag) {
        this.tag = tag;
      }

      public String getCategory() {
        return category;
      }

      public void setCategory(String category) {
        this.category = category;
      }

      public String getPtime() {
        return ptime;
      }

      public void setPtime(String ptime) {
        this.ptime = ptime;
      }

      public List<PicInfoBeanXXX> getPicInfo() {
        return picInfo;
      }

      public void setPicInfo(List<PicInfoBeanXXX> picInfo) {
        this.picInfo = picInfo;
      }

      public static class PicInfoBeanXXX {
        /**
         * ref : null
         * width : null
         * url : http://cms-bucket.nosdn.127.net/2018/07/17/cac8521a127545caae39c526eb607e02.jpeg
         * height : null
         */

        private Object ref;
        private Object width;
        private String url;
        private Object height;

        public Object getRef() {
          return ref;
        }

        public void setRef(Object ref) {
          this.ref = ref;
        }

        public Object getWidth() {
          return width;
        }

        public void setWidth(Object width) {
          this.width = width;
        }

        public String getUrl() {
          return url;
        }

        public void setUrl(String url) {
          this.url = url;
        }

        public Object getHeight() {
          return height;
        }

        public void setHeight(Object height) {
          this.height = height;
        }
      }
    }

    public static class DyBean {
      /**
       * liveInfo : null
       * tcount : 91
       * picInfo : [{"ref":null,"width":null,"url":"http://dingyue.nosdn.127.net/udC2IK4dK5QBzYCQ7h5BPQBkhbkvbGDV64kHt1k9XsxTn1531767212992.jpeg","height":null},{"ref":null,"width":null,"url":"http://dingyue.nosdn.127.net/ColrTbIPNWb5apiNkHjBqi0WN6MBpjAt6zgj81KkHPyRo1531767220302.jpeg","height":null},{"ref":null,"width":null,"url":"http://dingyue.nosdn.127.net/IJSJoUGHfxBIctmpR7sfD9OvCkvsClnTuoD67t92AvwiB1531767226092.jpeg","height":null}]
       * docid : DMSREV0E0523AEN0
       * videoInfo : null
       * channel : dy
       * link : https://3g.163.com/all/article/DMSREV0E0523AEN0.html
       * source : 冷炮历史
       * title : 铁血宰相俾斯麦：为何反对德国去大力开拓海外的殖民地？
       * type : doc
       * imgsrcFrom : null
       * imgsrc3gtype : 2
       * unlikeReason : 重复、旧闻/6,内容质量差/6
       * digest : 在德意志第二帝国建立的过程中，铁血宰相俾斯麦可谓是居功至伟。
       * typeid :
       * addata : null
       * tag :
       * category : 推荐
       * ptime : 2018-07-17 08:05:01
       */

      private Object liveInfo;
      private int tcount;
      private String docid;
      private Object videoInfo;
      private String channel;
      private String link;
      private String source;
      private String title;
      private String type;
      private Object imgsrcFrom;
      private int imgsrc3gtype;
      private String unlikeReason;
      private String digest;
      private String typeid;
      private Object addata;
      private String tag;
      private String category;
      private String ptime;
      private List<PicInfoBeanXXXX> picInfo;

      public Object getLiveInfo() {
        return liveInfo;
      }

      public void setLiveInfo(Object liveInfo) {
        this.liveInfo = liveInfo;
      }

      public int getTcount() {
        return tcount;
      }

      public void setTcount(int tcount) {
        this.tcount = tcount;
      }

      public String getDocid() {
        return docid;
      }

      public void setDocid(String docid) {
        this.docid = docid;
      }

      public Object getVideoInfo() {
        return videoInfo;
      }

      public void setVideoInfo(Object videoInfo) {
        this.videoInfo = videoInfo;
      }

      public String getChannel() {
        return channel;
      }

      public void setChannel(String channel) {
        this.channel = channel;
      }

      public String getLink() {
        return link;
      }

      public void setLink(String link) {
        this.link = link;
      }

      public String getSource() {
        return source;
      }

      public void setSource(String source) {
        this.source = source;
      }

      public String getTitle() {
        return title;
      }

      public void setTitle(String title) {
        this.title = title;
      }

      public String getType() {
        return type;
      }

      public void setType(String type) {
        this.type = type;
      }

      public Object getImgsrcFrom() {
        return imgsrcFrom;
      }

      public void setImgsrcFrom(Object imgsrcFrom) {
        this.imgsrcFrom = imgsrcFrom;
      }

      public int getImgsrc3gtype() {
        return imgsrc3gtype;
      }

      public void setImgsrc3gtype(int imgsrc3gtype) {
        this.imgsrc3gtype = imgsrc3gtype;
      }

      public String getUnlikeReason() {
        return unlikeReason;
      }

      public void setUnlikeReason(String unlikeReason) {
        this.unlikeReason = unlikeReason;
      }

      public String getDigest() {
        return digest;
      }

      public void setDigest(String digest) {
        this.digest = digest;
      }

      public String getTypeid() {
        return typeid;
      }

      public void setTypeid(String typeid) {
        this.typeid = typeid;
      }

      public Object getAddata() {
        return addata;
      }

      public void setAddata(Object addata) {
        this.addata = addata;
      }

      public String getTag() {
        return tag;
      }

      public void setTag(String tag) {
        this.tag = tag;
      }

      public String getCategory() {
        return category;
      }

      public void setCategory(String category) {
        this.category = category;
      }

      public String getPtime() {
        return ptime;
      }

      public void setPtime(String ptime) {
        this.ptime = ptime;
      }

      public List<PicInfoBeanXXXX> getPicInfo() {
        return picInfo;
      }

      public void setPicInfo(List<PicInfoBeanXXXX> picInfo) {
        this.picInfo = picInfo;
      }

      public static class PicInfoBeanXXXX {
        /**
         * ref : null
         * width : null
         * url : http://dingyue.nosdn.127.net/udC2IK4dK5QBzYCQ7h5BPQBkhbkvbGDV64kHt1k9XsxTn1531767212992.jpeg
         * height : null
         */

        private Object ref;
        private Object width;
        private String url;
        private Object height;

        public Object getRef() {
          return ref;
        }

        public void setRef(Object ref) {
          this.ref = ref;
        }

        public Object getWidth() {
          return width;
        }

        public void setWidth(Object width) {
          this.width = width;
        }

        public String getUrl() {
          return url;
        }

        public void setUrl(String url) {
          this.url = url;
        }

        public Object getHeight() {
          return height;
        }

        public void setHeight(Object height) {
          this.height = height;
        }
      }
    }

    public static class WarBean {
      /**
       * liveInfo : null
       * tcount : 1228
       * picInfo : [{"ref":null,"width":null,"url":"http://cms-bucket.nosdn.127.net/2018/07/17/e7f510bbbecf4c9a8bee5c3f40b5fa7a.jpeg","height":null}]
       * docid : 0001set2295001
       * videoInfo : null
       * channel : war
       * link : https://3g.163.com/all/photoview/0001/2295001.html
       * source : 参考消息网
       * title : 俄50架伊尔76空投战车抗北约
       * type : photoset
       * imgsrcFrom : null
       * imgsrc3gtype : 1
       * unlikeReason : 重复、旧闻/6,内容质量差/6
       * digest :
       * typeid : 4T8E0001|2295001
       * addata : null
       * tag : 图集
       * category : 推荐
       * ptime : 2018-07-17 09:35:06
       */

      private Object liveInfo;
      private int tcount;
      private String docid;
      private Object videoInfo;
      private String channel;
      private String link;
      private String source;
      private String title;
      private String type;
      private Object imgsrcFrom;
      private int imgsrc3gtype;
      private String unlikeReason;
      private String digest;
      private String typeid;
      private Object addata;
      private String tag;
      private String category;
      private String ptime;
      private List<PicInfoBeanXXXXX> picInfo;

      public Object getLiveInfo() {
        return liveInfo;
      }

      public void setLiveInfo(Object liveInfo) {
        this.liveInfo = liveInfo;
      }

      public int getTcount() {
        return tcount;
      }

      public void setTcount(int tcount) {
        this.tcount = tcount;
      }

      public String getDocid() {
        return docid;
      }

      public void setDocid(String docid) {
        this.docid = docid;
      }

      public Object getVideoInfo() {
        return videoInfo;
      }

      public void setVideoInfo(Object videoInfo) {
        this.videoInfo = videoInfo;
      }

      public String getChannel() {
        return channel;
      }

      public void setChannel(String channel) {
        this.channel = channel;
      }

      public String getLink() {
        return link;
      }

      public void setLink(String link) {
        this.link = link;
      }

      public String getSource() {
        return source;
      }

      public void setSource(String source) {
        this.source = source;
      }

      public String getTitle() {
        return title;
      }

      public void setTitle(String title) {
        this.title = title;
      }

      public String getType() {
        return type;
      }

      public void setType(String type) {
        this.type = type;
      }

      public Object getImgsrcFrom() {
        return imgsrcFrom;
      }

      public void setImgsrcFrom(Object imgsrcFrom) {
        this.imgsrcFrom = imgsrcFrom;
      }

      public int getImgsrc3gtype() {
        return imgsrc3gtype;
      }

      public void setImgsrc3gtype(int imgsrc3gtype) {
        this.imgsrc3gtype = imgsrc3gtype;
      }

      public String getUnlikeReason() {
        return unlikeReason;
      }

      public void setUnlikeReason(String unlikeReason) {
        this.unlikeReason = unlikeReason;
      }

      public String getDigest() {
        return digest;
      }

      public void setDigest(String digest) {
        this.digest = digest;
      }

      public String getTypeid() {
        return typeid;
      }

      public void setTypeid(String typeid) {
        this.typeid = typeid;
      }

      public Object getAddata() {
        return addata;
      }

      public void setAddata(Object addata) {
        this.addata = addata;
      }

      public String getTag() {
        return tag;
      }

      public void setTag(String tag) {
        this.tag = tag;
      }

      public String getCategory() {
        return category;
      }

      public void setCategory(String category) {
        this.category = category;
      }

      public String getPtime() {
        return ptime;
      }

      public void setPtime(String ptime) {
        this.ptime = ptime;
      }

      public List<PicInfoBeanXXXXX> getPicInfo() {
        return picInfo;
      }

      public void setPicInfo(List<PicInfoBeanXXXXX> picInfo) {
        this.picInfo = picInfo;
      }

      public static class PicInfoBeanXXXXX {
        /**
         * ref : null
         * width : null
         * url : http://cms-bucket.nosdn.127.net/2018/07/17/e7f510bbbecf4c9a8bee5c3f40b5fa7a.jpeg
         * height : null
         */

        private Object ref;
        private Object width;
        private String url;
        private Object height;

        public Object getRef() {
          return ref;
        }

        public void setRef(Object ref) {
          this.ref = ref;
        }

        public Object getWidth() {
          return width;
        }

        public void setWidth(Object width) {
          this.width = width;
        }

        public String getUrl() {
          return url;
        }

        public void setUrl(String url) {
          this.url = url;
        }

        public Object getHeight() {
          return height;
        }

        public void setHeight(Object height) {
          this.height = height;
        }
      }
    }

    public static class EntBean {
      /**
       * liveInfo : null
       * tcount : 883
       * picInfo : [{"ref":null,"width":null,"url":"http://cms-bucket.nosdn.127.net/2018/07/17/d2e4166b09c74c488ab294112a120c2b.jpeg","height":null},{"ref":null,"width":null,"url":"http://cms-bucket.nosdn.127.net/2018/07/17/f8ffe30fede6401da62ee4e679639a1a.jpeg","height":null},{"ref":null,"width":null,"url":"http://cms-bucket.nosdn.127.net/2018/07/17/47de0dc512d94344ab297acaea0f6080.jpeg","height":null}]
       * docid : 0003set655947
       * videoInfo : null
       * channel : ent
       * link : https://3g.163.com/all/photoview/0003/655947.html
       * source : 视觉中国
       * title : 莫文蔚穿着清凉 热舞秀身材
       * type : photoset
       * imgsrcFrom : null
       * imgsrc3gtype : 2
       * unlikeReason : 重复、旧闻/6,内容质量差/6
       * digest :
       * typeid : 00AJ0003|655947
       * addata : null
       * tag : 图集
       * category : 推荐
       * ptime : 2018-07-17 07:59:19
       */

      private Object liveInfo;
      private int tcount;
      private String docid;
      private Object videoInfo;
      private String channel;
      private String link;
      private String source;
      private String title;
      private String type;
      private Object imgsrcFrom;
      private int imgsrc3gtype;
      private String unlikeReason;
      private String digest;
      private String typeid;
      private Object addata;
      private String tag;
      private String category;
      private String ptime;
      private List<PicInfoBeanXXXXXX> picInfo;

      public Object getLiveInfo() {
        return liveInfo;
      }

      public void setLiveInfo(Object liveInfo) {
        this.liveInfo = liveInfo;
      }

      public int getTcount() {
        return tcount;
      }

      public void setTcount(int tcount) {
        this.tcount = tcount;
      }

      public String getDocid() {
        return docid;
      }

      public void setDocid(String docid) {
        this.docid = docid;
      }

      public Object getVideoInfo() {
        return videoInfo;
      }

      public void setVideoInfo(Object videoInfo) {
        this.videoInfo = videoInfo;
      }

      public String getChannel() {
        return channel;
      }

      public void setChannel(String channel) {
        this.channel = channel;
      }

      public String getLink() {
        return link;
      }

      public void setLink(String link) {
        this.link = link;
      }

      public String getSource() {
        return source;
      }

      public void setSource(String source) {
        this.source = source;
      }

      public String getTitle() {
        return title;
      }

      public void setTitle(String title) {
        this.title = title;
      }

      public String getType() {
        return type;
      }

      public void setType(String type) {
        this.type = type;
      }

      public Object getImgsrcFrom() {
        return imgsrcFrom;
      }

      public void setImgsrcFrom(Object imgsrcFrom) {
        this.imgsrcFrom = imgsrcFrom;
      }

      public int getImgsrc3gtype() {
        return imgsrc3gtype;
      }

      public void setImgsrc3gtype(int imgsrc3gtype) {
        this.imgsrc3gtype = imgsrc3gtype;
      }

      public String getUnlikeReason() {
        return unlikeReason;
      }

      public void setUnlikeReason(String unlikeReason) {
        this.unlikeReason = unlikeReason;
      }

      public String getDigest() {
        return digest;
      }

      public void setDigest(String digest) {
        this.digest = digest;
      }

      public String getTypeid() {
        return typeid;
      }

      public void setTypeid(String typeid) {
        this.typeid = typeid;
      }

      public Object getAddata() {
        return addata;
      }

      public void setAddata(Object addata) {
        this.addata = addata;
      }

      public String getTag() {
        return tag;
      }

      public void setTag(String tag) {
        this.tag = tag;
      }

      public String getCategory() {
        return category;
      }

      public void setCategory(String category) {
        this.category = category;
      }

      public String getPtime() {
        return ptime;
      }

      public void setPtime(String ptime) {
        this.ptime = ptime;
      }

      public List<PicInfoBeanXXXXXX> getPicInfo() {
        return picInfo;
      }

      public void setPicInfo(List<PicInfoBeanXXXXXX> picInfo) {
        this.picInfo = picInfo;
      }

      public static class PicInfoBeanXXXXXX {
        /**
         * ref : null
         * width : null
         * url : http://cms-bucket.nosdn.127.net/2018/07/17/d2e4166b09c74c488ab294112a120c2b.jpeg
         * height : null
         */

        private Object ref;
        private Object width;
        private String url;
        private Object height;

        public Object getRef() {
          return ref;
        }

        public void setRef(Object ref) {
          this.ref = ref;
        }

        public Object getWidth() {
          return width;
        }

        public void setWidth(Object width) {
          this.width = width;
        }

        public String getUrl() {
          return url;
        }

        public void setUrl(String url) {
          this.url = url;
        }

        public Object getHeight() {
          return height;
        }

        public void setHeight(Object height) {
          this.height = height;
        }
      }
    }

    public static class ToutiaoBean {
      /**
       * liveInfo : null
       * tcount : 0
       * picInfo : []
       * docid : DMU0DL7T000189FH
       * videoInfo : null
       * channel :
       * link : https://3g.163.com/all/article/DMU0DL7T000189FH.html
       * source : 新华网
       * title : 5年来，习近平这样说“金砖”
       * type : doc
       * imgsrcFrom : null
       * imgsrc3gtype : 0
       * unlikeReason : 重复、旧闻/6,内容质量差/6
       * digest : 【编前语】从首次金砖国家外长会议至今，金砖国家合作已经走过十
       * typeid :
       * addata : null
       * tag :
       * category : 新闻
       * ptime : 2018-07-17 13:39:59
       */

      private Object liveInfo;
      private int tcount;
      private String docid;
      private Object videoInfo;
      private String channel;
      private String link;
      private String source;
      private String title;
      private String type;
      private Object imgsrcFrom;
      private int imgsrc3gtype;
      private String unlikeReason;
      private String digest;
      private String typeid;
      private Object addata;
      private String tag;
      private String category;
      private String ptime;
      private List<?> picInfo;

      public Object getLiveInfo() {
        return liveInfo;
      }

      public void setLiveInfo(Object liveInfo) {
        this.liveInfo = liveInfo;
      }

      public int getTcount() {
        return tcount;
      }

      public void setTcount(int tcount) {
        this.tcount = tcount;
      }

      public String getDocid() {
        return docid;
      }

      public void setDocid(String docid) {
        this.docid = docid;
      }

      public Object getVideoInfo() {
        return videoInfo;
      }

      public void setVideoInfo(Object videoInfo) {
        this.videoInfo = videoInfo;
      }

      public String getChannel() {
        return channel;
      }

      public void setChannel(String channel) {
        this.channel = channel;
      }

      public String getLink() {
        return link;
      }

      public void setLink(String link) {
        this.link = link;
      }

      public String getSource() {
        return source;
      }

      public void setSource(String source) {
        this.source = source;
      }

      public String getTitle() {
        return title;
      }

      public void setTitle(String title) {
        this.title = title;
      }

      public String getType() {
        return type;
      }

      public void setType(String type) {
        this.type = type;
      }

      public Object getImgsrcFrom() {
        return imgsrcFrom;
      }

      public void setImgsrcFrom(Object imgsrcFrom) {
        this.imgsrcFrom = imgsrcFrom;
      }

      public int getImgsrc3gtype() {
        return imgsrc3gtype;
      }

      public void setImgsrc3gtype(int imgsrc3gtype) {
        this.imgsrc3gtype = imgsrc3gtype;
      }

      public String getUnlikeReason() {
        return unlikeReason;
      }

      public void setUnlikeReason(String unlikeReason) {
        this.unlikeReason = unlikeReason;
      }

      public String getDigest() {
        return digest;
      }

      public void setDigest(String digest) {
        this.digest = digest;
      }

      public String getTypeid() {
        return typeid;
      }

      public void setTypeid(String typeid) {
        this.typeid = typeid;
      }

      public Object getAddata() {
        return addata;
      }

      public void setAddata(Object addata) {
        this.addata = addata;
      }

      public String getTag() {
        return tag;
      }

      public void setTag(String tag) {
        this.tag = tag;
      }

      public String getCategory() {
        return category;
      }

      public void setCategory(String category) {
        this.category = category;
      }

      public String getPtime() {
        return ptime;
      }

      public void setPtime(String ptime) {
        this.ptime = ptime;
      }

      public List<?> getPicInfo() {
        return picInfo;
      }

      public void setPicInfo(List<?> picInfo) {
        this.picInfo = picInfo;
      }
    }
  }
}
