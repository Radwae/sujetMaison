package com.sujetMaison;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sujet.maison.SujetMaisonApplication;
import com.sujet.maison.business.SujetMaisonBusinessApi;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SujetMaisonApplication.class)
public class SujetMaisonApplicationTests {


	@Autowired
	SujetMaisonBusinessApi app ;
	
	@Test
	public void testPartition() {
		assertThat("[[1, 2], [2, 3], [5]]").isEqualTo(app.printPartition(new int[]{1,2,3,4,5} , 2));
		assertThat("[[1, 2, 3], [4, 5]]").isEqualTo(app.printPartition(new int[]{1,2,3,4,5} , 3));
		assertThat("[[1], [2], [3], [4], [5]]").isEqualTo(app.printPartition(new int[]{1,2,3,4,5} , 1));
	}

}
