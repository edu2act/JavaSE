package puke;

import java.util.ArrayList;
import java.util.Random;
public class play {

	public static void main(String[] args) {
		//创建一个ArrayList的集合，存放54张扑克牌
		ArrayList list1=new ArrayList();
		//运用4个循环，初始化54张牌
		for(int i=0;i<13;i++){
			list1.add(new puke("红桃",i+1));
		}
		for(int i=0;i<13;i++){
			list1.add(new puke("方片",i+1));
		}
		for(int i=0;i<13;i++){
			list1.add(new puke("梅花",i+1));
		}
		for(int i=0;i<13;i++){
			list1.add(new puke("黑桃",i+1));
		}
		list1.add(new puke("大王",0));
		list1.add(new puke("小王",0));
		//打印54张牌,因为打印出来为哈希值，所以转化为puke类型，然后通过get方法得到花色和数值
		System.out.println("共有54张扑克：");
		for(int j = 0;j <list1.size();j++){
			puke a=(puke) list1.get(j);
			System.out.print(a.getHuase()+a.getNumber()+"    ");
		};
		//初始化3个玩家
		player player1=new player("张三",1);
		player player2=new player("李四",2);
		player player3=new player("王五",3);
		
		Random r = new Random();
		//随机给三个玩家分牌，分一张牌就从list1中删除一张，避免重复发牌
		//并把‘牌’转化为puke类存入各个玩家的list集合中
		for(int i=0;i<17;i++){
			int n=r.nextInt(list1.size());
			player1.list.add((puke)list1.get(n));
			list1.remove(n);
		}
		for(int i=0;i<17;i++){
			int n=r.nextInt(list1.size());
			player2.list.add((puke)list1.get(n));
			list1.remove(n);
		}
		for(int i=0;i<17;i++){
			int n=r.nextInt(list1.size());
			player3.list.add((puke)list1.get(n));
			list1.remove(n);
		}
		//把每个玩家的牌打印出来
		//因为是哈希值所以应先转换为puke类型
		System.out.println();
		System.out.println("玩家一："+player1.getName()+"级别："+player1.getlevel());
		for(int i=0;i<player1.list.size();i++){
			puke a=(puke)player1.list.get(i);
			System.out.print(a.getHuase()+a.getNumber()+"   ");
		}
		System.out.println();
		System.out.println("玩家二："+player2.getName()+"级别："+player2.getlevel());
		for(int i=0;i<player2.list.size();i++){
			puke a=(puke)player2.list.get(i);
			System.out.print(a.getHuase()+a.getNumber()+"   ");
		}
		System.out.println();
		System.out.println("玩家三："+player3.getName()+"级别："+player3.getlevel());
		for(int i=0;i<player3.list.size();i++){
			
			puke a=(puke)player3.list.get(i);
			System.out.print(a.getHuase()+a.getNumber()+"   ");
		}
		//最后打印出底牌
		System.out.println();
		System.out.println("底牌是：");
		for(int i=0;i<list1.size();i++){
			
			puke a=(puke)list1.get(i);
			System.out.println(a.getHuase()+a.getNumber()+"   ");
		}
		
	}

}
