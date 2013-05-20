package com.bus.service.interfaces;

import com.bus.domain.BusLocation;

public interface BusLocInter {

	//增加记录
	public void addBusLoc(BusLocation b);
	//显示记录
	public void showBusLoc(BusLocation b);
	
	
	
	
	//删除记录
	public void delBusLoc(java.io.Serializable busid);
}
