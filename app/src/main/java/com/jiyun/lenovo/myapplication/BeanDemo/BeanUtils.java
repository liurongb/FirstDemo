package com.jiyun.lenovo.myapplication.BeanDemo;

import java.util.List;

/**
 * Created by lenovo on 2017/8/14.
 */

public class BeanUtils {
    /**
     * error_code : 0
     * reason : Success
     * viewpager_url : ["https://i.stack.imgur.com/RGmo3.jpg?s=128&g=1","https://www.gravatar.com/avatar/3c062e6ad2a626766e1aec1c6e0ad0e5?s=128&d=identicon&r=PG&f=1","https://www.gravatar.com/avatar/db7370a2f0ff1585eca6839ffb9ab4b3?s=128&d=identicon&r=PG&f=1","https://www.gravatar.com/avatar/79555981e9c8619baa4c57b48fe5dc4d?s=128&d=identicon&r=PG&f=1"]
     * new : [{"title":"马云到非洲","content":"非洲十个总统接待马云！！！","img":["http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg"]},{"title":"孙杨又夺冠","content":"实现了世锦赛三连冠的孙杨在颁奖的时候又哭了，果然小哭包人设不倒！","img":["http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg"]},{"title":"习近平主持中央政治局会议:扩大外资准入","content":"习近平致信祝贺第十九届国际植物学大会开幕  砥砺奋进","img":["http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg"]},{"title":"孙政才涉嫌严重违纪 中共中央决定对其立案审查","content":"新华社北京7月24日电 鉴于孙政才同志涉嫌严重违纪，中共中央决定，由中共中央纪律检查委员会对其立案审查。","img":["http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg"]},{"title":"蚊香中毒","content":"点20盘蚊香导致蚊香中毒............","img":["http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg"]},{"title":"美女主播","content":"4名男子网上佯装美女主播诈骗半年骗得300余万","img":["http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg"]},{"title":"北京新闻","content":"北京好像没新闻！！！","img":["http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg"]},{"title":"摩拜单车曼城受欢迎","content":"中国共享单车摩拜登陆英国曼彻斯特不到一个月，在迅速俘获当地民众芳心","img":["http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg"]},{"title":"飞鱼","content":"福建景区飞鱼上岸扑向游客翅膀比身子还宽","img":["http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg"]},{"title":"昆明豪车报废","content":"地下车库被淹数十辆豪车泡三天报废了。真可惜还不如给我呢","img":["http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg"]}]
     */

    private int error_code;
    private String reason;
    private List<String> viewpager_url;
    private List<NewBean> newX;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<String> getViewpager_url() {
        return viewpager_url;
    }

    public void setViewpager_url(List<String> viewpager_url) {
        this.viewpager_url = viewpager_url;
    }

    public List<NewBean> getNewX() {
        return newX;
    }

    public void setNewX(List<NewBean> newX) {
        this.newX = newX;
    }

    public static class NewBean {
        /**
         * title : 马云到非洲
         * content : 非洲十个总统接待马云！！！
         * img : ["http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg","http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg"]
         */

        private String title;
        private String content;
        private List<String> img;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public List<String> getImg() {
            return img;
        }

        public void setImg(List<String> img) {
            this.img = img;
        }
    }
}
