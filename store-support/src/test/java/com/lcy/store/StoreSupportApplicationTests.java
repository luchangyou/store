package com.lcy.store;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lcy.store.entity.Waybill;
import com.lcy.store.service.WaybillService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StoreSupportApplicationTests {

	@Autowired
	private WaybillService waybillService;

	@Test
	public void addWaybill() {
		for (int i = 0; i < 100; i++) {
			Waybill waybill = new Waybill();
			waybill.setWaybillNo("LD00002346"+i);
			waybill.setOrderNo("00002346"+i);
			waybillService.save(waybill);
		}

	}

	@Test
	public void getWaybill(){
		QueryWrapper<Waybill> wrapper = new QueryWrapper<>();
		wrapper.eq("waybill_no","LD0000234644");
		Waybill waybill = waybillService.getOne(wrapper);
		System.out.println(waybill);
		System.out.println(waybill.getId());
	}


}
