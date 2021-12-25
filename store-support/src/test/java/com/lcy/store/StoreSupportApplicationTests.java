package com.lcy.store;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lcy.store.entity.OrderInfo;
import com.lcy.store.entity.Waybill;
import com.lcy.store.service.OrderService;
import com.lcy.store.service.WaybillService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StoreSupportApplicationTests {

	@Autowired
	private WaybillService waybillService;
	@Autowired
	private OrderService orderService;

	@Test
	public void addOrder() {
		for (int i = 0; i < 10; i++) {
			OrderInfo order = new OrderInfo();
			order.setOrderNo("111123461"+i);
			order.setWaybillNo("LD111123461"+i);
			orderService.save(order);
		}


	}

	@Test
	public void addWaybill() {
		Waybill waybill = new Waybill();
		waybill.setWaybillNo("LD0000112346");
		waybill.setOrderNo("0000112346");
		waybillService.save(waybill);

	}

	@Test
	public void bachAddWaybill() {
		for (int i = 0; i < 100; i++) {
			Waybill waybill = new Waybill();
			waybill.setWaybillNo("LD11002346"+i);
			waybill.setOrderNo("11002346"+i);
			waybillService.save(waybill);
		}

	}

	@Test
	public void getWaybill(){
		QueryWrapper<Waybill> wrapper = new QueryWrapper<>();
		wrapper.eq("waybill_no","LD0000112346");
		Waybill waybill = waybillService.getOne(wrapper);
		System.out.println(waybill);
		System.out.println(waybill.getId());
	}

	@Test
	public void getWaybillPage(){
		QueryWrapper<Waybill> wrapper = new QueryWrapper<>();
		wrapper.eq("waybill_no","LD0000234644");
		Page page = new Page(1,10);
		IPage waybillPage = waybillService.page(page, wrapper);
		List records = waybillPage.getRecords();
		System.out.println("records.sizze"+records.size());
		System.out.println("waybillPage.total"+waybillPage.getTotal());
	}

}
