package com.kevin.cqsubway.app;

import com.kevin.cqsubway.model.db.SubwayOne;
import com.kevin.cqsubway.model.db.SubwaySix;
import com.kevin.cqsubway.model.db.SubwayThree;
import com.kevin.cqsubway.model.db.SubwayTwo;

import org.litepal.LitePalApplication;
import org.litepal.crud.DataSupport;

import java.util.List;

/**
 * Created by Kevin Liu on 2016/12/18.
 * Function：
 */

public class SubwayApplication extends LitePalApplication{

    private boolean isFirstOpen = true;
    public static List<SubwayOne> subwayOneList;
    public static List<SubwayTwo> subwayTwoList;
    public static List<SubwayThree> subwayThreeList;
    public static List<SubwaySix> subwaySixList;
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
        new SubwayOne(":-:",":-:",0,"朝天门",100,"").save();
        new SubwayOne("06:30-22:30",":-:",1,"小什子",101,"").save();
        new SubwayOne("06:32-22:32","06:37-22:22",2,"较场口",102,"").save();
        new SubwayOne("06:34-22:34","06:35-22:20",3,"七星岗",103,"").save();
        new SubwayOne("06:36-22:37","06:32-22:18",4,"两路口",104,"").save();
        new SubwayOne("06:39-22:39","06:30-22:15",5,"鹅岭",105,"").save();
        new SubwayOne("06:42-22:42","06:35-22:13",6,"大坪",106,"").save();
        new SubwayOne("06:44-22:44","06:33-22:10",7,"石油路",107,"").save();
        new SubwayOne("06:46-22:46","06:31-22:08",8,"歇台子",108,"").save();
        new SubwayOne("06:48 -22:48","06:32-22:06",9,"石桥铺",109,"").save();
        new SubwayOne("06:50-22:50","06:33-22:04",10,"高庙村",110,"").save();
        new SubwayOne("06:32-22:52","06:31-22:02",11,"马家岩",111,"").save();
        new SubwayOne("06:33-22:54","06:45-22:00",12,"小龙坎",112,"").save();
        new SubwayOne("06:36-22:57","06:43-22:58",13,"沙坪坝",113,"").save();
        new SubwayOne("06:38-22:58","06:40-22:56",14,"杨公桥",114,"").save();
        new SubwayOne("06:30-23:00","06:39-22:54",15,"烈士墓",115,"").save();
        new SubwayOne("06:32-23:03","06:37-22:52",16,"磁器口",116,"").save();
        new SubwayOne("06:34-23:05","06:34-22:49",17,"石井坡",117,"").save();
        new SubwayOne("06:37-23:08","06:32-22:47",18,"双碑",118,"").save();
        new SubwayOne("06:37-23:14","06:32-22:40",19,"赖家桥",119,"").save();
        new SubwayOne("06:30-23:16","06:38-22:38",20,"微电园",120,"").save();
        new SubwayOne("06:33-23:19","06:35-22:35",21,"陈家桥",121,"").save();
        new SubwayOne("06:36-23:22","06:32-22:32",22,"大学城",122,"").save();
        new SubwayOne(":-:","06:30-22:30",23,"尖顶坡",123,"").save();

