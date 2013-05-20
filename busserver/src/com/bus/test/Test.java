package com.bus.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bus.domain.BusLocation;
import com.bus.service.interfaces.BusLocInter;

public class Test {
	private static Date mydate;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// 测试spring是否已经配置好了
		// TestService ts=(TestService) ac.getBean("testService");
		// System.out.println(ts.getName());

		// 测试spring和hibernate的整合
		// SessionFactory sf=(SessionFactory) ac.getBean("sessionFactory");
		// Session s=sf.openSession();
		//
		// BusLocation buslocation=
		// new BusLocation(45, 0, 1, 1, new Date(),
		// 113.299408f, 22.513175f, 0f, 0f);
		// Transaction tx=s.beginTransaction();
		// s.save(buslocation);
		// tx.commit();
		// 用spring来分层实现的添加
		BusLocInter busLocInter = (BusLocInter) ac.getBean("busLocService");
		SimpleDateFormat sft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//45路第一次插入
//		try {
//			mydate = sft.parse("2013-05-16 13:24:10");
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		BusLocation buslocation = new BusLocation(45, 0, 1, 1, mydate,
//				108.999395d, 34.222573d, 0f, 0f);
		//45路第2次插入
//				try {
//					mydate = sft.parse("2013-05-16 13:27:52");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(45, 0, 1, 1, mydate,
//						108.993709d, 34.231461d, 0f, 0f);
		//45路第3次插入
//				try {
//					mydate = sft.parse("2013-05-16 13:32:02");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(45, 0, 1, 1, mydate,
//						108.989804d, 34.237670d, 0f, 0f);		
//				108.993709d, 34.231461d, 0f, 0f);
		//45路第4次插入
//				try {
//					mydate = sft.parse("2013-05-16 13:36:58");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(45, 0, 1, 1, mydate,
//						108.988023d, 34.240632, 0f, 0f);	
				//45路第5次插入
//				try {
//					mydate = sft.parse("2013-05-16 13:39:58");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(45, 0, 1, 1, mydate,
//						108.988259d, 34.250956, 0f, 0f);	
				//45路第6次插入
//				try {
//					mydate = sft.parse("2013-05-16 13:42:53");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(45, 0, 1, 1, mydate,
//						108.980985, 34.251098, 0f, 0f);	
				//45路第7次插入
//				try {
//					mydate = sft.parse("2013-05-16 13:46:58");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(45, 0, 1, 1, mydate,
//						108.975964, 34.251044, 0f, 0f);
				
				//45路第8次插入
//				try {
//					mydate = sft.parse("2013-05-16 13:51:25");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(45, 0, 1, 1, mydate,
//						108.972509, 34.253244, 0f, 0f);
				//45路第9次插入
//				try {
//					mydate = sft.parse("2013-05-16 13:54:08");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(45, 0, 1, 1, mydate,
//						108.971221, 34.260036, 0f, 0f);
			//45路第10次插入
//				try {
//					mydate = sft.parse("2013-05-16 13:56:34");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(45, 0, 1, 1, mydate,
//						108.964527,34.259540, 0f, 0f);
			//45路第11次插入
//				try {
//					mydate = sft.parse("2013-05-16 14:00:58");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(45, 0, 1, 1, mydate,
//						108.958679,34.259620, 0f, 0f);
				//45路第12次插入
//				try {
//					mydate = sft.parse("2013-05-16 14:02:23");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(45, 0, 1, 1, mydate,
//						108.953819,34.259620, 0f, 0f);	
				//45路第13次插入
//				try {
//					mydate = sft.parse("2013-05-16 14:08:25");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(45, 0, 1, 1, mydate,
//						108.948004, 34.259549,0f, 0f);		
				//45路第14次插入
//				try {
//					mydate = sft.parse("2013-05-16 14:11:58");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(45, 0, 1, 1, mydate,
//						108.939646, 34.259469,0f, 0f);		
				//45路第15次插入
//				try {
//					mydate = sft.parse("2013-05-16 14:16:34");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(45, 0, 1, 1, mydate,
//						108.935022, 34.259478,0f, 0f);
				
/*
 * 以下是25路的插入
 */
				//25路第1次插入
//				try {
//					mydate = sft.parse("2013-05-15 10:16:04");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.999739, 34.222111,0f, 0f);
				//25路第2次插入
//				try {
//					mydate = sft.parse("2013-05-15 10:20:54");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.996370, 34.227141,0f, 0f);
				//25路第3次插入
//				try {
//					mydate = sft.parse("2013-05-15 10:26:33");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.993033, 34.232455,0f, 0f);
				
				//25路第4次插入
//				try {
//					mydate = sft.parse("2013-05-15 10:30:23");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.987433, 34.239577,0f, 0f);
				
				//25路第5次插入
//				try {
//					mydate = sft.parse("2013-05-15 10:35:28");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.979633, 34.236242,0f, 0f);
				
				//25路第6次插入
//				try {
//					mydate = sft.parse("2013-05-15 10:38:36");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.969483, 34.231949,0f, 0f);
				
				//25路第7次插入
//				try {
//					mydate = sft.parse("2013-05-15 10:42:39");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.963915, 34.230614,0f, 0f);
				//25路第8次插入
//				try {
//					mydate = sft.parse("2013-05-15 10:46:42");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.963754, 34.235945,0f, 0f);
				//25路第9次插入
//				try {
//					mydate = sft.parse("2013-05-15 10:49:13");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.963625, 34.241617,0f, 0f);
				//25路第10次插入
//				try {
//					mydate = sft.parse("2013-05-15 10:54:45");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.963534,34.245510,0f, 0f);
				//25路第11次插入
//				try {
//					mydate = sft.parse("2013-05-15 10:54:45");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.963384,34.250902,0f, 0f);
//				//25路第12次插入
//				try {
//					mydate = sft.parse("2013-05-15 10:57:32");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.963320,34.252836,0f, 0f);
				//25路第13次插入
//				try {
//					mydate = sft.parse("2013-05-15 11:02:56");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.963234,34.255492,0f, 0f);
				//25路第14次插入
//				try {
//					mydate = sft.parse("2013-05-15 11:05:45");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.963175,34.258046,0f, 0f);
				//25路第15次插入
//				try {
//					mydate = sft.parse("2013-05-15 11:07:32");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.963137,34.260431,0f, 0f);
				//25路第16次插入
//				try {
//					mydate = sft.parse("2013-05-15 11:10:34");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.963089,34.262705,0f, 0f);
				//25路第17次插入
//				try {
//					mydate = sft.parse("2013-05-15 11:13:53");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.963068,34.264793,0f, 0f);
				//25路第18次插入
//				try {
//					mydate = sft.parse("2013-05-15 11:15:36");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.962976,34.270264,0f, 0f);
				//25路第19次插入
//				try {
//					mydate = sft.parse("2013-05-15 11:19:09");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.962917,34.273460,0f, 0f);
//				//25路第20次插入
//				try {
//					mydate = sft.parse("2013-05-15 11:23:37");
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//				BusLocation buslocation = new BusLocation(25, 0, 1, 1, mydate,
//						108.962885,34.274755,0f, 0f);
//				
//				
//				
//				
//				
//		busLocInter.addBusLoc(buslocation);
	}

}
