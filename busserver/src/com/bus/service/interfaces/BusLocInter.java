package com.bus.service.interfaces;

import com.bus.domain.BusLocation;

public interface BusLocInter {

	//���Ӽ�¼
	public void addBusLoc(BusLocation b);
	//��ʾ��¼
	public void showBusLoc(BusLocation b);
	
	
	
	
	//ɾ����¼
	public void delBusLoc(java.io.Serializable busid);
}
