package com.bwei.xlistview;

import java.util.List;

/**
 * 1.类的用途
 * 2.@author:zhanghaisheng
 * 3.@2017/2/26
 */


public class Bean {

    /**
     * error_code : 0
     * reason : Success
     * result : {"data":[{"content":"宿舍六个人聊起了三国，李哥问我：兄弟，三国里你最喜欢哪个？ 我想了想说：肯定最喜欢诸葛亮，夜观天象，知天下大事。 说完我问他们，他们五个都喜欢貂蝉\u2026\u2026","hashId":"b690610291b1d5c084530e25d139cbe5","unixtime":1488093830,"updatetime":"2017-02-26 15:23:50"},{"content":"有人疯狂追求了你3年，有的人默默对你好了两年，有人体贴照顾了你1年，还有的人喜欢你却从未说。但你无论多么感动多么开心，就是没在一起；可是莫名有一人，只相识一个月、见了两次面、讲了几句话， 你就决定在一起了。或许是缘分，又或许那天阳光正好，他站在阳光下靠在兰博基尼上很帅。","hashId":"d292c08368a15c7e1774422ed99849b7","unixtime":1488093830,"updatetime":"2017-02-26 15:23:50"},{"content":"结婚前几天岳父抓住女婿的手，叮嘱道：\u201c我没别的要求，小娟嫁过去以后，你要好好待她，有些事情她做的不对的地方你要迁就他，孩子记住有啥事儿好好说千万别和她动手\u201d。说完老头止不住的老泪纵横，婚后没过多久小两口打架了，望着躺在医院里女婿，老头无奈的摇摇头：\u201c哎，孩子你不听话啊","hashId":"2c5d08d249a680c50f4f1382abc79616","unixtime":1488093830,"updatetime":"2017-02-26 15:23:50"},{"content":"昨天去旅游景点登山游玩，看到了非常感人的一幕，一位中年男子带着他的父母，媳妇，儿女一家六口游玩，看到他们困难时的互相帮助，脸上洋溢着幸福的笑容。父慈子孝，相敬如宾。这不正是我们中华民族的传统品德，透过早晨的阳光我静静的看着他们一家六口，静静的看着他们一家六口跳过了两米高的围墙逃过了检票的窗口","hashId":"87ed62e4b4132bc193f50429954a055b","unixtime":1488093830,"updatetime":"2017-02-26 15:23:50"},{"content":"自从有了美颜APP以后，很多妹子就以为自己就长成了美图照片里的样子。越来越看不上现实生活中身边的屌丝了，天天拿着经过神磨皮后的照片对比周围的正常人，越发觉得自己与众不同，高端大气上档次了。这些人太可怕了，竟然连自己都骗","hashId":"e967bf9db421a41ae50be50bca13456f","unixtime":1488093830,"updatetime":"2017-02-26 15:23:50"},{"content":"打心眼瞧不起那些春节不胖的人，你对得起春节为你死去的鸡鸭牛羊猪吗？反正我是问心无愧了。","hashId":"9d41a5b53d897fb5f83f341b7e81f984","unixtime":1488093830,"updatetime":"2017-02-26 15:23:50"},{"content":"网吧里，进来一位女子，一番张望，来到一个男孩旁边，拎起男孩的耳朵就骂：\u201c你不是去老师家里补课了吗?\u201d男孩一边护着耳朵，一边盯着显示屏大叫：\u201c爸爸，有人打我!\u201d男子大怒：\u201c在哪儿，我来收拾他!\u201d不料，女子又来到他身边，拎起他的耳朵，骂道：\u201c你不是去加班了吗?\u201d","hashId":"6e448d5b7d77b92ec9658eb501150b9b","unixtime":1488092630,"updatetime":"2017-02-26 15:03:50"},{"content":"女友去陪她失恋的闺蜜去了。孤独的我正要睡觉，女友发来信息：\u201c有没有想我？\u201d我：\u201c好想。\u201d不一会，女友发来一条性感大腿并附言：\u201c趁我闺蜜睡着了，我偷拍了她的大腿，你快撸撸睡吧！\u201d","hashId":"6d98293be97172c324c79510ef82bb46","unixtime":1488092630,"updatetime":"2017-02-26 15:03:50"},{"content":"刚进小学的时候，我鼓起勇气向喜欢的同班女生告白。结果我就悲剧的接下来连着六年都论为群众的笑柄，她逢人就说:\u201cXX那家伙居然对我\u2026\u2026噗哈哈哈\u2026\u2026\u201d接下来初中又被嘲笑了三年，高中也没有放过我，一直到现在，家里吃晚饭的时候她还是动不动就拿出来说。我实在受不了：\u201c爸，小妈老提那事，你也不管管\u201d","hashId":"36165730e5d811bbc378f7c46ddc7fe7","unixtime":1488092630,"updatetime":"2017-02-26 15:03:50"},{"content":"一天我带女票回家，趁着家里只有小妹就在房里快活了一下午，晚上吃饭的时候小妹说，哥哥，我也要吃冰激凌，我说我没有冰激凌啊. 小妹说：你骗人，下午的时候明明听见你和家姐（小妹这样叫我女票）在吃冰激凌，你还说快舔，在不舔就软了......爸妈都在，女票的脸已经埋进碗里了...","hashId":"b663a64aca8285240a90680dc97662db","unixtime":1488092630,"updatetime":"2017-02-26 15:03:50"}]}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

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

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * content : 宿舍六个人聊起了三国，李哥问我：兄弟，三国里你最喜欢哪个？ 我想了想说：肯定最喜欢诸葛亮，夜观天象，知天下大事。 说完我问他们，他们五个都喜欢貂蝉……
             * hashId : b690610291b1d5c084530e25d139cbe5
             * unixtime : 1488093830
             * updatetime : 2017-02-26 15:23:50
             */

            private String content;
            private String hashId;
            private int unixtime;
            private String updatetime;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getHashId() {
                return hashId;
            }

            public void setHashId(String hashId) {
                this.hashId = hashId;
            }

            public int getUnixtime() {
                return unixtime;
            }

            public void setUnixtime(int unixtime) {
                this.unixtime = unixtime;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }
        }
    }
}
