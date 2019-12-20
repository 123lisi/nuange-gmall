package com.nuange.gmall.pms;

import com.nuange.gmall.pms.entity.Brand;
import com.nuange.gmall.pms.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {
    @Autowired
    BrandService brandService;


    @Test
    void contextLoads() {
        Brand byId = brandService.getById(53);
        System.out.println(byId.getName());
    }

}
