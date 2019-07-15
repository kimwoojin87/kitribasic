package com.kitri.haksa.service;

import com.kitri.haksa.data.HaksaDto;

public interface HaksaService {

	public void menu();

	public void registerMenu();

	public void register(HaksaDto haksa);

	public void findNameMenu();

	public HaksaDto findName(String name);

	public void deleteMenu();

	public void /* void�� �ص��ȴ�. */ delete(String name);

	public void seletAll();

	public void processExit();

}
