package com.example.adenom;

import com.example.adenom.utils.AdenomPartition;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdenomApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void partitionTest() {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");
        list.add("eleven");
        List<List<String>> partition = AdenomPartition.partition(list, 1);
        System.out.println(partition.get(2).size());
        assertTrue(partition.size()==11);
        assertTrue(partition.get(0).size()==1);
        partition = AdenomPartition.partition(list, 7);
        assertTrue(partition.size()==2);
        assertTrue(partition.get(0).size()==7);
        assertTrue(partition.get(1).size()==4);

        // now let assume you want to have x number of buckets
        // How many elements must placed in a list?
        // Take x as 3

        int buckets = 3;
        int divide = list.size() / buckets;
        if (list.size() % buckets !=0){
            divide ++;
        }
        System.out.println("Max. number of element in each bucket " + divide);
        partition = AdenomPartition.partition(list, divide );
        assertTrue(partition.size()==buckets);
    }

}
