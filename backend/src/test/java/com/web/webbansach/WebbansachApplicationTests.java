package com.web.webbansach;

import com.web.webbansach.entity.TheLoai;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebbansachApplicationTests {

	@Test
	void contextLoads() {
		TheLoai theLoai = new TheLoai();
		theLoai.setMaTheLoai(1);
		theLoai.setTenTheLoai("GiaKhoaw");
	}

}
