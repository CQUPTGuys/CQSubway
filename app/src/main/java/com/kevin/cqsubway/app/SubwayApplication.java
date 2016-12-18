package com.kevin.cqsubway.app;

import com.kevin.cqsubway.model.db.SubwayOne;
import com.kevin.cqsubway.model.db.SubwayTwo;

import org.litepal.LitePalApplication;

/**
 * Created by Kevin Liu on 2016/12/18.
 * Function：
 */

public class SubwayApplication extends LitePalApplication{

    private boolean isFirstOpen = true;

    @Override
    public void onCreate() {
        super.onCreate();
        if (isFirstOpen){
            initSubwayOne();
            initSubwayTwo();
            initSubwayThree();
            initSubwaySix();
            isFirstOpen = false;
        }
    }

    private void initSubwayOne(){
        new SubwayOne(0,"朝天门",100,"").save();
        new SubwayOne(1,"小什子",101,"").save();
        new SubwayOne(2,"较场口",102,"").save();
        new SubwayOne(3,"七星岗",103,"").save();
        new SubwayOne(4,"两路口",104,"").save();
        new SubwayOne(5,"鹅岭",105,"").save();
        new SubwayOne(6,"大坪",106,"").save();
        new SubwayOne(7,"石油路",107,"").save();
        new SubwayOne(8,"歇台子",108,"").save();
        new SubwayOne(9,"石桥铺",109,"").save();
        new SubwayOne(10,"高庙村",110,"").save();
        new SubwayOne(11,"马家岩",111,"").save();
        new SubwayOne(12,"小龙坎",112,"").save();
        new SubwayOne(13,"沙坪坝",113,"").save();
        new SubwayOne(14,"杨公桥",114,"").save();
        new SubwayOne(15,"烈士墓",115,"").save();
        new SubwayOne(16,"磁器口",116,"").save();
        new SubwayOne(17,"石井坡",117,"").save();
        new SubwayOne(18,"双碑",118,"").save();
        new SubwayOne(19,"赖家桥",119,"").save();
        new SubwayOne(20,"微电园",120,"").save();
        new SubwayOne(21,"陈家桥",121,"").save();
        new SubwayOne(22,"大学城",122,"").save();
        new SubwayOne(23,"尖顶坡",123,"").save();


    }
    private void initSubwayTwo(){
        new SubwayTwo(0,"较场口",200,"").save();
        new SubwayTwo(1,"临江门",201,"").save();
        new SubwayTwo(2,"黄花园",202,"").save();
        new SubwayTwo(3,"大溪沟",203,"").save();
        new SubwayTwo(4,"曾家岩",204,"").save();
        new SubwayTwo(5,"牛角沱",205,"").save();
        new SubwayTwo(6,"李子坝",206,"").save();
        new SubwayTwo(7,"佛图关",207,"").save();
        new SubwayTwo(8,"大坪",208,"").save();
        new SubwayTwo(9,"袁家岗",209,"").save();
        new SubwayTwo(10,"谢家湾",210,"").save();
        new SubwayTwo(11,"杨家坪",211,"").save();
        new SubwayTwo(12,"动物园",212,"").save();
        new SubwayTwo(13,"大堰村",213,"").save();
        new SubwayTwo(14,"马王场",214,"").save();
        new SubwayTwo(15,"平安",215,"").save();
        new SubwayTwo(16,"大渡口",216,"").save();
        new SubwayTwo(17,"新山村",217,"").save();
        new SubwayTwo(18,"天堂堡",218,"").save();
        new SubwayTwo(19,"建桥",219,"").save();
        new SubwayTwo(20,"金家湾",220,"").save();
        new SubwayTwo(21,"刘家坝",221,"").save();
        new SubwayTwo(22,"白居寺",222,"").save();
        new SubwayTwo(23,"大江",223,"").save();
        new SubwayTwo(24,"鱼洞",224,"").save();
    }
    private void initSubwayThree(){
        new SubwayTwo(0,"江北机场",400,"").save();
        new SubwayTwo(1,"碧津",301,"").save();
        new SubwayTwo(2,"双龙",302,"").save();
        new SubwayTwo(3,"回兴",303,"").save();
        new SubwayTwo(4,"长福路",304,"").save();
        new SubwayTwo(5,"翠云",305,"").save();
        new SubwayTwo(6,"园博园",306,"").save();
        new SubwayTwo(7,"鸳鸯",307,"").save();
        new SubwayTwo(8,"金童路",308,"").save();
        new SubwayTwo(9,"金渝",309,"").save();
        new SubwayTwo(10,"童家院子",310,"").save();
        new SubwayTwo(11,"龙头寺",311,"").save();
        new SubwayTwo(12,"重庆北站南广场",312,"").save();
        new SubwayTwo(13,"狮子坪",313,"").save();
        new SubwayTwo(14,"唐家院子",314,"").save();
        new SubwayTwo(15,"郑家院子",315,"").save();
        new SubwayTwo(16,"嘉州路",316,"").save();
        new SubwayTwo(17,"红旗河沟",317,"").save();
        new SubwayTwo(18,"观音桥",318,"").save();
        new SubwayTwo(19,"华新街",319,"").save();
        new SubwayTwo(20,"牛角沱",320,"").save();
        new SubwayTwo(21,"两路口",321,"").save();
        new SubwayTwo(22,"铜元局",322,"").save();
        new SubwayTwo(23,"工贸",323,"").save();
        new SubwayTwo(24,"南坪",324,"").save();
        new SubwayTwo(25,"四公里",325,"").save();
        new SubwayTwo(26,"五公里",326,"").save();
        new SubwayTwo(27,"六公里",327,"").save();
        new SubwayTwo(28,"二塘",328,"").save();
        new SubwayTwo(29,"八公里",329,"").save();
        new SubwayTwo(30,"麒龙",330,"").save();
        new SubwayTwo(31,"九公里",331,"").save();
        new SubwayTwo(32,"岔路口",332,"").save();
        new SubwayTwo(33,"花溪",333,"").save();
        new SubwayTwo(34,"大山村",334,"").save();
        new SubwayTwo(35,"学堂湾",335,"").save();
        new SubwayTwo(36,"鱼胡路",336,"").save();
        new SubwayTwo(37,"金竹",337,"").save();
        new SubwayTwo(38,"鱼洞",338,"").save();


    }
    private void initSubwaySix(){
        new SubwayTwo(0,"茶园",200,"").save();
        new SubwayTwo(1,"邱家湾",201,"").save();
        new SubwayTwo(2,"长生桥",202,"").save();
        new SubwayTwo(3,"刘家坪",203,"").save();
        new SubwayTwo(4,"上新街",204,"").save();
        new SubwayTwo(5,"小什字",205,"").save();
        new SubwayTwo(6,"大剧院",206,"").save();
        new SubwayTwo(7,"江北城",207,"").save();
        new SubwayTwo(8,"五里店",208,"").save();
        new SubwayTwo(9,"红土地",209,"").save();
        new SubwayTwo(10,"黄泥磅",210,"").save();
        new SubwayTwo(11,"红旗河沟",211,"").save();
        new SubwayTwo(12,"花卉园",212,"").save();
        new SubwayTwo(13,"大龙山",213,"").save();
        new SubwayTwo(14,"冉家坝",214,"").save();
        new SubwayTwo(15,"光电园",215,"").save();
        new SubwayTwo(16,"大竹林",216,"").save();
        new SubwayTwo(17,"康庄",217,"").save();
        new SubwayTwo(18,"九曲河",218,"").save();
        new SubwayTwo(19,"礼嘉",219,"").save();
//------------------------从这里开始分成两条路-----------------------------------
        new SubwayTwo(20,"金山寺",2201,"").save();
        new SubwayTwo(21,"曹家湾",2211,"").save();
        new SubwayTwo(22,"蔡家",2221,"").save();
        new SubwayTwo(23,"向家岗",2231,"").save();
        new SubwayTwo(24,"龙凤溪",2241,"").save();
        new SubwayTwo(25,"北碚",2221,"").save();
        new SubwayTwo(26,"五路口",2231,"").save();
//------------------------国博线-----------------------------------------------
        new SubwayTwo(20,"平场",2202,"").save();
        new SubwayTwo(21,"黄茅坪",2212,"").save();
        new SubwayTwo(22,"高义口",2222,"").save();
        new SubwayTwo(23,"国博中心",2232,"").save();
        new SubwayTwo(24,"悦来",2242,"").save();
    }

}
