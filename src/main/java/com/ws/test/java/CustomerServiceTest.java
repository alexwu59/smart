package com.ws.test.java;

import com.ws.smart.model.Customer;
import com.ws.smart.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wushuai on 16/4/8.
 */
public class CustomerServiceTest {

    private final CustomerService customerService = new CustomerService();

    @Before
    public void init(){
       //TODO init dataSource
    }

    @Test
    public void getCustomerListTest() throws Exception{

        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertEquals(2,customerList.size());
    }

    @Test
    public void getCustomer()throws Exception{
        long id=1;
        Customer customer = customerService.getOneCustomerById(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void deleteCustomer()throws Exception{

        long id =1;
        boolean flag = customerService.deleteCustomer(id);
        Assert.assertTrue(flag);
    }

    @Test
    public void updateCustomer()throws Exception{
        long id =1;
        HashMap<String,Object> map = new HashMap<>();
        map.put("contact","ws");
        boolean result = customerService.updateCustomer(id,map);
        Assert.assertTrue(result);
    }

    @Test
    public void createCustomer()throws Exception{

        HashMap<String,Object> map = new HashMap<>();
        map.put("name","打扰");
        map.put("contact","ddd");
        map.put("telephone","134444");
        boolean result = customerService.createCustomer(map);
        Assert.assertTrue(result);
    }

}