        subwayOneList= DataSupport.findAll(SubwayOne.class);
    }
    private void initSubwayTwo(){
        new SubwayTwo("06:30-22:30",":-:",0,"较场口",200,"").save();
        new SubwayTwo("06:31-22:31","06:46-23:13",1,"临江门",201,"").save();
        new SubwayTwo("06:33-22:33","06:44-23:11",2,"黄花园",202,"").save();
        new SubwayTwo("06:35-22:35","06:42-23:10",3,"大溪沟",203,"").save();
        new SubwayTwo("06:37-22:37","06:41-23:08",4,"曾家岩",204,"").save();
        new SubwayTwo("06:39-22:39","06:39-23:06",5,"牛角沱",205,"").save();
        new SubwayTwo("06:41-22:41","06:37-23:04",6,"李子坝",206,"").save();
        new SubwayTwo("06:43-22:43","06:35-23:02",7,"佛图关",207,"").save();
        new SubwayTwo("06:45-22:46","06:32-22:59",8,"大坪",208,"").save();
        new SubwayTwo("06:48-22:48","06:30-22:56",9,"袁家岗",209,"").save();
        new SubwayTwo("06:50-22:50","06:34-22:54",10,"谢家湾",210,"").save();
        new SubwayTwo("06:52-22:53","06:32-22:52",11,"杨家坪",211,"").save();
        new SubwayTwo("06:32-22:55","06:30-22:50",12,"动物园",212,"").save();
        new SubwayTwo("06:34-22:57","06:40-22:47",13,"大堰村",213,"").save();
        new SubwayTwo("06:36-22:59","06:38-22:45",14,"马王场",214,"").save();
        new SubwayTwo("06:38-23:01","06:36-22:43",15,"平安",215,"").save();
        new SubwayTwo("06:40-23:03","06:34-22:41",16,"大渡口",216,"").save();
        new SubwayTwo("06:43-23:06","06:32-22:39",17,"新山村",217,"").save();
        new SubwayTwo("06:30-22:30","06:30-22:36",18,"天堂堡",218,"").save();
        new SubwayTwo("06:33-22:33","06:43-22:33",19,"建桥",219,"").save();
        new SubwayTwo("06:35-22:35","06:41-22:31",20,"金家湾",220,"").save();
        new SubwayTwo("06:37-22:37","06:39-22:29",21,"刘家坝",221,"").save();
        new SubwayTwo("06:40-22:40","06:36-22:26",22,"白居寺",222,"").save();
        new SubwayTwo("06:44-22:44","06:32-22:22",23,"大江",223,"").save();
        new SubwayTwo(":-:","06:30-22:20",24,"鱼洞",224,"").save();

        subwayTwoList=DataSupport.findAll(SubwayTwo.class);
    }
    private void initSubwayThree(){
        new SubwayThree(":-:","06:30-22:30",0,"江北机场",400,"").save();
        new SubwayThree("06:40-00:05","06:32-22:32",1,"碧津",301,"").save();
        new SubwayThree("06:36-00:01","06:30-22:36",2,"双龙",302,"").save();
        new SubwayThree("06:34-23:58","06:33-22:39",3,"回兴",303,"").save();
        new SubwayThree("06:31-23:55","06:30-22:42",4,"长福路",304,"").save();
        new SubwayThree("06:33-23:52","06:33-22:45",5,"翠云",305,"").save();
        new SubwayThree("06:30-23:49","06:35-22:47",6,"园博园",306,"").save();
        new SubwayThree("06:33-23:47","06:32-22:50",7,"鸳鸯",307,"").save();
        new SubwayThree("06:35-23:44","06:35-22:53",8,"金童路",308,"").save();
        new SubwayThree("06:33-23:41","06:31-22:55",9,"金渝",309,"").save();
        new SubwayThree("06:30-23:39","06:33-22:58",10,"童家院子",310,"").save();
        new SubwayThree("06:32-23:36","06:31-23:00",11,"龙头寺",311,"").save();
        new SubwayThree("06:35-23:34","06:33-23:03",12,"重庆北站南广场",312,"").save();
        new SubwayThree("06:34-23:32","06:30-23:04",13,"狮子坪",313,"").save();
        new SubwayThree("06:31-23:30","06:32-23:07",14,"唐家院子",314,"").save();
        new SubwayThree("06:39-23:28","06:30-23:09",15,"郑家院子",315,"").save();
        new SubwayThree("06:37-23:25","06:32-23:11",16,"嘉州路",316,"").save();
        new SubwayThree("06:34-23:23","06:35-23:14",17,"红旗河沟",317,"").save();
        new SubwayThree("06:32-23:20","06:33-23:17",18,"观音桥",318,"").save();
        new SubwayThree("06:39-23:17","06:35-23:19",19,"华新街",319,"").save();
        new SubwayThree("06:37-23:15","06:31-23:22",20,"牛角沱",320,"").save();
        new SubwayThree("06:34-23:13","06:33-23:24",21,"两路口",321,"").save();
        new SubwayThree("06:31-23:10","06:31-23:27",22,"铜元局",322,"").save();
        new SubwayThree("06:34-23:08","06:34-23:29",23,"工贸",323,"").save();
        new SubwayThree("06:32-23:06","06:32-23:32",24,"南坪",324,"").save();
        new SubwayThree("06:34-23:03","06:34-23:34",25,"四公里",325,"").save();
        new SubwayThree("06:32-23:01","06:36-23:37",26,"五公里",326,"").save();
        new SubwayThree("06:30-22:58","06:30-23:39",27,"六公里",327,"").save();
        new SubwayThree("06:33-22:56","06:32-23:41",28,"二塘",328,"").save();
        new SubwayThree("06:30-22:54","06:35-23:43",29,"八公里",329,"").save();
        new SubwayThree("06:33-22:51","06:37-23:46",30,"麒龙",330,"").save();
        new SubwayThree("06:30-22:49","06:39-23:48",31,"九公里",331,"").save();
        new SubwayThree("06:38-22:47","06:42-23:50",32,"岔路口",332,"").save();
        new SubwayThree("06:36-22:44","06:44-23:53",33,"花溪",333,"").save();
        new SubwayThree("06:32-22:41","06:47-23:56",34,"大山村",334,"").save();
        new SubwayThree("06:30-22:38","06:50-23:59",35,"学堂湾",335,"").save();
        new SubwayThree("06:31-22:35","06:34-00:02",36,"鱼胡路",336,"").save();
        new SubwayThree("06:34-22:32","06:37-00:04",37,"金竹",337,"").save();
        new SubwayThree("06:31-22:30",":-:",38,"鱼洞",338,"").save();

        subwayThreeList=DataSupport.findAll(SubwayThree.class);

    }
    private void initSubwaySix(){
        new SubwaySix("06:45-19:25",":-:",0,"茶园",200,"").save();
        new SubwaySix("06:48-19:27","06:36-23:45",1,"邱家湾",201,"").save();
        new SubwaySix("06:50-19:30","06:33-23:42",2,"长生桥",202,"").save();
        new SubwaySix("06:53-19:32","06:30-23:40",3,"刘家坪",203,"").save();
        new SubwaySix("06:59-19:38","06:45-23:34",4,"上新街",204,"").save();
        new SubwaySix("07:01-19:41","06:43-23:31",5,"小什字",205,"").save();
        new SubwaySix("07:03-19:43","06:40-23:28",6,"大剧院",206,"").save();
        new SubwaySix("07:05-19:45","06:38-23:26",7,"江北城",207,"").save();
        new SubwaySix("07:07-19:47","06:36-23:25",8,"五里店",208,"").save();
        new SubwaySix("07:09-19:50","06:34-23:22",9,"红土地",209,"").save();
        new SubwaySix("07:12-19:52","06:32-23:20",10,"黄泥磅",210,"").save();
        new SubwaySix("07:14-19:54","06:30-23:17",11,"红旗河沟",211,"").save();
        new SubwaySix("07:17-19:57","06:39-23:15",12,"花卉园",212,"").save();
        new SubwaySix("07:19-19:59","06:36-23:12",13,"大龙山",213,"").save();
        new SubwaySix("07:21-20:02","06:34-23:10",14,"冉家坝",214,"").save();
        new SubwaySix("07:24-20:05","06:31-23:07",15,"光电园",215,"").save();
        new SubwaySix("07:28-20:08","06:42-23:03",16,"大竹林",216,"").save();
        new SubwaySix("07:30-20:10","06:40-23:02",17,"康庄",217,"").save();
        new SubwaySix("07:33-20:13","06:37-22:59",18,"九曲河",218,"").save();
        new SubwaySix("07:35-20:15","06:35-22:57",19,"礼嘉",219,"").save();
//------------------------从这里开始分成两条路-----------------------------------
        new SubwaySix("06:32-23:22","06:54-22:54",20,"金山寺",2201,"").save();
        new SubwaySix("06:34-23:29","06:47-22:47",21,"曹家湾",2211,"").save();
        new SubwaySix("06:37-23:31","06:45-22:45",22,"蔡家",2221,"").save();
        new SubwaySix("06:44-23:39","06:38-22:38",23,"向家岗",2231,"").save();
        new SubwaySix("06:46-23:41","06:35-22:35",24,"龙凤溪",2241,"").save();
        new SubwaySix("06:49-23:44","06:32-22:32",25,"北碚",2221,"").save();
        new SubwaySix(":-:","06:30-22:30",26,"五路口",2231,"").save();
//------------------------国博线-----------------------------------------------
        new SubwaySix("07:38-20:18","07:50-20:35",20,"平场",2202,"").save();
        new SubwaySix("07:41-20:21","07:46-20:22",21,"黄茅坪",2212,"").save();
        new SubwaySix("07:43-20:23","07:43-20:24",22,"高义口",2222,"").save();
        new SubwaySix("07:47-20:27","07:41-20:26",23,"国博中心",2232,"").save();
        new SubwaySix(":-:","07:38-20:24",24,"悦来",2242,"").save();

        subwaySixList=DataSupport.findAll(SubwaySix.class);
    }

}
